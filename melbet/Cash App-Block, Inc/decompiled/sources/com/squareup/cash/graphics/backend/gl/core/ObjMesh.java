package com.squareup.cash.graphics.backend.gl.core;

import android.opengl.GLES20;
import com.google.common.math.DoubleUtils;
import com.knotapi.knot.ui.views.KnotSpinnerView$$ExternalSyntheticLambda0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.text.Charsets;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class ObjMesh {
    public final int indexSize;
    public final int[] indexVertexBuffer;

    public ObjMesh(InputStream inputStream) {
        inputStream.getClass();
        int[] iArr = new int[2];
        GLES20.glGenBuffers(2, iArr, 0);
        DoubleUtils.checkLocation(iArr[0], "ObjBuffer[0]");
        DoubleUtils.checkLocation(iArr[1], "ObjBuffer[1]");
        this.indexVertexBuffer = iArr;
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
        Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
        Ref$FloatRef ref$FloatRef4 = new Ref$FloatRef();
        Ref$FloatRef ref$FloatRef5 = new Ref$FloatRef();
        Ref$FloatRef ref$FloatRef6 = new Ref$FloatRef();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        Stream<String> lines = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), PKIFailureInfo.certRevoked).lines();
        ArrayList arrayList13 = arrayList6;
        ObjMesh$$ExternalSyntheticLambda0 objMesh$$ExternalSyntheticLambda0 = new ObjMesh$$ExternalSyntheticLambda0(arrayList8, arrayList10, arrayList12, arrayList11, arrayList9, arrayList7, ref$FloatRef, ref$FloatRef2, ref$FloatRef3, ref$FloatRef4, ref$FloatRef5, ref$FloatRef6);
        int i = 3;
        lines.forEach(new KnotSpinnerView$$ExternalSyntheticLambda0(objMesh$$ExternalSyntheticLambda0, 3));
        int size = arrayList8.size();
        int i2 = 0;
        while (i2 < size) {
            int intValue = ((Number) arrayList8.get(i2)).intValue();
            int intValue2 = ((Number) arrayList10.get(i2)).intValue();
            int intValue3 = ((Number) arrayList12.get(i2)).intValue();
            float[] fArr = (float[]) arrayList7.get(intValue - 1);
            float[] fArr2 = (float[]) arrayList9.get(intValue2 - 1);
            int i3 = size;
            float[] fArr3 = (float[]) arrayList11.get(intValue3 - 1);
            arrayList.add(fArr);
            arrayList2.add(fArr2);
            arrayList3.add(fArr3);
            arrayList13.add(Integer.valueOf(arrayList.size() - 1));
            i2++;
            size = i3;
            i = 3;
        }
        int i4 = i;
        Iterator it = CollectionsKt.windowed(arrayList13, i4, i4, true).iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            float[] fArr4 = (float[]) arrayList.get(((Number) list.get(0)).intValue());
            float[] fArr5 = (float[]) arrayList.get(((Number) list.get(1)).intValue());
            float[] fArr6 = (float[]) arrayList.get(((Number) list.get(2)).intValue());
            float[] fArr7 = (float[]) arrayList2.get(((Number) list.get(0)).intValue());
            float[] fArr8 = (float[]) arrayList2.get(((Number) list.get(1)).intValue());
            float[] fArr9 = (float[]) arrayList2.get(((Number) list.get(2)).intValue());
            float f = fArr5[0];
            float f2 = fArr4[0];
            char c = 1;
            float f3 = fArr5[1];
            float f4 = fArr4[1];
            float f5 = fArr5[2];
            float f6 = fArr4[2];
            ArrayList arrayList14 = arrayList13;
            float[] fArr10 = {f - f2, f3 - f4, f5 - f6};
            float[] fArr11 = {fArr6[0] - f2, fArr6[1] - f4, fArr6[2] - f6};
            float f7 = fArr8[0];
            float f8 = fArr7[0];
            float f9 = fArr8[1];
            float f10 = fArr7[1];
            float[] fArr12 = {f7 - f8, f9 - f10};
            float[] fArr13 = {fArr9[0] - f8, fArr9[1] - f10};
            ArrayList arrayList15 = new ArrayList(3);
            int i5 = 0;
            while (i5 < 3) {
                arrayList15.add(Float.valueOf(fArr10[i5] * fArr13[c]));
                i5++;
                c = 1;
            }
            ArrayList arrayList16 = new ArrayList(3);
            int i6 = 0;
            for (int i7 = 3; i6 < i7; i7 = 3) {
                arrayList16.add(Float.valueOf(fArr11[i6] * fArr12[1]));
                i6++;
            }
            float f11 = (float) (1.0d / ((fArr12[0] * fArr13[1]) - (fArr13[0] * fArr12[1])));
            float floatValue = (((Number) arrayList15.get(0)).floatValue() - ((Number) arrayList16.get(0)).floatValue()) * f11;
            float floatValue2 = (((Number) arrayList15.get(1)).floatValue() - ((Number) arrayList16.get(1)).floatValue()) * f11;
            float floatValue3 = (((Number) arrayList15.get(2)).floatValue() - ((Number) arrayList16.get(2)).floatValue()) * f11;
            char c2 = 0;
            float[] fArr14 = {floatValue, floatValue2, floatValue3};
            ArrayList arrayList17 = new ArrayList(3);
            int i8 = 0;
            while (i8 < 3) {
                arrayList17.add(Float.valueOf(fArr11[i8] * fArr12[c2]));
                i8++;
                c2 = 0;
            }
            ArrayList arrayList18 = new ArrayList(3);
            int i9 = 0;
            for (int i10 = 3; i9 < i10; i10 = 3) {
                arrayList18.add(Float.valueOf(fArr10[i9] * fArr13[0]));
                i9++;
            }
            float[] fArr15 = {(((Number) arrayList17.get(0)).floatValue() - ((Number) arrayList18.get(0)).floatValue()) * f11, (((Number) arrayList17.get(1)).floatValue() - ((Number) arrayList18.get(1)).floatValue()) * f11, (((Number) arrayList17.get(2)).floatValue() - ((Number) arrayList18.get(2)).floatValue()) * f11};
            arrayList4.add(fArr14);
            arrayList4.add(fArr14);
            arrayList4.add(fArr14);
            arrayList5.add(fArr15);
            arrayList5.add(fArr15);
            arrayList5.add(fArr15);
            arrayList13 = arrayList14;
        }
        ArrayList arrayList19 = arrayList13;
        ArrayList arrayList20 = new ArrayList();
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList20.addAll(ArraysKt___ArraysKt.toList((float[]) arrayList.get(i11)));
            arrayList20.addAll(ArraysKt___ArraysKt.toList((float[]) arrayList3.get(i11)));
            arrayList20.addAll(ArraysKt___ArraysKt.toList((float[]) arrayList4.get(i11)));
            arrayList20.addAll(ArraysKt___ArraysKt.toList((float[]) arrayList5.get(i11)));
            arrayList20.addAll(ArraysKt___ArraysKt.toList((float[]) arrayList2.get(i11)));
        }
        int[] intArray = CollectionsKt.toIntArray(arrayList19);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(intArray.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        IntBuffer asIntBuffer = allocateDirect.asIntBuffer();
        asIntBuffer.put(intArray);
        asIntBuffer.position(0);
        this.indexSize = arrayList19.size();
        GLES20.glBindBuffer(34963, this.indexVertexBuffer[0]);
        GLES20.glBufferData(34963, arrayList19.size() * 4, asIntBuffer, 35044);
        float[] floatArray = CollectionsKt.toFloatArray(arrayList20);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(floatArray.length * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect2.asFloatBuffer();
        asFloatBuffer.put(floatArray);
        asFloatBuffer.position(0);
        GLES20.glBindBuffer(34962, this.indexVertexBuffer[1]);
        GLES20.glBufferData(34962, arrayList20.size() * 4, asFloatBuffer, 35044);
        GLES20.glBindBuffer(34963, 0);
        GLES20.glBindBuffer(34962, 0);
    }
}
