package androidx.datastore.preferences.protobuf;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.UnsafeUtil;
import androidx.datastore.preferences.protobuf.WireFormat$FieldType;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.measurement.zzabh;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.squareup.wire.GrpcMethod;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class MessageSchema implements Schema {
    public static final int[] EMPTY_INT_ARRAY = new int[0];
    public static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();
    public final int[] buffer;
    public final int checkInitializedCount;
    public final AbstractMessageLite defaultInstance;
    public final int[] intArray;
    public final ListFieldSchemaLite listFieldSchema;
    public final boolean lite;
    public final MapFieldSchemaLite mapFieldSchema;
    public final int maxFieldNumber;
    public final int minFieldNumber;
    public final NewInstanceSchemaLite newInstanceSchema;
    public final Object[] objects;
    public final int repeatedFieldOffsetStart;
    public final UnknownFieldSchema unknownFieldSchema;

    public MessageSchema(int[] iArr, Object[] objArr, int i, int i2, AbstractMessageLite abstractMessageLite, int[] iArr2, int i3, int i4, NewInstanceSchemaLite newInstanceSchemaLite, ListFieldSchemaLite listFieldSchemaLite, UnknownFieldSchema unknownFieldSchema, ExtensionSchemaLite extensionSchemaLite, MapFieldSchemaLite mapFieldSchemaLite) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i2;
        this.lite = abstractMessageLite instanceof GeneratedMessageLite;
        this.intArray = iArr2;
        this.checkInitializedCount = i3;
        this.repeatedFieldOffsetStart = i4;
        this.newInstanceSchema = newInstanceSchemaLite;
        this.listFieldSchema = listFieldSchemaLite;
        this.unknownFieldSchema = unknownFieldSchema;
        this.defaultInstance = abstractMessageLite;
        this.mapFieldSchema = mapFieldSchemaLite;
    }

    public static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MessageSchema newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, NewInstanceSchemaLite newInstanceSchemaLite, ListFieldSchemaLite listFieldSchemaLite, UnknownFieldSchema unknownFieldSchema, ExtensionSchemaLite extensionSchemaLite, MapFieldSchemaLite mapFieldSchemaLite) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char charAt2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        char charAt5;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        int i14;
        char charAt8;
        int i15;
        char charAt9;
        Object[] objArr;
        int i16;
        int i17;
        int i18;
        int i19;
        int objectFieldOffset;
        String str;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field reflectField;
        int i25;
        char charAt10;
        int i26;
        int i27;
        Field reflectField2;
        Field reflectField3;
        int i28;
        char charAt11;
        int i29;
        char charAt12;
        int i30;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        String str2 = rawMessageInfo.info;
        int length = str2.length();
        if (str2.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i = i33 + 1;
                if (str2.charAt(i33) < 55296) {
                    break;
                }
                i33 = i;
            }
        } else {
            i = 1;
        }
        int i34 = i + 1;
        int charAt15 = str2.charAt(i);
        if (charAt15 >= 55296) {
            int i35 = charAt15 & 8191;
            int i36 = 13;
            while (true) {
                i32 = i34 + 1;
                charAt14 = str2.charAt(i34);
                if (charAt14 < 55296) {
                    break;
                }
                i35 |= (charAt14 & 8191) << i36;
                i36 += 13;
                i34 = i32;
            }
            charAt15 = i35 | (charAt14 << i36);
            i34 = i32;
        }
        if (charAt15 == 0) {
            i3 = 0;
            i6 = 0;
            charAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = EMPTY_INT_ARRAY;
            i4 = 0;
        } else {
            int i37 = i34 + 1;
            int charAt16 = str2.charAt(i34);
            if (charAt16 >= 55296) {
                int i38 = charAt16 & 8191;
                int i39 = 13;
                while (true) {
                    i15 = i37 + 1;
                    charAt9 = str2.charAt(i37);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i38 |= (charAt9 & 8191) << i39;
                    i39 += 13;
                    i37 = i15;
                }
                charAt16 = i38 | (charAt9 << i39);
                i37 = i15;
            }
            int i40 = i37 + 1;
            int charAt17 = str2.charAt(i37);
            if (charAt17 >= 55296) {
                int i41 = charAt17 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    charAt8 = str2.charAt(i40);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i41 |= (charAt8 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                charAt17 = i41 | (charAt8 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            int charAt18 = str2.charAt(i40);
            if (charAt18 >= 55296) {
                int i44 = charAt18 & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    charAt7 = str2.charAt(i43);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i44 |= (charAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                charAt18 = i44 | (charAt7 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            int charAt19 = str2.charAt(i43);
            if (charAt19 >= 55296) {
                int i47 = charAt19 & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    charAt6 = str2.charAt(i46);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i47 |= (charAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                charAt19 = i47 | (charAt6 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            charAt = str2.charAt(i46);
            if (charAt >= 55296) {
                int i50 = charAt & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    charAt5 = str2.charAt(i49);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i50 |= (charAt5 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                charAt = i50 | (charAt5 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            int charAt20 = str2.charAt(i49);
            if (charAt20 >= 55296) {
                int i53 = charAt20 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    charAt4 = str2.charAt(i52);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i53 |= (charAt4 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                charAt20 = i53 | (charAt4 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            int charAt21 = str2.charAt(i52);
            if (charAt21 >= 55296) {
                int i56 = charAt21 & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    charAt3 = str2.charAt(i55);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i56 |= (charAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i9;
                }
                charAt21 = i56 | (charAt3 << i57);
                i55 = i9;
            }
            int i58 = i55 + 1;
            int charAt22 = str2.charAt(i55);
            if (charAt22 >= 55296) {
                int i59 = charAt22 & 8191;
                int i60 = 13;
                while (true) {
                    i8 = i58 + 1;
                    charAt2 = str2.charAt(i58);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i59 |= (charAt2 & 8191) << i60;
                    i60 += 13;
                    i58 = i8;
                }
                charAt22 = i59 | (charAt2 << i60);
                i58 = i8;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i61 = (charAt16 * 2) + charAt17;
            int i62 = charAt20;
            i2 = charAt18;
            i3 = i62;
            i4 = charAt16;
            i34 = i58;
            iArr = iArr2;
            i5 = charAt19;
            i6 = i61;
            i7 = charAt22;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objArr2 = rawMessageInfo.objects;
        Class<?> cls = rawMessageInfo.defaultInstance.getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr3 = new Object[charAt * 2];
        int i63 = i7 + i3;
        int i64 = i63;
        int i65 = i7;
        int i66 = 0;
        int i67 = 0;
        while (i34 < length) {
            int i68 = i34 + 1;
            int charAt23 = str2.charAt(i34);
            int i69 = length;
            if (charAt23 >= 55296) {
                int i70 = charAt23 & 8191;
                int i71 = i68;
                int i72 = 13;
                while (true) {
                    i31 = i71 + 1;
                    charAt13 = str2.charAt(i71);
                    objArr = objArr2;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i70 |= (charAt13 & 8191) << i72;
                    i72 += 13;
                    i71 = i31;
                    objArr2 = objArr;
                }
                charAt23 = i70 | (charAt13 << i72);
                i16 = i31;
            } else {
                objArr = objArr2;
                i16 = i68;
            }
            int i73 = i16 + 1;
            int charAt24 = str2.charAt(i16);
            if (charAt24 >= 55296) {
                int i74 = charAt24 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i29 = i75 + 1;
                    charAt12 = str2.charAt(i75);
                    i30 = i74;
                    if (charAt12 < 55296) {
                        break;
                    }
                    i74 = i30 | ((charAt12 & 8191) << i76);
                    i76 += 13;
                    i75 = i29;
                }
                charAt24 = i30 | (charAt12 << i76);
                i17 = i29;
            } else {
                i17 = i73;
            }
            int i77 = charAt23;
            int i78 = charAt24 & 255;
            int[] iArr4 = iArr3;
            if ((charAt24 & 1024) != 0) {
                iArr[i67] = i66;
                i67++;
            }
            int i79 = i4;
            if (i78 >= 51) {
                int i80 = i17 + 1;
                int charAt25 = str2.charAt(i17);
                char c = 55296;
                if (charAt25 >= 55296) {
                    int i81 = charAt25 & 8191;
                    int i82 = 13;
                    while (true) {
                        i28 = i80 + 1;
                        charAt11 = str2.charAt(i80);
                        if (charAt11 < c) {
                            break;
                        }
                        i81 |= (charAt11 & 8191) << i82;
                        i82 += 13;
                        i80 = i28;
                        c = 55296;
                    }
                    charAt25 = i81 | (charAt11 << i82);
                    i80 = i28;
                }
                int i83 = i78 - 51;
                int i84 = charAt25;
                if (i83 == 9 || i83 == 17) {
                    i27 = i80;
                    objArr3[Boxes$$ExternalSyntheticOutline1.m$1(i66, 3, 2, 1)] = objArr[i6];
                    i6++;
                } else {
                    if (i83 == 12 && (CameraSelector$$ExternalSyntheticOutline0.equals(rawMessageInfo.getSyntax(), 1) || (charAt24 & 2048) != 0)) {
                        i27 = i80;
                        objArr3[Boxes$$ExternalSyntheticOutline1.m$1(i66, 3, 2, 1)] = objArr[i6];
                        i6++;
                    }
                    i27 = i80;
                }
                int i85 = i84 * 2;
                Object obj = objArr[i85];
                if (obj instanceof Field) {
                    reflectField2 = (Field) obj;
                } else {
                    reflectField2 = reflectField(cls, (String) obj);
                    objArr[i85] = reflectField2;
                }
                int i86 = i63;
                i20 = i6;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(reflectField2);
                int i87 = i85 + 1;
                Object obj2 = objArr[i87];
                if (obj2 instanceof Field) {
                    reflectField3 = (Field) obj2;
                } else {
                    reflectField3 = reflectField(cls, (String) obj2);
                    objArr[i87] = reflectField3;
                }
                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(reflectField3);
                str = str2;
                objectFieldOffset = objectFieldOffset2;
                i21 = i66;
                i23 = i27;
                i22 = objectFieldOffset3;
                i18 = i86;
                i24 = 0;
            } else {
                int i88 = i63;
                int i89 = i6 + 1;
                Field reflectField4 = reflectField(cls, (String) objArr[i6]);
                if (i78 == 9 || i78 == 17) {
                    i18 = i88;
                    objArr3[Boxes$$ExternalSyntheticOutline1.m$1(i66, 3, 2, 1)] = reflectField4.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        i18 = i88;
                        i26 = i6 + 2;
                        objArr3[Boxes$$ExternalSyntheticOutline1.m$1(i66, 3, 2, 1)] = objArr[i89];
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        i18 = i88;
                        if (rawMessageInfo.getSyntax() == 1 || (charAt24 & 2048) != 0) {
                            i26 = i6 + 2;
                            objArr3[Boxes$$ExternalSyntheticOutline1.m$1(i66, 3, 2, 1)] = objArr[i89];
                        }
                    } else if (i78 == 50) {
                        int i90 = i65 + 1;
                        iArr[i65] = i66;
                        int i91 = (i66 / 3) * 2;
                        int i92 = i6 + 2;
                        objArr3[i91] = objArr[i89];
                        if ((charAt24 & 2048) != 0) {
                            i19 = i6 + 3;
                            objArr3[i91 + 1] = objArr[i92];
                            i18 = i88;
                            i65 = i90;
                        } else {
                            i19 = i92;
                            i65 = i90;
                            i18 = i88;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                        if ((charAt24 & 4096) != 0 || i78 > 17) {
                            str = str2;
                            i20 = i19;
                            i21 = i66;
                            i22 = 1048575;
                            i23 = i17;
                            i24 = 0;
                        } else {
                            i23 = i17 + 1;
                            int charAt26 = str2.charAt(i17);
                            if (charAt26 >= 55296) {
                                int i93 = charAt26 & 8191;
                                int i94 = 13;
                                while (true) {
                                    i25 = i23 + 1;
                                    charAt10 = str2.charAt(i23);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i93 |= (charAt10 & 8191) << i94;
                                    i94 += 13;
                                    i23 = i25;
                                }
                                charAt26 = i93 | (charAt10 << i94);
                                i23 = i25;
                            }
                            int i95 = (charAt26 / 32) + (i79 * 2);
                            Object obj3 = objArr[i95];
                            str = str2;
                            if (obj3 instanceof Field) {
                                reflectField = (Field) obj3;
                            } else {
                                reflectField = reflectField(cls, (String) obj3);
                                objArr[i95] = reflectField;
                            }
                            i20 = i19;
                            i21 = i66;
                            i22 = (int) unsafe.objectFieldOffset(reflectField);
                            i24 = charAt26 % 32;
                        }
                        if (i78 >= 18 && i78 <= 49) {
                            iArr[i64] = objectFieldOffset;
                            i64++;
                        }
                    } else {
                        i18 = i88;
                    }
                    i19 = i26;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    str = str2;
                    i20 = i19;
                    i21 = i66;
                    i22 = 1048575;
                    i23 = i17;
                    i24 = 0;
                    if (i78 >= 18) {
                        iArr[i64] = objectFieldOffset;
                        i64++;
                    }
                }
                i19 = i89;
                objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                if ((charAt24 & 4096) != 0) {
                }
                str = str2;
                i20 = i19;
                i21 = i66;
                i22 = 1048575;
                i23 = i17;
                i24 = 0;
                if (i78 >= 18) {
                }
            }
            int i96 = i21 + 1;
            iArr4[i21] = i77;
            int i97 = i21 + 2;
            int i98 = i21;
            iArr4[i96] = ((charAt24 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? PKIFailureInfo.systemUnavail : 0) | (i78 << 20) | objectFieldOffset;
            i66 = i98 + 3;
            iArr4[i97] = (i24 << 20) | i22;
            i34 = i23;
            length = i69;
            iArr3 = iArr4;
            objArr2 = objArr;
            i63 = i18;
            i6 = i20;
            i4 = i79;
            str2 = str;
        }
        return new MessageSchema(iArr3, objArr3, i2, i5, rawMessageInfo.defaultInstance, iArr, i7, i63, newInstanceSchemaLite, listFieldSchemaLite, unknownFieldSchema, extensionSchemaLite, mapFieldSchemaLite);
    }

    public static long offset(int i) {
        return i & 1048575;
    }

    public static int oneofIntAt(Object obj, long j) {
        return ((Integer) UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, j)).intValue();
    }

    public static long oneofLongAt(Object obj, long j) {
        return ((Long) UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, j)).longValue();
    }

    public static Field reflectField(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Field ", str, " for ");
            Boxes$$ExternalSyntheticOutline1.m(cls, m3m, " not found. Known fields are ");
            m3m.append(Arrays.toString(declaredFields));
            throw new RuntimeException(m3m.toString());
        }
    }

    public static int type(int i) {
        return (i & 267386880) >>> 20;
    }

    public final boolean arePresentForEquals(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i) {
        return isFieldPresent(generatedMessageLite, i) == isFieldPresent(generatedMessageLite2, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.SchemaUtil.safeEquals(r5.getObject(r12, r7), r5.getObject(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.getLong(r12, r7) == r5.getLong(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.getInt(r12, r7) == r5.getInt(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.getLong(r12, r7) == r5.getLong(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.getInt(r12, r7) == r5.getInt(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.getInt(r12, r7) == r5.getInt(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.getInt(r12, r7) == r5.getInt(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (androidx.datastore.preferences.protobuf.SchemaUtil.safeEquals(r5.getObject(r12, r7), r5.getObject(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.SchemaUtil.safeEquals(r5.getObject(r12, r7), r5.getObject(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.SchemaUtil.safeEquals(r5.getObject(r12, r7), r5.getObject(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.getBoolean(r12, r7) == r5.getBoolean(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.getInt(r12, r7) == r5.getInt(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.getLong(r12, r7) == r5.getLong(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.getInt(r12, r7) == r5.getInt(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.getLong(r12, r7) == r5.getLong(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.getLong(r12, r7) == r5.getLong(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.getFloat(r12, r7)) == java.lang.Float.floatToIntBits(r5.getFloat(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.getDouble(r12, r7)) == java.lang.Double.doubleToLongBits(r5.getDouble(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (androidx.datastore.preferences.protobuf.SchemaUtil.safeEquals(r9.getObject(r12, r7), r9.getObject(r13, r7)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        int[] iArr = this.buffer;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int typeAndOffsetAt = typeAndOffsetAt(i);
                long j = typeAndOffsetAt & 1048575;
                switch (type(typeAndOffsetAt)) {
                    case 0:
                        if (arePresentForEquals(generatedMessageLite, generatedMessageLite2, i)) {
                            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.MEMORY_ACCESSOR;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (arePresentForEquals(generatedMessageLite, generatedMessageLite2, i)) {
                            UnsafeUtil.MemoryAccessor memoryAccessor2 = UnsafeUtil.MEMORY_ACCESSOR;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (arePresentForEquals(generatedMessageLite, generatedMessageLite2, i)) {
                            UnsafeUtil.MemoryAccessor memoryAccessor3 = UnsafeUtil.MEMORY_ACCESSOR;
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (arePresentForEquals(generatedMessageLite, generatedMessageLite2, i)) {
                            UnsafeUtil.MemoryAccessor memoryAccessor4 = UnsafeUtil.MEMORY_ACCESSOR;
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (arePresentForEquals(generatedMessageLite, generatedMessageLite2, i)) {
                            UnsafeUtil.MemoryAccessor memoryAccessor5 = UnsafeUtil.MEMORY_ACCESSOR;
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (arePresentForEquals(generatedMessageLite, generatedMessageLite2, i)) {
                            UnsafeUtil.MemoryAccessor memoryAccessor6 = UnsafeUtil.MEMORY_ACCESSOR;
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (arePresentForEquals(generatedMessageLite, generatedMessageLite2, i)) {
                            UnsafeUtil.MemoryAccessor memoryAccessor7 = UnsafeUtil.MEMORY_ACCESSOR;
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (arePresentForEquals(generatedMessageLite, generatedMessageLite2, i)) {
                            UnsafeUtil.MemoryAccessor memoryAccessor8 = UnsafeUtil.MEMORY_ACCESSOR;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (arePresentForEquals(generatedMessageLite, generatedMessageLite2, i)) {
                            UnsafeUtil.MemoryAccessor memoryAccessor9 = UnsafeUtil.MEMORY_ACCESSOR;
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (arePresentForEquals(generatedMessageLite, generatedMessageLite2, i)) {
                            UnsafeUtil.MemoryAccessor memoryAccessor10 = UnsafeUtil.MEMORY_ACCESSOR;
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (arePresentForEquals(generatedMessageLite, generatedMessageLite2, i)) {
                            UnsafeUtil.MemoryAccessor memoryAccessor11 = UnsafeUtil.MEMORY_ACCESSOR;
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (arePresentForEquals(generatedMessageLite, generatedMessageLite2, i)) {
                            UnsafeUtil.MemoryAccessor memoryAccessor12 = UnsafeUtil.MEMORY_ACCESSOR;
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (arePresentForEquals(generatedMessageLite, generatedMessageLite2, i)) {
                            UnsafeUtil.MemoryAccessor memoryAccessor13 = UnsafeUtil.MEMORY_ACCESSOR;
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (arePresentForEquals(generatedMessageLite, generatedMessageLite2, i)) {
                            UnsafeUtil.MemoryAccessor memoryAccessor14 = UnsafeUtil.MEMORY_ACCESSOR;
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (arePresentForEquals(generatedMessageLite, generatedMessageLite2, i)) {
                            UnsafeUtil.MemoryAccessor memoryAccessor15 = UnsafeUtil.MEMORY_ACCESSOR;
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (arePresentForEquals(generatedMessageLite, generatedMessageLite2, i)) {
                            UnsafeUtil.MemoryAccessor memoryAccessor16 = UnsafeUtil.MEMORY_ACCESSOR;
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (arePresentForEquals(generatedMessageLite, generatedMessageLite2, i)) {
                            UnsafeUtil.MemoryAccessor memoryAccessor17 = UnsafeUtil.MEMORY_ACCESSOR;
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (arePresentForEquals(generatedMessageLite, generatedMessageLite2, i)) {
                            UnsafeUtil.MemoryAccessor memoryAccessor18 = UnsafeUtil.MEMORY_ACCESSOR;
                            break;
                        }
                        z = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        UnsafeUtil.MemoryAccessor memoryAccessor19 = UnsafeUtil.MEMORY_ACCESSOR;
                        z = SchemaUtil.safeEquals(memoryAccessor19.getObject(generatedMessageLite, j), memoryAccessor19.getObject(generatedMessageLite2, j));
                        break;
                    case 50:
                        UnsafeUtil.MemoryAccessor memoryAccessor20 = UnsafeUtil.MEMORY_ACCESSOR;
                        z = SchemaUtil.safeEquals(memoryAccessor20.getObject(generatedMessageLite, j), memoryAccessor20.getObject(generatedMessageLite2, j));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        UnsafeUtil.MemoryAccessor memoryAccessor21 = UnsafeUtil.MEMORY_ACCESSOR;
                        if (memoryAccessor21.getInt(generatedMessageLite, j2) == memoryAccessor21.getInt(generatedMessageLite2, j2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                UnknownFieldSetLiteSchema unknownFieldSetLiteSchema = (UnknownFieldSetLiteSchema) this.unknownFieldSchema;
                unknownFieldSetLiteSchema.getClass();
                UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
                unknownFieldSetLiteSchema.getClass();
                if (unknownFieldSetLite.equals(generatedMessageLite2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void filterMapUnknownEnumValues(int i, Object obj, Object obj2) {
        int i2 = this.buffer[i];
        if (UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, typeAndOffsetAt(i) & 1048575) == null) {
            return;
        }
        getEnumFieldVerifier(i);
    }

    public final void getEnumFieldVerifier(int i) {
        if (this.objects[Boxes$$ExternalSyntheticOutline1.m$1(i, 3, 2, 1)] == null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1();
    }

    public final Schema getMessageFieldSchema(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.objects;
        Schema schema = (Schema) objArr[i2];
        if (schema != null) {
            return schema;
        }
        Schema schemaFor = Protobuf.INSTANCE.schemaFor((Class) objArr[i2 + 1]);
        objArr[i2] = schemaFor;
        return schemaFor;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0329 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getSerializedSize(GeneratedMessageLite generatedMessageLite) {
        int i;
        int computeTagSize;
        int computeTagSize2;
        int computeTagSize3;
        int computeUInt64SizeNoTag;
        int computeTagSize4;
        int computeUInt64SizeNoTag2;
        int computeTagSize5;
        int computeTagSize6;
        int computeBytesSize;
        int i2;
        int computeSizeFixed64List;
        int i3;
        int i4;
        int computeTagSize7;
        int size;
        int computeSizeUInt64ListNoTag;
        int computeTagSize8;
        int computeTagSize9;
        int size2;
        int computeTagSize10;
        int computeUInt32SizeNoTag;
        int i5;
        int i6;
        int i7;
        int computeUInt64SizeNoTag3;
        int size3;
        int computeUInt32SizeNoTag2;
        WireFormat$FieldType wireFormat$FieldType;
        int computeUInt64SizeNoTag4;
        int size4;
        int computeUInt32SizeNoTag3;
        int computeTagSize11;
        int computeTagSize12;
        int computeTagSize13;
        int computeUInt64SizeNoTag5;
        int computeTagSize14;
        int computeUInt64SizeNoTag6;
        int computeTagSize15;
        int computeUInt32SizeNoTag4;
        MessageSchema messageSchema = this;
        GeneratedMessageLite generatedMessageLite2 = generatedMessageLite;
        Unsafe unsafe = UNSAFE;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = messageSchema.buffer;
            if (i10 >= iArr.length) {
                ((UnknownFieldSetLiteSchema) messageSchema.unknownFieldSchema).getClass();
                return generatedMessageLite2.unknownFields.getSerializedSize() + i12;
            }
            int typeAndOffsetAt = messageSchema.typeAndOffsetAt(i10);
            int type2 = type(typeAndOffsetAt);
            int i13 = iArr[i10];
            int i14 = iArr[i10 + 2];
            int i15 = i14 & i8;
            int i16 = 1;
            if (type2 <= 17) {
                if (i15 != i9) {
                    i11 = i15 == i8 ? 0 : unsafe.getInt(generatedMessageLite2, i15);
                    i9 = i15;
                }
                i = 1 << (i14 >>> 20);
            } else {
                i = 0;
            }
            long j = typeAndOffsetAt & i8;
            if (type2 >= FieldType.DOUBLE_LIST_PACKED.id) {
                int i17 = FieldType.SINT64_LIST_PACKED.id;
            }
            char c = '?';
            switch (type2) {
                case 0:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i10, i9, i11, i)) {
                        computeTagSize = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13) + 8;
                        i12 += computeTagSize;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 1:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i10, i9, i11, i)) {
                        computeTagSize2 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeTagSize6 = computeTagSize2 + 4;
                        i12 += computeTagSize6;
                    }
                    messageSchema = this;
                    generatedMessageLite2 = generatedMessageLite;
                    i10 += 3;
                    i8 = 1048575;
                case 2:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i10, i9, i11, i)) {
                        long j2 = unsafe.getLong(generatedMessageLite2, j);
                        computeTagSize3 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt64SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(j2);
                        i12 += computeUInt64SizeNoTag + computeTagSize3;
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 3:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i10, i9, i11, i)) {
                        long j3 = unsafe.getLong(generatedMessageLite2, j);
                        computeTagSize3 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt64SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(j3);
                        i12 += computeUInt64SizeNoTag + computeTagSize3;
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 4:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i10, i9, i11, i)) {
                        int i18 = unsafe.getInt(generatedMessageLite2, j);
                        computeTagSize4 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt64SizeNoTag2 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(i18);
                        computeBytesSize = computeUInt64SizeNoTag2 + computeTagSize4;
                        i12 += computeBytesSize;
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 5:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i10, i9, i11, i)) {
                        computeTagSize5 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeTagSize6 = computeTagSize5 + 8;
                        i12 += computeTagSize6;
                    }
                    messageSchema = this;
                    generatedMessageLite2 = generatedMessageLite;
                    i10 += 3;
                    i8 = 1048575;
                case 6:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i10, i9, i11, i)) {
                        computeTagSize2 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeTagSize6 = computeTagSize2 + 4;
                        i12 += computeTagSize6;
                    }
                    messageSchema = this;
                    generatedMessageLite2 = generatedMessageLite;
                    i10 += 3;
                    i8 = 1048575;
                case 7:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i10, i9, i11, i)) {
                        computeTagSize6 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13) + 1;
                        i12 += computeTagSize6;
                    }
                    messageSchema = this;
                    generatedMessageLite2 = generatedMessageLite;
                    i10 += 3;
                    i8 = 1048575;
                case 8:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i10, i9, i11, i)) {
                        Object object = unsafe.getObject(generatedMessageLite2, j);
                        i12 = (object instanceof ByteString$LiteralByteString ? CodedOutputStream$OutputStreamEncoder.computeBytesSize(i13, (ByteString$LiteralByteString) object) : CodedOutputStream$OutputStreamEncoder.computeStringSizeNoTag((String) object) + CodedOutputStream$OutputStreamEncoder.computeTagSize(i13)) + i12;
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 9:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i10, i9, i11, i)) {
                        Object object2 = unsafe.getObject(generatedMessageLite2, j);
                        Schema messageFieldSchema = messageSchema.getMessageFieldSchema(i10);
                        Class cls = SchemaUtil.GENERATED_MESSAGE_CLASS;
                        int computeTagSize16 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        int serializedSize = ((AbstractMessageLite) object2).getSerializedSize(messageFieldSchema);
                        i12 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(serializedSize) + serializedSize + computeTagSize16;
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 10:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i10, i9, i11, i)) {
                        computeBytesSize = CodedOutputStream$OutputStreamEncoder.computeBytesSize(i13, (ByteString$LiteralByteString) unsafe.getObject(generatedMessageLite2, j));
                        i12 += computeBytesSize;
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 11:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i10, i9, i11, i)) {
                        int i19 = unsafe.getInt(generatedMessageLite2, j);
                        computeTagSize4 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt64SizeNoTag2 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i19);
                        computeBytesSize = computeUInt64SizeNoTag2 + computeTagSize4;
                        i12 += computeBytesSize;
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 12:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i10, i9, i11, i)) {
                        int i20 = unsafe.getInt(generatedMessageLite2, j);
                        computeTagSize4 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt64SizeNoTag2 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(i20);
                        computeBytesSize = computeUInt64SizeNoTag2 + computeTagSize4;
                        i12 += computeBytesSize;
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 13:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i10, i9, i11, i)) {
                        computeTagSize2 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeTagSize6 = computeTagSize2 + 4;
                        i12 += computeTagSize6;
                    }
                    messageSchema = this;
                    generatedMessageLite2 = generatedMessageLite;
                    i10 += 3;
                    i8 = 1048575;
                case 14:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i10, i9, i11, i)) {
                        computeTagSize5 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeTagSize6 = computeTagSize5 + 8;
                        i12 += computeTagSize6;
                    }
                    messageSchema = this;
                    generatedMessageLite2 = generatedMessageLite;
                    i10 += 3;
                    i8 = 1048575;
                case 15:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i10, i9, i11, i)) {
                        int i21 = unsafe.getInt(generatedMessageLite2, j);
                        computeTagSize4 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt64SizeNoTag2 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag((i21 >> 31) ^ (i21 << 1));
                        computeBytesSize = computeUInt64SizeNoTag2 + computeTagSize4;
                        i12 += computeBytesSize;
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 16:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i10, i9, i11, i)) {
                        long j4 = unsafe.getLong(generatedMessageLite2, j);
                        computeTagSize3 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt64SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag((j4 >> 63) ^ (j4 << 1));
                        i12 += computeUInt64SizeNoTag + computeTagSize3;
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 17:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i10, i9, i11, i)) {
                        computeTagSize = ((AbstractMessageLite) unsafe.getObject(generatedMessageLite2, j)).getSerializedSize(messageSchema.getMessageFieldSchema(i10)) + (CodedOutputStream$OutputStreamEncoder.computeTagSize(i13) * 2);
                        i12 += computeTagSize;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 18:
                    i2 = i9;
                    computeSizeFixed64List = SchemaUtil.computeSizeFixed64List(i13, (List) unsafe.getObject(generatedMessageLite2, j));
                    i12 += computeSizeFixed64List;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 19:
                    i2 = i9;
                    computeSizeFixed64List = SchemaUtil.computeSizeFixed32List(i13, (List) unsafe.getObject(generatedMessageLite2, j));
                    i12 += computeSizeFixed64List;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 20:
                    i2 = i9;
                    i3 = i11;
                    i4 = 0;
                    List list = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls2 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    if (list.size() != 0) {
                        computeTagSize7 = (CodedOutputStream$OutputStreamEncoder.computeTagSize(i13) * list.size()) + SchemaUtil.computeSizeInt64ListNoTag(list);
                        i12 += computeTagSize7;
                        i11 = i3;
                        i9 = i2;
                        i10 += 3;
                        i8 = 1048575;
                    }
                    computeTagSize7 = i4;
                    i12 += computeTagSize7;
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 21:
                    i2 = i9;
                    i3 = i11;
                    i4 = 0;
                    List list2 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls3 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size = list2.size();
                    if (size != 0) {
                        computeSizeUInt64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag(list2);
                        computeTagSize8 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeTagSize7 = (computeTagSize8 * size) + computeSizeUInt64ListNoTag;
                        i12 += computeTagSize7;
                        i11 = i3;
                        i9 = i2;
                        i10 += 3;
                        i8 = 1048575;
                    }
                    computeTagSize7 = i4;
                    i12 += computeTagSize7;
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 22:
                    i2 = i9;
                    i3 = i11;
                    i4 = 0;
                    List list3 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls4 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size = list3.size();
                    if (size != 0) {
                        computeSizeUInt64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag(list3);
                        computeTagSize8 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeTagSize7 = (computeTagSize8 * size) + computeSizeUInt64ListNoTag;
                        i12 += computeTagSize7;
                        i11 = i3;
                        i9 = i2;
                        i10 += 3;
                        i8 = 1048575;
                    }
                    computeTagSize7 = i4;
                    i12 += computeTagSize7;
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 23:
                    i2 = i9;
                    computeSizeFixed64List = SchemaUtil.computeSizeFixed64List(i13, (List) unsafe.getObject(generatedMessageLite2, j));
                    i12 += computeSizeFixed64List;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 24:
                    i2 = i9;
                    computeSizeFixed64List = SchemaUtil.computeSizeFixed32List(i13, (List) unsafe.getObject(generatedMessageLite2, j));
                    i12 += computeSizeFixed64List;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 25:
                    i2 = i9;
                    i3 = i11;
                    List list4 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls5 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    int size5 = list4.size();
                    i12 += size5 == 0 ? 0 : (CodedOutputStream$OutputStreamEncoder.computeTagSize(i13) + 1) * size5;
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 26:
                    i2 = i9;
                    i3 = i11;
                    i4 = 0;
                    List list5 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls6 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    int size6 = list5.size();
                    if (size6 != 0) {
                        computeTagSize7 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13) * size6;
                        if (list5 instanceof LazyStringList) {
                            LazyStringList lazyStringList = (LazyStringList) list5;
                            for (int i22 = 0; i22 < size6; i22++) {
                                Object raw = lazyStringList.getRaw();
                                if (raw instanceof ByteString$LiteralByteString) {
                                    int size7 = ((ByteString$LiteralByteString) raw).size();
                                    computeTagSize7 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size7) + size7 + computeTagSize7;
                                } else {
                                    computeTagSize7 = CodedOutputStream$OutputStreamEncoder.computeStringSizeNoTag((String) raw) + computeTagSize7;
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size6; i23++) {
                                Object obj = list5.get(i23);
                                if (obj instanceof ByteString$LiteralByteString) {
                                    int size8 = ((ByteString$LiteralByteString) obj).size();
                                    computeTagSize7 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size8) + size8 + computeTagSize7;
                                } else {
                                    computeTagSize7 = CodedOutputStream$OutputStreamEncoder.computeStringSizeNoTag((String) obj) + computeTagSize7;
                                }
                            }
                        }
                        i12 += computeTagSize7;
                        i11 = i3;
                        i9 = i2;
                        i10 += 3;
                        i8 = 1048575;
                    }
                    computeTagSize7 = i4;
                    i12 += computeTagSize7;
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 27:
                    i2 = i9;
                    i3 = i11;
                    List list6 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Schema messageFieldSchema2 = messageSchema.getMessageFieldSchema(i10);
                    Class cls7 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    int size9 = list6.size();
                    if (size9 == 0) {
                        computeTagSize9 = 0;
                    } else {
                        computeTagSize9 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13) * size9;
                        for (int i24 = 0; i24 < size9; i24++) {
                            int serializedSize2 = ((AbstractMessageLite) list6.get(i24)).getSerializedSize(messageFieldSchema2);
                            computeTagSize9 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(serializedSize2) + serializedSize2;
                        }
                    }
                    i12 += computeTagSize9;
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 28:
                    i2 = i9;
                    i3 = i11;
                    i4 = 0;
                    List list7 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls8 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    int size10 = list7.size();
                    if (size10 != 0) {
                        computeTagSize7 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13) * size10;
                        for (int i25 = 0; i25 < list7.size(); i25++) {
                            int size11 = ((ByteString$LiteralByteString) list7.get(i25)).size();
                            computeTagSize7 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size11) + size11;
                        }
                        i12 += computeTagSize7;
                        i11 = i3;
                        i9 = i2;
                        i10 += 3;
                        i8 = 1048575;
                    }
                    computeTagSize7 = i4;
                    i12 += computeTagSize7;
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 29:
                    i2 = i9;
                    i3 = i11;
                    i4 = 0;
                    List list8 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls9 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size = list8.size();
                    if (size != 0) {
                        computeSizeUInt64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag(list8);
                        computeTagSize8 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeTagSize7 = (computeTagSize8 * size) + computeSizeUInt64ListNoTag;
                        i12 += computeTagSize7;
                        i11 = i3;
                        i9 = i2;
                        i10 += 3;
                        i8 = 1048575;
                    }
                    computeTagSize7 = i4;
                    i12 += computeTagSize7;
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 30:
                    i2 = i9;
                    i3 = i11;
                    i4 = 0;
                    List list9 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls10 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size = list9.size();
                    if (size != 0) {
                        computeSizeUInt64ListNoTag = SchemaUtil.computeSizeEnumListNoTag(list9);
                        computeTagSize8 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeTagSize7 = (computeTagSize8 * size) + computeSizeUInt64ListNoTag;
                        i12 += computeTagSize7;
                        i11 = i3;
                        i9 = i2;
                        i10 += 3;
                        i8 = 1048575;
                    }
                    computeTagSize7 = i4;
                    i12 += computeTagSize7;
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 31:
                    i2 = i9;
                    computeSizeFixed64List = SchemaUtil.computeSizeFixed32List(i13, (List) unsafe.getObject(generatedMessageLite2, j));
                    i12 += computeSizeFixed64List;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 32:
                    i2 = i9;
                    computeSizeFixed64List = SchemaUtil.computeSizeFixed64List(i13, (List) unsafe.getObject(generatedMessageLite2, j));
                    i12 += computeSizeFixed64List;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 33:
                    i2 = i9;
                    i3 = i11;
                    i4 = 0;
                    List list10 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls11 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size = list10.size();
                    if (size != 0) {
                        computeSizeUInt64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag(list10);
                        computeTagSize8 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeTagSize7 = (computeTagSize8 * size) + computeSizeUInt64ListNoTag;
                        i12 += computeTagSize7;
                        i11 = i3;
                        i9 = i2;
                        i10 += 3;
                        i8 = 1048575;
                    }
                    computeTagSize7 = i4;
                    i12 += computeTagSize7;
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 34:
                    i2 = i9;
                    i3 = i11;
                    i4 = 0;
                    List list11 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls12 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size = list11.size();
                    if (size != 0) {
                        computeSizeUInt64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag(list11);
                        computeTagSize8 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeTagSize7 = (computeTagSize8 * size) + computeSizeUInt64ListNoTag;
                        i12 += computeTagSize7;
                        i11 = i3;
                        i9 = i2;
                        i10 += 3;
                        i8 = 1048575;
                    }
                    computeTagSize7 = i4;
                    i12 += computeTagSize7;
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 35:
                    i2 = i9;
                    i3 = i11;
                    List list12 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls13 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        computeTagSize10 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt32SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size2);
                        i12 += computeUInt32SizeNoTag + computeTagSize10 + size2;
                    }
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 36:
                    i2 = i9;
                    i3 = i11;
                    List list13 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls14 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        computeTagSize10 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt32SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size2);
                        i12 += computeUInt32SizeNoTag + computeTagSize10 + size2;
                    }
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 37:
                    i2 = i9;
                    i3 = i11;
                    size2 = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(generatedMessageLite2, j));
                    if (size2 > 0) {
                        computeTagSize10 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt32SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size2);
                        i12 += computeUInt32SizeNoTag + computeTagSize10 + size2;
                    }
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 38:
                    i2 = i9;
                    i3 = i11;
                    size2 = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(generatedMessageLite2, j));
                    if (size2 > 0) {
                        computeTagSize10 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt32SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size2);
                        i12 += computeUInt32SizeNoTag + computeTagSize10 + size2;
                    }
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 39:
                    i2 = i9;
                    i3 = i11;
                    size2 = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(generatedMessageLite2, j));
                    if (size2 > 0) {
                        computeTagSize10 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt32SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size2);
                        i12 += computeUInt32SizeNoTag + computeTagSize10 + size2;
                    }
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 40:
                    i2 = i9;
                    i3 = i11;
                    List list14 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls15 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        computeTagSize10 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt32SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size2);
                        i12 += computeUInt32SizeNoTag + computeTagSize10 + size2;
                    }
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 41:
                    i2 = i9;
                    i3 = i11;
                    List list15 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls16 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        computeTagSize10 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt32SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size2);
                        i12 += computeUInt32SizeNoTag + computeTagSize10 + size2;
                    }
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 42:
                    i2 = i9;
                    i3 = i11;
                    List list16 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls17 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size2 = list16.size();
                    if (size2 > 0) {
                        computeTagSize10 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt32SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size2);
                        i12 += computeUInt32SizeNoTag + computeTagSize10 + size2;
                    }
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 43:
                    i2 = i9;
                    i3 = i11;
                    size2 = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(generatedMessageLite2, j));
                    if (size2 > 0) {
                        computeTagSize10 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt32SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size2);
                        i12 += computeUInt32SizeNoTag + computeTagSize10 + size2;
                    }
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 44:
                    i2 = i9;
                    i3 = i11;
                    size2 = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(generatedMessageLite2, j));
                    if (size2 > 0) {
                        computeTagSize10 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt32SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size2);
                        i12 += computeUInt32SizeNoTag + computeTagSize10 + size2;
                    }
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 45:
                    i2 = i9;
                    i3 = i11;
                    List list17 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls18 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        computeTagSize10 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt32SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size2);
                        i12 += computeUInt32SizeNoTag + computeTagSize10 + size2;
                    }
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 46:
                    i2 = i9;
                    i3 = i11;
                    List list18 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls19 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        computeTagSize10 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt32SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size2);
                        i12 += computeUInt32SizeNoTag + computeTagSize10 + size2;
                    }
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 47:
                    i2 = i9;
                    i3 = i11;
                    size2 = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(generatedMessageLite2, j));
                    if (size2 > 0) {
                        computeTagSize10 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt32SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size2);
                        i12 += computeUInt32SizeNoTag + computeTagSize10 + size2;
                    }
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 48:
                    i2 = i9;
                    i3 = i11;
                    size2 = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(generatedMessageLite2, j));
                    if (size2 > 0) {
                        computeTagSize10 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt32SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size2);
                        i12 += computeUInt32SizeNoTag + computeTagSize10 + size2;
                    }
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 49:
                    i2 = i9;
                    i3 = i11;
                    List list19 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Schema messageFieldSchema3 = messageSchema.getMessageFieldSchema(i10);
                    Class cls20 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    int size12 = list19.size();
                    if (size12 == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (int i26 = 0; i26 < size12; i26++) {
                            i5 += ((AbstractMessageLite) list19.get(i26)).getSerializedSize(messageFieldSchema3) + (CodedOutputStream$OutputStreamEncoder.computeTagSize(i13) * 2);
                        }
                    }
                    i12 += i5;
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 50:
                    Object object3 = unsafe.getObject(generatedMessageLite2, j);
                    Object obj2 = messageSchema.objects[(i10 / 3) * 2];
                    messageSchema.mapFieldSchema.getClass();
                    MapFieldLite mapFieldLite = (MapFieldLite) object3;
                    MapEntryLite mapEntryLite = (MapEntryLite) obj2;
                    if (!mapFieldLite.isEmpty()) {
                        i6 = 0;
                        for (Map.Entry entry : mapFieldLite.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            mapEntryLite.getClass();
                            int computeTagSize17 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                            GrpcMethod grpcMethod = mapEntryLite.metadata;
                            char c2 = c;
                            WireFormat$FieldType wireFormat$FieldType2 = (WireFormat$FieldType) grpcMethod.path;
                            int i27 = FieldSet.$r8$clinit;
                            int computeTagSize18 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i16);
                            int i28 = i16;
                            WireFormat$FieldType.AnonymousClass2 anonymousClass2 = WireFormat$FieldType.GROUP;
                            if (wireFormat$FieldType2 == anonymousClass2) {
                                computeTagSize18 *= 2;
                            }
                            int i29 = i9;
                            switch (wireFormat$FieldType2.ordinal()) {
                                case 0:
                                    i7 = i11;
                                    ((Double) key).getClass();
                                    computeUInt64SizeNoTag3 = 8;
                                    int i30 = computeUInt64SizeNoTag3 + computeTagSize18;
                                    wireFormat$FieldType = (WireFormat$FieldType) grpcMethod.requestAdapter;
                                    int computeTagSize19 = CodedOutputStream$OutputStreamEncoder.computeTagSize(2);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                        computeTagSize19 *= 2;
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            computeUInt64SizeNoTag4 = 8;
                                            int i31 = computeUInt64SizeNoTag4 + computeTagSize19 + i30;
                                            i6 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i31) + i31 + computeTagSize17;
                                            i11 = i7;
                                            c = c2;
                                            i16 = i28;
                                            i9 = i29;
                                        case 1:
                                            ((Float) value).getClass();
                                            computeUInt64SizeNoTag4 = 4;
                                            int i312 = computeUInt64SizeNoTag4 + computeTagSize19 + i30;
                                            i6 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i312) + i312 + computeTagSize17;
                                            i11 = i7;
                                            c = c2;
                                            i16 = i28;
                                            i9 = i29;
                                        case 2:
                                            computeUInt64SizeNoTag4 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(((Long) value).longValue());
                                            int i3122 = computeUInt64SizeNoTag4 + computeTagSize19 + i30;
                                            i6 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i3122) + i3122 + computeTagSize17;
                                            i11 = i7;
                                            c = c2;
                                            i16 = i28;
                                            i9 = i29;
                                        case 3:
                                            computeUInt64SizeNoTag4 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(((Long) value).longValue());
                                            int i31222 = computeUInt64SizeNoTag4 + computeTagSize19 + i30;
                                            i6 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i31222) + i31222 + computeTagSize17;
                                            i11 = i7;
                                            c = c2;
                                            i16 = i28;
                                            i9 = i29;
                                        case 4:
                                            computeUInt64SizeNoTag4 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(((Integer) value).intValue());
                                            int i312222 = computeUInt64SizeNoTag4 + computeTagSize19 + i30;
                                            i6 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i312222) + i312222 + computeTagSize17;
                                            i11 = i7;
                                            c = c2;
                                            i16 = i28;
                                            i9 = i29;
                                        case 5:
                                            ((Long) value).getClass();
                                            computeUInt64SizeNoTag4 = 8;
                                            int i3122222 = computeUInt64SizeNoTag4 + computeTagSize19 + i30;
                                            i6 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i3122222) + i3122222 + computeTagSize17;
                                            i11 = i7;
                                            c = c2;
                                            i16 = i28;
                                            i9 = i29;
                                        case 6:
                                            ((Integer) value).getClass();
                                            computeUInt64SizeNoTag4 = 4;
                                            int i31222222 = computeUInt64SizeNoTag4 + computeTagSize19 + i30;
                                            i6 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i31222222) + i31222222 + computeTagSize17;
                                            i11 = i7;
                                            c = c2;
                                            i16 = i28;
                                            i9 = i29;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            computeUInt64SizeNoTag4 = i28;
                                            int i312222222 = computeUInt64SizeNoTag4 + computeTagSize19 + i30;
                                            i6 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i312222222) + i312222222 + computeTagSize17;
                                            i11 = i7;
                                            c = c2;
                                            i16 = i28;
                                            i9 = i29;
                                        case 8:
                                            if (value instanceof ByteString$LiteralByteString) {
                                                size4 = ((ByteString$LiteralByteString) value).size();
                                                computeUInt32SizeNoTag3 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size4);
                                                computeUInt64SizeNoTag4 = size4 + computeUInt32SizeNoTag3;
                                                int i3122222222 = computeUInt64SizeNoTag4 + computeTagSize19 + i30;
                                                i6 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i3122222222) + i3122222222 + computeTagSize17;
                                                i11 = i7;
                                                c = c2;
                                                i16 = i28;
                                                i9 = i29;
                                            } else {
                                                computeUInt64SizeNoTag4 = CodedOutputStream$OutputStreamEncoder.computeStringSizeNoTag((String) value);
                                                int i31222222222 = computeUInt64SizeNoTag4 + computeTagSize19 + i30;
                                                i6 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i31222222222) + i31222222222 + computeTagSize17;
                                                i11 = i7;
                                                c = c2;
                                                i16 = i28;
                                                i9 = i29;
                                            }
                                        case 9:
                                            computeUInt64SizeNoTag4 = ((GeneratedMessageLite) ((AbstractMessageLite) value)).getSerializedSize(null);
                                            int i312222222222 = computeUInt64SizeNoTag4 + computeTagSize19 + i30;
                                            i6 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i312222222222) + i312222222222 + computeTagSize17;
                                            i11 = i7;
                                            c = c2;
                                            i16 = i28;
                                            i9 = i29;
                                        case 10:
                                            size4 = ((GeneratedMessageLite) ((AbstractMessageLite) value)).getSerializedSize(null);
                                            computeUInt32SizeNoTag3 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size4);
                                            computeUInt64SizeNoTag4 = size4 + computeUInt32SizeNoTag3;
                                            int i3122222222222 = computeUInt64SizeNoTag4 + computeTagSize19 + i30;
                                            i6 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i3122222222222) + i3122222222222 + computeTagSize17;
                                            i11 = i7;
                                            c = c2;
                                            i16 = i28;
                                            i9 = i29;
                                        case 11:
                                            if (value instanceof ByteString$LiteralByteString) {
                                                size4 = ((ByteString$LiteralByteString) value).size();
                                                computeUInt32SizeNoTag3 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                computeUInt32SizeNoTag3 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size4);
                                            }
                                            computeUInt64SizeNoTag4 = size4 + computeUInt32SizeNoTag3;
                                            int i31222222222222 = computeUInt64SizeNoTag4 + computeTagSize19 + i30;
                                            i6 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i31222222222222) + i31222222222222 + computeTagSize17;
                                            i11 = i7;
                                            c = c2;
                                            i16 = i28;
                                            i9 = i29;
                                        case 12:
                                            computeUInt64SizeNoTag4 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(((Integer) value).intValue());
                                            int i312222222222222 = computeUInt64SizeNoTag4 + computeTagSize19 + i30;
                                            i6 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i312222222222222) + i312222222222222 + computeTagSize17;
                                            i11 = i7;
                                            c = c2;
                                            i16 = i28;
                                            i9 = i29;
                                        case 13:
                                            computeUInt64SizeNoTag4 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(((Integer) value).intValue());
                                            int i3122222222222222 = computeUInt64SizeNoTag4 + computeTagSize19 + i30;
                                            i6 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i3122222222222222) + i3122222222222222 + computeTagSize17;
                                            i11 = i7;
                                            c = c2;
                                            i16 = i28;
                                            i9 = i29;
                                        case 14:
                                            ((Integer) value).getClass();
                                            computeUInt64SizeNoTag4 = 4;
                                            int i31222222222222222 = computeUInt64SizeNoTag4 + computeTagSize19 + i30;
                                            i6 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i31222222222222222) + i31222222222222222 + computeTagSize17;
                                            i11 = i7;
                                            c = c2;
                                            i16 = i28;
                                            i9 = i29;
                                        case 15:
                                            ((Long) value).getClass();
                                            computeUInt64SizeNoTag4 = 8;
                                            int i312222222222222222 = computeUInt64SizeNoTag4 + computeTagSize19 + i30;
                                            i6 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i312222222222222222) + i312222222222222222 + computeTagSize17;
                                            i11 = i7;
                                            c = c2;
                                            i16 = i28;
                                            i9 = i29;
                                        case 16:
                                            int intValue = ((Integer) value).intValue();
                                            computeUInt64SizeNoTag4 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag((intValue >> 31) ^ (intValue << 1));
                                            int i3122222222222222222 = computeUInt64SizeNoTag4 + computeTagSize19 + i30;
                                            i6 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i3122222222222222222) + i3122222222222222222 + computeTagSize17;
                                            i11 = i7;
                                            c = c2;
                                            i16 = i28;
                                            i9 = i29;
                                        case 17:
                                            long longValue = ((Long) value).longValue();
                                            computeUInt64SizeNoTag4 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag((longValue << i28) ^ (longValue >> c2));
                                            int i31222222222222222222 = computeUInt64SizeNoTag4 + computeTagSize19 + i30;
                                            i6 += CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i31222222222222222222) + i31222222222222222222 + computeTagSize17;
                                            i11 = i7;
                                            c = c2;
                                            i16 = i28;
                                            i9 = i29;
                                        default:
                                            OptionalProvider$$ExternalSyntheticLambda0.m$1("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                case 1:
                                    i7 = i11;
                                    ((Float) key).getClass();
                                    computeUInt64SizeNoTag3 = 4;
                                    int i302 = computeUInt64SizeNoTag3 + computeTagSize18;
                                    wireFormat$FieldType = (WireFormat$FieldType) grpcMethod.requestAdapter;
                                    int computeTagSize192 = CodedOutputStream$OutputStreamEncoder.computeTagSize(2);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 2:
                                    i7 = i11;
                                    computeUInt64SizeNoTag3 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(((Long) key).longValue());
                                    int i3022 = computeUInt64SizeNoTag3 + computeTagSize18;
                                    wireFormat$FieldType = (WireFormat$FieldType) grpcMethod.requestAdapter;
                                    int computeTagSize1922 = CodedOutputStream$OutputStreamEncoder.computeTagSize(2);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 3:
                                    i7 = i11;
                                    computeUInt64SizeNoTag3 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(((Long) key).longValue());
                                    int i30222 = computeUInt64SizeNoTag3 + computeTagSize18;
                                    wireFormat$FieldType = (WireFormat$FieldType) grpcMethod.requestAdapter;
                                    int computeTagSize19222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(2);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 4:
                                    i7 = i11;
                                    computeUInt64SizeNoTag3 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(((Integer) key).intValue());
                                    int i302222 = computeUInt64SizeNoTag3 + computeTagSize18;
                                    wireFormat$FieldType = (WireFormat$FieldType) grpcMethod.requestAdapter;
                                    int computeTagSize192222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(2);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 5:
                                    i7 = i11;
                                    ((Long) key).getClass();
                                    computeUInt64SizeNoTag3 = 8;
                                    int i3022222 = computeUInt64SizeNoTag3 + computeTagSize18;
                                    wireFormat$FieldType = (WireFormat$FieldType) grpcMethod.requestAdapter;
                                    int computeTagSize1922222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(2);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 6:
                                    i7 = i11;
                                    ((Integer) key).getClass();
                                    computeUInt64SizeNoTag3 = 4;
                                    int i30222222 = computeUInt64SizeNoTag3 + computeTagSize18;
                                    wireFormat$FieldType = (WireFormat$FieldType) grpcMethod.requestAdapter;
                                    int computeTagSize19222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(2);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 7:
                                    i7 = i11;
                                    ((Boolean) key).getClass();
                                    computeUInt64SizeNoTag3 = i28;
                                    int i302222222 = computeUInt64SizeNoTag3 + computeTagSize18;
                                    wireFormat$FieldType = (WireFormat$FieldType) grpcMethod.requestAdapter;
                                    int computeTagSize192222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(2);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 8:
                                    i7 = i11;
                                    if (key instanceof ByteString$LiteralByteString) {
                                        size3 = ((ByteString$LiteralByteString) key).size();
                                        computeUInt32SizeNoTag2 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size3);
                                        computeUInt64SizeNoTag3 = computeUInt32SizeNoTag2 + size3;
                                        int i3022222222 = computeUInt64SizeNoTag3 + computeTagSize18;
                                        wireFormat$FieldType = (WireFormat$FieldType) grpcMethod.requestAdapter;
                                        int computeTagSize1922222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(2);
                                        if (wireFormat$FieldType == anonymousClass2) {
                                        }
                                        switch (wireFormat$FieldType.ordinal()) {
                                        }
                                    } else {
                                        computeUInt64SizeNoTag3 = CodedOutputStream$OutputStreamEncoder.computeStringSizeNoTag((String) key);
                                        int i30222222222 = computeUInt64SizeNoTag3 + computeTagSize18;
                                        wireFormat$FieldType = (WireFormat$FieldType) grpcMethod.requestAdapter;
                                        int computeTagSize19222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(2);
                                        if (wireFormat$FieldType == anonymousClass2) {
                                        }
                                        switch (wireFormat$FieldType.ordinal()) {
                                        }
                                    }
                                case 9:
                                    i7 = i11;
                                    computeUInt64SizeNoTag3 = ((GeneratedMessageLite) ((AbstractMessageLite) key)).getSerializedSize(null);
                                    int i302222222222 = computeUInt64SizeNoTag3 + computeTagSize18;
                                    wireFormat$FieldType = (WireFormat$FieldType) grpcMethod.requestAdapter;
                                    int computeTagSize192222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(2);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 10:
                                    i7 = i11;
                                    int serializedSize3 = ((GeneratedMessageLite) ((AbstractMessageLite) key)).getSerializedSize(null);
                                    computeUInt64SizeNoTag3 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(serializedSize3) + serializedSize3;
                                    int i3022222222222 = computeUInt64SizeNoTag3 + computeTagSize18;
                                    wireFormat$FieldType = (WireFormat$FieldType) grpcMethod.requestAdapter;
                                    int computeTagSize1922222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(2);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 11:
                                    i7 = i11;
                                    if (key instanceof ByteString$LiteralByteString) {
                                        size3 = ((ByteString$LiteralByteString) key).size();
                                        computeUInt32SizeNoTag2 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size3);
                                    } else {
                                        size3 = ((byte[]) key).length;
                                        computeUInt32SizeNoTag2 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size3);
                                    }
                                    computeUInt64SizeNoTag3 = computeUInt32SizeNoTag2 + size3;
                                    int i30222222222222 = computeUInt64SizeNoTag3 + computeTagSize18;
                                    wireFormat$FieldType = (WireFormat$FieldType) grpcMethod.requestAdapter;
                                    int computeTagSize19222222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(2);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 12:
                                    i7 = i11;
                                    computeUInt64SizeNoTag3 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(((Integer) key).intValue());
                                    int i302222222222222 = computeUInt64SizeNoTag3 + computeTagSize18;
                                    wireFormat$FieldType = (WireFormat$FieldType) grpcMethod.requestAdapter;
                                    int computeTagSize192222222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(2);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 13:
                                    i7 = i11;
                                    computeUInt64SizeNoTag3 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(((Integer) key).intValue());
                                    int i3022222222222222 = computeUInt64SizeNoTag3 + computeTagSize18;
                                    wireFormat$FieldType = (WireFormat$FieldType) grpcMethod.requestAdapter;
                                    int computeTagSize1922222222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(2);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 14:
                                    ((Integer) key).getClass();
                                    i7 = i11;
                                    computeUInt64SizeNoTag3 = 4;
                                    int i30222222222222222 = computeUInt64SizeNoTag3 + computeTagSize18;
                                    wireFormat$FieldType = (WireFormat$FieldType) grpcMethod.requestAdapter;
                                    int computeTagSize19222222222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(2);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 15:
                                    ((Long) key).getClass();
                                    i7 = i11;
                                    computeUInt64SizeNoTag3 = 8;
                                    int i302222222222222222 = computeUInt64SizeNoTag3 + computeTagSize18;
                                    wireFormat$FieldType = (WireFormat$FieldType) grpcMethod.requestAdapter;
                                    int computeTagSize192222222222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(2);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((Integer) key).intValue();
                                    computeUInt64SizeNoTag3 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag((intValue2 >> 31) ^ (intValue2 << 1));
                                    i7 = i11;
                                    int i3022222222222222222 = computeUInt64SizeNoTag3 + computeTagSize18;
                                    wireFormat$FieldType = (WireFormat$FieldType) grpcMethod.requestAdapter;
                                    int computeTagSize1922222222222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(2);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((Long) key).longValue();
                                    computeUInt64SizeNoTag3 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag((longValue2 << i28) ^ (longValue2 >> c2));
                                    i7 = i11;
                                    int i30222222222222222222 = computeUInt64SizeNoTag3 + computeTagSize18;
                                    wireFormat$FieldType = (WireFormat$FieldType) grpcMethod.requestAdapter;
                                    int computeTagSize19222222222222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(2);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                default:
                                    OptionalProvider$$ExternalSyntheticLambda0.m$1("There is no way to get here, but the compiler thinks otherwise.");
                                    break;
                            }
                        }
                    } else {
                        i6 = 0;
                    }
                    i2 = i9;
                    i3 = i11;
                    i12 += i6;
                    i11 = i3;
                    i9 = i2;
                    i10 += 3;
                    i8 = 1048575;
                case 51:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i13, i10)) {
                        computeTagSize11 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeTagSize15 = computeTagSize11 + 8;
                        i12 += computeTagSize15;
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 52:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i13, i10)) {
                        computeTagSize12 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeTagSize15 = computeTagSize12 + 4;
                        i12 += computeTagSize15;
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 53:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i13, i10)) {
                        long oneofLongAt = oneofLongAt(generatedMessageLite2, j);
                        computeTagSize13 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt64SizeNoTag5 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(oneofLongAt);
                        computeUInt32SizeNoTag4 = computeUInt64SizeNoTag5 + computeTagSize13;
                        i12 += computeUInt32SizeNoTag4;
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 54:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i13, i10)) {
                        long oneofLongAt2 = oneofLongAt(generatedMessageLite2, j);
                        computeTagSize13 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt64SizeNoTag5 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(oneofLongAt2);
                        computeUInt32SizeNoTag4 = computeUInt64SizeNoTag5 + computeTagSize13;
                        i12 += computeUInt32SizeNoTag4;
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 55:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i13, i10)) {
                        int oneofIntAt = oneofIntAt(generatedMessageLite2, j);
                        computeTagSize14 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt64SizeNoTag6 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(oneofIntAt);
                        computeTagSize15 = computeUInt64SizeNoTag6 + computeTagSize14;
                        i12 += computeTagSize15;
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 56:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i13, i10)) {
                        computeTagSize11 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeTagSize15 = computeTagSize11 + 8;
                        i12 += computeTagSize15;
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 57:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i13, i10)) {
                        computeTagSize12 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeTagSize15 = computeTagSize12 + 4;
                        i12 += computeTagSize15;
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 58:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i13, i10)) {
                        computeTagSize15 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13) + 1;
                        i12 += computeTagSize15;
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 59:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i13, i10)) {
                        Object object4 = unsafe.getObject(generatedMessageLite2, j);
                        i12 = (object4 instanceof ByteString$LiteralByteString ? CodedOutputStream$OutputStreamEncoder.computeBytesSize(i13, (ByteString$LiteralByteString) object4) : CodedOutputStream$OutputStreamEncoder.computeStringSizeNoTag((String) object4) + CodedOutputStream$OutputStreamEncoder.computeTagSize(i13)) + i12;
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 60:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i13, i10)) {
                        Object object5 = unsafe.getObject(generatedMessageLite2, j);
                        Schema messageFieldSchema4 = messageSchema.getMessageFieldSchema(i10);
                        Class cls21 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                        int computeTagSize20 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        int serializedSize4 = ((AbstractMessageLite) object5).getSerializedSize(messageFieldSchema4);
                        computeUInt32SizeNoTag4 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(serializedSize4) + serializedSize4 + computeTagSize20;
                        i12 += computeUInt32SizeNoTag4;
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 61:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i13, i10)) {
                        computeTagSize15 = CodedOutputStream$OutputStreamEncoder.computeBytesSize(i13, (ByteString$LiteralByteString) unsafe.getObject(generatedMessageLite2, j));
                        i12 += computeTagSize15;
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 62:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i13, i10)) {
                        int oneofIntAt2 = oneofIntAt(generatedMessageLite2, j);
                        computeTagSize14 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt64SizeNoTag6 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(oneofIntAt2);
                        computeTagSize15 = computeUInt64SizeNoTag6 + computeTagSize14;
                        i12 += computeTagSize15;
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 63:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i13, i10)) {
                        int oneofIntAt3 = oneofIntAt(generatedMessageLite2, j);
                        computeTagSize14 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt64SizeNoTag6 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(oneofIntAt3);
                        computeTagSize15 = computeUInt64SizeNoTag6 + computeTagSize14;
                        i12 += computeTagSize15;
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 64:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i13, i10)) {
                        computeTagSize12 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeTagSize15 = computeTagSize12 + 4;
                        i12 += computeTagSize15;
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 65:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i13, i10)) {
                        computeTagSize11 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeTagSize15 = computeTagSize11 + 8;
                        i12 += computeTagSize15;
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 66:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i13, i10)) {
                        int oneofIntAt4 = oneofIntAt(generatedMessageLite2, j);
                        computeTagSize14 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt64SizeNoTag6 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag((oneofIntAt4 >> 31) ^ (oneofIntAt4 << 1));
                        computeTagSize15 = computeUInt64SizeNoTag6 + computeTagSize14;
                        i12 += computeTagSize15;
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 67:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i13, i10)) {
                        long oneofLongAt3 = oneofLongAt(generatedMessageLite2, j);
                        computeTagSize13 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i13);
                        computeUInt64SizeNoTag5 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag((oneofLongAt3 << 1) ^ (oneofLongAt3 >> 63));
                        computeUInt32SizeNoTag4 = computeUInt64SizeNoTag5 + computeTagSize13;
                        i12 += computeUInt32SizeNoTag4;
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 68:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i13, i10)) {
                        computeTagSize15 = ((AbstractMessageLite) unsafe.getObject(generatedMessageLite2, j)).getSerializedSize(messageSchema.getMessageFieldSchema(i10)) + (CodedOutputStream$OutputStreamEncoder.computeTagSize(i13) * 2);
                        i12 += computeTagSize15;
                    }
                    i10 += 3;
                    i8 = 1048575;
                default:
                    i10 += 3;
                    i8 = 1048575;
            }
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int hashCode(GeneratedMessageLite generatedMessageLite) {
        int i;
        int hashLong;
        int i2;
        int[] iArr = this.buffer;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i4);
            int i5 = iArr[i4];
            long j = 1048575 & typeAndOffsetAt;
            int i6 = 1237;
            int i7 = 37;
            switch (type(typeAndOffsetAt)) {
                case 0:
                    i = i3 * 53;
                    hashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.MEMORY_ACCESSOR.getDouble(generatedMessageLite, j)));
                    i3 = hashLong + i;
                    break;
                case 1:
                    i = i3 * 53;
                    hashLong = Float.floatToIntBits(UnsafeUtil.MEMORY_ACCESSOR.getFloat(generatedMessageLite, j));
                    i3 = hashLong + i;
                    break;
                case 2:
                    i = i3 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.MEMORY_ACCESSOR.getLong(generatedMessageLite, j));
                    i3 = hashLong + i;
                    break;
                case 3:
                    i = i3 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.MEMORY_ACCESSOR.getLong(generatedMessageLite, j));
                    i3 = hashLong + i;
                    break;
                case 4:
                    i = i3 * 53;
                    hashLong = UnsafeUtil.MEMORY_ACCESSOR.getInt(generatedMessageLite, j);
                    i3 = hashLong + i;
                    break;
                case 5:
                    i = i3 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.MEMORY_ACCESSOR.getLong(generatedMessageLite, j));
                    i3 = hashLong + i;
                    break;
                case 6:
                    i = i3 * 53;
                    hashLong = UnsafeUtil.MEMORY_ACCESSOR.getInt(generatedMessageLite, j);
                    i3 = hashLong + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean z = UnsafeUtil.MEMORY_ACCESSOR.getBoolean(generatedMessageLite, j);
                    Charset charset = Internal.UTF_8;
                    break;
                case 8:
                    i = i3 * 53;
                    hashLong = ((String) UnsafeUtil.MEMORY_ACCESSOR.getObject(generatedMessageLite, j)).hashCode();
                    i3 = hashLong + i;
                    break;
                case 9:
                    Object object = UnsafeUtil.MEMORY_ACCESSOR.getObject(generatedMessageLite, j);
                    if (object != null) {
                        i7 = object.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    hashLong = UnsafeUtil.MEMORY_ACCESSOR.getObject(generatedMessageLite, j).hashCode();
                    i3 = hashLong + i;
                    break;
                case 11:
                    i = i3 * 53;
                    hashLong = UnsafeUtil.MEMORY_ACCESSOR.getInt(generatedMessageLite, j);
                    i3 = hashLong + i;
                    break;
                case 12:
                    i = i3 * 53;
                    hashLong = UnsafeUtil.MEMORY_ACCESSOR.getInt(generatedMessageLite, j);
                    i3 = hashLong + i;
                    break;
                case 13:
                    i = i3 * 53;
                    hashLong = UnsafeUtil.MEMORY_ACCESSOR.getInt(generatedMessageLite, j);
                    i3 = hashLong + i;
                    break;
                case 14:
                    i = i3 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.MEMORY_ACCESSOR.getLong(generatedMessageLite, j));
                    i3 = hashLong + i;
                    break;
                case 15:
                    i = i3 * 53;
                    hashLong = UnsafeUtil.MEMORY_ACCESSOR.getInt(generatedMessageLite, j);
                    i3 = hashLong + i;
                    break;
                case 16:
                    i = i3 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.MEMORY_ACCESSOR.getLong(generatedMessageLite, j));
                    i3 = hashLong + i;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.MEMORY_ACCESSOR.getObject(generatedMessageLite, j);
                    if (object2 != null) {
                        i7 = object2.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    hashLong = UnsafeUtil.MEMORY_ACCESSOR.getObject(generatedMessageLite, j).hashCode();
                    i3 = hashLong + i;
                    break;
                case 50:
                    i = i3 * 53;
                    hashLong = UnsafeUtil.MEMORY_ACCESSOR.getObject(generatedMessageLite, j).hashCode();
                    i3 = hashLong + i;
                    break;
                case 51:
                    if (isOneofPresent(generatedMessageLite, i5, i4)) {
                        i = i3 * 53;
                        hashLong = Internal.hashLong(Double.doubleToLongBits(((Double) UnsafeUtil.MEMORY_ACCESSOR.getObject(generatedMessageLite, j)).doubleValue()));
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(generatedMessageLite, i5, i4)) {
                        i = i3 * 53;
                        hashLong = Float.floatToIntBits(((Float) UnsafeUtil.MEMORY_ACCESSOR.getObject(generatedMessageLite, j)).floatValue());
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(generatedMessageLite, i5, i4)) {
                        i = i3 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(generatedMessageLite, j));
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(generatedMessageLite, i5, i4)) {
                        i = i3 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(generatedMessageLite, j));
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(generatedMessageLite, i5, i4)) {
                        i = i3 * 53;
                        hashLong = oneofIntAt(generatedMessageLite, j);
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(generatedMessageLite, i5, i4)) {
                        i = i3 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(generatedMessageLite, j));
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(generatedMessageLite, i5, i4)) {
                        i = i3 * 53;
                        hashLong = oneofIntAt(generatedMessageLite, j);
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(generatedMessageLite, i5, i4)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) UnsafeUtil.MEMORY_ACCESSOR.getObject(generatedMessageLite, j)).booleanValue();
                        Charset charset2 = Internal.UTF_8;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(generatedMessageLite, i5, i4)) {
                        i = i3 * 53;
                        hashLong = ((String) UnsafeUtil.MEMORY_ACCESSOR.getObject(generatedMessageLite, j)).hashCode();
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(generatedMessageLite, i5, i4)) {
                        i = i3 * 53;
                        hashLong = UnsafeUtil.MEMORY_ACCESSOR.getObject(generatedMessageLite, j).hashCode();
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(generatedMessageLite, i5, i4)) {
                        i = i3 * 53;
                        hashLong = UnsafeUtil.MEMORY_ACCESSOR.getObject(generatedMessageLite, j).hashCode();
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(generatedMessageLite, i5, i4)) {
                        i = i3 * 53;
                        hashLong = oneofIntAt(generatedMessageLite, j);
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(generatedMessageLite, i5, i4)) {
                        i = i3 * 53;
                        hashLong = oneofIntAt(generatedMessageLite, j);
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(generatedMessageLite, i5, i4)) {
                        i = i3 * 53;
                        hashLong = oneofIntAt(generatedMessageLite, j);
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(generatedMessageLite, i5, i4)) {
                        i = i3 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(generatedMessageLite, j));
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(generatedMessageLite, i5, i4)) {
                        i = i3 * 53;
                        hashLong = oneofIntAt(generatedMessageLite, j);
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(generatedMessageLite, i5, i4)) {
                        i = i3 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(generatedMessageLite, j));
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(generatedMessageLite, i5, i4)) {
                        i = i3 * 53;
                        hashLong = UnsafeUtil.MEMORY_ACCESSOR.getObject(generatedMessageLite, j).hashCode();
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((UnknownFieldSetLiteSchema) this.unknownFieldSchema).getClass();
        return generatedMessageLite.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0110 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isFieldPresent(Object obj, int i) {
        int i2 = this.buffer[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int typeAndOffsetAt = typeAndOffsetAt(i);
            long j2 = typeAndOffsetAt & 1048575;
            switch (type(typeAndOffsetAt)) {
                case 0:
                    return Double.doubleToRawLongBits(UnsafeUtil.MEMORY_ACCESSOR.getDouble(obj, j2)) != 0;
                case 1:
                    if (Float.floatToRawIntBits(UnsafeUtil.MEMORY_ACCESSOR.getFloat(obj, j2)) != 0) {
                    }
                    break;
                case 2:
                    if (UnsafeUtil.MEMORY_ACCESSOR.getLong(obj, j2) != 0) {
                    }
                    break;
                case 3:
                    if (UnsafeUtil.MEMORY_ACCESSOR.getLong(obj, j2) != 0) {
                    }
                    break;
                case 4:
                    if (UnsafeUtil.MEMORY_ACCESSOR.getInt(obj, j2) != 0) {
                    }
                    break;
                case 5:
                    if (UnsafeUtil.MEMORY_ACCESSOR.getLong(obj, j2) != 0) {
                    }
                    break;
                case 6:
                    if (UnsafeUtil.MEMORY_ACCESSOR.getInt(obj, j2) != 0) {
                    }
                    break;
                case 7:
                    return UnsafeUtil.MEMORY_ACCESSOR.getBoolean(obj, j2);
                case 8:
                    Object object = UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, j2);
                    if (object instanceof String) {
                        return !((String) object).isEmpty();
                    }
                    if (object instanceof ByteString$LiteralByteString) {
                        return !ByteString$LiteralByteString.EMPTY.equals(object);
                    }
                    Path$$ExternalSyntheticBUOutline0.m$3();
                    return false;
                case 9:
                    if (UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, j2) != null) {
                    }
                    break;
                case 10:
                    return !ByteString$LiteralByteString.EMPTY.equals(UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, j2));
                case 11:
                    if (UnsafeUtil.MEMORY_ACCESSOR.getInt(obj, j2) != 0) {
                    }
                    break;
                case 12:
                    if (UnsafeUtil.MEMORY_ACCESSOR.getInt(obj, j2) != 0) {
                    }
                    break;
                case 13:
                    if (UnsafeUtil.MEMORY_ACCESSOR.getInt(obj, j2) != 0) {
                    }
                    break;
                case 14:
                    if (UnsafeUtil.MEMORY_ACCESSOR.getLong(obj, j2) != 0) {
                    }
                    break;
                case 15:
                    if (UnsafeUtil.MEMORY_ACCESSOR.getInt(obj, j2) != 0) {
                    }
                    break;
                case 16:
                    if (UnsafeUtil.MEMORY_ACCESSOR.getLong(obj, j2) != 0) {
                    }
                    break;
                case 17:
                    if (UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, j2) != null) {
                    }
                    break;
                default:
                    Path$$ExternalSyntheticBUOutline0.m$3();
                    return false;
            }
        } else if (((1 << (i2 >>> 20)) & UnsafeUtil.MEMORY_ACCESSOR.getInt(obj, j)) != 0) {
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.checkInitializedCount) {
            int i7 = this.intArray[i6];
            int[] iArr = this.buffer;
            int i8 = iArr[i7];
            int typeAndOffsetAt = typeAndOffsetAt(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = UNSAFE.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & typeAndOffsetAt) == 0 || isFieldPresent(obj, i2, i, i3, i11)) {
                int type2 = type(typeAndOffsetAt);
                if (type2 == 9 || type2 == 17) {
                    if (isFieldPresent(obj, i2, i, i3, i11)) {
                        if (!getMessageFieldSchema(i2).isInitialized(UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, typeAndOffsetAt & 1048575))) {
                        }
                    } else {
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (type2 != 27) {
                        if (type2 == 60 || type2 == 68) {
                            if (isOneofPresent(obj, i8, i2)) {
                                if (!getMessageFieldSchema(i2).isInitialized(UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, typeAndOffsetAt & 1048575))) {
                                }
                            } else {
                                continue;
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        } else if (type2 != 49) {
                            if (type2 != 50) {
                                continue;
                            } else {
                                Object object = UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, typeAndOffsetAt & 1048575);
                                this.mapFieldSchema.getClass();
                                MapFieldLite mapFieldLite = (MapFieldLite) object;
                                if (mapFieldLite.isEmpty()) {
                                    continue;
                                } else {
                                    if (((WireFormat$FieldType) ((MapEntryLite) this.objects[(i2 / 3) * 2]).metadata.requestAdapter).javaType != WireFormat$JavaType.MESSAGE) {
                                        continue;
                                    } else {
                                        Schema schema = null;
                                        for (Object obj2 : mapFieldLite.values()) {
                                            if (schema == null) {
                                                schema = Protobuf.INSTANCE.schemaFor(obj2.getClass());
                                            }
                                            if (!schema.isInitialized(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, typeAndOffsetAt & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        Schema messageFieldSchema = getMessageFieldSchema(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (messageFieldSchema.isInitialized(list.get(i13))) {
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean isOneofPresent(Object obj, int i, int i2) {
        return UnsafeUtil.MEMORY_ACCESSOR.getInt(obj, (long) (this.buffer[i2 + 2] & 1048575)) == i;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void makeImmutable(Object obj) {
        if (isMutable(obj)) {
            if (obj instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                generatedMessageLite.setMemoizedSerializedSize(Integer.MAX_VALUE);
                generatedMessageLite.memoizedHashCode = 0;
                generatedMessageLite.markImmutable();
            }
            int[] iArr = this.buffer;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int typeAndOffsetAt = typeAndOffsetAt(i);
                long j = 1048575 & typeAndOffsetAt;
                int type2 = type(typeAndOffsetAt);
                if (type2 != 9) {
                    if (type2 != 60 && type2 != 68) {
                        switch (type2) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.listFieldSchema.getClass();
                                AbstractProtobufList abstractProtobufList = (AbstractProtobufList) ((Internal.ProtobufList) UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, j));
                                if (abstractProtobufList.isMutable) {
                                    abstractProtobufList.isMutable = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Unsafe unsafe = UNSAFE;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.mapFieldSchema.getClass();
                                    ((MapFieldLite) object).isMutable = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (isOneofPresent(obj, iArr[i], i)) {
                        getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(obj, j));
                    }
                }
                if (isFieldPresent(obj, i)) {
                    getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(obj, j));
                }
            }
            ((UnknownFieldSetLiteSchema) this.unknownFieldSchema).getClass();
            UnknownFieldSetLite unknownFieldSetLite = ((GeneratedMessageLite) obj).unknownFields;
            if (unknownFieldSetLite.isMutable) {
                unknownFieldSetLite.isMutable = false;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void mergeFrom(java.lang.Object r19, androidx.datastore.preferences.protobuf.CodedInputStreamReader r20, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r21) {
        /*
            Method dump skipped, instructions count: 1868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.mergeFrom(java.lang.Object, androidx.datastore.preferences.protobuf.CodedInputStreamReader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        r9.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        r10.popLimit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a3, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mergeMap(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, CodedInputStreamReader codedInputStreamReader) {
        long typeAndOffsetAt = typeAndOffsetAt(i) & 1048575;
        Object object = UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, typeAndOffsetAt);
        MapFieldSchemaLite mapFieldSchemaLite = this.mapFieldSchema;
        if (object == null) {
            mapFieldSchemaLite.getClass();
            object = MapFieldLite.EMPTY_MAP_FIELD.mutableCopy();
            UnsafeUtil.putObject(obj, typeAndOffsetAt, object);
        } else {
            mapFieldSchemaLite.getClass();
            if (!((MapFieldLite) object).isMutable) {
                MapFieldLite mutableCopy = MapFieldLite.EMPTY_MAP_FIELD.mutableCopy();
                MapFieldSchemaLite.mergeFrom(mutableCopy, object);
                UnsafeUtil.putObject(obj, typeAndOffsetAt, mutableCopy);
                object = mutableCopy;
            }
        }
        mapFieldSchemaLite.getClass();
        MapFieldLite mapFieldLite = (MapFieldLite) object;
        GrpcMethod grpcMethod = ((MapEntryLite) obj2).metadata;
        codedInputStreamReader.requireWireType(2);
        zzabh zzabhVar = codedInputStreamReader.input;
        int pushLimit = zzabhVar.pushLimit(zzabhVar.readUInt32());
        Object obj3 = grpcMethod.responseAdapter;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int fieldNumber = codedInputStreamReader.getFieldNumber();
                if (fieldNumber == Integer.MAX_VALUE || zzabhVar.isAtEnd()) {
                    break;
                }
                if (fieldNumber == 1) {
                    obj4 = codedInputStreamReader.readField((WireFormat$FieldType) grpcMethod.path, null, null);
                } else if (fieldNumber != 2) {
                    try {
                        if (!codedInputStreamReader.skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!codedInputStreamReader.skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = codedInputStreamReader.readField((WireFormat$FieldType) grpcMethod.requestAdapter, obj3.getClass(), extensionRegistryLite);
                }
            } catch (Throwable th) {
                zzabhVar.popLimit(pushLimit);
                throw th;
            }
        }
    }

    public final void mergeMessage(Object obj, Object obj2, int i) {
        if (isFieldPresent(obj2, i)) {
            long typeAndOffsetAt = typeAndOffsetAt(i) & 1048575;
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(obj2, typeAndOffsetAt);
            if (object == null) {
                JWK$$ExternalSyntheticBUOutline0.m(this.buffer[i], obj2);
                return;
            }
            Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isFieldPresent(obj, i)) {
                if (isMutable(object)) {
                    GeneratedMessageLite newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(obj, typeAndOffsetAt, newInstance);
                } else {
                    unsafe.putObject(obj, typeAndOffsetAt, object);
                }
                setFieldPresent(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, typeAndOffsetAt);
            if (!isMutable(object2)) {
                GeneratedMessageLite newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(obj, typeAndOffsetAt, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    public final void mergeOneofMessage(Object obj, Object obj2, int i) {
        int[] iArr = this.buffer;
        int i2 = iArr[i];
        if (isOneofPresent(obj2, i2, i)) {
            long typeAndOffsetAt = typeAndOffsetAt(i) & 1048575;
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(obj2, typeAndOffsetAt);
            if (object == null) {
                JWK$$ExternalSyntheticBUOutline0.m(iArr[i], obj2);
                return;
            }
            Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isOneofPresent(obj, i2, i)) {
                if (isMutable(object)) {
                    GeneratedMessageLite newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(obj, typeAndOffsetAt, newInstance);
                } else {
                    unsafe.putObject(obj, typeAndOffsetAt, object);
                }
                setOneofPresent(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, typeAndOffsetAt);
            if (!isMutable(object2)) {
                GeneratedMessageLite newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(obj, typeAndOffsetAt, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    public final Object mutableMessageFieldForMerge(Object obj, int i) {
        Schema messageFieldSchema = getMessageFieldSchema(i);
        long typeAndOffsetAt = typeAndOffsetAt(i) & 1048575;
        if (!isFieldPresent(obj, i)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(obj, typeAndOffsetAt);
        if (isMutable(object)) {
            return object;
        }
        GeneratedMessageLite newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    public final Object mutableOneofMessageFieldForMerge(Object obj, int i, int i2) {
        Schema messageFieldSchema = getMessageFieldSchema(i2);
        if (!isOneofPresent(obj, i, i2)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(obj, typeAndOffsetAt(i2) & 1048575);
        if (isMutable(object)) {
            return object;
        }
        GeneratedMessageLite newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final GeneratedMessageLite newInstance() {
        this.newInstanceSchema.getClass();
        return ((GeneratedMessageLite) this.defaultInstance).newMutableInstance$1();
    }

    public final int positionForFieldNumber(int i) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        int[] iArr = this.buffer;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void readGroupList(Object obj, long j, CodedInputStreamReader codedInputStreamReader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        this.listFieldSchema.getClass();
        Internal.ProtobufList mutableListAt = ListFieldSchemaLite.mutableListAt(obj, j);
        zzabh zzabhVar = codedInputStreamReader.input;
        int i = codedInputStreamReader.tag;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            GeneratedMessageLite newInstance = schema.newInstance();
            codedInputStreamReader.mergeGroupFieldInternal(newInstance, schema, extensionRegistryLite);
            schema.makeImmutable(newInstance);
            mutableListAt.add(newInstance);
            if (zzabhVar.isAtEnd() || codedInputStreamReader.nextTag != 0) {
                return;
            } else {
                readTag = zzabhVar.readTag();
            }
        } while (readTag == i);
        codedInputStreamReader.nextTag = readTag;
    }

    public final void readMessageList(Object obj, int i, CodedInputStreamReader codedInputStreamReader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        this.listFieldSchema.getClass();
        Internal.ProtobufList mutableListAt = ListFieldSchemaLite.mutableListAt(obj, i & 1048575);
        zzabh zzabhVar = codedInputStreamReader.input;
        int i2 = codedInputStreamReader.tag;
        if ((i2 & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            GeneratedMessageLite newInstance = schema.newInstance();
            codedInputStreamReader.mergeMessageFieldInternal(newInstance, schema, extensionRegistryLite);
            schema.makeImmutable(newInstance);
            mutableListAt.add(newInstance);
            if (zzabhVar.isAtEnd() || codedInputStreamReader.nextTag != 0) {
                return;
            } else {
                readTag = zzabhVar.readTag();
            }
        } while (readTag == i2);
        codedInputStreamReader.nextTag = readTag;
    }

    public final void readString(int i, CodedInputStreamReader codedInputStreamReader, Object obj) {
        if ((536870912 & i) != 0) {
            codedInputStreamReader.requireWireType(2);
            UnsafeUtil.putObject(obj, i & 1048575, codedInputStreamReader.input.readStringRequireUtf8());
        } else if (!this.lite) {
            UnsafeUtil.putObject(obj, i & 1048575, codedInputStreamReader.readBytes());
        } else {
            codedInputStreamReader.requireWireType(2);
            UnsafeUtil.putObject(obj, i & 1048575, codedInputStreamReader.input.readString());
        }
    }

    public final void readStringList(int i, CodedInputStreamReader codedInputStreamReader, Object obj) {
        boolean z = (536870912 & i) != 0;
        ListFieldSchemaLite listFieldSchemaLite = this.listFieldSchema;
        if (z) {
            listFieldSchemaLite.getClass();
            codedInputStreamReader.readStringListInternal(ListFieldSchemaLite.mutableListAt(obj, i & 1048575), true);
        } else {
            listFieldSchemaLite.getClass();
            codedInputStreamReader.readStringListInternal(ListFieldSchemaLite.mutableListAt(obj, i & 1048575), false);
        }
    }

    public final void setFieldPresent(Object obj, int i) {
        int i2 = this.buffer[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        UnsafeUtil.putInt(obj, j, (1 << (i2 >>> 20)) | UnsafeUtil.MEMORY_ACCESSOR.getInt(obj, j));
    }

    public final void setOneofPresent(Object obj, int i, int i2) {
        UnsafeUtil.putInt(obj, this.buffer[i2 + 2] & 1048575, i);
    }

    public final void storeMessageField(Object obj, int i, AbstractMessageLite abstractMessageLite) {
        UNSAFE.putObject(obj, typeAndOffsetAt(i) & 1048575, abstractMessageLite);
        setFieldPresent(obj, i);
    }

    public final void storeOneofMessageField(Object obj, int i, int i2, AbstractMessageLite abstractMessageLite) {
        UNSAFE.putObject(obj, typeAndOffsetAt(i2) & 1048575, abstractMessageLite);
        setOneofPresent(obj, i, i2);
    }

    public final int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0394  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeFieldsInAscendingOrder(Object obj, ManifestSchemaFactory manifestSchemaFactory) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        Iterator it;
        int computeUInt64SizeNoTag;
        int size;
        int computeUInt32SizeNoTag;
        int serializedSize;
        int computeUInt32SizeNoTag2;
        int i7;
        int computeUInt64SizeNoTag2;
        int size2;
        int computeUInt32SizeNoTag3;
        MessageSchema messageSchema = this;
        int[] iArr = messageSchema.buffer;
        int length = iArr.length;
        Unsafe unsafe = UNSAFE;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int typeAndOffsetAt = messageSchema.typeAndOffsetAt(i10);
            int i12 = iArr[i10];
            int type2 = type(typeAndOffsetAt);
            int i13 = 1;
            if (type2 <= 17) {
                int i14 = iArr[i10 + 2];
                int i15 = i14 & i8;
                if (i15 != i9) {
                    i11 = i15 == i8 ? 0 : unsafe.getInt(obj, i15);
                    i9 = i15;
                }
                i = typeAndOffsetAt;
                i2 = 1 << (i14 >>> 20);
            } else {
                i = typeAndOffsetAt;
                i2 = 0;
            }
            long j = i & i8;
            switch (type2) {
                case 0:
                    if (messageSchema.isFieldPresent(obj, i10, i9, i11, i2)) {
                        double d = UnsafeUtil.MEMORY_ACCESSOR.getDouble(obj, j);
                        CodedOutputStream$OutputStreamEncoder codedOutputStream$OutputStreamEncoder = (CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory;
                        codedOutputStream$OutputStreamEncoder.getClass();
                        codedOutputStream$OutputStreamEncoder.writeFixed64(i12, Double.doubleToRawLongBits(d));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 1:
                    if (messageSchema.isFieldPresent(obj, i10, i9, i11, i2)) {
                        float f = UnsafeUtil.MEMORY_ACCESSOR.getFloat(obj, j);
                        CodedOutputStream$OutputStreamEncoder codedOutputStream$OutputStreamEncoder2 = (CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory;
                        codedOutputStream$OutputStreamEncoder2.getClass();
                        codedOutputStream$OutputStreamEncoder2.writeFixed32(i12, Float.floatToRawIntBits(f));
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 2:
                    if (messageSchema.isFieldPresent(obj, i10, i9, i11, i2)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeUInt64(i12, unsafe.getLong(obj, j));
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 3:
                    if (messageSchema.isFieldPresent(obj, i10, i9, i11, i2)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeUInt64(i12, unsafe.getLong(obj, j));
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 4:
                    if (messageSchema.isFieldPresent(obj, i10, i9, i11, i2)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeInt32(i12, unsafe.getInt(obj, j));
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 5:
                    if (messageSchema.isFieldPresent(obj, i10, i9, i11, i2)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeFixed64(i12, unsafe.getLong(obj, j));
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 6:
                    if (messageSchema.isFieldPresent(obj, i10, i9, i11, i2)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeFixed32(i12, unsafe.getInt(obj, j));
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 7:
                    if (messageSchema.isFieldPresent(obj, i10, i9, i11, i2)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeBool(i12, UnsafeUtil.MEMORY_ACCESSOR.getBoolean(obj, j));
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 8:
                    if (messageSchema.isFieldPresent(obj, i10, i9, i11, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeString(i12, (String) object);
                        } else {
                            ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeBytes(i12, (ByteString$LiteralByteString) object);
                        }
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 9:
                    if (messageSchema.isFieldPresent(obj, i10, i9, i11, i2)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeMessage(i12, (AbstractMessageLite) unsafe.getObject(obj, j), messageSchema.getMessageFieldSchema(i10));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 10:
                    if (messageSchema.isFieldPresent(obj, i10, i9, i11, i2)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeBytes(i12, (ByteString$LiteralByteString) unsafe.getObject(obj, j));
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 11:
                    if (messageSchema.isFieldPresent(obj, i10, i9, i11, i2)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeUInt32(i12, unsafe.getInt(obj, j));
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 12:
                    if (messageSchema.isFieldPresent(obj, i10, i9, i11, i2)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeInt32(i12, unsafe.getInt(obj, j));
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 13:
                    if (messageSchema.isFieldPresent(obj, i10, i9, i11, i2)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeFixed32(i12, unsafe.getInt(obj, j));
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 14:
                    if (messageSchema.isFieldPresent(obj, i10, i9, i11, i2)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeFixed64(i12, unsafe.getLong(obj, j));
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 15:
                    if (messageSchema.isFieldPresent(obj, i10, i9, i11, i2)) {
                        int i16 = unsafe.getInt(obj, j);
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeUInt32(i12, (i16 >> 31) ^ (i16 << 1));
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 16:
                    if (messageSchema.isFieldPresent(obj, i10, i9, i11, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeUInt64(i12, (j2 >> 63) ^ (j2 << 1));
                    }
                    messageSchema = this;
                    i10 += 3;
                    i8 = 1048575;
                case 17:
                    if (messageSchema.isFieldPresent(obj, i10, i9, i11, i2)) {
                        manifestSchemaFactory.writeGroup(i12, unsafe.getObject(obj, j), messageSchema.getMessageFieldSchema(i10));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 18:
                    i3 = i9;
                    i4 = i11;
                    SchemaUtil.writeDoubleList(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    i9 = i3;
                    i11 = i4;
                    i10 += 3;
                    i8 = 1048575;
                case 19:
                    i3 = i9;
                    i4 = i11;
                    SchemaUtil.writeFloatList(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    i9 = i3;
                    i11 = i4;
                    i10 += 3;
                    i8 = 1048575;
                case 20:
                    i3 = i9;
                    i4 = i11;
                    SchemaUtil.writeInt64List(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    i9 = i3;
                    i11 = i4;
                    i10 += 3;
                    i8 = 1048575;
                case 21:
                    i3 = i9;
                    i4 = i11;
                    SchemaUtil.writeUInt64List(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    i9 = i3;
                    i11 = i4;
                    i10 += 3;
                    i8 = 1048575;
                case 22:
                    i3 = i9;
                    i4 = i11;
                    SchemaUtil.writeInt32List(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    i9 = i3;
                    i11 = i4;
                    i10 += 3;
                    i8 = 1048575;
                case 23:
                    i3 = i9;
                    i4 = i11;
                    SchemaUtil.writeFixed64List(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    i9 = i3;
                    i11 = i4;
                    i10 += 3;
                    i8 = 1048575;
                case 24:
                    i3 = i9;
                    i4 = i11;
                    SchemaUtil.writeFixed32List(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    i9 = i3;
                    i11 = i4;
                    i10 += 3;
                    i8 = 1048575;
                case 25:
                    i3 = i9;
                    i4 = i11;
                    SchemaUtil.writeBoolList(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    i9 = i3;
                    i11 = i4;
                    i10 += 3;
                    i8 = 1048575;
                case 26:
                    i5 = i9;
                    i6 = i11;
                    int i17 = iArr[i10];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    if (list != null && !list.isEmpty()) {
                        CodedOutputStream$OutputStreamEncoder codedOutputStream$OutputStreamEncoder3 = (CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory;
                        if (list instanceof LazyStringList) {
                            LazyStringList lazyStringList = (LazyStringList) list;
                            for (int i18 = 0; i18 < list.size(); i18++) {
                                Object raw = lazyStringList.getRaw();
                                if (raw instanceof String) {
                                    codedOutputStream$OutputStreamEncoder3.writeString(i17, (String) raw);
                                } else {
                                    codedOutputStream$OutputStreamEncoder3.writeBytes(i17, (ByteString$LiteralByteString) raw);
                                }
                            }
                        } else {
                            for (int i19 = 0; i19 < list.size(); i19++) {
                                codedOutputStream$OutputStreamEncoder3.writeString(i17, (String) list.get(i19));
                            }
                        }
                    }
                    i9 = i5;
                    i11 = i6;
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 27:
                    i5 = i9;
                    i6 = i11;
                    int i20 = iArr[i10];
                    List list2 = (List) unsafe.getObject(obj, j);
                    Schema messageFieldSchema = messageSchema.getMessageFieldSchema(i10);
                    Class cls2 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    if (list2 != null && !list2.isEmpty()) {
                        manifestSchemaFactory.getClass();
                        for (int i21 = 0; i21 < list2.size(); i21++) {
                            ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeMessage(i20, (AbstractMessageLite) list2.get(i21), messageFieldSchema);
                        }
                    }
                    i9 = i5;
                    i11 = i6;
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 28:
                    i5 = i9;
                    i6 = i11;
                    int i22 = iArr[i10];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    if (list3 != null && !list3.isEmpty()) {
                        manifestSchemaFactory.getClass();
                        for (int i23 = 0; i23 < list3.size(); i23++) {
                            ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeBytes(i22, (ByteString$LiteralByteString) list3.get(i23));
                        }
                    }
                    i9 = i5;
                    i11 = i6;
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 29:
                    i3 = i9;
                    i4 = i11;
                    z = false;
                    SchemaUtil.writeUInt32List(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    i9 = i3;
                    i11 = i4;
                    i10 += 3;
                    i8 = 1048575;
                case 30:
                    i3 = i9;
                    i4 = i11;
                    z = false;
                    SchemaUtil.writeEnumList(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    i9 = i3;
                    i11 = i4;
                    i10 += 3;
                    i8 = 1048575;
                case 31:
                    i3 = i9;
                    i4 = i11;
                    z = false;
                    SchemaUtil.writeSFixed32List(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    i9 = i3;
                    i11 = i4;
                    i10 += 3;
                    i8 = 1048575;
                case 32:
                    i3 = i9;
                    i4 = i11;
                    z = false;
                    SchemaUtil.writeSFixed64List(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    i9 = i3;
                    i11 = i4;
                    i10 += 3;
                    i8 = 1048575;
                case 33:
                    i3 = i9;
                    i4 = i11;
                    z = false;
                    SchemaUtil.writeSInt32List(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    i9 = i3;
                    i11 = i4;
                    i10 += 3;
                    i8 = 1048575;
                case 34:
                    i3 = i9;
                    i4 = i11;
                    z = false;
                    SchemaUtil.writeSInt64List(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    i9 = i3;
                    i11 = i4;
                    i10 += 3;
                    i8 = 1048575;
                case 35:
                    i5 = i9;
                    i6 = i11;
                    SchemaUtil.writeDoubleList(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, true);
                    i9 = i5;
                    i11 = i6;
                    i10 += 3;
                    i8 = 1048575;
                case 36:
                    i5 = i9;
                    i6 = i11;
                    SchemaUtil.writeFloatList(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, true);
                    i9 = i5;
                    i11 = i6;
                    i10 += 3;
                    i8 = 1048575;
                case 37:
                    i5 = i9;
                    i6 = i11;
                    SchemaUtil.writeInt64List(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, true);
                    i9 = i5;
                    i11 = i6;
                    i10 += 3;
                    i8 = 1048575;
                case 38:
                    i5 = i9;
                    i6 = i11;
                    SchemaUtil.writeUInt64List(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, true);
                    i9 = i5;
                    i11 = i6;
                    i10 += 3;
                    i8 = 1048575;
                case 39:
                    i5 = i9;
                    i6 = i11;
                    SchemaUtil.writeInt32List(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, true);
                    i9 = i5;
                    i11 = i6;
                    i10 += 3;
                    i8 = 1048575;
                case 40:
                    i5 = i9;
                    i6 = i11;
                    SchemaUtil.writeFixed64List(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, true);
                    i9 = i5;
                    i11 = i6;
                    i10 += 3;
                    i8 = 1048575;
                case 41:
                    i5 = i9;
                    i6 = i11;
                    SchemaUtil.writeFixed32List(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, true);
                    i9 = i5;
                    i11 = i6;
                    i10 += 3;
                    i8 = 1048575;
                case 42:
                    i5 = i9;
                    i6 = i11;
                    SchemaUtil.writeBoolList(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, true);
                    i9 = i5;
                    i11 = i6;
                    i10 += 3;
                    i8 = 1048575;
                case 43:
                    i5 = i9;
                    i6 = i11;
                    SchemaUtil.writeUInt32List(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, true);
                    i9 = i5;
                    i11 = i6;
                    i10 += 3;
                    i8 = 1048575;
                case 44:
                    i5 = i9;
                    i6 = i11;
                    SchemaUtil.writeEnumList(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, true);
                    i9 = i5;
                    i11 = i6;
                    i10 += 3;
                    i8 = 1048575;
                case 45:
                    i5 = i9;
                    i6 = i11;
                    SchemaUtil.writeSFixed32List(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, true);
                    i9 = i5;
                    i11 = i6;
                    i10 += 3;
                    i8 = 1048575;
                case 46:
                    i5 = i9;
                    i6 = i11;
                    SchemaUtil.writeSFixed64List(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, true);
                    i9 = i5;
                    i11 = i6;
                    i10 += 3;
                    i8 = 1048575;
                case 47:
                    i5 = i9;
                    i6 = i11;
                    SchemaUtil.writeSInt32List(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, true);
                    i9 = i5;
                    i11 = i6;
                    i10 += 3;
                    i8 = 1048575;
                case 48:
                    i5 = i9;
                    i6 = i11;
                    SchemaUtil.writeSInt64List(iArr[i10], (List) unsafe.getObject(obj, j), manifestSchemaFactory, true);
                    i9 = i5;
                    i11 = i6;
                    i10 += 3;
                    i8 = 1048575;
                case 49:
                    i5 = i9;
                    i6 = i11;
                    int i24 = iArr[i10];
                    List list4 = (List) unsafe.getObject(obj, j);
                    Schema messageFieldSchema2 = messageSchema.getMessageFieldSchema(i10);
                    Class cls4 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    if (list4 != null && !list4.isEmpty()) {
                        manifestSchemaFactory.getClass();
                        for (int i25 = 0; i25 < list4.size(); i25++) {
                            manifestSchemaFactory.writeGroup(i24, list4.get(i25), messageFieldSchema2);
                        }
                    }
                    i9 = i5;
                    i11 = i6;
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i26 = 2;
                        Object obj2 = messageSchema.objects[(i10 / 3) * 2];
                        messageSchema.mapFieldSchema.getClass();
                        GrpcMethod grpcMethod = ((MapEntryLite) obj2).metadata;
                        WireFormat$FieldType wireFormat$FieldType = (WireFormat$FieldType) grpcMethod.requestAdapter;
                        WireFormat$FieldType wireFormat$FieldType2 = (WireFormat$FieldType) grpcMethod.path;
                        CodedOutputStream$OutputStreamEncoder codedOutputStream$OutputStreamEncoder4 = (CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory;
                        codedOutputStream$OutputStreamEncoder4.getClass();
                        Iterator it2 = ((MapFieldLite) object2).entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            codedOutputStream$OutputStreamEncoder4.writeTag(i12, i26);
                            int i27 = i26;
                            Object key = entry.getKey();
                            int i28 = i13;
                            Object value = entry.getValue();
                            int i29 = FieldSet.$r8$clinit;
                            int computeTagSize = CodedOutputStream$OutputStreamEncoder.computeTagSize(i28);
                            int i30 = i9;
                            WireFormat$FieldType.AnonymousClass2 anonymousClass2 = WireFormat$FieldType.GROUP;
                            if (wireFormat$FieldType2 == anonymousClass2) {
                                computeTagSize *= 2;
                            }
                            int i31 = i11;
                            switch (wireFormat$FieldType2.ordinal()) {
                                case 0:
                                    it = it2;
                                    ((Double) key).getClass();
                                    computeUInt64SizeNoTag = 8;
                                    int i32 = computeUInt64SizeNoTag + computeTagSize;
                                    int computeTagSize2 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i27);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                        computeTagSize2 *= 2;
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                        case 0:
                                            i7 = i32;
                                            ((Double) value).getClass();
                                            computeUInt64SizeNoTag2 = 8;
                                            codedOutputStream$OutputStreamEncoder4.writeUInt32NoTag(computeUInt64SizeNoTag2 + computeTagSize2 + i7);
                                            Object key2 = entry.getKey();
                                            Object value2 = entry.getValue();
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType2, i28, key2);
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType, i27, value2);
                                            i26 = i27;
                                            i9 = i30;
                                            it2 = it;
                                            i11 = i31;
                                            i13 = 1;
                                        case 1:
                                            i7 = i32;
                                            ((Float) value).getClass();
                                            computeUInt64SizeNoTag2 = 4;
                                            codedOutputStream$OutputStreamEncoder4.writeUInt32NoTag(computeUInt64SizeNoTag2 + computeTagSize2 + i7);
                                            Object key22 = entry.getKey();
                                            Object value22 = entry.getValue();
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType2, i28, key22);
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType, i27, value22);
                                            i26 = i27;
                                            i9 = i30;
                                            it2 = it;
                                            i11 = i31;
                                            i13 = 1;
                                        case 2:
                                            i7 = i32;
                                            computeUInt64SizeNoTag2 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(((Long) value).longValue());
                                            codedOutputStream$OutputStreamEncoder4.writeUInt32NoTag(computeUInt64SizeNoTag2 + computeTagSize2 + i7);
                                            Object key222 = entry.getKey();
                                            Object value222 = entry.getValue();
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType2, i28, key222);
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType, i27, value222);
                                            i26 = i27;
                                            i9 = i30;
                                            it2 = it;
                                            i11 = i31;
                                            i13 = 1;
                                        case 3:
                                            i7 = i32;
                                            computeUInt64SizeNoTag2 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(((Long) value).longValue());
                                            codedOutputStream$OutputStreamEncoder4.writeUInt32NoTag(computeUInt64SizeNoTag2 + computeTagSize2 + i7);
                                            Object key2222 = entry.getKey();
                                            Object value2222 = entry.getValue();
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType2, i28, key2222);
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType, i27, value2222);
                                            i26 = i27;
                                            i9 = i30;
                                            it2 = it;
                                            i11 = i31;
                                            i13 = 1;
                                        case 4:
                                            i7 = i32;
                                            computeUInt64SizeNoTag2 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(((Integer) value).intValue());
                                            codedOutputStream$OutputStreamEncoder4.writeUInt32NoTag(computeUInt64SizeNoTag2 + computeTagSize2 + i7);
                                            Object key22222 = entry.getKey();
                                            Object value22222 = entry.getValue();
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType2, i28, key22222);
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType, i27, value22222);
                                            i26 = i27;
                                            i9 = i30;
                                            it2 = it;
                                            i11 = i31;
                                            i13 = 1;
                                        case 5:
                                            i7 = i32;
                                            ((Long) value).getClass();
                                            computeUInt64SizeNoTag2 = 8;
                                            codedOutputStream$OutputStreamEncoder4.writeUInt32NoTag(computeUInt64SizeNoTag2 + computeTagSize2 + i7);
                                            Object key222222 = entry.getKey();
                                            Object value222222 = entry.getValue();
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType2, i28, key222222);
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType, i27, value222222);
                                            i26 = i27;
                                            i9 = i30;
                                            it2 = it;
                                            i11 = i31;
                                            i13 = 1;
                                        case 6:
                                            i7 = i32;
                                            ((Integer) value).getClass();
                                            computeUInt64SizeNoTag2 = 4;
                                            codedOutputStream$OutputStreamEncoder4.writeUInt32NoTag(computeUInt64SizeNoTag2 + computeTagSize2 + i7);
                                            Object key2222222 = entry.getKey();
                                            Object value2222222 = entry.getValue();
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType2, i28, key2222222);
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType, i27, value2222222);
                                            i26 = i27;
                                            i9 = i30;
                                            it2 = it;
                                            i11 = i31;
                                            i13 = 1;
                                        case 7:
                                            i7 = i32;
                                            ((Boolean) value).getClass();
                                            computeUInt64SizeNoTag2 = i28;
                                            codedOutputStream$OutputStreamEncoder4.writeUInt32NoTag(computeUInt64SizeNoTag2 + computeTagSize2 + i7);
                                            Object key22222222 = entry.getKey();
                                            Object value22222222 = entry.getValue();
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType2, i28, key22222222);
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType, i27, value22222222);
                                            i26 = i27;
                                            i9 = i30;
                                            it2 = it;
                                            i11 = i31;
                                            i13 = 1;
                                        case 8:
                                            i7 = i32;
                                            if (value instanceof ByteString$LiteralByteString) {
                                                size2 = ((ByteString$LiteralByteString) value).size();
                                                computeUInt32SizeNoTag3 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size2);
                                                computeUInt64SizeNoTag2 = size2 + computeUInt32SizeNoTag3;
                                                codedOutputStream$OutputStreamEncoder4.writeUInt32NoTag(computeUInt64SizeNoTag2 + computeTagSize2 + i7);
                                                Object key222222222 = entry.getKey();
                                                Object value222222222 = entry.getValue();
                                                FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType2, i28, key222222222);
                                                FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType, i27, value222222222);
                                                i26 = i27;
                                                i9 = i30;
                                                it2 = it;
                                                i11 = i31;
                                                i13 = 1;
                                            } else {
                                                computeUInt64SizeNoTag2 = CodedOutputStream$OutputStreamEncoder.computeStringSizeNoTag((String) value);
                                                codedOutputStream$OutputStreamEncoder4.writeUInt32NoTag(computeUInt64SizeNoTag2 + computeTagSize2 + i7);
                                                Object key2222222222 = entry.getKey();
                                                Object value2222222222 = entry.getValue();
                                                FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType2, i28, key2222222222);
                                                FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType, i27, value2222222222);
                                                i26 = i27;
                                                i9 = i30;
                                                it2 = it;
                                                i11 = i31;
                                                i13 = 1;
                                            }
                                        case 9:
                                            i7 = i32;
                                            computeUInt64SizeNoTag2 = ((GeneratedMessageLite) ((AbstractMessageLite) value)).getSerializedSize(null);
                                            codedOutputStream$OutputStreamEncoder4.writeUInt32NoTag(computeUInt64SizeNoTag2 + computeTagSize2 + i7);
                                            Object key22222222222 = entry.getKey();
                                            Object value22222222222 = entry.getValue();
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType2, i28, key22222222222);
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType, i27, value22222222222);
                                            i26 = i27;
                                            i9 = i30;
                                            it2 = it;
                                            i11 = i31;
                                            i13 = 1;
                                        case 10:
                                            i7 = i32;
                                            size2 = ((GeneratedMessageLite) ((AbstractMessageLite) value)).getSerializedSize(null);
                                            computeUInt32SizeNoTag3 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size2);
                                            computeUInt64SizeNoTag2 = size2 + computeUInt32SizeNoTag3;
                                            codedOutputStream$OutputStreamEncoder4.writeUInt32NoTag(computeUInt64SizeNoTag2 + computeTagSize2 + i7);
                                            Object key222222222222 = entry.getKey();
                                            Object value222222222222 = entry.getValue();
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType2, i28, key222222222222);
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType, i27, value222222222222);
                                            i26 = i27;
                                            i9 = i30;
                                            it2 = it;
                                            i11 = i31;
                                            i13 = 1;
                                        case 11:
                                            i7 = i32;
                                            if (value instanceof ByteString$LiteralByteString) {
                                                size2 = ((ByteString$LiteralByteString) value).size();
                                                computeUInt32SizeNoTag3 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                computeUInt32SizeNoTag3 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size2);
                                            }
                                            computeUInt64SizeNoTag2 = size2 + computeUInt32SizeNoTag3;
                                            codedOutputStream$OutputStreamEncoder4.writeUInt32NoTag(computeUInt64SizeNoTag2 + computeTagSize2 + i7);
                                            Object key2222222222222 = entry.getKey();
                                            Object value2222222222222 = entry.getValue();
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType2, i28, key2222222222222);
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType, i27, value2222222222222);
                                            i26 = i27;
                                            i9 = i30;
                                            it2 = it;
                                            i11 = i31;
                                            i13 = 1;
                                        case 12:
                                            i7 = i32;
                                            computeUInt64SizeNoTag2 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(((Integer) value).intValue());
                                            codedOutputStream$OutputStreamEncoder4.writeUInt32NoTag(computeUInt64SizeNoTag2 + computeTagSize2 + i7);
                                            Object key22222222222222 = entry.getKey();
                                            Object value22222222222222 = entry.getValue();
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType2, i28, key22222222222222);
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType, i27, value22222222222222);
                                            i26 = i27;
                                            i9 = i30;
                                            it2 = it;
                                            i11 = i31;
                                            i13 = 1;
                                        case 13:
                                            i7 = i32;
                                            computeUInt64SizeNoTag2 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(((Integer) value).intValue());
                                            codedOutputStream$OutputStreamEncoder4.writeUInt32NoTag(computeUInt64SizeNoTag2 + computeTagSize2 + i7);
                                            Object key222222222222222 = entry.getKey();
                                            Object value222222222222222 = entry.getValue();
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType2, i28, key222222222222222);
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType, i27, value222222222222222);
                                            i26 = i27;
                                            i9 = i30;
                                            it2 = it;
                                            i11 = i31;
                                            i13 = 1;
                                        case 14:
                                            ((Integer) value).getClass();
                                            i7 = i32;
                                            computeUInt64SizeNoTag2 = 4;
                                            codedOutputStream$OutputStreamEncoder4.writeUInt32NoTag(computeUInt64SizeNoTag2 + computeTagSize2 + i7);
                                            Object key2222222222222222 = entry.getKey();
                                            Object value2222222222222222 = entry.getValue();
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType2, i28, key2222222222222222);
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType, i27, value2222222222222222);
                                            i26 = i27;
                                            i9 = i30;
                                            it2 = it;
                                            i11 = i31;
                                            i13 = 1;
                                        case 15:
                                            ((Long) value).getClass();
                                            i7 = i32;
                                            computeUInt64SizeNoTag2 = 8;
                                            codedOutputStream$OutputStreamEncoder4.writeUInt32NoTag(computeUInt64SizeNoTag2 + computeTagSize2 + i7);
                                            Object key22222222222222222 = entry.getKey();
                                            Object value22222222222222222 = entry.getValue();
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType2, i28, key22222222222222222);
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType, i27, value22222222222222222);
                                            i26 = i27;
                                            i9 = i30;
                                            it2 = it;
                                            i11 = i31;
                                            i13 = 1;
                                        case 16:
                                            int intValue = ((Integer) value).intValue();
                                            computeUInt64SizeNoTag2 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag((intValue >> 31) ^ (intValue << 1));
                                            i7 = i32;
                                            codedOutputStream$OutputStreamEncoder4.writeUInt32NoTag(computeUInt64SizeNoTag2 + computeTagSize2 + i7);
                                            Object key222222222222222222 = entry.getKey();
                                            Object value222222222222222222 = entry.getValue();
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType2, i28, key222222222222222222);
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType, i27, value222222222222222222);
                                            i26 = i27;
                                            i9 = i30;
                                            it2 = it;
                                            i11 = i31;
                                            i13 = 1;
                                        case 17:
                                            long longValue = ((Long) value).longValue();
                                            computeUInt64SizeNoTag2 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag((longValue << i28) ^ (longValue >> 63));
                                            i7 = i32;
                                            codedOutputStream$OutputStreamEncoder4.writeUInt32NoTag(computeUInt64SizeNoTag2 + computeTagSize2 + i7);
                                            Object key2222222222222222222 = entry.getKey();
                                            Object value2222222222222222222 = entry.getValue();
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType2, i28, key2222222222222222222);
                                            FieldSet.writeElement(codedOutputStream$OutputStreamEncoder4, wireFormat$FieldType, i27, value2222222222222222222);
                                            i26 = i27;
                                            i9 = i30;
                                            it2 = it;
                                            i11 = i31;
                                            i13 = 1;
                                        default:
                                            OptionalProvider$$ExternalSyntheticLambda0.m$1("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                case 1:
                                    it = it2;
                                    ((Float) key).getClass();
                                    computeUInt64SizeNoTag = 4;
                                    int i322 = computeUInt64SizeNoTag + computeTagSize;
                                    int computeTagSize22 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i27);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 2:
                                    it = it2;
                                    computeUInt64SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(((Long) key).longValue());
                                    int i3222 = computeUInt64SizeNoTag + computeTagSize;
                                    int computeTagSize222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i27);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 3:
                                    it = it2;
                                    computeUInt64SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(((Long) key).longValue());
                                    int i32222 = computeUInt64SizeNoTag + computeTagSize;
                                    int computeTagSize2222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i27);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 4:
                                    it = it2;
                                    computeUInt64SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(((Integer) key).intValue());
                                    int i322222 = computeUInt64SizeNoTag + computeTagSize;
                                    int computeTagSize22222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i27);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 5:
                                    it = it2;
                                    ((Long) key).getClass();
                                    computeUInt64SizeNoTag = 8;
                                    int i3222222 = computeUInt64SizeNoTag + computeTagSize;
                                    int computeTagSize222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i27);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 6:
                                    it = it2;
                                    ((Integer) key).getClass();
                                    computeUInt64SizeNoTag = 4;
                                    int i32222222 = computeUInt64SizeNoTag + computeTagSize;
                                    int computeTagSize2222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i27);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 7:
                                    it = it2;
                                    ((Boolean) key).getClass();
                                    computeUInt64SizeNoTag = i28;
                                    int i322222222 = computeUInt64SizeNoTag + computeTagSize;
                                    int computeTagSize22222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i27);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 8:
                                    it = it2;
                                    if (key instanceof ByteString$LiteralByteString) {
                                        size = ((ByteString$LiteralByteString) key).size();
                                        computeUInt32SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size);
                                        computeUInt64SizeNoTag = size + computeUInt32SizeNoTag;
                                        int i3222222222 = computeUInt64SizeNoTag + computeTagSize;
                                        int computeTagSize222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i27);
                                        if (wireFormat$FieldType == anonymousClass2) {
                                        }
                                        switch (wireFormat$FieldType.ordinal()) {
                                        }
                                    } else {
                                        computeUInt64SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeStringSizeNoTag((String) key);
                                        int i32222222222 = computeUInt64SizeNoTag + computeTagSize;
                                        int computeTagSize2222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i27);
                                        if (wireFormat$FieldType == anonymousClass2) {
                                        }
                                        switch (wireFormat$FieldType.ordinal()) {
                                        }
                                    }
                                case 9:
                                    it = it2;
                                    serializedSize = ((GeneratedMessageLite) ((AbstractMessageLite) key)).getSerializedSize(null);
                                    computeUInt64SizeNoTag = serializedSize;
                                    int i322222222222 = computeUInt64SizeNoTag + computeTagSize;
                                    int computeTagSize22222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i27);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 10:
                                    it = it2;
                                    int serializedSize2 = ((GeneratedMessageLite) ((AbstractMessageLite) key)).getSerializedSize(null);
                                    serializedSize = serializedSize2 + CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(serializedSize2);
                                    computeUInt64SizeNoTag = serializedSize;
                                    int i3222222222222 = computeUInt64SizeNoTag + computeTagSize;
                                    int computeTagSize222222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i27);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 11:
                                    it = it2;
                                    if (key instanceof ByteString$LiteralByteString) {
                                        size = ((ByteString$LiteralByteString) key).size();
                                        computeUInt32SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size);
                                    } else {
                                        size = ((byte[]) key).length;
                                        computeUInt32SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(size);
                                    }
                                    computeUInt64SizeNoTag = size + computeUInt32SizeNoTag;
                                    int i32222222222222 = computeUInt64SizeNoTag + computeTagSize;
                                    int computeTagSize2222222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i27);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 12:
                                    it = it2;
                                    computeUInt64SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(((Integer) key).intValue());
                                    int i322222222222222 = computeUInt64SizeNoTag + computeTagSize;
                                    int computeTagSize22222222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i27);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 13:
                                    it = it2;
                                    computeUInt64SizeNoTag = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag(((Integer) key).intValue());
                                    int i3222222222222222 = computeUInt64SizeNoTag + computeTagSize;
                                    int computeTagSize222222222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i27);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 14:
                                    ((Integer) key).getClass();
                                    it = it2;
                                    computeUInt64SizeNoTag = 4;
                                    int i32222222222222222 = computeUInt64SizeNoTag + computeTagSize;
                                    int computeTagSize2222222222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i27);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 15:
                                    ((Long) key).getClass();
                                    it = it2;
                                    computeUInt64SizeNoTag = 8;
                                    int i322222222222222222 = computeUInt64SizeNoTag + computeTagSize;
                                    int computeTagSize22222222222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i27);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((Integer) key).intValue();
                                    computeUInt32SizeNoTag2 = CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag((intValue2 << 1) ^ (intValue2 >> 31));
                                    it = it2;
                                    computeUInt64SizeNoTag = computeUInt32SizeNoTag2;
                                    int i3222222222222222222 = computeUInt64SizeNoTag + computeTagSize;
                                    int computeTagSize222222222222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i27);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((Long) key).longValue();
                                    computeUInt32SizeNoTag2 = CodedOutputStream$OutputStreamEncoder.computeUInt64SizeNoTag((longValue2 << i28) ^ (longValue2 >> 63));
                                    it = it2;
                                    computeUInt64SizeNoTag = computeUInt32SizeNoTag2;
                                    int i32222222222222222222 = computeUInt64SizeNoTag + computeTagSize;
                                    int computeTagSize2222222222222222222 = CodedOutputStream$OutputStreamEncoder.computeTagSize(i27);
                                    if (wireFormat$FieldType == anonymousClass2) {
                                    }
                                    switch (wireFormat$FieldType.ordinal()) {
                                    }
                                default:
                                    OptionalProvider$$ExternalSyntheticLambda0.m$1("There is no way to get here, but the compiler thinks otherwise.");
                                    break;
                            }
                        }
                    }
                    i5 = i9;
                    i6 = i11;
                    i9 = i5;
                    i11 = i6;
                    i10 += 3;
                    i8 = 1048575;
                case 51:
                    if (messageSchema.isOneofPresent(obj, i12, i10)) {
                        double doubleValue = ((Double) UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, j)).doubleValue();
                        CodedOutputStream$OutputStreamEncoder codedOutputStream$OutputStreamEncoder5 = (CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory;
                        codedOutputStream$OutputStreamEncoder5.getClass();
                        codedOutputStream$OutputStreamEncoder5.writeFixed64(i12, Double.doubleToRawLongBits(doubleValue));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 52:
                    if (messageSchema.isOneofPresent(obj, i12, i10)) {
                        float floatValue = ((Float) UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, j)).floatValue();
                        CodedOutputStream$OutputStreamEncoder codedOutputStream$OutputStreamEncoder6 = (CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory;
                        codedOutputStream$OutputStreamEncoder6.getClass();
                        codedOutputStream$OutputStreamEncoder6.writeFixed32(i12, Float.floatToRawIntBits(floatValue));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 53:
                    if (messageSchema.isOneofPresent(obj, i12, i10)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeUInt64(i12, oneofLongAt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 54:
                    if (messageSchema.isOneofPresent(obj, i12, i10)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeUInt64(i12, oneofLongAt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 55:
                    if (messageSchema.isOneofPresent(obj, i12, i10)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeInt32(i12, oneofIntAt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 56:
                    if (messageSchema.isOneofPresent(obj, i12, i10)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeFixed64(i12, oneofLongAt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 57:
                    if (messageSchema.isOneofPresent(obj, i12, i10)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeFixed32(i12, oneofIntAt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 58:
                    if (messageSchema.isOneofPresent(obj, i12, i10)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeBool(i12, ((Boolean) UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, j)).booleanValue());
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 59:
                    if (messageSchema.isOneofPresent(obj, i12, i10)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeString(i12, (String) object3);
                        } else {
                            ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeBytes(i12, (ByteString$LiteralByteString) object3);
                        }
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 60:
                    if (messageSchema.isOneofPresent(obj, i12, i10)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeMessage(i12, (AbstractMessageLite) unsafe.getObject(obj, j), messageSchema.getMessageFieldSchema(i10));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 61:
                    if (messageSchema.isOneofPresent(obj, i12, i10)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeBytes(i12, (ByteString$LiteralByteString) unsafe.getObject(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 62:
                    if (messageSchema.isOneofPresent(obj, i12, i10)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeUInt32(i12, oneofIntAt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 63:
                    if (messageSchema.isOneofPresent(obj, i12, i10)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeInt32(i12, oneofIntAt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 64:
                    if (messageSchema.isOneofPresent(obj, i12, i10)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeFixed32(i12, oneofIntAt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 65:
                    if (messageSchema.isOneofPresent(obj, i12, i10)) {
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeFixed64(i12, oneofLongAt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 66:
                    if (messageSchema.isOneofPresent(obj, i12, i10)) {
                        int oneofIntAt = oneofIntAt(obj, j);
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeUInt32(i12, (oneofIntAt >> 31) ^ (oneofIntAt << 1));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 67:
                    if (messageSchema.isOneofPresent(obj, i12, i10)) {
                        long oneofLongAt = oneofLongAt(obj, j);
                        ((CodedOutputStream$OutputStreamEncoder) manifestSchemaFactory.messageInfoFactory).writeUInt64(i12, (oneofLongAt << 1) ^ (oneofLongAt >> 63));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 68:
                    if (messageSchema.isOneofPresent(obj, i12, i10)) {
                        manifestSchemaFactory.writeGroup(i12, unsafe.getObject(obj, j), messageSchema.getMessageFieldSchema(i10));
                    }
                    i10 += 3;
                    i8 = 1048575;
                default:
                    i10 += 3;
                    i8 = 1048575;
            }
            return;
        }
        ((UnknownFieldSetLiteSchema) messageSchema.unknownFieldSchema).getClass();
        ((GeneratedMessageLite) obj).unknownFields.writeTo(manifestSchemaFactory);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void writeTo(Object obj, ManifestSchemaFactory manifestSchemaFactory) {
        manifestSchemaFactory.getClass();
        writeFieldsInAscendingOrder(obj, manifestSchemaFactory);
    }

    public final boolean isFieldPresent(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return isFieldPresent(obj, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void mergeFrom(Object obj, Object obj2) {
        Object obj3;
        if (isMutable(obj)) {
            obj2.getClass();
            int i = 0;
            while (true) {
                int[] iArr = this.buffer;
                if (i < iArr.length) {
                    int typeAndOffsetAt = typeAndOffsetAt(i);
                    long j = 1048575 & typeAndOffsetAt;
                    int i2 = iArr[i];
                    switch (type(typeAndOffsetAt)) {
                        case 0:
                            if (isFieldPresent(obj2, i)) {
                                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.MEMORY_ACCESSOR;
                                obj3 = obj;
                                memoryAccessor.putDouble(obj3, j, memoryAccessor.getDouble(obj2, j));
                                setFieldPresent(obj3, i);
                                break;
                            }
                            obj3 = obj;
                            break;
                        case 1:
                            if (isFieldPresent(obj2, i)) {
                                UnsafeUtil.MemoryAccessor memoryAccessor2 = UnsafeUtil.MEMORY_ACCESSOR;
                                memoryAccessor2.putFloat(obj, j, memoryAccessor2.getFloat(obj2, j));
                                setFieldPresent(obj, i);
                            }
                            obj3 = obj;
                            break;
                        case 2:
                            if (isFieldPresent(obj2, i)) {
                                UnsafeUtil.putLong(obj, j, UnsafeUtil.MEMORY_ACCESSOR.getLong(obj2, j));
                                setFieldPresent(obj, i);
                            }
                            obj3 = obj;
                            break;
                        case 3:
                            if (isFieldPresent(obj2, i)) {
                                UnsafeUtil.putLong(obj, j, UnsafeUtil.MEMORY_ACCESSOR.getLong(obj2, j));
                                setFieldPresent(obj, i);
                            }
                            obj3 = obj;
                            break;
                        case 4:
                            if (isFieldPresent(obj2, i)) {
                                UnsafeUtil.putInt(obj, j, UnsafeUtil.MEMORY_ACCESSOR.getInt(obj2, j));
                                setFieldPresent(obj, i);
                            }
                            obj3 = obj;
                            break;
                        case 5:
                            if (isFieldPresent(obj2, i)) {
                                UnsafeUtil.putLong(obj, j, UnsafeUtil.MEMORY_ACCESSOR.getLong(obj2, j));
                                setFieldPresent(obj, i);
                            }
                            obj3 = obj;
                            break;
                        case 6:
                            if (isFieldPresent(obj2, i)) {
                                UnsafeUtil.putInt(obj, j, UnsafeUtil.MEMORY_ACCESSOR.getInt(obj2, j));
                                setFieldPresent(obj, i);
                            }
                            obj3 = obj;
                            break;
                        case 7:
                            if (isFieldPresent(obj2, i)) {
                                UnsafeUtil.MemoryAccessor memoryAccessor3 = UnsafeUtil.MEMORY_ACCESSOR;
                                memoryAccessor3.putBoolean(obj, j, memoryAccessor3.getBoolean(obj2, j));
                                setFieldPresent(obj, i);
                            }
                            obj3 = obj;
                            break;
                        case 8:
                            if (isFieldPresent(obj2, i)) {
                                UnsafeUtil.putObject(obj, j, UnsafeUtil.MEMORY_ACCESSOR.getObject(obj2, j));
                                setFieldPresent(obj, i);
                            }
                            obj3 = obj;
                            break;
                        case 9:
                            mergeMessage(obj, obj2, i);
                            obj3 = obj;
                            break;
                        case 10:
                            if (isFieldPresent(obj2, i)) {
                                UnsafeUtil.putObject(obj, j, UnsafeUtil.MEMORY_ACCESSOR.getObject(obj2, j));
                                setFieldPresent(obj, i);
                            }
                            obj3 = obj;
                            break;
                        case 11:
                            if (isFieldPresent(obj2, i)) {
                                UnsafeUtil.putInt(obj, j, UnsafeUtil.MEMORY_ACCESSOR.getInt(obj2, j));
                                setFieldPresent(obj, i);
                            }
                            obj3 = obj;
                            break;
                        case 12:
                            if (isFieldPresent(obj2, i)) {
                                UnsafeUtil.putInt(obj, j, UnsafeUtil.MEMORY_ACCESSOR.getInt(obj2, j));
                                setFieldPresent(obj, i);
                            }
                            obj3 = obj;
                            break;
                        case 13:
                            if (isFieldPresent(obj2, i)) {
                                UnsafeUtil.putInt(obj, j, UnsafeUtil.MEMORY_ACCESSOR.getInt(obj2, j));
                                setFieldPresent(obj, i);
                            }
                            obj3 = obj;
                            break;
                        case 14:
                            if (isFieldPresent(obj2, i)) {
                                UnsafeUtil.putLong(obj, j, UnsafeUtil.MEMORY_ACCESSOR.getLong(obj2, j));
                                setFieldPresent(obj, i);
                            }
                            obj3 = obj;
                            break;
                        case 15:
                            if (isFieldPresent(obj2, i)) {
                                UnsafeUtil.putInt(obj, j, UnsafeUtil.MEMORY_ACCESSOR.getInt(obj2, j));
                                setFieldPresent(obj, i);
                            }
                            obj3 = obj;
                            break;
                        case 16:
                            if (isFieldPresent(obj2, i)) {
                                UnsafeUtil.putLong(obj, j, UnsafeUtil.MEMORY_ACCESSOR.getLong(obj2, j));
                                setFieldPresent(obj, i);
                            }
                            obj3 = obj;
                            break;
                        case 17:
                            mergeMessage(obj, obj2, i);
                            obj3 = obj;
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.listFieldSchema.getClass();
                            UnsafeUtil.MemoryAccessor memoryAccessor4 = UnsafeUtil.MEMORY_ACCESSOR;
                            Internal.ProtobufList protobufList = (Internal.ProtobufList) memoryAccessor4.getObject(obj, j);
                            Internal.ProtobufList protobufList2 = (Internal.ProtobufList) memoryAccessor4.getObject(obj2, j);
                            int size = protobufList.size();
                            int size2 = protobufList2.size();
                            if (size > 0 && size2 > 0) {
                                if (!((AbstractProtobufList) protobufList).isMutable) {
                                    protobufList = ((ProtobufArrayList) protobufList).mutableCopyWithCapacity(size2 + size);
                                }
                                protobufList.addAll(protobufList2);
                            }
                            if (size > 0) {
                                protobufList2 = protobufList;
                            }
                            UnsafeUtil.putObject(obj, j, protobufList2);
                            obj3 = obj;
                            break;
                        case 50:
                            Class cls = SchemaUtil.GENERATED_MESSAGE_CLASS;
                            UnsafeUtil.MemoryAccessor memoryAccessor5 = UnsafeUtil.MEMORY_ACCESSOR;
                            Object object = memoryAccessor5.getObject(obj, j);
                            Object object2 = memoryAccessor5.getObject(obj2, j);
                            this.mapFieldSchema.getClass();
                            UnsafeUtil.putObject(obj, j, MapFieldSchemaLite.mergeFrom(object, object2));
                            obj3 = obj;
                            break;
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            if (isOneofPresent(obj2, i2, i)) {
                                UnsafeUtil.putObject(obj, j, UnsafeUtil.MEMORY_ACCESSOR.getObject(obj2, j));
                                setOneofPresent(obj, i2, i);
                            }
                            obj3 = obj;
                            break;
                        case 60:
                            mergeOneofMessage(obj, obj2, i);
                            obj3 = obj;
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (isOneofPresent(obj2, i2, i)) {
                                UnsafeUtil.putObject(obj, j, UnsafeUtil.MEMORY_ACCESSOR.getObject(obj2, j));
                                setOneofPresent(obj, i2, i);
                            }
                            obj3 = obj;
                            break;
                        case 68:
                            mergeOneofMessage(obj, obj2, i);
                            obj3 = obj;
                            break;
                        default:
                            obj3 = obj;
                            break;
                    }
                    i += 3;
                    obj = obj3;
                } else {
                    SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, obj, obj2);
                    return;
                }
            }
        } else {
            a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m("Mutating immutable message: ", obj));
        }
    }
}
