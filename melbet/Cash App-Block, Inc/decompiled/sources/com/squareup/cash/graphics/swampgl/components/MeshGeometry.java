package com.squareup.cash.graphics.swampgl.components;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLES30;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.paging.Pager$pageFetcher$2;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.graphics.swampgl.GLLauncher;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.graphics.swampgl.gl.RealGlOperations;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Charsets;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.hpke.HPKE;
import timber.log.Timber;

/* loaded from: classes6.dex */
public class MeshGeometry implements Geometry {
    public final StateFlowImpl _ready;
    public AABB aabb;
    public final Context context;
    public final GLLauncher glLauncher;
    public final RealGlOperations glOps;
    public int iboId;
    public int indexCount;
    public final String meshName;
    public final ReadonlyStateFlow ready;
    public List subMeshes;
    public final LinkedHashMap vaosByProgram;
    public int vboId;
    public int vertexStride;

    public MeshGeometry(Context context, GLLauncher gLLauncher, String str) {
        RealGlOperations realGlOperations = RealGlOperations.INSTANCE;
        context.getClass();
        gLLauncher.getClass();
        this.context = context;
        this.glLauncher = gLLauncher;
        this.meshName = str;
        this.glOps = realGlOperations;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(Boolean.FALSE);
        this._ready = MutableStateFlow;
        this.ready = FlowKt.asStateFlow(MutableStateFlow);
        this.subMeshes = EmptyList.INSTANCE;
        this.vaosByProgram = new LinkedHashMap();
        gLLauncher.launch(new Scene.AnonymousClass1(this, (Continuation) null, 23));
    }

    public static void decodeOctahedron(float f, float f2, float[] fArr, int i) {
        float abs = (1.0f - Math.abs(f)) - Math.abs(f2);
        if (abs < RecyclerView.DECELERATION_RATE) {
            float abs2 = (1.0f - Math.abs(f2)) * (f >= RecyclerView.DECELERATION_RATE ? 1.0f : -1.0f);
            f2 = (1.0f - Math.abs(f)) * (f2 >= RecyclerView.DECELERATION_RATE ? 1.0f : -1.0f);
            f = abs2;
        }
        float sqrt = (float) Math.sqrt((abs * abs) + (f2 * f2) + (f * f));
        if (sqrt > 1.0E-4f) {
            fArr[i] = f / sqrt;
            fArr[i + 1] = f2 / sqrt;
            fArr[i + 2] = abs / sqrt;
        } else {
            fArr[i] = 0.0f;
            fArr[i + 1] = 1.0f;
            fArr[i + 2] = 0.0f;
        }
    }

    public static MeshData loadMeshDataV1(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i * 14;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr[i4] = byteBuffer.getFloat();
        }
        int[] iArr = new int[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            iArr[i5] = byteBuffer.getInt();
        }
        float f = Float.NEGATIVE_INFINITY;
        float f2 = Float.NEGATIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        float f4 = Float.POSITIVE_INFINITY;
        float f5 = Float.POSITIVE_INFINITY;
        float f6 = Float.POSITIVE_INFINITY;
        for (int i6 = 0; i6 < i3; i6 += 14) {
            f4 = Math.min(f4, fArr[i6]);
            int i7 = i6 + 1;
            f5 = Math.min(f5, fArr[i7]);
            int i8 = i6 + 2;
            f6 = Math.min(f6, fArr[i8]);
            f = Math.max(f, fArr[i6]);
            f2 = Math.max(f2, fArr[i7]);
            f3 = Math.max(f3, fArr[i8]);
        }
        return new MeshData(fArr, iArr, new AABB(f4, f5, f6, f, f2, f3), EmptyList.INSTANCE);
    }

    public static MeshData loadMeshDataV2(ByteBuffer byteBuffer, int i, int i2) {
        MeshData meshData;
        int i3 = i;
        float f = byteBuffer.getFloat();
        float f2 = byteBuffer.getFloat();
        float f3 = byteBuffer.getFloat();
        float f4 = byteBuffer.getFloat();
        float f5 = byteBuffer.getFloat();
        float f6 = byteBuffer.getFloat();
        int i4 = byteBuffer.get() & 255;
        int i5 = 0;
        int i6 = byteBuffer.remaining() != (i3 * 24) + ((ArraysKt___ArraysKt.contains(new int[]{0, 2}, i4) ? 2 : 4) * i2) ? byteBuffer.getInt() : 0;
        float f7 = f4 - f;
        if (f7 == RecyclerView.DECELERATION_RATE) {
            f7 = 1.0f;
        }
        float f8 = f5 - f2;
        if (f8 == RecyclerView.DECELERATION_RATE) {
            f8 = 1.0f;
        }
        float f9 = f6 - f3;
        float f10 = f9 != RecyclerView.DECELERATION_RATE ? f9 : 1.0f;
        float[] fArr = new float[i3 * 14];
        while (i5 < i3) {
            int i7 = i5 * 14;
            fArr[i7] = (((byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY) / 65535.0f) * f7) + f;
            fArr[i7 + 1] = (((byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY) / 65535.0f) * f8) + f2;
            fArr[i7 + 2] = (((byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY) / 65535.0f) * f10) + f3;
            decodeOctahedron(byteBuffer.getShort() / 32767.0f, byteBuffer.getShort() / 32767.0f, fArr, i7 + 3);
            decodeOctahedron(byteBuffer.getShort() / 32767.0f, byteBuffer.getShort() / 32767.0f, fArr, i7 + 6);
            decodeOctahedron(byteBuffer.getShort() / 32767.0f, byteBuffer.getShort() / 32767.0f, fArr, i7 + 9);
            fArr[i7 + 12] = (byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY) / 65535.0f;
            fArr[i7 + 13] = (byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY) / 65535.0f;
            byteBuffer.getShort();
            i5++;
            i3 = i;
            f2 = f2;
        }
        float f11 = f2;
        int[] iArr = new int[i2];
        MeshData meshData2 = null;
        if (i4 == 0) {
            for (int i8 = 0; i8 < i2; i8++) {
                iArr[i8] = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
            }
        } else if (i4 == 1) {
            for (int i9 = 0; i9 < i2; i9++) {
                iArr[i9] = byteBuffer.getInt();
            }
        } else if (i4 == 2) {
            int i10 = 0;
            for (int i11 = 0; i11 < i2; i11++) {
                i10 += byteBuffer.getShort();
                iArr[i11] = i10;
            }
        } else {
            if (i4 != 3) {
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i4, "Unknown index type: "));
                return null;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < i2; i13++) {
                i12 += byteBuffer.getInt();
                iArr[i13] = i12;
            }
        }
        ArrayList arrayList = new ArrayList(i6);
        int i14 = 0;
        while (i14 < i6) {
            byte[] bArr = new byte[byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY];
            byteBuffer.get(bArr);
            String str = new String(bArr, Charsets.UTF_8);
            int i15 = byteBuffer.getInt();
            int i16 = byteBuffer.getInt();
            if (i15 < 0 || i16 < 0) {
                meshData = meshData2;
            } else {
                meshData = meshData2;
                if (i15 + i16 <= i2) {
                    arrayList.add(new SubMesh(str, i15, i16));
                    i14++;
                    meshData2 = meshData;
                }
            }
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(i16, i2, " total=", Recorder$$ExternalSyntheticOutline2.m("SubMesh '", i15, str, "' out of bounds: offset=", " count=")));
            return meshData;
        }
        return new MeshData(fArr, iArr, new AABB(f, f11, f3, f4, f5, f6), arrayList);
    }

    public static MeshData loadMeshDataV3(ByteBuffer byteBuffer, int i, int i2) {
        float[] fArr;
        Ref$IntRef ref$IntRef;
        Ref$ObjectRef ref$ObjectRef;
        int i3;
        float f;
        float f2;
        float f3;
        int i4;
        int i5;
        ByteBuffer byteBuffer2 = byteBuffer;
        int i6 = i;
        float f4 = byteBuffer2.getFloat();
        float f5 = byteBuffer2.getFloat();
        float f6 = byteBuffer2.getFloat();
        float f7 = byteBuffer2.getFloat();
        float f8 = byteBuffer2.getFloat();
        float f9 = byteBuffer2.getFloat();
        int i7 = byteBuffer2.get() & 255;
        boolean z = (byteBuffer2.get() & 1) != 0;
        int i8 = byteBuffer2.getInt();
        float f10 = f7 - f4;
        if (f10 == RecyclerView.DECELERATION_RATE) {
            f10 = 1.0f;
        }
        float f11 = f8 - f5;
        if (f11 == RecyclerView.DECELERATION_RATE) {
            f11 = 1.0f;
        }
        float f12 = f9 - f6;
        if (f12 == RecyclerView.DECELERATION_RATE) {
            f12 = 1.0f;
        }
        if (!z) {
            float[] fArr2 = new float[i6 * 14];
            int i9 = 0;
            while (i9 < i6) {
                int i10 = i9 * 14;
                fArr2[i10] = (((byteBuffer2.getShort() & HPKE.aead_EXPORT_ONLY) / 65535.0f) * f10) + f4;
                fArr2[i10 + 1] = (((byteBuffer2.getShort() & HPKE.aead_EXPORT_ONLY) / 65535.0f) * f11) + f5;
                fArr2[i10 + 2] = (((byteBuffer2.getShort() & HPKE.aead_EXPORT_ONLY) / 65535.0f) * f12) + f6;
                decodeOctahedron(byteBuffer2.getShort() / 32767.0f, byteBuffer2.getShort() / 32767.0f, fArr2, i10 + 3);
                decodeOctahedron(byteBuffer2.getShort() / 32767.0f, byteBuffer2.getShort() / 32767.0f, fArr2, i10 + 6);
                decodeOctahedron(byteBuffer2.getShort() / 32767.0f, byteBuffer2.getShort() / 32767.0f, fArr2, i10 + 9);
                fArr2[i10 + 12] = (byteBuffer2.getShort() & HPKE.aead_EXPORT_ONLY) / 65535.0f;
                fArr2[i10 + 13] = (byteBuffer2.getShort() & HPKE.aead_EXPORT_ONLY) / 65535.0f;
                byteBuffer2.getShort();
                i9++;
                i6 = i;
                f6 = f6;
            }
            float f13 = f6;
            int[] readIndices = readIndices(byteBuffer2, i2, i7);
            ArrayList arrayList = new ArrayList(i8);
            int i11 = 0;
            while (i11 < i8) {
                byte[] bArr = new byte[byteBuffer2.getShort() & HPKE.aead_EXPORT_ONLY];
                byteBuffer2.get(bArr);
                String str = new String(bArr, Charsets.UTF_8);
                int i12 = byteBuffer2.getInt();
                int i13 = byteBuffer2.getInt();
                if (i12 < 0 || i13 < 0 || i12 + i13 > i2) {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SubMesh '", str, "' out of bounds"));
                    return null;
                }
                arrayList.add(new SubMesh(str, i12, i13));
                i11++;
                byteBuffer2 = byteBuffer;
            }
            return new MeshData(fArr2, readIndices, new AABB(f4, f5, f13, f7, f8, f9), arrayList);
        }
        int i14 = i6 * 3;
        float[] fArr3 = new float[i14];
        int i15 = 0;
        while (i15 < i6) {
            int i16 = i15;
            int i17 = i16 * 3;
            fArr3[i17] = (((byteBuffer2.getShort() & HPKE.aead_EXPORT_ONLY) / 65535.0f) * f10) + f4;
            fArr3[i17 + 1] = (((byteBuffer2.getShort() & HPKE.aead_EXPORT_ONLY) / 65535.0f) * f11) + f5;
            fArr3[i17 + 2] = (((byteBuffer2.getShort() & HPKE.aead_EXPORT_ONLY) / 65535.0f) * f12) + f6;
            i15 = i16 + 1;
        }
        int[] readIndices2 = readIndices(byteBuffer2, i2, i7);
        ArrayList arrayList2 = new ArrayList(i8);
        int i18 = 0;
        while (i18 < i8) {
            byte[] bArr2 = new byte[byteBuffer2.getShort() & HPKE.aead_EXPORT_ONLY];
            byteBuffer2.get(bArr2);
            int i19 = i18;
            float f14 = f7;
            String str2 = new String(bArr2, Charsets.UTF_8);
            int i20 = byteBuffer2.getInt();
            int i21 = byteBuffer2.getInt();
            if (i20 >= 0 && i21 >= 0) {
                float f15 = f8;
                if (i20 + i21 <= i2) {
                    arrayList2.add(new SubMesh(str2, i20, i21));
                    i18 = i19 + 1;
                    f7 = f14;
                    f8 = f15;
                }
            }
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SubMesh '", str2, "' out of bounds"));
            return null;
        }
        AABB aabb = new AABB(f4, f5, f6, f7, f8, f9);
        float cos = (float) Math.cos(Math.toRadians(30.0d));
        int i22 = 3;
        int length = readIndices2.length / 3;
        int i23 = i14 / 3;
        int i24 = length * 3;
        float[] fArr4 = new float[i24];
        float[] fArr5 = new float[i24];
        boolean[] zArr = new boolean[length];
        int i25 = 0;
        while (i25 < length) {
            int i26 = i25 * 3;
            int i27 = readIndices2[i26];
            int i28 = i26 + 1;
            int i29 = readIndices2[i28];
            int i30 = i26 + 2;
            int i31 = readIndices2[i30];
            int i32 = i27 * i22;
            float f16 = fArr3[i32];
            float f17 = fArr3[i32 + 1];
            float f18 = fArr3[i32 + 2];
            int i33 = i29 * 3;
            float f19 = fArr3[i33] - f16;
            float f20 = fArr3[i33 + 1] - f17;
            float f21 = fArr3[i33 + 2] - f18;
            int i34 = i31 * 3;
            float f22 = fArr3[i34] - f16;
            float f23 = fArr3[i34 + 1] - f17;
            float f24 = fArr3[i34 + 2] - f18;
            float f25 = (f20 * f24) - (f21 * f23);
            float f26 = (f21 * f22) - (f24 * f19);
            float f27 = (f19 * f23) - (f20 * f22);
            fArr4[i26] = f25;
            fArr4[i28] = f26;
            fArr4[i30] = f27;
            int i35 = i24;
            float sqrt = (float) Math.sqrt((f27 * f27) + (f26 * f26) + (f25 * f25));
            if (sqrt > 1.0E-12f) {
                fArr5[i26] = f25 / sqrt;
                fArr5[i28] = f26 / sqrt;
                fArr5[i30] = f27 / sqrt;
                zArr[i25] = true;
            }
            i25++;
            i24 = i35;
            i22 = 3;
        }
        int i36 = i24;
        int[] iArr = new int[i23];
        for (int i37 = 0; i37 < length; i37++) {
            int i38 = i37 * 3;
            int i39 = readIndices2[i38];
            iArr[i39] = iArr[i39] + 1;
            int i40 = readIndices2[i38 + 1];
            iArr[i40] = iArr[i40] + 1;
            int i41 = readIndices2[i38 + 2];
            iArr[i41] = iArr[i41] + 1;
        }
        int[] iArr2 = new int[i23 + 1];
        int i42 = 0;
        while (i42 < i23) {
            int i43 = i42 + 1;
            iArr2[i43] = iArr2[i42] + iArr[i42];
            i42 = i43;
        }
        int i44 = iArr2[i23];
        int[] iArr3 = new int[i44];
        int[] iArr4 = new int[i44];
        int[] iArr5 = new int[i23];
        int i45 = 0;
        while (i45 < length) {
            float f28 = cos;
            for (int i46 = 0; i46 < 3; i46++) {
                int i47 = readIndices2[(i45 * 3) + i46];
                int i48 = iArr2[i47] + iArr5[i47];
                iArr3[i48] = i45;
                iArr4[i48] = i46;
                iArr5[i47] = iArr5[i47] + 1;
            }
            i45++;
            cos = f28;
        }
        float f29 = cos;
        int[] iArr6 = new int[i36];
        for (int i49 = 0; i49 < i36; i49++) {
            iArr6[i49] = -1;
        }
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef2.element = new float[i23 * 14];
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef2;
        float[] fArr6 = new float[8];
        float[] fArr7 = new float[8];
        float[] fArr8 = new float[8];
        float[] fArr9 = new float[8];
        int i50 = 0;
        float[] fArr10 = new float[8];
        int[] iArr7 = new int[8];
        float[] fArr11 = new float[8];
        int i51 = 0;
        while (i51 < i23) {
            int i52 = iArr2[i51];
            int i53 = i51 + 1;
            int i54 = i51;
            int i55 = iArr2[i53];
            float[] fArr12 = fArr6;
            int[] iArr8 = iArr2;
            float[] fArr13 = fArr12;
            float[] fArr14 = fArr7;
            float[] fArr15 = fArr4;
            float[] fArr16 = fArr14;
            float[] fArr17 = fArr10;
            float[] fArr18 = fArr5;
            float[] fArr19 = fArr17;
            float[] fArr20 = fArr8;
            boolean[] zArr2 = zArr;
            float[] fArr21 = fArr20;
            float[] fArr22 = fArr9;
            int[] iArr9 = iArr3;
            float[] fArr23 = fArr22;
            int[] iArr10 = iArr6;
            float[] fArr24 = fArr3;
            int i56 = 0;
            int i57 = i52;
            while (i57 < i55) {
                int i58 = iArr9[i57];
                if (zArr2[i58]) {
                    int i59 = i58 * 3;
                    float f30 = fArr18[i59];
                    int i60 = i59 + 1;
                    float f31 = fArr18[i60];
                    int i61 = i59 + 2;
                    float f32 = fArr18[i61];
                    float f33 = fArr15[i59];
                    float f34 = fArr15[i60];
                    float f35 = fArr15[i61];
                    i5 = i57;
                    int i62 = 0;
                    while (true) {
                        if (i62 >= i56) {
                            i62 = -1;
                            break;
                        }
                        if ((fArr11[i62] * f32) + (fArr21[i62] * f31) + (fArr23[i62] * f30) >= f29) {
                            break;
                        }
                        i62++;
                    }
                    if (i62 >= 0) {
                        fArr19[i62] = fArr19[i62] + f33;
                        fArr13[i62] = fArr13[i62] + f34;
                        float f36 = fArr16[i62] + f35;
                        fArr16[i62] = f36;
                        float f37 = fArr19[i62];
                        float f38 = fArr13[i62];
                        int i63 = i62;
                        i4 = i23;
                        float sqrt2 = (float) Math.sqrt((f36 * f36) + (f38 * f38) + (f37 * f37));
                        if (sqrt2 > 1.0E-12f) {
                            fArr23[i63] = f37 / sqrt2;
                            fArr21[i63] = f38 / sqrt2;
                            fArr11[i63] = f36 / sqrt2;
                        }
                    } else {
                        i4 = i23;
                        if (i56 >= fArr19.length) {
                            int length2 = fArr19.length * 2;
                            fArr19 = Arrays.copyOf(fArr19, length2);
                            fArr13 = Arrays.copyOf(fArr13, length2);
                            fArr16 = Arrays.copyOf(fArr16, length2);
                            fArr23 = Arrays.copyOf(fArr23, length2);
                            fArr21 = Arrays.copyOf(fArr21, length2);
                            fArr11 = Arrays.copyOf(fArr11, length2);
                            iArr7 = Arrays.copyOf(iArr7, length2);
                        }
                        fArr19[i56] = f33;
                        fArr13[i56] = f34;
                        fArr16[i56] = f35;
                        fArr23[i56] = f30;
                        fArr21[i56] = f31;
                        fArr11[i56] = f32;
                        iArr7[i56] = -1;
                        i56++;
                    }
                } else {
                    i4 = i23;
                    i5 = i57;
                }
                i57 = i5 + 1;
                i23 = i4;
            }
            int i64 = i23;
            int i65 = i54 * 3;
            float f39 = fArr24[i65];
            float f40 = fArr24[i65 + 1];
            float f41 = fArr24[i65 + 2];
            if (i56 == 0) {
                int i66 = i50 + 1;
                smoothPositionsOnly$appendOutVertex(ref$IntRef2, ref$ObjectRef3, f39, f40, f41, RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE);
                for (int i67 = i52; i67 < i55; i67++) {
                    iArr10[(iArr9[i67] * 3) + iArr4[i67]] = i50;
                }
                fArr = fArr13;
                i50 = i66;
                ref$IntRef = ref$IntRef2;
                ref$ObjectRef = ref$ObjectRef3;
            } else {
                int i68 = 0;
                while (i68 < i56) {
                    float f42 = fArr19[i68];
                    float f43 = fArr13[i68];
                    float f44 = fArr16[i68];
                    int i69 = i50;
                    float[] fArr25 = fArr13;
                    float sqrt3 = (float) Math.sqrt((f44 * f44) + (f43 * f43) + (f42 * f42));
                    if (sqrt3 > 1.0E-12f) {
                        f3 = f44 / sqrt3;
                        f = f43 / sqrt3;
                        f2 = f42 / sqrt3;
                    } else {
                        f = 1.0f;
                        f2 = RecyclerView.DECELERATION_RATE;
                        f3 = RecyclerView.DECELERATION_RATE;
                    }
                    i50 = i69 + 1;
                    iArr7[i68] = i69;
                    smoothPositionsOnly$appendOutVertex(ref$IntRef2, ref$ObjectRef3, f39, f40, f41, f2, f, f3);
                    i68++;
                    fArr13 = fArr25;
                }
                int i70 = i50;
                fArr = fArr13;
                ref$IntRef = ref$IntRef2;
                ref$ObjectRef = ref$ObjectRef3;
                int i71 = i52;
                while (i71 < i55) {
                    int i72 = iArr9[i71];
                    int i73 = i72 * 3;
                    int i74 = i73 + iArr4[i71];
                    if (zArr2[i72]) {
                        float f45 = fArr18[i73];
                        float f46 = fArr18[i73 + 1];
                        float f47 = fArr18[i73 + 2];
                        float f48 = -3.4028235E38f;
                        i3 = i55;
                        int i75 = 0;
                        for (int i76 = 0; i76 < i56; i76++) {
                            float f49 = (fArr11[i76] * f47) + (fArr21[i76] * f46) + (fArr23[i76] * f45);
                            if (f49 > f48) {
                                i75 = i76;
                                f48 = f49;
                            }
                        }
                        iArr10[i74] = iArr7[i75];
                    } else {
                        iArr10[i74] = iArr7[0];
                        i3 = i55;
                    }
                    i71++;
                    i55 = i3;
                }
                i50 = i70;
            }
            fArr7 = fArr16;
            fArr4 = fArr15;
            fArr10 = fArr19;
            fArr5 = fArr18;
            fArr8 = fArr21;
            zArr = zArr2;
            fArr9 = fArr23;
            iArr3 = iArr9;
            ref$ObjectRef3 = ref$ObjectRef;
            ref$IntRef2 = ref$IntRef;
            iArr2 = iArr8;
            i51 = i53;
            iArr6 = iArr10;
            fArr3 = fArr24;
            fArr6 = fArr;
            i23 = i64;
        }
        int i77 = i23;
        int[] iArr11 = iArr6;
        Ref$IntRef ref$IntRef3 = ref$IntRef2;
        Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef3;
        int[] iArr12 = new int[readIndices2.length];
        for (int i78 = 0; i78 < length; i78++) {
            int i79 = i78 * 3;
            iArr12[i79] = iArr11[i79];
            int i80 = i79 + 1;
            iArr12[i80] = iArr11[i80];
            int i81 = i79 + 2;
            iArr12[i81] = iArr11[i81];
        }
        float[] copyOf = Arrays.copyOf((float[]) ref$ObjectRef4.element, ref$IntRef3.element);
        Timber.Forest forest = Timber.Forest;
        forest.tag("MeshGeometry");
        StringBuilder sb = new StringBuilder("V3 lite splitter: ");
        sb.append(i77);
        sb.append(" → ");
        forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i50, " verts (30.0° threshold)", sb), new Object[0]);
        return new MeshData(copyOf, iArr12, aabb, arrayList2);
    }

    public static int[] readIndices(ByteBuffer byteBuffer, int i, int i2) {
        int[] iArr = new int[i];
        int i3 = 0;
        if (i2 == 0) {
            while (i3 < i) {
                iArr[i3] = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
                i3++;
            }
        } else if (i2 == 1) {
            while (i3 < i) {
                iArr[i3] = byteBuffer.getInt();
                i3++;
            }
        } else if (i2 == 2) {
            int i4 = 0;
            while (i3 < i) {
                i4 += byteBuffer.getShort();
                iArr[i3] = i4;
                i3++;
            }
        } else {
            if (i2 != 3) {
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Unknown index type: "));
                return null;
            }
            int i5 = 0;
            while (i3 < i) {
                i5 += byteBuffer.getInt();
                iArr[i3] = i5;
                i3++;
            }
        }
        return iArr;
    }

    public static final void smoothPositionsOnly$appendOutVertex(Ref$IntRef ref$IntRef, Ref$ObjectRef ref$ObjectRef, float f, float f2, float f3, float f4, float f5, float f6) {
        int i = ref$IntRef.element + 14;
        float[] fArr = (float[]) ref$ObjectRef.element;
        if (i > fArr.length) {
            ref$ObjectRef.element = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int i2 = ref$IntRef.element;
        float[] fArr2 = (float[]) ref$ObjectRef.element;
        fArr2[i2] = f;
        fArr2[i2 + 1] = f2;
        fArr2[i2 + 2] = f3;
        fArr2[i2 + 3] = f4;
        fArr2[i2 + 4] = f5;
        fArr2[i2 + 5] = f6;
        fArr2[i2 + 6] = 1.0f;
        fArr2[i2 + 7] = 0.0f;
        fArr2[i2 + 8] = 0.0f;
        fArr2[i2 + 9] = 0.0f;
        fArr2[i2 + 10] = 1.0f;
        fArr2[i2 + 11] = 0.0f;
        fArr2[i2 + 12] = 0.0f;
        fArr2[i2 + 13] = 0.0f;
        ref$IntRef.element = i2 + 14;
    }

    public final void dispose() {
        this.glLauncher.launch(new Pager$pageFetcher$2(this, null, 9));
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Geometry
    public final void draw() {
        if (this.vboId == 0 || this.iboId == 0) {
            Timber.Forest forest = Timber.Forest;
            forest.tag("MeshGeometry");
            forest.w("Attempting to draw before buffers are ready", new Object[0]);
        } else {
            GLES30.glBindVertexArray(getOrCreateVAO());
            GLES20.glDrawElements(4, this.indexCount, 5125, 0);
            GLES30.glBindVertexArray(0);
        }
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Geometry
    public final AABB getAABB() {
        AABB aabb = this.aabb;
        return aabb == null ? new AABB(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) : aabb;
    }

    public final int getOrCreateVAO() {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(35725, iArr, 0);
        int i = iArr[0];
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.vaosByProgram;
        Integer num = (Integer) linkedHashMap.get(valueOf);
        if (num != null) {
            return num.intValue();
        }
        int[] iArr2 = new int[1];
        GLES30.glGenVertexArrays(1, iArr2, 0);
        int i2 = iArr2[0];
        GLES30.glBindVertexArray(i2);
        int glGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(i, "aNormal");
        int glGetAttribLocation3 = GLES20.glGetAttribLocation(i, "aTangent");
        int glGetAttribLocation4 = GLES20.glGetAttribLocation(i, "aBitangent");
        int glGetAttribLocation5 = GLES20.glGetAttribLocation(i, "aUV");
        GLES20.glBindBuffer(34962, this.vboId);
        int i3 = this.vertexStride * 4;
        if (glGetAttribLocation >= 0) {
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, i3, 0);
        }
        if (glGetAttribLocation2 >= 0) {
            GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
            GLES20.glVertexAttribPointer(glGetAttribLocation2, 3, 5126, false, i3, 12);
        }
        if (glGetAttribLocation3 >= 0) {
            GLES20.glEnableVertexAttribArray(glGetAttribLocation3);
            GLES20.glVertexAttribPointer(glGetAttribLocation3, 3, 5126, false, i3, 24);
        }
        if (glGetAttribLocation4 >= 0) {
            GLES20.glEnableVertexAttribArray(glGetAttribLocation4);
            GLES20.glVertexAttribPointer(glGetAttribLocation4, 3, 5126, false, i3, 36);
        }
        if (glGetAttribLocation5 >= 0) {
            GLES20.glEnableVertexAttribArray(glGetAttribLocation5);
            GLES20.glVertexAttribPointer(glGetAttribLocation5, 2, 5126, false, i3, 48);
        }
        GLES20.glBindBuffer(34963, this.iboId);
        GLES30.glBindVertexArray(0);
        linkedHashMap.put(Integer.valueOf(i), Integer.valueOf(i2));
        Timber.Forest forest = Timber.Forest;
        forest.tag("MeshGeometry");
        forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, ")", re$$ExternalSyntheticOutline0.m("Created VAO ", i2, " (mesh: ", this.meshName, ", program: ")), new Object[0]);
        return i2;
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Geometry
    public final StateFlow getReady() {
        return this.ready;
    }
}
