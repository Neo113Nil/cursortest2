package com.google.crypto.tink.shaded.protobuf;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.measurement.zzacv;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.UnsafeUtil;
import com.google.crypto.tink.shaded.protobuf.Utf8;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
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

    public MessageSchema(int[] iArr, Object[] objArr, int i, int i2, AbstractMessageLite abstractMessageLite, int[] iArr2, int i3, int i4, NewInstanceSchemaLite newInstanceSchemaLite, ListFieldSchemaLite listFieldSchemaLite, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchemaLite mapFieldSchemaLite) {
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

    public static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m("Mutating immutable message: ", obj));
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
    public static MessageSchema newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, NewInstanceSchemaLite newInstanceSchemaLite, ListFieldSchemaLite listFieldSchemaLite, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchemaLite mapFieldSchemaLite) {
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
        return new MessageSchema(iArr3, objArr3, i2, i5, rawMessageInfo.defaultInstance, iArr, i7, i63, newInstanceSchemaLite, listFieldSchemaLite, unknownFieldSchema, extensionSchema, mapFieldSchemaLite);
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
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Field ", str, " for ");
            Boxes$$ExternalSyntheticOutline1.m(cls, m3m, " not found. Known fields are ");
            m3m.append(Arrays.toString(declaredFields));
            throw new RuntimeException(m3m.toString(), e);
        }
    }

    public static int type(int i) {
        return (i & 267386880) >>> 20;
    }

    public final boolean arePresentForEquals(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i) {
        return isFieldPresent(generatedMessageLite, i) == isFieldPresent(generatedMessageLite2, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.SchemaUtil.safeEquals(r5.getObject(r12, r7), r5.getObject(r13, r7)) != false) goto L105;
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
    
        if (com.google.crypto.tink.shaded.protobuf.SchemaUtil.safeEquals(r5.getObject(r12, r7), r5.getObject(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.SchemaUtil.safeEquals(r5.getObject(r12, r7), r5.getObject(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.SchemaUtil.safeEquals(r5.getObject(r12, r7), r5.getObject(r13, r7)) != false) goto L105;
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
    
        if (com.google.crypto.tink.shaded.protobuf.SchemaUtil.safeEquals(r9.getObject(r12, r7), r9.getObject(r13, r7)) != false) goto L105;
     */
    @Override // com.google.crypto.tink.shaded.protobuf.Schema
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

    public final Object getMapFieldDefaultEntry(int i) {
        return this.objects[(i / 3) * 2];
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

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
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
        int computeTagSize7;
        int serializedSize;
        int computeUInt32SizeNoTag;
        int computeBytesSize;
        int computeTagSize8;
        int serializedSize2;
        int computeSizeFixed64List;
        int computeTagSize9;
        int size;
        int computeSizeUInt64ListNoTag;
        int computeTagSize10;
        int computeTagSize11;
        int size2;
        int computeTagSize12;
        int computeUInt32SizeNoTag2;
        int i2;
        int computeTagSize13;
        int computeTagSize14;
        int computeUInt64SizeNoTag3;
        int computeTagSize15;
        int computeUInt64SizeNoTag4;
        int i3;
        MessageSchema messageSchema = this;
        GeneratedMessageLite generatedMessageLite2 = generatedMessageLite;
        Unsafe unsafe = UNSAFE;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = messageSchema.buffer;
            if (i4 >= iArr.length) {
                ((UnknownFieldSetLiteSchema) messageSchema.unknownFieldSchema).getClass();
                return generatedMessageLite2.unknownFields.getSerializedSize() + i6;
            }
            int typeAndOffsetAt = messageSchema.typeAndOffsetAt(i4);
            int type2 = type(typeAndOffsetAt);
            int i8 = iArr[i4];
            int i9 = iArr[i4 + 2];
            int i10 = i9 & 1048575;
            if (type2 <= 17) {
                if (i10 != i7) {
                    i5 = i10 == 1048575 ? 0 : unsafe.getInt(generatedMessageLite2, i10);
                    i7 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = typeAndOffsetAt & 1048575;
            if (type2 >= FieldType.DOUBLE_LIST_PACKED.id) {
                int i11 = FieldType.SINT64_LIST_PACKED.id;
            }
            switch (type2) {
                case 0:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i4, i7, i5, i)) {
                        computeTagSize = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeSizeFixed64List = computeTagSize + 8;
                        i6 += computeSizeFixed64List;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 1:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i4, i7, i5, i)) {
                        computeTagSize2 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeTagSize6 = computeTagSize2 + 4;
                        i6 += computeTagSize6;
                    }
                    messageSchema = this;
                    generatedMessageLite2 = generatedMessageLite;
                    i4 += 3;
                case 2:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i4, i7, i5, i)) {
                        long j2 = unsafe.getLong(generatedMessageLite2, j);
                        computeTagSize3 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt64SizeNoTag = CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(j2);
                        i6 += computeUInt64SizeNoTag + computeTagSize3;
                    }
                    messageSchema = this;
                    i4 += 3;
                case 3:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i4, i7, i5, i)) {
                        long j3 = unsafe.getLong(generatedMessageLite2, j);
                        computeTagSize3 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt64SizeNoTag = CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(j3);
                        i6 += computeUInt64SizeNoTag + computeTagSize3;
                    }
                    messageSchema = this;
                    i4 += 3;
                case 4:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i4, i7, i5, i)) {
                        int i12 = unsafe.getInt(generatedMessageLite2, j);
                        computeTagSize4 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt64SizeNoTag2 = CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(i12);
                        computeBytesSize = computeUInt64SizeNoTag2 + computeTagSize4;
                        i6 += computeBytesSize;
                    }
                    messageSchema = this;
                    i4 += 3;
                case 5:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i4, i7, i5, i)) {
                        computeTagSize5 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeTagSize6 = computeTagSize5 + 8;
                        i6 += computeTagSize6;
                    }
                    messageSchema = this;
                    generatedMessageLite2 = generatedMessageLite;
                    i4 += 3;
                case 6:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i4, i7, i5, i)) {
                        computeTagSize2 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeTagSize6 = computeTagSize2 + 4;
                        i6 += computeTagSize6;
                    }
                    messageSchema = this;
                    generatedMessageLite2 = generatedMessageLite;
                    i4 += 3;
                case 7:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i4, i7, i5, i)) {
                        computeTagSize6 = CodedOutputStream$ArrayEncoder.computeTagSize(i8) + 1;
                        i6 += computeTagSize6;
                    }
                    messageSchema = this;
                    generatedMessageLite2 = generatedMessageLite;
                    i4 += 3;
                case 8:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i4, i7, i5, i)) {
                        Object object = unsafe.getObject(generatedMessageLite2, j);
                        i6 = (object instanceof ByteString ? CodedOutputStream$ArrayEncoder.computeBytesSize(i8, (ByteString) object) : CodedOutputStream$ArrayEncoder.computeStringSizeNoTag((String) object) + CodedOutputStream$ArrayEncoder.computeTagSize(i8)) + i6;
                    }
                    messageSchema = this;
                    i4 += 3;
                case 9:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i4, i7, i5, i)) {
                        Object object2 = unsafe.getObject(generatedMessageLite2, j);
                        Schema messageFieldSchema = messageSchema.getMessageFieldSchema(i4);
                        Class cls = SchemaUtil.GENERATED_MESSAGE_CLASS;
                        computeTagSize7 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        serializedSize = ((AbstractMessageLite) object2).getSerializedSize(messageFieldSchema);
                        computeUInt32SizeNoTag = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(serializedSize);
                        i3 = computeUInt32SizeNoTag + serializedSize + computeTagSize7;
                        i6 += i3;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 10:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i4, i7, i5, i)) {
                        computeBytesSize = CodedOutputStream$ArrayEncoder.computeBytesSize(i8, (ByteString) unsafe.getObject(generatedMessageLite2, j));
                        i6 += computeBytesSize;
                    }
                    messageSchema = this;
                    i4 += 3;
                case 11:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i4, i7, i5, i)) {
                        int i13 = unsafe.getInt(generatedMessageLite2, j);
                        computeTagSize4 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt64SizeNoTag2 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(i13);
                        computeBytesSize = computeUInt64SizeNoTag2 + computeTagSize4;
                        i6 += computeBytesSize;
                    }
                    messageSchema = this;
                    i4 += 3;
                case 12:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i4, i7, i5, i)) {
                        int i14 = unsafe.getInt(generatedMessageLite2, j);
                        computeTagSize4 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt64SizeNoTag2 = CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(i14);
                        computeBytesSize = computeUInt64SizeNoTag2 + computeTagSize4;
                        i6 += computeBytesSize;
                    }
                    messageSchema = this;
                    i4 += 3;
                case 13:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i4, i7, i5, i)) {
                        computeTagSize2 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeTagSize6 = computeTagSize2 + 4;
                        i6 += computeTagSize6;
                    }
                    messageSchema = this;
                    generatedMessageLite2 = generatedMessageLite;
                    i4 += 3;
                case 14:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i4, i7, i5, i)) {
                        computeTagSize5 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeTagSize6 = computeTagSize5 + 8;
                        i6 += computeTagSize6;
                    }
                    messageSchema = this;
                    generatedMessageLite2 = generatedMessageLite;
                    i4 += 3;
                case 15:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i4, i7, i5, i)) {
                        int i15 = unsafe.getInt(generatedMessageLite2, j);
                        computeTagSize4 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt64SizeNoTag2 = CodedOutputStream$ArrayEncoder.computeSInt32SizeNoTag(i15);
                        computeBytesSize = computeUInt64SizeNoTag2 + computeTagSize4;
                        i6 += computeBytesSize;
                    }
                    messageSchema = this;
                    i4 += 3;
                case 16:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i4, i7, i5, i)) {
                        long j4 = unsafe.getLong(generatedMessageLite2, j);
                        computeTagSize3 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt64SizeNoTag = CodedOutputStream$ArrayEncoder.computeSInt64SizeNoTag(j4);
                        i6 += computeUInt64SizeNoTag + computeTagSize3;
                    }
                    messageSchema = this;
                    i4 += 3;
                case 17:
                    if (messageSchema.isFieldPresent(generatedMessageLite2, i4, i7, i5, i)) {
                        AbstractMessageLite abstractMessageLite = (AbstractMessageLite) unsafe.getObject(generatedMessageLite2, j);
                        Schema messageFieldSchema2 = messageSchema.getMessageFieldSchema(i4);
                        computeTagSize8 = CodedOutputStream$ArrayEncoder.computeTagSize(i8) * 2;
                        serializedSize2 = abstractMessageLite.getSerializedSize(messageFieldSchema2);
                        computeSizeFixed64List = serializedSize2 + computeTagSize8;
                        i6 += computeSizeFixed64List;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 18:
                    computeSizeFixed64List = SchemaUtil.computeSizeFixed64List(i8, (List) unsafe.getObject(generatedMessageLite2, j));
                    i6 += computeSizeFixed64List;
                    i4 += 3;
                case 19:
                    computeSizeFixed64List = SchemaUtil.computeSizeFixed32List(i8, (List) unsafe.getObject(generatedMessageLite2, j));
                    i6 += computeSizeFixed64List;
                    i4 += 3;
                case 20:
                    List list = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls2 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    if (list.size() != 0) {
                        computeTagSize9 = (CodedOutputStream$ArrayEncoder.computeTagSize(i8) * list.size()) + SchemaUtil.computeSizeInt64ListNoTag(list);
                        i6 += computeTagSize9;
                        i4 += 3;
                    }
                    computeTagSize9 = 0;
                    i6 += computeTagSize9;
                    i4 += 3;
                case 21:
                    List list2 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls3 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size = list2.size();
                    if (size != 0) {
                        computeSizeUInt64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag(list2);
                        computeTagSize10 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeTagSize9 = (computeTagSize10 * size) + computeSizeUInt64ListNoTag;
                        i6 += computeTagSize9;
                        i4 += 3;
                    }
                    computeTagSize9 = 0;
                    i6 += computeTagSize9;
                    i4 += 3;
                case 22:
                    List list3 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls4 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size = list3.size();
                    if (size != 0) {
                        computeSizeUInt64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag(list3);
                        computeTagSize10 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeTagSize9 = (computeTagSize10 * size) + computeSizeUInt64ListNoTag;
                        i6 += computeTagSize9;
                        i4 += 3;
                    }
                    computeTagSize9 = 0;
                    i6 += computeTagSize9;
                    i4 += 3;
                case 23:
                    computeSizeFixed64List = SchemaUtil.computeSizeFixed64List(i8, (List) unsafe.getObject(generatedMessageLite2, j));
                    i6 += computeSizeFixed64List;
                    i4 += 3;
                case 24:
                    computeSizeFixed64List = SchemaUtil.computeSizeFixed32List(i8, (List) unsafe.getObject(generatedMessageLite2, j));
                    i6 += computeSizeFixed64List;
                    i4 += 3;
                case 25:
                    List list4 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls5 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    int size3 = list4.size();
                    i6 += size3 == 0 ? 0 : (CodedOutputStream$ArrayEncoder.computeTagSize(i8) + 1) * size3;
                    i4 += 3;
                case 26:
                    List list5 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls6 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        computeTagSize9 = CodedOutputStream$ArrayEncoder.computeTagSize(i8) * size4;
                        if (list5 instanceof LazyStringList) {
                            LazyStringList lazyStringList = (LazyStringList) list5;
                            for (int i16 = 0; i16 < size4; i16++) {
                                Object raw = lazyStringList.getRaw();
                                if (raw instanceof ByteString) {
                                    int size5 = ((ByteString) raw).size();
                                    computeTagSize9 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(size5) + size5 + computeTagSize9;
                                } else {
                                    computeTagSize9 = CodedOutputStream$ArrayEncoder.computeStringSizeNoTag((String) raw) + computeTagSize9;
                                }
                            }
                        } else {
                            for (int i17 = 0; i17 < size4; i17++) {
                                Object obj = list5.get(i17);
                                if (obj instanceof ByteString) {
                                    int size6 = ((ByteString) obj).size();
                                    computeTagSize9 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(size6) + size6 + computeTagSize9;
                                } else {
                                    computeTagSize9 = CodedOutputStream$ArrayEncoder.computeStringSizeNoTag((String) obj) + computeTagSize9;
                                }
                            }
                        }
                        i6 += computeTagSize9;
                        i4 += 3;
                    }
                    computeTagSize9 = 0;
                    i6 += computeTagSize9;
                    i4 += 3;
                case 27:
                    List list6 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Schema messageFieldSchema3 = messageSchema.getMessageFieldSchema(i4);
                    Class cls7 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    int size7 = list6.size();
                    if (size7 == 0) {
                        computeTagSize11 = 0;
                    } else {
                        computeTagSize11 = CodedOutputStream$ArrayEncoder.computeTagSize(i8) * size7;
                        for (int i18 = 0; i18 < size7; i18++) {
                            int serializedSize3 = ((AbstractMessageLite) list6.get(i18)).getSerializedSize(messageFieldSchema3);
                            computeTagSize11 += CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(serializedSize3) + serializedSize3;
                        }
                    }
                    i6 += computeTagSize11;
                    i4 += 3;
                case 28:
                    List list7 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls8 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    int size8 = list7.size();
                    if (size8 != 0) {
                        computeTagSize9 = CodedOutputStream$ArrayEncoder.computeTagSize(i8) * size8;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int size9 = ((ByteString) list7.get(i19)).size();
                            computeTagSize9 += CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(size9) + size9;
                        }
                        i6 += computeTagSize9;
                        i4 += 3;
                    }
                    computeTagSize9 = 0;
                    i6 += computeTagSize9;
                    i4 += 3;
                case 29:
                    List list8 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls9 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size = list8.size();
                    if (size != 0) {
                        computeSizeUInt64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag(list8);
                        computeTagSize10 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeTagSize9 = (computeTagSize10 * size) + computeSizeUInt64ListNoTag;
                        i6 += computeTagSize9;
                        i4 += 3;
                    }
                    computeTagSize9 = 0;
                    i6 += computeTagSize9;
                    i4 += 3;
                case 30:
                    List list9 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls10 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size = list9.size();
                    if (size != 0) {
                        computeSizeUInt64ListNoTag = SchemaUtil.computeSizeEnumListNoTag(list9);
                        computeTagSize10 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeTagSize9 = (computeTagSize10 * size) + computeSizeUInt64ListNoTag;
                        i6 += computeTagSize9;
                        i4 += 3;
                    }
                    computeTagSize9 = 0;
                    i6 += computeTagSize9;
                    i4 += 3;
                case 31:
                    computeSizeFixed64List = SchemaUtil.computeSizeFixed32List(i8, (List) unsafe.getObject(generatedMessageLite2, j));
                    i6 += computeSizeFixed64List;
                    i4 += 3;
                case 32:
                    computeSizeFixed64List = SchemaUtil.computeSizeFixed64List(i8, (List) unsafe.getObject(generatedMessageLite2, j));
                    i6 += computeSizeFixed64List;
                    i4 += 3;
                case 33:
                    List list10 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls11 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size = list10.size();
                    if (size != 0) {
                        computeSizeUInt64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag(list10);
                        computeTagSize10 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeTagSize9 = (computeTagSize10 * size) + computeSizeUInt64ListNoTag;
                        i6 += computeTagSize9;
                        i4 += 3;
                    }
                    computeTagSize9 = 0;
                    i6 += computeTagSize9;
                    i4 += 3;
                case 34:
                    List list11 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls12 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size = list11.size();
                    if (size != 0) {
                        computeSizeUInt64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag(list11);
                        computeTagSize10 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeTagSize9 = (computeTagSize10 * size) + computeSizeUInt64ListNoTag;
                        i6 += computeTagSize9;
                        i4 += 3;
                    }
                    computeTagSize9 = 0;
                    i6 += computeTagSize9;
                    i4 += 3;
                case 35:
                    List list12 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls13 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        computeTagSize12 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt32SizeNoTag2 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(size2);
                        i6 += computeUInt32SizeNoTag2 + computeTagSize12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls14 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        computeTagSize12 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt32SizeNoTag2 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(size2);
                        i6 += computeUInt32SizeNoTag2 + computeTagSize12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 37:
                    size2 = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(generatedMessageLite2, j));
                    if (size2 > 0) {
                        computeTagSize12 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt32SizeNoTag2 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(size2);
                        i6 += computeUInt32SizeNoTag2 + computeTagSize12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 38:
                    size2 = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(generatedMessageLite2, j));
                    if (size2 > 0) {
                        computeTagSize12 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt32SizeNoTag2 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(size2);
                        i6 += computeUInt32SizeNoTag2 + computeTagSize12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 39:
                    size2 = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(generatedMessageLite2, j));
                    if (size2 > 0) {
                        computeTagSize12 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt32SizeNoTag2 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(size2);
                        i6 += computeUInt32SizeNoTag2 + computeTagSize12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls15 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        computeTagSize12 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt32SizeNoTag2 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(size2);
                        i6 += computeUInt32SizeNoTag2 + computeTagSize12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls16 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        computeTagSize12 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt32SizeNoTag2 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(size2);
                        i6 += computeUInt32SizeNoTag2 + computeTagSize12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls17 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size2 = list16.size();
                    if (size2 > 0) {
                        computeTagSize12 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt32SizeNoTag2 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(size2);
                        i6 += computeUInt32SizeNoTag2 + computeTagSize12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 43:
                    size2 = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(generatedMessageLite2, j));
                    if (size2 > 0) {
                        computeTagSize12 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt32SizeNoTag2 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(size2);
                        i6 += computeUInt32SizeNoTag2 + computeTagSize12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 44:
                    size2 = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(generatedMessageLite2, j));
                    if (size2 > 0) {
                        computeTagSize12 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt32SizeNoTag2 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(size2);
                        i6 += computeUInt32SizeNoTag2 + computeTagSize12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls18 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        computeTagSize12 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt32SizeNoTag2 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(size2);
                        i6 += computeUInt32SizeNoTag2 + computeTagSize12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls19 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        computeTagSize12 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt32SizeNoTag2 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(size2);
                        i6 += computeUInt32SizeNoTag2 + computeTagSize12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 47:
                    size2 = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(generatedMessageLite2, j));
                    if (size2 > 0) {
                        computeTagSize12 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt32SizeNoTag2 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(size2);
                        i6 += computeUInt32SizeNoTag2 + computeTagSize12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 48:
                    size2 = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(generatedMessageLite2, j));
                    if (size2 > 0) {
                        computeTagSize12 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt32SizeNoTag2 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(size2);
                        i6 += computeUInt32SizeNoTag2 + computeTagSize12 + size2;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Schema messageFieldSchema4 = messageSchema.getMessageFieldSchema(i4);
                    Class cls20 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    int size10 = list19.size();
                    if (size10 == 0) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        for (int i20 = 0; i20 < size10; i20++) {
                            i2 += ((AbstractMessageLite) list19.get(i20)).getSerializedSize(messageFieldSchema4) + (CodedOutputStream$ArrayEncoder.computeTagSize(i8) * 2);
                        }
                    }
                    i6 += i2;
                    i4 += 3;
                case 50:
                    Object object3 = unsafe.getObject(generatedMessageLite2, j);
                    Object mapFieldDefaultEntry = messageSchema.getMapFieldDefaultEntry(i4);
                    messageSchema.mapFieldSchema.getClass();
                    MapFieldLite mapFieldLite = (MapFieldLite) object3;
                    JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(mapFieldDefaultEntry);
                    if (mapFieldLite.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = mapFieldLite.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i4 += 3;
                case 51:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i8, i4)) {
                        computeTagSize = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeSizeFixed64List = computeTagSize + 8;
                        i6 += computeSizeFixed64List;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 52:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i8, i4)) {
                        computeTagSize13 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeSizeFixed64List = computeTagSize13 + 4;
                        i6 += computeSizeFixed64List;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 53:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i8, i4)) {
                        long oneofLongAt = oneofLongAt(generatedMessageLite2, j);
                        computeTagSize14 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt64SizeNoTag3 = CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(oneofLongAt);
                        i3 = computeUInt64SizeNoTag3 + computeTagSize14;
                        i6 += i3;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 54:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i8, i4)) {
                        long oneofLongAt2 = oneofLongAt(generatedMessageLite2, j);
                        computeTagSize14 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt64SizeNoTag3 = CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(oneofLongAt2);
                        i3 = computeUInt64SizeNoTag3 + computeTagSize14;
                        i6 += i3;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 55:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i8, i4)) {
                        int oneofIntAt = oneofIntAt(generatedMessageLite2, j);
                        computeTagSize15 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt64SizeNoTag4 = CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(oneofIntAt);
                        computeSizeFixed64List = computeUInt64SizeNoTag4 + computeTagSize15;
                        i6 += computeSizeFixed64List;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 56:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i8, i4)) {
                        computeTagSize = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeSizeFixed64List = computeTagSize + 8;
                        i6 += computeSizeFixed64List;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 57:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i8, i4)) {
                        computeTagSize13 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeSizeFixed64List = computeTagSize13 + 4;
                        i6 += computeSizeFixed64List;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 58:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i8, i4)) {
                        computeSizeFixed64List = CodedOutputStream$ArrayEncoder.computeTagSize(i8) + 1;
                        i6 += computeSizeFixed64List;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 59:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i8, i4)) {
                        Object object4 = unsafe.getObject(generatedMessageLite2, j);
                        i6 = (object4 instanceof ByteString ? CodedOutputStream$ArrayEncoder.computeBytesSize(i8, (ByteString) object4) : CodedOutputStream$ArrayEncoder.computeStringSizeNoTag((String) object4) + CodedOutputStream$ArrayEncoder.computeTagSize(i8)) + i6;
                    }
                    i4 += 3;
                case 60:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i8, i4)) {
                        Object object5 = unsafe.getObject(generatedMessageLite2, j);
                        Schema messageFieldSchema5 = messageSchema.getMessageFieldSchema(i4);
                        Class cls21 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                        computeTagSize7 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        serializedSize = ((AbstractMessageLite) object5).getSerializedSize(messageFieldSchema5);
                        computeUInt32SizeNoTag = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(serializedSize);
                        i3 = computeUInt32SizeNoTag + serializedSize + computeTagSize7;
                        i6 += i3;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 61:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i8, i4)) {
                        computeSizeFixed64List = CodedOutputStream$ArrayEncoder.computeBytesSize(i8, (ByteString) unsafe.getObject(generatedMessageLite2, j));
                        i6 += computeSizeFixed64List;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 62:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i8, i4)) {
                        int oneofIntAt2 = oneofIntAt(generatedMessageLite2, j);
                        computeTagSize15 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt64SizeNoTag4 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(oneofIntAt2);
                        computeSizeFixed64List = computeUInt64SizeNoTag4 + computeTagSize15;
                        i6 += computeSizeFixed64List;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 63:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i8, i4)) {
                        int oneofIntAt3 = oneofIntAt(generatedMessageLite2, j);
                        computeTagSize15 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt64SizeNoTag4 = CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(oneofIntAt3);
                        computeSizeFixed64List = computeUInt64SizeNoTag4 + computeTagSize15;
                        i6 += computeSizeFixed64List;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 64:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i8, i4)) {
                        computeTagSize13 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeSizeFixed64List = computeTagSize13 + 4;
                        i6 += computeSizeFixed64List;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 65:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i8, i4)) {
                        computeTagSize = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeSizeFixed64List = computeTagSize + 8;
                        i6 += computeSizeFixed64List;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 66:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i8, i4)) {
                        int oneofIntAt4 = oneofIntAt(generatedMessageLite2, j);
                        computeTagSize15 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt64SizeNoTag4 = CodedOutputStream$ArrayEncoder.computeSInt32SizeNoTag(oneofIntAt4);
                        computeSizeFixed64List = computeUInt64SizeNoTag4 + computeTagSize15;
                        i6 += computeSizeFixed64List;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 67:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i8, i4)) {
                        long oneofLongAt3 = oneofLongAt(generatedMessageLite2, j);
                        computeTagSize14 = CodedOutputStream$ArrayEncoder.computeTagSize(i8);
                        computeUInt64SizeNoTag3 = CodedOutputStream$ArrayEncoder.computeSInt64SizeNoTag(oneofLongAt3);
                        i3 = computeUInt64SizeNoTag3 + computeTagSize14;
                        i6 += i3;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                case 68:
                    if (messageSchema.isOneofPresent(generatedMessageLite2, i8, i4)) {
                        AbstractMessageLite abstractMessageLite2 = (AbstractMessageLite) unsafe.getObject(generatedMessageLite2, j);
                        Schema messageFieldSchema6 = messageSchema.getMessageFieldSchema(i4);
                        computeTagSize8 = CodedOutputStream$ArrayEncoder.computeTagSize(i8) * 2;
                        serializedSize2 = abstractMessageLite2.getSerializedSize(messageFieldSchema6);
                        computeSizeFixed64List = serializedSize2 + computeTagSize8;
                        i6 += computeSizeFixed64List;
                        i4 += 3;
                    } else {
                        i4 += 3;
                    }
                default:
                    i4 += 3;
            }
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
    @Override // com.google.crypto.tink.shaded.protobuf.Schema
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
                    if (object instanceof ByteString) {
                        return !ByteString.EMPTY.equals(object);
                    }
                    Path$$ExternalSyntheticBUOutline0.m$3();
                    return false;
                case 9:
                    if (UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, j2) != null) {
                    }
                    break;
                case 10:
                    return !ByteString.EMPTY.equals(UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, j2));
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

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
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
                        } else if (type2 != 49) {
                            if (type2 != 50) {
                                continue;
                            } else {
                                Object object = UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, typeAndOffsetAt & 1048575);
                                this.mapFieldSchema.getClass();
                                if (!((MapFieldLite) object).isEmpty()) {
                                    JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(getMapFieldDefaultEntry(i2));
                                    throw null;
                                }
                            }
                        }
                        i6++;
                        i4 = i;
                        i5 = i3;
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

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
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
                                    ((MapFieldLite) object).makeImmutable();
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

    /* JADX WARN: Removed duplicated region for block: B:39:0x072e A[Catch: all -> 0x046d, TryCatch #5 {all -> 0x046d, blocks: (B:37:0x0729, B:39:0x072e, B:40:0x0733, B:138:0x0468, B:141:0x0470, B:142:0x0485, B:143:0x049a, B:144:0x04af, B:145:0x04c4, B:146:0x04d9, B:147:0x04ee, B:148:0x0503, B:149:0x0518, B:150:0x0532, B:151:0x0552, B:152:0x0573, B:153:0x0590, B:154:0x05ad, B:155:0x05cd, B:156:0x05ea, B:157:0x05ff, B:158:0x061a, B:159:0x0627, B:160:0x0644, B:161:0x0661, B:162:0x067e, B:163:0x069b, B:164:0x06b8, B:165:0x06d5, B:166:0x06f7, B:171:0x0719), top: B:36:0x0729 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x073a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0757 A[LOOP:3: B:53:0x0755->B:54:0x0757, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0761  */
    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mergeFrom(Object obj, CodedInputStreamReader codedInputStreamReader, ExtensionRegistryLite extensionRegistryLite) {
        MessageSchema messageSchema;
        int i;
        int i2;
        CodedInputStreamReader codedInputStreamReader2;
        int type2;
        ListFieldSchemaLite listFieldSchemaLite;
        MessageSchema messageSchema2 = this;
        Object obj2 = obj;
        CodedInputStreamReader codedInputStreamReader3 = codedInputStreamReader;
        ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
        extensionRegistryLite2.getClass();
        checkMutable(obj2);
        UnknownFieldSchema unknownFieldSchema = messageSchema2.unknownFieldSchema;
        int[] iArr = messageSchema2.intArray;
        int i3 = messageSchema2.repeatedFieldOffsetStart;
        int i4 = messageSchema2.checkInitializedCount;
        UnknownFieldSetLite unknownFieldSetLite = null;
        while (true) {
            try {
                int fieldNumber = codedInputStreamReader3.getFieldNumber();
                int slowPositionForFieldNumber = (fieldNumber < messageSchema2.minFieldNumber || fieldNumber > messageSchema2.maxFieldNumber) ? -1 : messageSchema2.slowPositionForFieldNumber(fieldNumber, 0);
                if (slowPositionForFieldNumber >= 0) {
                    int typeAndOffsetAt = messageSchema2.typeAndOffsetAt(slowPositionForFieldNumber);
                    try {
                        type2 = type(typeAndOffsetAt);
                        listFieldSchemaLite = messageSchema2.listFieldSchema;
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        messageSchema = messageSchema2;
                        i = i4;
                    }
                    switch (type2) {
                        case 0:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset = offset(typeAndOffsetAt);
                            codedInputStreamReader2.requireWireType(1);
                            Object obj3 = obj2;
                            try {
                                UnsafeUtil.MEMORY_ACCESSOR.putDouble(obj3, offset, Double.longBitsToDouble(((CodedInputStream$ArrayDecoder) codedInputStreamReader2.input).readRawLittleEndian64()));
                                obj2 = obj3;
                                messageSchema.setFieldPresent(obj2, slowPositionForFieldNumber);
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                obj2 = obj3;
                                try {
                                    unknownFieldSchema.getClass();
                                    if (unknownFieldSetLite == null) {
                                    }
                                    if (!unknownFieldSchema.mergeOneFieldFrom(0, codedInputStreamReader2, unknownFieldSetLite)) {
                                    }
                                    messageSchema2 = messageSchema;
                                    codedInputStreamReader3 = codedInputStreamReader2;
                                    i4 = i;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                } catch (Throwable th) {
                                    th = th;
                                    for (i2 = i; i2 < i3; i2++) {
                                        messageSchema.filterMapUnknownEnumValues(iArr[i2], obj2, unknownFieldSetLite);
                                    }
                                    if (unknownFieldSetLite != null) {
                                        ((UnknownFieldSetLiteSchema) unknownFieldSchema).getClass();
                                        ((GeneratedMessageLite) obj2).unknownFields = unknownFieldSetLite;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj2 = obj3;
                                while (i2 < i3) {
                                }
                                if (unknownFieldSetLite != null) {
                                }
                                throw th;
                            }
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                            break;
                        case 1:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset2 = offset(typeAndOffsetAt);
                            codedInputStreamReader2.requireWireType(5);
                            UnsafeUtil.MEMORY_ACCESSOR.putFloat(obj2, offset2, Float.intBitsToFloat(((CodedInputStream$ArrayDecoder) codedInputStreamReader2.input).readRawLittleEndian32()));
                            messageSchema.setFieldPresent(obj2, slowPositionForFieldNumber);
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 2:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset3 = offset(typeAndOffsetAt);
                            codedInputStreamReader2.requireWireType(0);
                            UnsafeUtil.putLong(obj2, offset3, ((CodedInputStream$ArrayDecoder) codedInputStreamReader2.input).readRawVarint64());
                            messageSchema.setFieldPresent(obj2, slowPositionForFieldNumber);
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 3:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset4 = offset(typeAndOffsetAt);
                            codedInputStreamReader2.requireWireType(0);
                            UnsafeUtil.putLong(obj2, offset4, ((CodedInputStream$ArrayDecoder) codedInputStreamReader2.input).readRawVarint64());
                            messageSchema.setFieldPresent(obj2, slowPositionForFieldNumber);
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 4:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset5 = offset(typeAndOffsetAt);
                            codedInputStreamReader2.requireWireType(0);
                            UnsafeUtil.putInt(obj2, offset5, ((CodedInputStream$ArrayDecoder) codedInputStreamReader2.input).readRawVarint32());
                            messageSchema.setFieldPresent(obj2, slowPositionForFieldNumber);
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 5:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset6 = offset(typeAndOffsetAt);
                            codedInputStreamReader2.requireWireType(1);
                            UnsafeUtil.putLong(obj2, offset6, ((CodedInputStream$ArrayDecoder) codedInputStreamReader2.input).readRawLittleEndian64());
                            messageSchema.setFieldPresent(obj2, slowPositionForFieldNumber);
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 6:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset7 = offset(typeAndOffsetAt);
                            codedInputStreamReader2.requireWireType(5);
                            UnsafeUtil.putInt(obj2, offset7, ((CodedInputStream$ArrayDecoder) codedInputStreamReader2.input).readRawLittleEndian32());
                            messageSchema.setFieldPresent(obj2, slowPositionForFieldNumber);
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 7:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset8 = offset(typeAndOffsetAt);
                            codedInputStreamReader2.requireWireType(0);
                            UnsafeUtil.MEMORY_ACCESSOR.putBoolean(obj2, offset8, codedInputStreamReader2.input.readBool());
                            messageSchema.setFieldPresent(obj2, slowPositionForFieldNumber);
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 8:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema.readString(typeAndOffsetAt, codedInputStreamReader2, obj2);
                            messageSchema.setFieldPresent(obj2, slowPositionForFieldNumber);
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 9:
                            ExtensionRegistryLite extensionRegistryLite3 = extensionRegistryLite2;
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            AbstractMessageLite abstractMessageLite = (AbstractMessageLite) messageSchema.mutableMessageFieldForMerge(obj2, slowPositionForFieldNumber);
                            Schema messageFieldSchema = messageSchema.getMessageFieldSchema(slowPositionForFieldNumber);
                            codedInputStreamReader2.requireWireType(2);
                            codedInputStreamReader2.mergeMessageFieldInternal(abstractMessageLite, messageFieldSchema, extensionRegistryLite3);
                            messageSchema.storeMessageField(obj2, slowPositionForFieldNumber, abstractMessageLite);
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 10:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), codedInputStreamReader2.readBytes());
                            messageSchema.setFieldPresent(obj2, slowPositionForFieldNumber);
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 11:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset9 = offset(typeAndOffsetAt);
                            codedInputStreamReader2.requireWireType(0);
                            UnsafeUtil.putInt(obj2, offset9, ((CodedInputStream$ArrayDecoder) codedInputStreamReader2.input).readRawVarint32());
                            messageSchema.setFieldPresent(obj2, slowPositionForFieldNumber);
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 12:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            codedInputStreamReader2.requireWireType(0);
                            int readRawVarint32 = ((CodedInputStream$ArrayDecoder) codedInputStreamReader2.input).readRawVarint32();
                            messageSchema.getEnumFieldVerifier(slowPositionForFieldNumber);
                            UnsafeUtil.putInt(obj2, offset(typeAndOffsetAt), readRawVarint32);
                            messageSchema.setFieldPresent(obj2, slowPositionForFieldNumber);
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 13:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset10 = offset(typeAndOffsetAt);
                            codedInputStreamReader2.requireWireType(5);
                            UnsafeUtil.putInt(obj2, offset10, ((CodedInputStream$ArrayDecoder) codedInputStreamReader2.input).readRawLittleEndian32());
                            messageSchema.setFieldPresent(obj2, slowPositionForFieldNumber);
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 14:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset11 = offset(typeAndOffsetAt);
                            codedInputStreamReader2.requireWireType(1);
                            UnsafeUtil.putLong(obj2, offset11, ((CodedInputStream$ArrayDecoder) codedInputStreamReader2.input).readRawLittleEndian64());
                            messageSchema.setFieldPresent(obj2, slowPositionForFieldNumber);
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 15:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset12 = offset(typeAndOffsetAt);
                            codedInputStreamReader2.requireWireType(0);
                            UnsafeUtil.putInt(obj2, offset12, zzacv.decodeZigZag32(((CodedInputStream$ArrayDecoder) codedInputStreamReader2.input).readRawVarint32()));
                            messageSchema.setFieldPresent(obj2, slowPositionForFieldNumber);
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 16:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset13 = offset(typeAndOffsetAt);
                            codedInputStreamReader2.requireWireType(0);
                            UnsafeUtil.putLong(obj2, offset13, zzacv.decodeZigZag64(((CodedInputStream$ArrayDecoder) codedInputStreamReader2.input).readRawVarint64()));
                            messageSchema.setFieldPresent(obj2, slowPositionForFieldNumber);
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 17:
                            ExtensionRegistryLite extensionRegistryLite4 = extensionRegistryLite2;
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            AbstractMessageLite abstractMessageLite2 = (AbstractMessageLite) messageSchema.mutableMessageFieldForMerge(obj2, slowPositionForFieldNumber);
                            Schema messageFieldSchema2 = messageSchema.getMessageFieldSchema(slowPositionForFieldNumber);
                            codedInputStreamReader2.requireWireType(3);
                            codedInputStreamReader2.mergeGroupFieldInternal(abstractMessageLite2, messageFieldSchema2, extensionRegistryLite4);
                            messageSchema.storeMessageField(obj2, slowPositionForFieldNumber, abstractMessageLite2);
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 18:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset14 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader2.readDoubleList(ListFieldSchemaLite.mutableListAt(obj2, offset14));
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 19:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset15 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader2.readFloatList(ListFieldSchemaLite.mutableListAt(obj2, offset15));
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 20:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset16 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader2.readInt64List(ListFieldSchemaLite.mutableListAt(obj2, offset16));
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 21:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset17 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader2.readUInt64List(ListFieldSchemaLite.mutableListAt(obj2, offset17));
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 22:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset18 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader2.readInt32List(ListFieldSchemaLite.mutableListAt(obj2, offset18));
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 23:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset19 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader2.readFixed64List(ListFieldSchemaLite.mutableListAt(obj2, offset19));
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 24:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset20 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader2.readFixed32List(ListFieldSchemaLite.mutableListAt(obj2, offset20));
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 25:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            long offset21 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader2.readBoolList(ListFieldSchemaLite.mutableListAt(obj2, offset21));
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 26:
                            i = i4;
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            try {
                                messageSchema.readStringList(typeAndOffsetAt, codedInputStreamReader2, obj2);
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                unknownFieldSchema.getClass();
                                if (unknownFieldSetLite == null) {
                                }
                                if (!unknownFieldSchema.mergeOneFieldFrom(0, codedInputStreamReader2, unknownFieldSetLite)) {
                                }
                                messageSchema2 = messageSchema;
                                codedInputStreamReader3 = codedInputStreamReader2;
                                i4 = i;
                                extensionRegistryLite2 = extensionRegistryLite;
                            }
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                            break;
                        case 27:
                            i = i4;
                            try {
                                try {
                                    messageSchema2.readMessageList(obj2, typeAndOffsetAt, codedInputStreamReader3, messageSchema2.getMessageFieldSchema(slowPositionForFieldNumber), extensionRegistryLite);
                                    codedInputStreamReader2 = codedInputStreamReader3;
                                    messageSchema = messageSchema2;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                    codedInputStreamReader2 = codedInputStreamReader3;
                                    messageSchema = messageSchema2;
                                    unknownFieldSchema.getClass();
                                    if (unknownFieldSetLite == null) {
                                    }
                                    if (!unknownFieldSchema.mergeOneFieldFrom(0, codedInputStreamReader2, unknownFieldSetLite)) {
                                    }
                                    messageSchema2 = messageSchema;
                                    codedInputStreamReader3 = codedInputStreamReader2;
                                    i4 = i;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                messageSchema = messageSchema2;
                                codedInputStreamReader2 = codedInputStreamReader3;
                                unknownFieldSchema.getClass();
                                if (unknownFieldSetLite == null) {
                                }
                                if (!unknownFieldSchema.mergeOneFieldFrom(0, codedInputStreamReader2, unknownFieldSetLite)) {
                                }
                                messageSchema2 = messageSchema;
                                codedInputStreamReader3 = codedInputStreamReader2;
                                i4 = i;
                                extensionRegistryLite2 = extensionRegistryLite;
                            }
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                            break;
                        case 28:
                            i = i4;
                            long offset22 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader3.readBytesList(ListFieldSchemaLite.mutableListAt(obj2, offset22));
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 29:
                            i = i4;
                            long offset23 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader3.readUInt32List(ListFieldSchemaLite.mutableListAt(obj2, offset23));
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 30:
                            i = i4;
                            long offset24 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            Internal.ProtobufList mutableListAt = ListFieldSchemaLite.mutableListAt(obj2, offset24);
                            codedInputStreamReader3.readEnumList(mutableListAt);
                            messageSchema2.getEnumFieldVerifier(slowPositionForFieldNumber);
                            SchemaUtil.filterUnknownEnumList(obj2, fieldNumber, mutableListAt, unknownFieldSetLite, unknownFieldSchema);
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 31:
                            i = i4;
                            long offset25 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader3.readSFixed32List(ListFieldSchemaLite.mutableListAt(obj2, offset25));
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 32:
                            i = i4;
                            long offset26 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader3.readSFixed64List(ListFieldSchemaLite.mutableListAt(obj2, offset26));
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 33:
                            i = i4;
                            long offset27 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader3.readSInt32List(ListFieldSchemaLite.mutableListAt(obj2, offset27));
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 34:
                            i = i4;
                            long offset28 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader3.readSInt64List(ListFieldSchemaLite.mutableListAt(obj2, offset28));
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 35:
                            i = i4;
                            long offset29 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader3.readDoubleList(ListFieldSchemaLite.mutableListAt(obj2, offset29));
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 36:
                            i = i4;
                            long offset30 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader3.readFloatList(ListFieldSchemaLite.mutableListAt(obj2, offset30));
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 37:
                            i = i4;
                            long offset31 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader3.readInt64List(ListFieldSchemaLite.mutableListAt(obj2, offset31));
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 38:
                            i = i4;
                            long offset32 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader3.readUInt64List(ListFieldSchemaLite.mutableListAt(obj2, offset32));
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 39:
                            i = i4;
                            long offset33 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader3.readInt32List(ListFieldSchemaLite.mutableListAt(obj2, offset33));
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 40:
                            i = i4;
                            long offset34 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader3.readFixed64List(ListFieldSchemaLite.mutableListAt(obj2, offset34));
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 41:
                            i = i4;
                            long offset35 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader3.readFixed32List(ListFieldSchemaLite.mutableListAt(obj2, offset35));
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 42:
                            i = i4;
                            long offset36 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader3.readBoolList(ListFieldSchemaLite.mutableListAt(obj2, offset36));
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 43:
                            i = i4;
                            long offset37 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader3.readUInt32List(ListFieldSchemaLite.mutableListAt(obj2, offset37));
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 44:
                            i = i4;
                            long offset38 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            Internal.ProtobufList mutableListAt2 = ListFieldSchemaLite.mutableListAt(obj2, offset38);
                            codedInputStreamReader3.readEnumList(mutableListAt2);
                            messageSchema2.getEnumFieldVerifier(slowPositionForFieldNumber);
                            SchemaUtil.filterUnknownEnumList(obj2, fieldNumber, mutableListAt2, unknownFieldSetLite, unknownFieldSchema);
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 45:
                            i = i4;
                            long offset39 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader3.readSFixed32List(ListFieldSchemaLite.mutableListAt(obj2, offset39));
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 46:
                            i = i4;
                            long offset40 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader3.readSFixed64List(ListFieldSchemaLite.mutableListAt(obj2, offset40));
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 47:
                            i = i4;
                            long offset41 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader3.readSInt32List(ListFieldSchemaLite.mutableListAt(obj2, offset41));
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 48:
                            i = i4;
                            long offset42 = offset(typeAndOffsetAt);
                            listFieldSchemaLite.getClass();
                            codedInputStreamReader3.readSInt64List(ListFieldSchemaLite.mutableListAt(obj2, offset42));
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 49:
                            i = i4;
                            try {
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                codedInputStreamReader2 = codedInputStreamReader;
                                messageSchema = messageSchema2;
                                unknownFieldSchema.getClass();
                                if (unknownFieldSetLite == null) {
                                    unknownFieldSetLite = unknownFieldSchema.getBuilderFromMessage(obj2);
                                }
                                if (!unknownFieldSchema.mergeOneFieldFrom(0, codedInputStreamReader2, unknownFieldSetLite)) {
                                    for (int i5 = i; i5 < i3; i5++) {
                                        messageSchema.filterMapUnknownEnumValues(iArr[i5], obj2, unknownFieldSetLite);
                                    }
                                    if (unknownFieldSetLite == null) {
                                        return;
                                    }
                                    ((GeneratedMessageLite) obj2).unknownFields = unknownFieldSetLite;
                                    return;
                                }
                                messageSchema2 = messageSchema;
                                codedInputStreamReader3 = codedInputStreamReader2;
                                i4 = i;
                                extensionRegistryLite2 = extensionRegistryLite;
                            }
                            try {
                                messageSchema2.readGroupList(obj2, offset(typeAndOffsetAt), codedInputStreamReader, messageSchema2.getMessageFieldSchema(slowPositionForFieldNumber), extensionRegistryLite);
                                codedInputStreamReader3 = codedInputStreamReader;
                                messageSchema = messageSchema2;
                                codedInputStreamReader2 = codedInputStreamReader3;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused7) {
                                messageSchema = messageSchema2;
                                codedInputStreamReader2 = codedInputStreamReader;
                                unknownFieldSchema.getClass();
                                if (unknownFieldSetLite == null) {
                                }
                                if (!unknownFieldSchema.mergeOneFieldFrom(0, codedInputStreamReader2, unknownFieldSetLite)) {
                                }
                                messageSchema2 = messageSchema;
                                codedInputStreamReader3 = codedInputStreamReader2;
                                i4 = i;
                                extensionRegistryLite2 = extensionRegistryLite;
                            }
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 50:
                            i = i4;
                            messageSchema2.mergeMap(slowPositionForFieldNumber, obj2, messageSchema2.getMapFieldDefaultEntry(slowPositionForFieldNumber));
                            throw null;
                            break;
                        case 51:
                            i = i4;
                            long offset43 = offset(typeAndOffsetAt);
                            codedInputStreamReader3.requireWireType(1);
                            UnsafeUtil.putObject(obj2, offset43, Double.valueOf(Double.longBitsToDouble(((CodedInputStream$ArrayDecoder) codedInputStreamReader3.input).readRawLittleEndian64())));
                            messageSchema2.setOneofPresent(obj2, fieldNumber, slowPositionForFieldNumber);
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 52:
                            i = i4;
                            long offset44 = offset(typeAndOffsetAt);
                            codedInputStreamReader3.requireWireType(5);
                            UnsafeUtil.putObject(obj2, offset44, Float.valueOf(Float.intBitsToFloat(((CodedInputStream$ArrayDecoder) codedInputStreamReader3.input).readRawLittleEndian32())));
                            messageSchema2.setOneofPresent(obj2, fieldNumber, slowPositionForFieldNumber);
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 53:
                            i = i4;
                            long offset45 = offset(typeAndOffsetAt);
                            codedInputStreamReader3.requireWireType(0);
                            UnsafeUtil.putObject(obj2, offset45, Long.valueOf(((CodedInputStream$ArrayDecoder) codedInputStreamReader3.input).readRawVarint64()));
                            messageSchema2.setOneofPresent(obj2, fieldNumber, slowPositionForFieldNumber);
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 54:
                            i = i4;
                            long offset46 = offset(typeAndOffsetAt);
                            codedInputStreamReader3.requireWireType(0);
                            UnsafeUtil.putObject(obj2, offset46, Long.valueOf(((CodedInputStream$ArrayDecoder) codedInputStreamReader3.input).readRawVarint64()));
                            messageSchema2.setOneofPresent(obj2, fieldNumber, slowPositionForFieldNumber);
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 55:
                            i = i4;
                            long offset47 = offset(typeAndOffsetAt);
                            codedInputStreamReader3.requireWireType(0);
                            UnsafeUtil.putObject(obj2, offset47, Integer.valueOf(((CodedInputStream$ArrayDecoder) codedInputStreamReader3.input).readRawVarint32()));
                            messageSchema2.setOneofPresent(obj2, fieldNumber, slowPositionForFieldNumber);
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 56:
                            i = i4;
                            long offset48 = offset(typeAndOffsetAt);
                            codedInputStreamReader3.requireWireType(1);
                            UnsafeUtil.putObject(obj2, offset48, Long.valueOf(((CodedInputStream$ArrayDecoder) codedInputStreamReader3.input).readRawLittleEndian64()));
                            messageSchema2.setOneofPresent(obj2, fieldNumber, slowPositionForFieldNumber);
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 57:
                            i = i4;
                            long offset49 = offset(typeAndOffsetAt);
                            codedInputStreamReader3.requireWireType(5);
                            UnsafeUtil.putObject(obj2, offset49, Integer.valueOf(((CodedInputStream$ArrayDecoder) codedInputStreamReader3.input).readRawLittleEndian32()));
                            messageSchema2.setOneofPresent(obj2, fieldNumber, slowPositionForFieldNumber);
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 58:
                            i = i4;
                            long offset50 = offset(typeAndOffsetAt);
                            codedInputStreamReader3.requireWireType(0);
                            UnsafeUtil.putObject(obj2, offset50, Boolean.valueOf(codedInputStreamReader3.input.readBool()));
                            messageSchema2.setOneofPresent(obj2, fieldNumber, slowPositionForFieldNumber);
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 59:
                            i = i4;
                            messageSchema2.readString(typeAndOffsetAt, codedInputStreamReader3, obj2);
                            messageSchema2.setOneofPresent(obj2, fieldNumber, slowPositionForFieldNumber);
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 60:
                            i = i4;
                            AbstractMessageLite abstractMessageLite3 = (AbstractMessageLite) messageSchema2.mutableOneofMessageFieldForMerge(obj2, fieldNumber, slowPositionForFieldNumber);
                            Schema messageFieldSchema3 = messageSchema2.getMessageFieldSchema(slowPositionForFieldNumber);
                            codedInputStreamReader3.requireWireType(2);
                            codedInputStreamReader3.mergeMessageFieldInternal(abstractMessageLite3, messageFieldSchema3, extensionRegistryLite2);
                            messageSchema2.storeOneofMessageField(obj2, fieldNumber, slowPositionForFieldNumber, abstractMessageLite3);
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 61:
                            i = i4;
                            UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), codedInputStreamReader3.readBytes());
                            messageSchema2.setOneofPresent(obj2, fieldNumber, slowPositionForFieldNumber);
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 62:
                            i = i4;
                            long offset51 = offset(typeAndOffsetAt);
                            codedInputStreamReader3.requireWireType(0);
                            UnsafeUtil.putObject(obj2, offset51, Integer.valueOf(((CodedInputStream$ArrayDecoder) codedInputStreamReader3.input).readRawVarint32()));
                            messageSchema2.setOneofPresent(obj2, fieldNumber, slowPositionForFieldNumber);
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 63:
                            i = i4;
                            codedInputStreamReader3.requireWireType(0);
                            int readRawVarint322 = ((CodedInputStream$ArrayDecoder) codedInputStreamReader3.input).readRawVarint32();
                            messageSchema2.getEnumFieldVerifier(slowPositionForFieldNumber);
                            UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), Integer.valueOf(readRawVarint322));
                            messageSchema2.setOneofPresent(obj2, fieldNumber, slowPositionForFieldNumber);
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 64:
                            i = i4;
                            long offset52 = offset(typeAndOffsetAt);
                            codedInputStreamReader3.requireWireType(5);
                            UnsafeUtil.putObject(obj2, offset52, Integer.valueOf(((CodedInputStream$ArrayDecoder) codedInputStreamReader3.input).readRawLittleEndian32()));
                            messageSchema2.setOneofPresent(obj2, fieldNumber, slowPositionForFieldNumber);
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 65:
                            i = i4;
                            long offset53 = offset(typeAndOffsetAt);
                            codedInputStreamReader3.requireWireType(1);
                            UnsafeUtil.putObject(obj2, offset53, Long.valueOf(((CodedInputStream$ArrayDecoder) codedInputStreamReader3.input).readRawLittleEndian64()));
                            messageSchema2.setOneofPresent(obj2, fieldNumber, slowPositionForFieldNumber);
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 66:
                            i = i4;
                            long offset54 = offset(typeAndOffsetAt);
                            codedInputStreamReader3.requireWireType(0);
                            UnsafeUtil.putObject(obj2, offset54, Integer.valueOf(zzacv.decodeZigZag32(((CodedInputStream$ArrayDecoder) codedInputStreamReader3.input).readRawVarint32())));
                            messageSchema2.setOneofPresent(obj2, fieldNumber, slowPositionForFieldNumber);
                            messageSchema = messageSchema2;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        case 67:
                            i = i4;
                            try {
                                try {
                                    long offset55 = offset(typeAndOffsetAt);
                                    codedInputStreamReader3.requireWireType(0);
                                    UnsafeUtil.putObject(obj2, offset55, Long.valueOf(zzacv.decodeZigZag64(((CodedInputStream$ArrayDecoder) codedInputStreamReader3.input).readRawVarint64())));
                                    messageSchema2.setOneofPresent(obj2, fieldNumber, slowPositionForFieldNumber);
                                    messageSchema = messageSchema2;
                                    codedInputStreamReader2 = codedInputStreamReader3;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused8) {
                                    messageSchema = messageSchema2;
                                    codedInputStreamReader2 = codedInputStreamReader3;
                                    unknownFieldSchema.getClass();
                                    if (unknownFieldSetLite == null) {
                                    }
                                    if (!unknownFieldSchema.mergeOneFieldFrom(0, codedInputStreamReader2, unknownFieldSetLite)) {
                                    }
                                    messageSchema2 = messageSchema;
                                    codedInputStreamReader3 = codedInputStreamReader2;
                                    i4 = i;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                }
                                messageSchema2 = messageSchema;
                                codedInputStreamReader3 = codedInputStreamReader2;
                                i4 = i;
                                extensionRegistryLite2 = extensionRegistryLite;
                            } catch (Throwable th3) {
                                th = th3;
                                messageSchema = messageSchema2;
                                while (i2 < i3) {
                                }
                                if (unknownFieldSetLite != null) {
                                }
                                throw th;
                            }
                            break;
                        case 68:
                            AbstractMessageLite abstractMessageLite4 = (AbstractMessageLite) messageSchema2.mutableOneofMessageFieldForMerge(obj2, fieldNumber, slowPositionForFieldNumber);
                            Schema messageFieldSchema4 = messageSchema2.getMessageFieldSchema(slowPositionForFieldNumber);
                            codedInputStreamReader3.requireWireType(3);
                            codedInputStreamReader3.mergeGroupFieldInternal(abstractMessageLite4, messageFieldSchema4, extensionRegistryLite2);
                            messageSchema2.storeOneofMessageField(obj2, fieldNumber, slowPositionForFieldNumber, abstractMessageLite4);
                            messageSchema = messageSchema2;
                            i = i4;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                        default:
                            if (unknownFieldSetLite == null) {
                                try {
                                    unknownFieldSetLite = unknownFieldSchema.getBuilderFromMessage(obj2);
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused9) {
                                    messageSchema = messageSchema2;
                                    i = i4;
                                    codedInputStreamReader2 = codedInputStreamReader3;
                                    unknownFieldSchema.getClass();
                                    if (unknownFieldSetLite == null) {
                                    }
                                    if (!unknownFieldSchema.mergeOneFieldFrom(0, codedInputStreamReader2, unknownFieldSetLite)) {
                                    }
                                    messageSchema2 = messageSchema;
                                    codedInputStreamReader3 = codedInputStreamReader2;
                                    i4 = i;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                }
                            }
                            if (!unknownFieldSchema.mergeOneFieldFrom(0, codedInputStreamReader3, unknownFieldSetLite)) {
                                while (i4 < i3) {
                                    messageSchema2.filterMapUnknownEnumValues(iArr[i4], obj2, unknownFieldSetLite);
                                    i4++;
                                }
                                if (unknownFieldSetLite == null) {
                                    return;
                                }
                            }
                            messageSchema = messageSchema2;
                            i = i4;
                            codedInputStreamReader2 = codedInputStreamReader3;
                            messageSchema2 = messageSchema;
                            codedInputStreamReader3 = codedInputStreamReader2;
                            i4 = i;
                            extensionRegistryLite2 = extensionRegistryLite;
                            break;
                    }
                } else if (fieldNumber == Integer.MAX_VALUE) {
                    while (i4 < i3) {
                        messageSchema2.filterMapUnknownEnumValues(iArr[i4], obj2, unknownFieldSetLite);
                        i4++;
                    }
                    if (unknownFieldSetLite == null) {
                        return;
                    } else {
                        ((UnknownFieldSetLiteSchema) unknownFieldSchema).getClass();
                    }
                } else {
                    unknownFieldSchema.getClass();
                    if (unknownFieldSetLite == null) {
                        unknownFieldSetLite = unknownFieldSchema.getBuilderFromMessage(obj2);
                    }
                    if (!unknownFieldSchema.mergeOneFieldFrom(0, codedInputStreamReader3, unknownFieldSetLite)) {
                        while (i4 < i3) {
                            messageSchema2.filterMapUnknownEnumValues(iArr[i4], obj2, unknownFieldSetLite);
                            i4++;
                        }
                        if (unknownFieldSetLite == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                messageSchema = messageSchema2;
                i = i4;
            }
        }
    }

    public final void mergeMap(int i, Object obj, Object obj2) {
        long typeAndOffsetAt = typeAndOffsetAt(i) & 1048575;
        Object object = UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, typeAndOffsetAt);
        MapFieldSchemaLite mapFieldSchemaLite = this.mapFieldSchema;
        if (object != null) {
            mapFieldSchemaLite.getClass();
            if (!((MapFieldLite) object).isMutable()) {
                MapFieldLite mutableCopy = MapFieldLite.emptyMapField().mutableCopy();
                MapFieldSchemaLite.mergeFrom(mutableCopy, object);
                UnsafeUtil.putObject(obj, typeAndOffsetAt, mutableCopy);
                object = mutableCopy;
            }
        } else {
            mapFieldSchemaLite.getClass();
            object = MapFieldLite.emptyMapField().mutableCopy();
            UnsafeUtil.putObject(obj, typeAndOffsetAt, object);
        }
        mapFieldSchemaLite.getClass();
        JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(obj2);
        throw null;
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
                    Object newInstance = messageFieldSchema.newInstance();
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
                Object newInstance2 = messageFieldSchema.newInstance();
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
                    Object newInstance = messageFieldSchema.newInstance();
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
                Object newInstance2 = messageFieldSchema.newInstance();
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
        Object newInstance = messageFieldSchema.newInstance();
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
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final Object newInstance() {
        this.newInstanceSchema.getClass();
        return ((GeneratedMessageLite) this.defaultInstance).newMutableInstance$1();
    }

    public final void parseMapField(long j, Object obj, int i) {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i);
        Object object = unsafe.getObject(obj, j);
        this.mapFieldSchema.getClass();
        if (!((MapFieldLite) object).isMutable()) {
            MapFieldLite mutableCopy = MapFieldLite.emptyMapField().mutableCopy();
            MapFieldSchemaLite.mergeFrom(mutableCopy, object);
            unsafe.putObject(obj, j, mutableCopy);
        }
        JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(mapFieldDefaultEntry);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x014c, code lost:
    
        r4 = r9;
        r9 = r25 | r23;
        r3 = r7;
        r7 = r13;
        r13 = r4;
        r4 = r33;
        r5 = r2;
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0297, code lost:
    
        r4 = r9;
        r9 = r25 | r23;
        r3 = r4;
        r4 = r13;
        r13 = r7;
        r7 = r4;
        r4 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x04a8, code lost:
    
        if (r8 == 1048575) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x04aa, code lost:
    
        r15.putInt(r10, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x04ae, code lost:
    
        r0 = r6.checkInitializedCount;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x04b2, code lost:
    
        if (r0 >= r6.repeatedFieldOffsetStart) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x04b4, code lost:
    
        r6.filterMapUnknownEnumValues(r6.intArray[r0], r10, r32);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x04c0, code lost:
    
        if (r34 != 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x04c2, code lost:
    
        if (r5 != r4) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x04c9, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x04ce, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04ca, code lost:
    
        if (r5 > r4) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x04cc, code lost:
    
        if (r12 != r34) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x04d3, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int parseMessage(Object obj, byte[] bArr, int i, int i2, int i3, ArrayDecoders$Registers arrayDecoders$Registers) {
        MessageSchema messageSchema;
        Unsafe unsafe;
        Object obj2;
        Object obj3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        char c;
        int i10;
        Unsafe unsafe2;
        Object obj4;
        int i11;
        byte[] bArr2;
        int i12;
        byte[] bArr3;
        ArrayDecoders$Registers arrayDecoders$Registers2;
        Unsafe unsafe3;
        Object obj5;
        ArrayDecoders$Registers arrayDecoders$Registers3;
        int i13;
        byte[] bArr4;
        int decodeVarint64;
        int i14;
        byte[] bArr5;
        Object obj6;
        ArrayDecoders$Registers arrayDecoders$Registers4;
        int decodeBytes;
        Object obj7;
        int i15;
        int i16;
        int i17;
        MessageSchema messageSchema2 = this;
        Object obj8 = obj;
        byte[] bArr6 = bArr;
        int i18 = i2;
        ArrayDecoders$Registers arrayDecoders$Registers5 = arrayDecoders$Registers;
        checkMutable(obj8);
        Unsafe unsafe4 = UNSAFE;
        int i19 = i;
        int i20 = -1;
        int i21 = 0;
        int i22 = 1048575;
        int i23 = 0;
        int i24 = 0;
        while (true) {
            int i25 = 1048575;
            while (true) {
                if (i19 < i18) {
                    int i26 = i19 + 1;
                    int i27 = bArr6[i19];
                    if (i27 < 0) {
                        i26 = DBUtil.decodeVarint32(i27, bArr6, i26, arrayDecoders$Registers5);
                        i27 = arrayDecoders$Registers5.int1;
                    }
                    int i28 = i26;
                    i24 = i27;
                    i19 = i28;
                    obj3 = null;
                    i4 = i24 >>> 3;
                    int i29 = i24 & 7;
                    int i30 = messageSchema2.maxFieldNumber;
                    int i31 = messageSchema2.minFieldNumber;
                    if (i4 > i20) {
                        i6 = (i4 < i31 || i4 > i30) ? -1 : messageSchema2.slowPositionForFieldNumber(i4, i21 / 3);
                        i5 = 0;
                    } else if (i4 < i31 || i4 > i30) {
                        i5 = 0;
                        i6 = -1;
                    } else {
                        i5 = 0;
                        i6 = messageSchema2.slowPositionForFieldNumber(i4, 0);
                    }
                    if (i6 == -1) {
                        i21 = i5;
                        i7 = i4;
                        messageSchema = messageSchema2;
                        unsafe = unsafe4;
                        obj2 = obj8;
                        i8 = i24;
                    } else {
                        int[] iArr = messageSchema2.buffer;
                        int i32 = iArr[i6 + 1];
                        int i33 = i5;
                        int type2 = type(i32);
                        long j = i32 & i25;
                        if (type2 <= 17) {
                            int i34 = iArr[i6 + 2];
                            int i35 = 1 << (i34 >>> 20);
                            int i36 = i34 & i25;
                            if (i36 != i22) {
                                int i37 = i25;
                                if (i22 != i37) {
                                    unsafe4.putInt(obj8, i22, i23);
                                    i37 = 1048575;
                                }
                                i23 = i36 == i37 ? i33 : unsafe4.getInt(obj8, i36);
                                i9 = i36;
                            } else {
                                i9 = i22;
                            }
                            int i38 = i23;
                            switch (type2) {
                                case 0:
                                    unsafe2 = unsafe4;
                                    ArrayDecoders$Registers arrayDecoders$Registers6 = arrayDecoders$Registers5;
                                    i11 = i19;
                                    c = 65535;
                                    i10 = i6;
                                    if (i29 != 1) {
                                        obj4 = obj8;
                                        messageSchema = messageSchema2;
                                        i19 = i11;
                                        i8 = i24;
                                        i21 = i10;
                                        i22 = i9;
                                        i23 = i38;
                                        i7 = i4;
                                        unsafe = unsafe2;
                                        obj2 = obj4;
                                        break;
                                    } else {
                                        UnsafeUtil.MEMORY_ACCESSOR.putDouble(obj8, j, Double.longBitsToDouble(DBUtil.decodeFixed64(bArr, i11)));
                                        i19 = i11 + 8;
                                        arrayDecoders$Registers5 = arrayDecoders$Registers6;
                                        i21 = i10;
                                        i18 = i2;
                                        bArr6 = bArr;
                                        i20 = i4;
                                        i22 = i9;
                                        i25 = 1048575;
                                        i23 = i38 | i35;
                                        obj8 = obj8;
                                        unsafe4 = unsafe2;
                                    }
                                case 1:
                                    bArr2 = bArr;
                                    unsafe2 = unsafe4;
                                    ArrayDecoders$Registers arrayDecoders$Registers7 = arrayDecoders$Registers5;
                                    i11 = i19;
                                    c = 65535;
                                    i10 = i6;
                                    if (i29 != 5) {
                                        obj4 = obj8;
                                        messageSchema = messageSchema2;
                                        i19 = i11;
                                        i8 = i24;
                                        i21 = i10;
                                        i22 = i9;
                                        i23 = i38;
                                        i7 = i4;
                                        unsafe = unsafe2;
                                        obj2 = obj4;
                                        break;
                                    } else {
                                        UnsafeUtil.MEMORY_ACCESSOR.putFloat(obj8, j, Float.intBitsToFloat(DBUtil.decodeFixed32(bArr2, i11)));
                                        i19 = i11 + 4;
                                        i12 = i38 | i35;
                                        arrayDecoders$Registers5 = arrayDecoders$Registers7;
                                        i21 = i10;
                                        i18 = i2;
                                        bArr6 = bArr2;
                                        i20 = i4;
                                        i22 = i9;
                                        i25 = 1048575;
                                        i23 = i12;
                                        unsafe4 = unsafe2;
                                    }
                                case 2:
                                case 3:
                                    bArr2 = bArr;
                                    ArrayDecoders$Registers arrayDecoders$Registers8 = arrayDecoders$Registers5;
                                    i11 = i19;
                                    c = 65535;
                                    i10 = i6;
                                    if (i29 != 0) {
                                        unsafe2 = unsafe4;
                                        obj4 = obj8;
                                        messageSchema = messageSchema2;
                                        i19 = i11;
                                        i8 = i24;
                                        i21 = i10;
                                        i22 = i9;
                                        i23 = i38;
                                        i7 = i4;
                                        unsafe = unsafe2;
                                        obj2 = obj4;
                                        break;
                                    } else {
                                        int decodeVarint642 = DBUtil.decodeVarint64(bArr2, i11, arrayDecoders$Registers8);
                                        unsafe4.putLong(obj8, j, arrayDecoders$Registers8.long1);
                                        unsafe2 = unsafe4;
                                        i12 = i38 | i35;
                                        arrayDecoders$Registers5 = arrayDecoders$Registers8;
                                        i21 = i10;
                                        i18 = i2;
                                        i19 = decodeVarint642;
                                        bArr6 = bArr2;
                                        i20 = i4;
                                        i22 = i9;
                                        i25 = 1048575;
                                        i23 = i12;
                                        unsafe4 = unsafe2;
                                    }
                                case 4:
                                case 11:
                                    bArr3 = bArr;
                                    arrayDecoders$Registers2 = arrayDecoders$Registers5;
                                    i11 = i19;
                                    c = 65535;
                                    i10 = i6;
                                    if (i29 == 0) {
                                        i19 = DBUtil.decodeVarint32(bArr3, i11, arrayDecoders$Registers2);
                                        unsafe4.putInt(obj8, j, arrayDecoders$Registers2.int1);
                                        break;
                                    }
                                    unsafe2 = unsafe4;
                                    obj4 = obj8;
                                    messageSchema = messageSchema2;
                                    i19 = i11;
                                    i8 = i24;
                                    i21 = i10;
                                    i22 = i9;
                                    i23 = i38;
                                    i7 = i4;
                                    unsafe = unsafe2;
                                    obj2 = obj4;
                                    break;
                                case 5:
                                case 14:
                                    bArr3 = bArr;
                                    Unsafe unsafe5 = unsafe4;
                                    Object obj9 = obj8;
                                    ArrayDecoders$Registers arrayDecoders$Registers9 = arrayDecoders$Registers5;
                                    c = 65535;
                                    i10 = i6;
                                    if (i29 != 1) {
                                        i11 = i19;
                                        unsafe2 = unsafe5;
                                        obj4 = obj9;
                                        messageSchema = messageSchema2;
                                        i19 = i11;
                                        i8 = i24;
                                        i21 = i10;
                                        i22 = i9;
                                        i23 = i38;
                                        i7 = i4;
                                        unsafe = unsafe2;
                                        obj2 = obj4;
                                        break;
                                    } else {
                                        arrayDecoders$Registers2 = arrayDecoders$Registers9;
                                        unsafe4 = unsafe5;
                                        obj8 = obj9;
                                        unsafe4.putLong(obj8, j, DBUtil.decodeFixed64(bArr3, i19));
                                        i19 += 8;
                                        break;
                                    }
                                case 6:
                                case 13:
                                    unsafe3 = unsafe4;
                                    obj5 = obj8;
                                    arrayDecoders$Registers3 = arrayDecoders$Registers5;
                                    c = 65535;
                                    i10 = i6;
                                    i13 = i19;
                                    if (i29 != 5) {
                                        obj4 = obj5;
                                        unsafe2 = unsafe3;
                                        i11 = i13;
                                        messageSchema = messageSchema2;
                                        i19 = i11;
                                        i8 = i24;
                                        i21 = i10;
                                        i22 = i9;
                                        i23 = i38;
                                        i7 = i4;
                                        unsafe = unsafe2;
                                        obj2 = obj4;
                                        break;
                                    } else {
                                        unsafe3.putInt(obj5, j, DBUtil.decodeFixed32(bArr, i13));
                                        i19 = i13 + 4;
                                        i18 = i2;
                                        bArr6 = bArr;
                                        i21 = i10;
                                        i20 = i4;
                                        i25 = 1048575;
                                        arrayDecoders$Registers5 = arrayDecoders$Registers3;
                                        i23 = i38 | i35;
                                        unsafe4 = unsafe3;
                                        obj8 = obj5;
                                        i22 = i9;
                                    }
                                case 7:
                                    bArr4 = bArr;
                                    unsafe3 = unsafe4;
                                    obj5 = obj8;
                                    arrayDecoders$Registers3 = arrayDecoders$Registers5;
                                    c = 65535;
                                    i10 = i6;
                                    i13 = i19;
                                    if (i29 != 0) {
                                        obj4 = obj5;
                                        unsafe2 = unsafe3;
                                        i11 = i13;
                                        messageSchema = messageSchema2;
                                        i19 = i11;
                                        i8 = i24;
                                        i21 = i10;
                                        i22 = i9;
                                        i23 = i38;
                                        i7 = i4;
                                        unsafe = unsafe2;
                                        obj2 = obj4;
                                        break;
                                    } else {
                                        decodeVarint64 = DBUtil.decodeVarint64(bArr4, i13, arrayDecoders$Registers3);
                                        UnsafeUtil.MEMORY_ACCESSOR.putBoolean(obj5, j, arrayDecoders$Registers3.long1 != 0 ? 1 : i33);
                                        byte[] bArr7 = bArr4;
                                        i23 = i38 | i35;
                                        bArr6 = bArr7;
                                        i18 = i2;
                                        i19 = decodeVarint64;
                                        obj8 = obj5;
                                        i21 = i10;
                                        i20 = i4;
                                        i25 = 1048575;
                                        arrayDecoders$Registers5 = arrayDecoders$Registers3;
                                        unsafe4 = unsafe3;
                                        i22 = i9;
                                    }
                                case 8:
                                    bArr4 = bArr;
                                    unsafe3 = unsafe4;
                                    obj5 = obj8;
                                    arrayDecoders$Registers3 = arrayDecoders$Registers5;
                                    c = 65535;
                                    i10 = i6;
                                    i13 = i19;
                                    if (i29 != 2) {
                                        obj4 = obj5;
                                        unsafe2 = unsafe3;
                                        i11 = i13;
                                        messageSchema = messageSchema2;
                                        i19 = i11;
                                        i8 = i24;
                                        i21 = i10;
                                        i22 = i9;
                                        i23 = i38;
                                        i7 = i4;
                                        unsafe = unsafe2;
                                        obj2 = obj4;
                                        break;
                                    } else if ((536870912 & i32) != 0) {
                                        decodeVarint64 = DBUtil.decodeVarint32(bArr4, i13, arrayDecoders$Registers3);
                                        i14 = arrayDecoders$Registers3.int1;
                                        if (i14 < 0) {
                                            throw InvalidProtocolBufferException.negativeSize();
                                        }
                                        if (i14 == 0) {
                                            arrayDecoders$Registers3.object1 = "";
                                            unsafe3.putObject(obj5, j, arrayDecoders$Registers3.object1);
                                            byte[] bArr72 = bArr4;
                                            i23 = i38 | i35;
                                            bArr6 = bArr72;
                                            i18 = i2;
                                            i19 = decodeVarint64;
                                            obj8 = obj5;
                                            i21 = i10;
                                            i20 = i4;
                                            i25 = 1048575;
                                            arrayDecoders$Registers5 = arrayDecoders$Registers3;
                                            unsafe4 = unsafe3;
                                            i22 = i9;
                                        } else {
                                            arrayDecoders$Registers3.object1 = Utf8.processor.decodeUtf8(bArr4, decodeVarint64, i14);
                                            decodeVarint64 += i14;
                                            unsafe3.putObject(obj5, j, arrayDecoders$Registers3.object1);
                                            byte[] bArr722 = bArr4;
                                            i23 = i38 | i35;
                                            bArr6 = bArr722;
                                            i18 = i2;
                                            i19 = decodeVarint64;
                                            obj8 = obj5;
                                            i21 = i10;
                                            i20 = i4;
                                            i25 = 1048575;
                                            arrayDecoders$Registers5 = arrayDecoders$Registers3;
                                            unsafe4 = unsafe3;
                                            i22 = i9;
                                        }
                                    } else {
                                        decodeVarint64 = DBUtil.decodeVarint32(bArr4, i13, arrayDecoders$Registers3);
                                        i14 = arrayDecoders$Registers3.int1;
                                        if (i14 < 0) {
                                            throw InvalidProtocolBufferException.negativeSize();
                                        }
                                        if (i14 == 0) {
                                            arrayDecoders$Registers3.object1 = "";
                                            unsafe3.putObject(obj5, j, arrayDecoders$Registers3.object1);
                                            byte[] bArr7222 = bArr4;
                                            i23 = i38 | i35;
                                            bArr6 = bArr7222;
                                            i18 = i2;
                                            i19 = decodeVarint64;
                                            obj8 = obj5;
                                            i21 = i10;
                                            i20 = i4;
                                            i25 = 1048575;
                                            arrayDecoders$Registers5 = arrayDecoders$Registers3;
                                            unsafe4 = unsafe3;
                                            i22 = i9;
                                        } else {
                                            arrayDecoders$Registers3.object1 = new String(bArr4, decodeVarint64, i14, Internal.UTF_8);
                                            decodeVarint64 += i14;
                                            unsafe3.putObject(obj5, j, arrayDecoders$Registers3.object1);
                                            byte[] bArr72222 = bArr4;
                                            i23 = i38 | i35;
                                            bArr6 = bArr72222;
                                            i18 = i2;
                                            i19 = decodeVarint64;
                                            obj8 = obj5;
                                            i21 = i10;
                                            i20 = i4;
                                            i25 = 1048575;
                                            arrayDecoders$Registers5 = arrayDecoders$Registers3;
                                            unsafe4 = unsafe3;
                                            i22 = i9;
                                        }
                                    }
                                case 9:
                                    obj5 = obj8;
                                    ArrayDecoders$Registers arrayDecoders$Registers10 = arrayDecoders$Registers5;
                                    c = 65535;
                                    i10 = i6;
                                    i13 = i19;
                                    if (i29 != 2) {
                                        unsafe3 = unsafe4;
                                        arrayDecoders$Registers3 = arrayDecoders$Registers10;
                                        obj4 = obj5;
                                        unsafe2 = unsafe3;
                                        i11 = i13;
                                        messageSchema = messageSchema2;
                                        i19 = i11;
                                        i8 = i24;
                                        i21 = i10;
                                        i22 = i9;
                                        i23 = i38;
                                        i7 = i4;
                                        unsafe = unsafe2;
                                        obj2 = obj4;
                                        break;
                                    } else {
                                        Unsafe unsafe6 = unsafe4;
                                        Object mutableMessageFieldForMerge = messageSchema2.mutableMessageFieldForMerge(obj5, i10);
                                        unsafe3 = unsafe6;
                                        decodeVarint64 = DBUtil.mergeMessageField(mutableMessageFieldForMerge, messageSchema2.getMessageFieldSchema(i10), bArr, i13, i2, arrayDecoders$Registers10);
                                        bArr4 = bArr;
                                        arrayDecoders$Registers3 = arrayDecoders$Registers10;
                                        messageSchema2.storeMessageField(obj5, i10, mutableMessageFieldForMerge);
                                        byte[] bArr722222 = bArr4;
                                        i23 = i38 | i35;
                                        bArr6 = bArr722222;
                                        i18 = i2;
                                        i19 = decodeVarint64;
                                        obj8 = obj5;
                                        i21 = i10;
                                        i20 = i4;
                                        i25 = 1048575;
                                        arrayDecoders$Registers5 = arrayDecoders$Registers3;
                                        unsafe4 = unsafe3;
                                        i22 = i9;
                                    }
                                case 10:
                                    bArr5 = bArr;
                                    obj6 = obj8;
                                    arrayDecoders$Registers4 = arrayDecoders$Registers5;
                                    c = 65535;
                                    i10 = i6;
                                    i13 = i19;
                                    if (i29 == 2) {
                                        decodeBytes = DBUtil.decodeBytes(bArr5, i13, arrayDecoders$Registers4);
                                        unsafe4.putObject(obj6, j, arrayDecoders$Registers4.object1);
                                        break;
                                    }
                                    Object obj10 = obj6;
                                    unsafe2 = unsafe4;
                                    obj4 = obj10;
                                    i11 = i13;
                                    messageSchema = messageSchema2;
                                    i19 = i11;
                                    i8 = i24;
                                    i21 = i10;
                                    i22 = i9;
                                    i23 = i38;
                                    i7 = i4;
                                    unsafe = unsafe2;
                                    obj2 = obj4;
                                    break;
                                case 12:
                                    bArr5 = bArr;
                                    obj6 = obj8;
                                    arrayDecoders$Registers4 = arrayDecoders$Registers5;
                                    c = 65535;
                                    i10 = i6;
                                    i13 = i19;
                                    if (i29 == 0) {
                                        decodeBytes = DBUtil.decodeVarint32(bArr5, i13, arrayDecoders$Registers4);
                                        int i39 = arrayDecoders$Registers4.int1;
                                        messageSchema2.getEnumFieldVerifier(i10);
                                        unsafe4.putInt(obj6, j, i39);
                                        break;
                                    }
                                    Object obj102 = obj6;
                                    unsafe2 = unsafe4;
                                    obj4 = obj102;
                                    i11 = i13;
                                    messageSchema = messageSchema2;
                                    i19 = i11;
                                    i8 = i24;
                                    i21 = i10;
                                    i22 = i9;
                                    i23 = i38;
                                    i7 = i4;
                                    unsafe = unsafe2;
                                    obj2 = obj4;
                                    break;
                                case 15:
                                    bArr5 = bArr;
                                    obj6 = obj8;
                                    arrayDecoders$Registers4 = arrayDecoders$Registers5;
                                    c = 65535;
                                    i10 = i6;
                                    i13 = i19;
                                    if (i29 == 0) {
                                        decodeBytes = DBUtil.decodeVarint32(bArr5, i13, arrayDecoders$Registers4);
                                        unsafe4.putInt(obj6, j, zzacv.decodeZigZag32(arrayDecoders$Registers4.int1));
                                        break;
                                    }
                                    Object obj1022 = obj6;
                                    unsafe2 = unsafe4;
                                    obj4 = obj1022;
                                    i11 = i13;
                                    messageSchema = messageSchema2;
                                    i19 = i11;
                                    i8 = i24;
                                    i21 = i10;
                                    i22 = i9;
                                    i23 = i38;
                                    i7 = i4;
                                    unsafe = unsafe2;
                                    obj2 = obj4;
                                    break;
                                case 16:
                                    ArrayDecoders$Registers arrayDecoders$Registers11 = arrayDecoders$Registers5;
                                    c = 65535;
                                    i10 = i6;
                                    i13 = i19;
                                    if (i29 != 0) {
                                        unsafe2 = unsafe4;
                                        obj4 = obj8;
                                        i11 = i13;
                                        messageSchema = messageSchema2;
                                        i19 = i11;
                                        i8 = i24;
                                        i21 = i10;
                                        i22 = i9;
                                        i23 = i38;
                                        i7 = i4;
                                        unsafe = unsafe2;
                                        obj2 = obj4;
                                        break;
                                    } else {
                                        int decodeVarint643 = DBUtil.decodeVarint64(bArr, i13, arrayDecoders$Registers11);
                                        unsafe4.putLong(obj8, j, zzacv.decodeZigZag64(arrayDecoders$Registers11.long1));
                                        obj2 = obj8;
                                        i18 = i2;
                                        bArr6 = bArr;
                                        i19 = decodeVarint643;
                                        i21 = i10;
                                        i20 = i4;
                                        i22 = i9;
                                        i25 = 1048575;
                                        arrayDecoders$Registers5 = arrayDecoders$Registers11;
                                        i23 = i38 | i35;
                                        obj8 = obj2;
                                    }
                                case 17:
                                    if (i29 != 3) {
                                        c = 65535;
                                        i10 = i6;
                                        unsafe2 = unsafe4;
                                        obj4 = obj8;
                                        i11 = i19;
                                        messageSchema = messageSchema2;
                                        i19 = i11;
                                        i8 = i24;
                                        i21 = i10;
                                        i22 = i9;
                                        i23 = i38;
                                        i7 = i4;
                                        unsafe = unsafe2;
                                        obj2 = obj4;
                                        break;
                                    } else {
                                        Object mutableMessageFieldForMerge2 = messageSchema2.mutableMessageFieldForMerge(obj8, i6);
                                        ArrayDecoders$Registers arrayDecoders$Registers12 = arrayDecoders$Registers5;
                                        int i40 = i6;
                                        int mergeGroupField = DBUtil.mergeGroupField(mutableMessageFieldForMerge2, messageSchema2.getMessageFieldSchema(i6), bArr, i19, i2, (i4 << 3) | 4, arrayDecoders$Registers12);
                                        messageSchema2.storeMessageField(obj8, i40, mutableMessageFieldForMerge2);
                                        i23 = i38 | i35;
                                        bArr6 = bArr;
                                        i21 = i40;
                                        arrayDecoders$Registers5 = arrayDecoders$Registers12;
                                        i19 = mergeGroupField;
                                        i20 = i4;
                                        i22 = i9;
                                        i25 = 1048575;
                                        i18 = i2;
                                    }
                                default:
                                    unsafe2 = unsafe4;
                                    obj4 = obj8;
                                    i11 = i19;
                                    c = 65535;
                                    i10 = i6;
                                    messageSchema = messageSchema2;
                                    i19 = i11;
                                    i8 = i24;
                                    i21 = i10;
                                    i22 = i9;
                                    i23 = i38;
                                    i7 = i4;
                                    unsafe = unsafe2;
                                    obj2 = obj4;
                                    break;
                            }
                        } else {
                            Object obj11 = obj8;
                            Unsafe unsafe7 = unsafe4;
                            int i41 = i6;
                            if (type2 != 27) {
                                i8 = i24;
                                if (type2 <= 49) {
                                    int i42 = i22;
                                    int i43 = i23;
                                    i7 = i4;
                                    unsafe = unsafe7;
                                    int parseRepeatedField = messageSchema2.parseRepeatedField(obj, bArr, i19, i2, i8, i29, i41, i32, type2, j, arrayDecoders$Registers);
                                    i8 = i8;
                                    if (parseRepeatedField != i19) {
                                        bArr6 = bArr;
                                        i18 = i2;
                                        arrayDecoders$Registers5 = arrayDecoders$Registers;
                                        i19 = parseRepeatedField;
                                        i21 = i41;
                                        i23 = i43;
                                        i20 = i7;
                                        i22 = i42;
                                        i25 = 1048575;
                                        i24 = i8;
                                        obj8 = obj;
                                        unsafe4 = unsafe;
                                    } else {
                                        obj2 = obj;
                                        i19 = parseRepeatedField;
                                        i21 = i41;
                                        i23 = i43;
                                        i22 = i42;
                                        messageSchema = messageSchema2;
                                    }
                                } else {
                                    obj7 = obj;
                                    i15 = i22;
                                    i16 = i23;
                                    i7 = i4;
                                    unsafe = unsafe7;
                                    i17 = i41;
                                    if (type2 == 50) {
                                        if (i29 == 2) {
                                            messageSchema2.parseMapField(j, obj7, i17);
                                            throw null;
                                        }
                                        messageSchema = messageSchema2;
                                        obj2 = obj7;
                                        i19 = i19;
                                    } else {
                                        int parseOneofField = messageSchema2.parseOneofField(obj7, bArr, i19, i2, i8, i7, i29, i32, type2, j, i17, arrayDecoders$Registers);
                                        obj2 = obj7;
                                        i8 = i8;
                                        messageSchema = messageSchema2;
                                        if (parseOneofField != i19) {
                                            bArr6 = bArr;
                                            i18 = i2;
                                            arrayDecoders$Registers5 = arrayDecoders$Registers;
                                            messageSchema2 = messageSchema;
                                            i19 = parseOneofField;
                                            i21 = i17;
                                            unsafe4 = unsafe;
                                            i23 = i16;
                                            i20 = i7;
                                            i22 = i15;
                                            i25 = 1048575;
                                            i24 = i8;
                                            obj8 = obj2;
                                        } else {
                                            i19 = parseOneofField;
                                        }
                                    }
                                }
                            } else if (i29 == 2) {
                                Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe7.getObject(obj11, j);
                                if (!((AbstractProtobufList) protobufList).isMutable) {
                                    int size = protobufList.size();
                                    protobufList = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
                                    unsafe7.putObject(obj11, j, protobufList);
                                }
                                bArr6 = bArr;
                                int decodeMessageList = DBUtil.decodeMessageList(messageSchema2.getMessageFieldSchema(i41), i24, bArr6, i19, i2, protobufList, arrayDecoders$Registers);
                                i18 = i2;
                                i19 = decodeMessageList;
                                unsafe4 = unsafe7;
                                i21 = i41;
                                i20 = i4;
                                i25 = 1048575;
                                arrayDecoders$Registers5 = arrayDecoders$Registers;
                                i24 = i24;
                                obj8 = obj;
                            } else {
                                i8 = i24;
                                obj7 = obj;
                                i15 = i22;
                                i16 = i23;
                                i7 = i4;
                                unsafe = unsafe7;
                                i17 = i41;
                                messageSchema = messageSchema2;
                                obj2 = obj7;
                                i19 = i19;
                            }
                            i21 = i17;
                            i23 = i16;
                            i22 = i15;
                        }
                    }
                    if (i8 != i3 || i3 == 0) {
                        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj2;
                        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
                        if (unknownFieldSetLite == UnknownFieldSetLite.DEFAULT_INSTANCE) {
                            unknownFieldSetLite = UnknownFieldSetLite.newInstance();
                            generatedMessageLite.unknownFields = unknownFieldSetLite;
                        }
                        int i44 = i8;
                        int decodeUnknownField = DBUtil.decodeUnknownField(i44, bArr, i19, i2, unknownFieldSetLite, arrayDecoders$Registers);
                        arrayDecoders$Registers5 = arrayDecoders$Registers;
                        i18 = i2;
                        i24 = i44;
                        messageSchema2 = messageSchema;
                        unsafe4 = unsafe;
                        i20 = i7;
                        i25 = 1048575;
                        bArr6 = bArr;
                        i19 = decodeUnknownField;
                        obj8 = obj2;
                    } else {
                        i18 = i2;
                        i24 = i8;
                    }
                } else {
                    messageSchema = messageSchema2;
                    unsafe = unsafe4;
                    obj2 = obj8;
                    obj3 = null;
                }
            }
            i20 = i4;
            i22 = i9;
        }
    }

    public final int parseOneofField(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, ArrayDecoders$Registers arrayDecoders$Registers) {
        int i9;
        Unsafe unsafe = UNSAFE;
        long j2 = this.buffer[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(DBUtil.decodeFixed64(bArr, i))));
                int i10 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(DBUtil.decodeFixed32(bArr, i))));
                int i11 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int decodeVarint64 = DBUtil.decodeVarint64(bArr, i, arrayDecoders$Registers);
                unsafe.putObject(obj, j, Long.valueOf(arrayDecoders$Registers.long1));
                unsafe.putInt(obj, j2, i4);
                return decodeVarint64;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int decodeVarint32 = DBUtil.decodeVarint32(bArr, i, arrayDecoders$Registers);
                unsafe.putObject(obj, j, Integer.valueOf(arrayDecoders$Registers.int1));
                unsafe.putInt(obj, j2, i4);
                return decodeVarint32;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(DBUtil.decodeFixed64(bArr, i)));
                int i12 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(DBUtil.decodeFixed32(bArr, i)));
                int i13 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i13;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int decodeVarint642 = DBUtil.decodeVarint64(bArr, i, arrayDecoders$Registers);
                unsafe.putObject(obj, j, Boolean.valueOf(arrayDecoders$Registers.long1 != 0));
                unsafe.putInt(obj, j2, i4);
                return decodeVarint642;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int decodeVarint322 = DBUtil.decodeVarint32(bArr, i, arrayDecoders$Registers);
                int i14 = arrayDecoders$Registers.int1;
                if (i14 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & PKIFailureInfo.duplicateCertReq) != 0) {
                        if (Utf8.processor.partialIsValidUtf8(bArr, decodeVarint322, decodeVarint322 + i14) != 0) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, decodeVarint322, i14, Internal.UTF_8));
                    decodeVarint322 += i14;
                }
                unsafe.putInt(obj, j2, i4);
                return decodeVarint322;
            case 60:
                i9 = i;
                if (i5 == 2) {
                    Object mutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(obj, i4, i8);
                    int mergeMessageField = DBUtil.mergeMessageField(mutableOneofMessageFieldForMerge, getMessageFieldSchema(i8), bArr, i9, i2, arrayDecoders$Registers);
                    storeOneofMessageField(obj, i4, i8, mutableOneofMessageFieldForMerge);
                    return mergeMessageField;
                }
                return i9;
            case 61:
                i9 = i;
                if (i5 == 2) {
                    int decodeBytes = DBUtil.decodeBytes(bArr, i9, arrayDecoders$Registers);
                    unsafe.putObject(obj, j, arrayDecoders$Registers.object1);
                    unsafe.putInt(obj, j2, i4);
                    return decodeBytes;
                }
                return i9;
            case 63:
                i9 = i;
                if (i5 == 0) {
                    int decodeVarint323 = DBUtil.decodeVarint32(bArr, i9, arrayDecoders$Registers);
                    int i15 = arrayDecoders$Registers.int1;
                    getEnumFieldVerifier(i8);
                    unsafe.putObject(obj, j, Integer.valueOf(i15));
                    unsafe.putInt(obj, j2, i4);
                    return decodeVarint323;
                }
                return i9;
            case 66:
                i9 = i;
                if (i5 == 0) {
                    int decodeVarint324 = DBUtil.decodeVarint32(bArr, i9, arrayDecoders$Registers);
                    unsafe.putObject(obj, j, Integer.valueOf(zzacv.decodeZigZag32(arrayDecoders$Registers.int1)));
                    unsafe.putInt(obj, j2, i4);
                    return decodeVarint324;
                }
                return i9;
            case 67:
                i9 = i;
                if (i5 == 0) {
                    int decodeVarint643 = DBUtil.decodeVarint64(bArr, i9, arrayDecoders$Registers);
                    unsafe.putObject(obj, j, Long.valueOf(zzacv.decodeZigZag64(arrayDecoders$Registers.long1)));
                    unsafe.putInt(obj, j2, i4);
                    return decodeVarint643;
                }
                return i9;
            case 68:
                if (i5 == 3) {
                    Object mutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(obj, i4, i8);
                    int mergeGroupField = DBUtil.mergeGroupField(mutableOneofMessageFieldForMerge2, getMessageFieldSchema(i8), bArr, i, i2, (i3 & (-8)) | 4, arrayDecoders$Registers);
                    storeOneofMessageField(obj, i4, i8, mutableOneofMessageFieldForMerge2);
                    return mergeGroupField;
                }
            default:
                return i;
        }
    }

    public final int parseRepeatedField(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, ArrayDecoders$Registers arrayDecoders$Registers) {
        int i7;
        int i8;
        int i9;
        int decodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe.getObject(obj, j2);
        if (!((AbstractProtobufList) protobufList).isMutable) {
            protobufList = protobufList.mutableCopyWithCapacity(protobufList.size() * 2);
            unsafe.putObject(obj, j2, protobufList);
        }
        Internal.ProtobufList protobufList2 = protobufList;
        switch (i6) {
            case 18:
            case 35:
                if (i4 != 2) {
                    if (i4 != 1) {
                        return i;
                    }
                    DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList2;
                    doubleArrayList.addDouble(Double.longBitsToDouble(DBUtil.decodeFixed64(bArr, i)));
                    int i10 = i + 8;
                    while (i10 < i2) {
                        int decodeVarint32 = DBUtil.decodeVarint32(bArr, i10, arrayDecoders$Registers);
                        if (i3 != arrayDecoders$Registers.int1) {
                            return i10;
                        }
                        doubleArrayList.addDouble(Double.longBitsToDouble(DBUtil.decodeFixed64(bArr, decodeVarint32)));
                        i10 = decodeVarint32 + 8;
                    }
                    return i10;
                }
                DoubleArrayList doubleArrayList2 = (DoubleArrayList) protobufList2;
                int decodeVarint322 = DBUtil.decodeVarint32(bArr, i, arrayDecoders$Registers);
                int i11 = arrayDecoders$Registers.int1;
                int i12 = decodeVarint322 + i11;
                if (i12 > bArr.length) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                doubleArrayList2.ensureCapacity((i11 / 8) + doubleArrayList2.size());
                while (decodeVarint322 < i12) {
                    doubleArrayList2.addDouble(Double.longBitsToDouble(DBUtil.decodeFixed64(bArr, decodeVarint322)));
                    decodeVarint322 += 8;
                }
                if (decodeVarint322 == i12) {
                    return decodeVarint322;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            case 19:
            case 36:
                if (i4 != 2) {
                    if (i4 != 5) {
                        return i;
                    }
                    FloatArrayList floatArrayList = (FloatArrayList) protobufList2;
                    floatArrayList.addFloat(Float.intBitsToFloat(DBUtil.decodeFixed32(bArr, i)));
                    int i13 = i + 4;
                    while (i13 < i2) {
                        int decodeVarint323 = DBUtil.decodeVarint32(bArr, i13, arrayDecoders$Registers);
                        if (i3 != arrayDecoders$Registers.int1) {
                            return i13;
                        }
                        floatArrayList.addFloat(Float.intBitsToFloat(DBUtil.decodeFixed32(bArr, decodeVarint323)));
                        i13 = decodeVarint323 + 4;
                    }
                    return i13;
                }
                FloatArrayList floatArrayList2 = (FloatArrayList) protobufList2;
                int decodeVarint324 = DBUtil.decodeVarint32(bArr, i, arrayDecoders$Registers);
                int i14 = arrayDecoders$Registers.int1;
                int i15 = decodeVarint324 + i14;
                if (i15 > bArr.length) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                floatArrayList2.ensureCapacity((i14 / 4) + floatArrayList2.size());
                while (decodeVarint324 < i15) {
                    floatArrayList2.addFloat(Float.intBitsToFloat(DBUtil.decodeFixed32(bArr, decodeVarint324)));
                    decodeVarint324 += 4;
                }
                if (decodeVarint324 == i15) {
                    return decodeVarint324;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            case 20:
            case 21:
            case 37:
            case 38:
                if (i4 == 2) {
                    LongArrayList longArrayList = (LongArrayList) protobufList2;
                    int decodeVarint325 = DBUtil.decodeVarint32(bArr, i, arrayDecoders$Registers);
                    int i16 = arrayDecoders$Registers.int1 + decodeVarint325;
                    while (decodeVarint325 < i16) {
                        decodeVarint325 = DBUtil.decodeVarint64(bArr, decodeVarint325, arrayDecoders$Registers);
                        longArrayList.addLong(arrayDecoders$Registers.long1);
                    }
                    if (decodeVarint325 == i16) {
                        return decodeVarint325;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i4 != 0) {
                    return i;
                }
                LongArrayList longArrayList2 = (LongArrayList) protobufList2;
                int decodeVarint64 = DBUtil.decodeVarint64(bArr, i, arrayDecoders$Registers);
                longArrayList2.addLong(arrayDecoders$Registers.long1);
                while (decodeVarint64 < i2) {
                    int decodeVarint326 = DBUtil.decodeVarint32(bArr, decodeVarint64, arrayDecoders$Registers);
                    if (i3 != arrayDecoders$Registers.int1) {
                        return decodeVarint64;
                    }
                    decodeVarint64 = DBUtil.decodeVarint64(bArr, decodeVarint326, arrayDecoders$Registers);
                    longArrayList2.addLong(arrayDecoders$Registers.long1);
                }
                return decodeVarint64;
            case 22:
            case 29:
            case 39:
            case 43:
                i7 = i;
                if (i4 == 2) {
                    IntArrayList intArrayList = (IntArrayList) protobufList2;
                    int decodeVarint327 = DBUtil.decodeVarint32(bArr, i, arrayDecoders$Registers);
                    int i17 = arrayDecoders$Registers.int1 + decodeVarint327;
                    while (decodeVarint327 < i17) {
                        decodeVarint327 = DBUtil.decodeVarint32(bArr, decodeVarint327, arrayDecoders$Registers);
                        intArrayList.addInt(arrayDecoders$Registers.int1);
                    }
                    if (decodeVarint327 == i17) {
                        return decodeVarint327;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i4 == 0) {
                    return DBUtil.decodeVarint32List(i3, bArr, i7, i2, protobufList2, arrayDecoders$Registers);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                i7 = i;
                if (i4 == 2) {
                    LongArrayList longArrayList3 = (LongArrayList) protobufList2;
                    int decodeVarint328 = DBUtil.decodeVarint32(bArr, i, arrayDecoders$Registers);
                    int i18 = arrayDecoders$Registers.int1;
                    int i19 = decodeVarint328 + i18;
                    if (i19 > bArr.length) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    longArrayList3.ensureCapacity((i18 / 8) + longArrayList3.size());
                    while (decodeVarint328 < i19) {
                        longArrayList3.addLong(DBUtil.decodeFixed64(bArr, decodeVarint328));
                        decodeVarint328 += 8;
                    }
                    if (decodeVarint328 == i19) {
                        return decodeVarint328;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i4 == 1) {
                    LongArrayList longArrayList4 = (LongArrayList) protobufList2;
                    longArrayList4.addLong(DBUtil.decodeFixed64(bArr, i));
                    while (true) {
                        i8 = i7 + 8;
                        if (i8 < i2) {
                            i7 = DBUtil.decodeVarint32(bArr, i8, arrayDecoders$Registers);
                            if (i3 == arrayDecoders$Registers.int1) {
                                longArrayList4.addLong(DBUtil.decodeFixed64(bArr, i7));
                            }
                        }
                    }
                    return i8;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                i7 = i;
                if (i4 == 2) {
                    IntArrayList intArrayList2 = (IntArrayList) protobufList2;
                    int decodeVarint329 = DBUtil.decodeVarint32(bArr, i, arrayDecoders$Registers);
                    int i20 = arrayDecoders$Registers.int1;
                    int i21 = decodeVarint329 + i20;
                    if (i21 > bArr.length) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    intArrayList2.ensureCapacity((i20 / 4) + intArrayList2.size());
                    while (decodeVarint329 < i21) {
                        intArrayList2.addInt(DBUtil.decodeFixed32(bArr, decodeVarint329));
                        decodeVarint329 += 4;
                    }
                    if (decodeVarint329 == i21) {
                        return decodeVarint329;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i4 == 5) {
                    IntArrayList intArrayList3 = (IntArrayList) protobufList2;
                    intArrayList3.addInt(DBUtil.decodeFixed32(bArr, i));
                    while (true) {
                        i9 = i7 + 4;
                        if (i9 < i2) {
                            i7 = DBUtil.decodeVarint32(bArr, i9, arrayDecoders$Registers);
                            if (i3 == arrayDecoders$Registers.int1) {
                                intArrayList3.addInt(DBUtil.decodeFixed32(bArr, i7));
                            }
                        }
                    }
                    return i9;
                }
                break;
            case 25:
            case 42:
                i7 = i;
                if (i4 == 2) {
                    BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList2;
                    int decodeVarint3210 = DBUtil.decodeVarint32(bArr, i, arrayDecoders$Registers);
                    int i22 = arrayDecoders$Registers.int1 + decodeVarint3210;
                    while (decodeVarint3210 < i22) {
                        decodeVarint3210 = DBUtil.decodeVarint64(bArr, decodeVarint3210, arrayDecoders$Registers);
                        booleanArrayList.addBoolean(arrayDecoders$Registers.long1 != 0);
                    }
                    if (decodeVarint3210 == i22) {
                        return decodeVarint3210;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i4 == 0) {
                    BooleanArrayList booleanArrayList2 = (BooleanArrayList) protobufList2;
                    int decodeVarint642 = DBUtil.decodeVarint64(bArr, i, arrayDecoders$Registers);
                    booleanArrayList2.addBoolean(arrayDecoders$Registers.long1 != 0);
                    while (decodeVarint642 < i2) {
                        int decodeVarint3211 = DBUtil.decodeVarint32(bArr, decodeVarint642, arrayDecoders$Registers);
                        if (i3 != arrayDecoders$Registers.int1) {
                            return decodeVarint642;
                        }
                        decodeVarint642 = DBUtil.decodeVarint64(bArr, decodeVarint3211, arrayDecoders$Registers);
                        booleanArrayList2.addBoolean(arrayDecoders$Registers.long1 != 0);
                    }
                    return decodeVarint642;
                }
                break;
            case 26:
                i7 = i;
                if (i4 == 2) {
                    if ((j & 536870912) == 0) {
                        int decodeVarint3212 = DBUtil.decodeVarint32(bArr, i, arrayDecoders$Registers);
                        int i23 = arrayDecoders$Registers.int1;
                        if (i23 < 0) {
                            throw InvalidProtocolBufferException.negativeSize();
                        }
                        if (i23 == 0) {
                            protobufList2.add("");
                        } else {
                            protobufList2.add(new String(bArr, decodeVarint3212, i23, Internal.UTF_8));
                            decodeVarint3212 += i23;
                        }
                        while (decodeVarint3212 < i2) {
                            int decodeVarint3213 = DBUtil.decodeVarint32(bArr, decodeVarint3212, arrayDecoders$Registers);
                            if (i3 != arrayDecoders$Registers.int1) {
                                return decodeVarint3212;
                            }
                            decodeVarint3212 = DBUtil.decodeVarint32(bArr, decodeVarint3213, arrayDecoders$Registers);
                            int i24 = arrayDecoders$Registers.int1;
                            if (i24 < 0) {
                                throw InvalidProtocolBufferException.negativeSize();
                            }
                            if (i24 == 0) {
                                protobufList2.add("");
                            } else {
                                protobufList2.add(new String(bArr, decodeVarint3212, i24, Internal.UTF_8));
                                decodeVarint3212 += i24;
                            }
                        }
                        return decodeVarint3212;
                    }
                    int decodeVarint3214 = DBUtil.decodeVarint32(bArr, i, arrayDecoders$Registers);
                    int i25 = arrayDecoders$Registers.int1;
                    if (i25 < 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    if (i25 == 0) {
                        protobufList2.add("");
                    } else {
                        int i26 = decodeVarint3214 + i25;
                        if (Utf8.processor.partialIsValidUtf8(bArr, decodeVarint3214, i26) != 0) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        protobufList2.add(new String(bArr, decodeVarint3214, i25, Internal.UTF_8));
                        decodeVarint3214 = i26;
                    }
                    while (decodeVarint3214 < i2) {
                        int decodeVarint3215 = DBUtil.decodeVarint32(bArr, decodeVarint3214, arrayDecoders$Registers);
                        if (i3 != arrayDecoders$Registers.int1) {
                            return decodeVarint3214;
                        }
                        decodeVarint3214 = DBUtil.decodeVarint32(bArr, decodeVarint3215, arrayDecoders$Registers);
                        int i27 = arrayDecoders$Registers.int1;
                        if (i27 < 0) {
                            throw InvalidProtocolBufferException.negativeSize();
                        }
                        if (i27 == 0) {
                            protobufList2.add("");
                        } else {
                            int i28 = decodeVarint3214 + i27;
                            if (Utf8.processor.partialIsValidUtf8(bArr, decodeVarint3214, i28) != 0) {
                                throw InvalidProtocolBufferException.invalidUtf8();
                            }
                            protobufList2.add(new String(bArr, decodeVarint3214, i27, Internal.UTF_8));
                            decodeVarint3214 = i28;
                        }
                    }
                    return decodeVarint3214;
                }
                break;
            case 27:
                return i4 == 2 ? DBUtil.decodeMessageList(getMessageFieldSchema(i5), i3, bArr, i, i2, protobufList2, arrayDecoders$Registers) : i;
            case 28:
                if (i4 != 2) {
                    return i;
                }
                int decodeVarint3216 = DBUtil.decodeVarint32(bArr, i, arrayDecoders$Registers);
                int i29 = arrayDecoders$Registers.int1;
                if (i29 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                if (i29 > bArr.length - decodeVarint3216) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i29 == 0) {
                    protobufList2.add(ByteString.EMPTY);
                } else {
                    protobufList2.add(ByteString.copyFrom(decodeVarint3216, i29, bArr));
                    decodeVarint3216 += i29;
                }
                while (decodeVarint3216 < i2) {
                    int decodeVarint3217 = DBUtil.decodeVarint32(bArr, decodeVarint3216, arrayDecoders$Registers);
                    if (i3 != arrayDecoders$Registers.int1) {
                        return decodeVarint3216;
                    }
                    decodeVarint3216 = DBUtil.decodeVarint32(bArr, decodeVarint3217, arrayDecoders$Registers);
                    int i30 = arrayDecoders$Registers.int1;
                    if (i30 < 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    if (i30 > bArr.length - decodeVarint3216) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    if (i30 == 0) {
                        protobufList2.add(ByteString.EMPTY);
                    } else {
                        protobufList2.add(ByteString.copyFrom(decodeVarint3216, i30, bArr));
                        decodeVarint3216 += i30;
                    }
                }
                return decodeVarint3216;
            case 30:
            case 44:
                if (i4 == 2) {
                    IntArrayList intArrayList4 = (IntArrayList) protobufList2;
                    decodeVarint32List = DBUtil.decodeVarint32(bArr, i, arrayDecoders$Registers);
                    int i31 = arrayDecoders$Registers.int1 + decodeVarint32List;
                    while (decodeVarint32List < i31) {
                        decodeVarint32List = DBUtil.decodeVarint32(bArr, decodeVarint32List, arrayDecoders$Registers);
                        intArrayList4.addInt(arrayDecoders$Registers.int1);
                    }
                    if (decodeVarint32List != i31) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                } else {
                    if (i4 != 0) {
                        return i;
                    }
                    decodeVarint32List = DBUtil.decodeVarint32List(i3, bArr, i, i2, protobufList2, arrayDecoders$Registers);
                }
                getEnumFieldVerifier(i5);
                Class cls = SchemaUtil.GENERATED_MESSAGE_CLASS;
                return decodeVarint32List;
            case 33:
            case 47:
                if (i4 == 2) {
                    IntArrayList intArrayList5 = (IntArrayList) protobufList2;
                    int decodeVarint3218 = DBUtil.decodeVarint32(bArr, i, arrayDecoders$Registers);
                    int i32 = arrayDecoders$Registers.int1 + decodeVarint3218;
                    while (decodeVarint3218 < i32) {
                        decodeVarint3218 = DBUtil.decodeVarint32(bArr, decodeVarint3218, arrayDecoders$Registers);
                        intArrayList5.addInt(zzacv.decodeZigZag32(arrayDecoders$Registers.int1));
                    }
                    if (decodeVarint3218 == i32) {
                        return decodeVarint3218;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i4 != 0) {
                    return i;
                }
                IntArrayList intArrayList6 = (IntArrayList) protobufList2;
                int decodeVarint3219 = DBUtil.decodeVarint32(bArr, i, arrayDecoders$Registers);
                intArrayList6.addInt(zzacv.decodeZigZag32(arrayDecoders$Registers.int1));
                while (decodeVarint3219 < i2) {
                    int decodeVarint3220 = DBUtil.decodeVarint32(bArr, decodeVarint3219, arrayDecoders$Registers);
                    if (i3 != arrayDecoders$Registers.int1) {
                        return decodeVarint3219;
                    }
                    decodeVarint3219 = DBUtil.decodeVarint32(bArr, decodeVarint3220, arrayDecoders$Registers);
                    intArrayList6.addInt(zzacv.decodeZigZag32(arrayDecoders$Registers.int1));
                }
                return decodeVarint3219;
            case 34:
            case 48:
                if (i4 == 2) {
                    LongArrayList longArrayList5 = (LongArrayList) protobufList2;
                    int decodeVarint3221 = DBUtil.decodeVarint32(bArr, i, arrayDecoders$Registers);
                    int i33 = arrayDecoders$Registers.int1 + decodeVarint3221;
                    while (decodeVarint3221 < i33) {
                        decodeVarint3221 = DBUtil.decodeVarint64(bArr, decodeVarint3221, arrayDecoders$Registers);
                        longArrayList5.addLong(zzacv.decodeZigZag64(arrayDecoders$Registers.long1));
                    }
                    if (decodeVarint3221 == i33) {
                        return decodeVarint3221;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i4 != 0) {
                    return i;
                }
                LongArrayList longArrayList6 = (LongArrayList) protobufList2;
                int decodeVarint643 = DBUtil.decodeVarint64(bArr, i, arrayDecoders$Registers);
                longArrayList6.addLong(zzacv.decodeZigZag64(arrayDecoders$Registers.long1));
                while (decodeVarint643 < i2) {
                    int decodeVarint3222 = DBUtil.decodeVarint32(bArr, decodeVarint643, arrayDecoders$Registers);
                    if (i3 != arrayDecoders$Registers.int1) {
                        return decodeVarint643;
                    }
                    decodeVarint643 = DBUtil.decodeVarint64(bArr, decodeVarint3222, arrayDecoders$Registers);
                    longArrayList6.addLong(zzacv.decodeZigZag64(arrayDecoders$Registers.long1));
                }
                return decodeVarint643;
            case 49:
                if (i4 == 3) {
                    Schema messageFieldSchema = getMessageFieldSchema(i5);
                    int i34 = (i3 & (-8)) | 4;
                    Object newInstance = messageFieldSchema.newInstance();
                    int mergeGroupField = DBUtil.mergeGroupField(newInstance, messageFieldSchema, bArr, i, i2, i34, arrayDecoders$Registers);
                    Schema schema = messageFieldSchema;
                    int i35 = i34;
                    schema.makeImmutable(newInstance);
                    arrayDecoders$Registers.object1 = newInstance;
                    protobufList2.add(newInstance);
                    while (mergeGroupField < i2) {
                        int decodeVarint3223 = DBUtil.decodeVarint32(bArr, mergeGroupField, arrayDecoders$Registers);
                        if (i3 != arrayDecoders$Registers.int1) {
                            return mergeGroupField;
                        }
                        Object newInstance2 = schema.newInstance();
                        Schema schema2 = schema;
                        int i36 = i35;
                        mergeGroupField = DBUtil.mergeGroupField(newInstance2, schema2, bArr, decodeVarint3223, i2, i36, arrayDecoders$Registers);
                        schema2.makeImmutable(newInstance2);
                        arrayDecoders$Registers.object1 = newInstance2;
                        protobufList2.add(newInstance2);
                        schema = schema2;
                        i35 = i36;
                    }
                    return mergeGroupField;
                }
            default:
                return i;
        }
        return i7;
    }

    public final void readGroupList(Object obj, long j, CodedInputStreamReader codedInputStreamReader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        this.listFieldSchema.getClass();
        Internal.ProtobufList mutableListAt = ListFieldSchemaLite.mutableListAt(obj, j);
        zzacv zzacvVar = codedInputStreamReader.input;
        int i = codedInputStreamReader.tag;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            Object newInstance = schema.newInstance();
            codedInputStreamReader.mergeGroupFieldInternal(newInstance, schema, extensionRegistryLite);
            schema.makeImmutable(newInstance);
            mutableListAt.add(newInstance);
            if (zzacvVar.isAtEnd() || codedInputStreamReader.nextTag != 0) {
                return;
            } else {
                readTag = zzacvVar.readTag();
            }
        } while (readTag == i);
        codedInputStreamReader.nextTag = readTag;
    }

    public final void readMessageList(Object obj, int i, CodedInputStreamReader codedInputStreamReader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        this.listFieldSchema.getClass();
        Internal.ProtobufList mutableListAt = ListFieldSchemaLite.mutableListAt(obj, i & 1048575);
        zzacv zzacvVar = codedInputStreamReader.input;
        int i2 = codedInputStreamReader.tag;
        if ((i2 & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            Object newInstance = schema.newInstance();
            codedInputStreamReader.mergeMessageFieldInternal(newInstance, schema, extensionRegistryLite);
            schema.makeImmutable(newInstance);
            mutableListAt.add(newInstance);
            if (zzacvVar.isAtEnd() || codedInputStreamReader.nextTag != 0) {
                return;
            } else {
                readTag = zzacvVar.readTag();
            }
        } while (readTag == i2);
        codedInputStreamReader.nextTag = readTag;
    }

    public final void readString(int i, CodedInputStreamReader codedInputStreamReader, Object obj) {
        if ((536870912 & i) != 0) {
            UnsafeUtil.putObject(obj, i & 1048575, codedInputStreamReader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, i & 1048575, codedInputStreamReader.readString());
        } else {
            UnsafeUtil.putObject(obj, i & 1048575, codedInputStreamReader.readBytes());
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

    public final int slowPositionForFieldNumber(int i, int i2) {
        int[] iArr = this.buffer;
        int length = (iArr.length / 3) - 1;
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

    public final void storeMessageField(Object obj, int i, Object obj2) {
        UNSAFE.putObject(obj, typeAndOffsetAt(i) & 1048575, obj2);
        setFieldPresent(obj, i);
    }

    public final void storeOneofMessageField(Object obj, int i, int i2, Object obj2) {
        UNSAFE.putObject(obj, typeAndOffsetAt(i2) & 1048575, obj2);
        setOneofPresent(obj, i, i2);
    }

    public final int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [long] */
    /* JADX WARN: Type inference failed for: r16v3 */
    public final void writeFieldsInAscendingOrder(Object obj, ManifestSchemaFactory manifestSchemaFactory) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i10;
        int computeUInt32SizeNoTag;
        int i11;
        int i12;
        boolean z3;
        MessageSchema messageSchema = this;
        int[] iArr = messageSchema.buffer;
        int length = iArr.length;
        Unsafe unsafe = UNSAFE;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            int typeAndOffsetAt = messageSchema.typeAndOffsetAt(i15);
            int i17 = iArr[i15];
            int type2 = type(typeAndOffsetAt);
            if (type2 <= 17) {
                int i18 = iArr[i15 + 2];
                z = 1;
                int i19 = i18 & i13;
                if (i19 != i14) {
                    if (i19 == i13) {
                        i = i13;
                        i16 = 0;
                    } else {
                        i = i13;
                        i16 = unsafe.getInt(obj, i19);
                    }
                    i14 = i19;
                } else {
                    i = i13;
                }
                int i20 = i16;
                i2 = i14;
                i3 = typeAndOffsetAt;
                i4 = i20;
                i5 = type2;
                i6 = 1 << (i18 >>> 20);
            } else {
                i = i13;
                z = 1;
                int i21 = i16;
                i2 = i14;
                i3 = typeAndOffsetAt;
                i4 = i21;
                i5 = type2;
                i6 = 0;
            }
            long j = i3 & i;
            int[] iArr2 = iArr;
            int i22 = 2;
            switch (i5) {
                case 0:
                    if (messageSchema.isFieldPresent(obj, i15, i2, i4, i6)) {
                        double d = UnsafeUtil.MEMORY_ACCESSOR.getDouble(obj, j);
                        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
                        codedOutputStream$ArrayEncoder.getClass();
                        codedOutputStream$ArrayEncoder.writeFixed64(i17, Double.doubleToRawLongBits(d));
                    }
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 1:
                    if (messageSchema.isFieldPresent(obj, i15, i2, i4, i6)) {
                        float f = UnsafeUtil.MEMORY_ACCESSOR.getFloat(obj, j);
                        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder2 = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
                        codedOutputStream$ArrayEncoder2.getClass();
                        codedOutputStream$ArrayEncoder2.writeFixed32(i17, Float.floatToRawIntBits(f));
                    }
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 2:
                    if (messageSchema.isFieldPresent(obj, i15, i2, i4, i6)) {
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeUInt64(i17, unsafe.getLong(obj, j));
                    }
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 3:
                    if (messageSchema.isFieldPresent(obj, i15, i2, i4, i6)) {
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeUInt64(i17, unsafe.getLong(obj, j));
                    }
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 4:
                    if (messageSchema.isFieldPresent(obj, i15, i2, i4, i6)) {
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeInt32(i17, unsafe.getInt(obj, j));
                    }
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 5:
                    if (messageSchema.isFieldPresent(obj, i15, i2, i4, i6)) {
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeFixed64(i17, unsafe.getLong(obj, j));
                    }
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 6:
                    if (messageSchema.isFieldPresent(obj, i15, i2, i4, i6)) {
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeFixed32(i17, unsafe.getInt(obj, j));
                    }
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 7:
                    if (messageSchema.isFieldPresent(obj, i15, i2, i4, i6)) {
                        boolean z4 = UnsafeUtil.MEMORY_ACCESSOR.getBoolean(obj, j);
                        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder3 = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
                        codedOutputStream$ArrayEncoder3.writeTag(i17, 0);
                        codedOutputStream$ArrayEncoder3.write(z4 ? (byte) 1 : (byte) 0);
                        messageSchema = this;
                        i15 += 3;
                        i14 = i2;
                        i16 = i4;
                        i13 = i;
                        iArr = iArr2;
                    }
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 8:
                    if (messageSchema.isFieldPresent(obj, i15, i2, i4, i6)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            String str = (String) object;
                            CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder4 = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
                            codedOutputStream$ArrayEncoder4.writeTag(i17, 2);
                            int i23 = codedOutputStream$ArrayEncoder4.limit;
                            byte[] bArr = codedOutputStream$ArrayEncoder4.buffer;
                            int i24 = codedOutputStream$ArrayEncoder4.position;
                            try {
                                int computeUInt32SizeNoTag2 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(str.length() * 3);
                                int computeUInt32SizeNoTag3 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(str.length());
                                if (computeUInt32SizeNoTag3 == computeUInt32SizeNoTag2) {
                                    int i25 = i24 + computeUInt32SizeNoTag3;
                                    codedOutputStream$ArrayEncoder4.position = i25;
                                    int encodeUtf8 = Utf8.processor.encodeUtf8(str, bArr, i25, i23 - i25);
                                    codedOutputStream$ArrayEncoder4.position = i24;
                                    codedOutputStream$ArrayEncoder4.writeUInt32NoTag((encodeUtf8 - i24) - computeUInt32SizeNoTag3);
                                    codedOutputStream$ArrayEncoder4.position = encodeUtf8;
                                } else {
                                    codedOutputStream$ArrayEncoder4.writeUInt32NoTag(Utf8.encodedLength(str));
                                    int i26 = codedOutputStream$ArrayEncoder4.position;
                                    codedOutputStream$ArrayEncoder4.position = Utf8.processor.encodeUtf8(str, bArr, i26, i23 - i26);
                                }
                            } catch (Utf8.UnpairedSurrogateException e) {
                                codedOutputStream$ArrayEncoder4.position = i24;
                                CodedOutputStream$ArrayEncoder.logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                                byte[] bytes = str.getBytes(Internal.UTF_8);
                                try {
                                    codedOutputStream$ArrayEncoder4.writeUInt32NoTag(bytes.length);
                                    codedOutputStream$ArrayEncoder4.write(bytes, 0, bytes.length);
                                } catch (IndexOutOfBoundsException e2) {
                                    throw new CodedOutputStream$OutOfSpaceException(e2);
                                }
                            } catch (IndexOutOfBoundsException e3) {
                                throw new CodedOutputStream$OutOfSpaceException(e3);
                            }
                        } else {
                            ByteString byteString = (ByteString) object;
                            CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder5 = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
                            codedOutputStream$ArrayEncoder5.writeTag(i17, 2);
                            codedOutputStream$ArrayEncoder5.writeUInt32NoTag(byteString.size());
                            ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
                            codedOutputStream$ArrayEncoder5.write(literalByteString.bytes, literalByteString.getOffsetIntoBytes(), literalByteString.size());
                        }
                    }
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 9:
                    if (messageSchema.isFieldPresent(obj, i15, i2, i4, i6)) {
                        manifestSchemaFactory.writeMessage(i17, unsafe.getObject(obj, j), messageSchema.getMessageFieldSchema(i15));
                    }
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 10:
                    if (messageSchema.isFieldPresent(obj, i15, i2, i4, i6)) {
                        ByteString byteString2 = (ByteString) unsafe.getObject(obj, j);
                        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder6 = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
                        codedOutputStream$ArrayEncoder6.writeTag(i17, 2);
                        codedOutputStream$ArrayEncoder6.writeUInt32NoTag(byteString2.size());
                        ByteString.LiteralByteString literalByteString2 = (ByteString.LiteralByteString) byteString2;
                        codedOutputStream$ArrayEncoder6.write(literalByteString2.bytes, literalByteString2.getOffsetIntoBytes(), literalByteString2.size());
                    }
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 11:
                    if (messageSchema.isFieldPresent(obj, i15, i2, i4, i6)) {
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeUInt32(i17, unsafe.getInt(obj, j));
                    }
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 12:
                    if (messageSchema.isFieldPresent(obj, i15, i2, i4, i6)) {
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeInt32(i17, unsafe.getInt(obj, j));
                    }
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 13:
                    if (messageSchema.isFieldPresent(obj, i15, i2, i4, i6)) {
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeFixed32(i17, unsafe.getInt(obj, j));
                    }
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 14:
                    if (messageSchema.isFieldPresent(obj, i15, i2, i4, i6)) {
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeFixed64(i17, unsafe.getLong(obj, j));
                    }
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 15:
                    if (messageSchema.isFieldPresent(obj, i15, i2, i4, i6)) {
                        int i27 = unsafe.getInt(obj, j);
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeUInt32(i17, (i27 >> 31) ^ (i27 << 1));
                    }
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 16:
                    if (messageSchema.isFieldPresent(obj, i15, i2, i4, i6)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeUInt64(i17, (j2 >> 63) ^ (j2 << 1));
                    }
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 17:
                    if (messageSchema.isFieldPresent(obj, i15, i2, i4, i6)) {
                        manifestSchemaFactory.writeGroup(i17, unsafe.getObject(obj, j), messageSchema.getMessageFieldSchema(i15));
                    }
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 18:
                    z2 = false;
                    SchemaUtil.writeDoubleList(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 19:
                    z2 = false;
                    SchemaUtil.writeFloatList(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 20:
                    z2 = false;
                    SchemaUtil.writeInt64List(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 21:
                    z2 = false;
                    SchemaUtil.writeUInt64List(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 22:
                    z2 = false;
                    SchemaUtil.writeInt32List(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 23:
                    z2 = false;
                    SchemaUtil.writeFixed64List(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 24:
                    z2 = false;
                    SchemaUtil.writeFixed32List(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 25:
                    z2 = false;
                    SchemaUtil.writeBoolList(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    messageSchema = this;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 26:
                    int i28 = i2;
                    int i29 = iArr2[i15];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    if (list != null && !list.isEmpty()) {
                        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder7 = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
                        if (list instanceof LazyStringList) {
                            LazyStringList lazyStringList = (LazyStringList) list;
                            int i30 = 0;
                            while (i30 < list.size()) {
                                Object raw = lazyStringList.getRaw();
                                if (raw instanceof String) {
                                    String str2 = (String) raw;
                                    codedOutputStream$ArrayEncoder7.writeTag(i29, i22);
                                    int i31 = codedOutputStream$ArrayEncoder7.limit;
                                    byte[] bArr2 = codedOutputStream$ArrayEncoder7.buffer;
                                    int i32 = codedOutputStream$ArrayEncoder7.position;
                                    try {
                                        try {
                                            computeUInt32SizeNoTag = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(str2.length() * 3);
                                            i9 = i15;
                                        } catch (IndexOutOfBoundsException e4) {
                                            throw new CodedOutputStream$OutOfSpaceException(e4);
                                        }
                                    } catch (Utf8.UnpairedSurrogateException e5) {
                                        e = e5;
                                        i9 = i15;
                                    }
                                    try {
                                        int computeUInt32SizeNoTag4 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(str2.length());
                                        if (computeUInt32SizeNoTag4 == computeUInt32SizeNoTag) {
                                            int i33 = i32 + computeUInt32SizeNoTag4;
                                            codedOutputStream$ArrayEncoder7.position = i33;
                                            i10 = i4;
                                            try {
                                                int encodeUtf82 = Utf8.processor.encodeUtf8(str2, bArr2, i33, i31 - i33);
                                                codedOutputStream$ArrayEncoder7.position = i32;
                                                codedOutputStream$ArrayEncoder7.writeUInt32NoTag((encodeUtf82 - i32) - computeUInt32SizeNoTag4);
                                                codedOutputStream$ArrayEncoder7.position = encodeUtf82;
                                            } catch (Utf8.UnpairedSurrogateException e6) {
                                                e = e6;
                                                codedOutputStream$ArrayEncoder7.position = i32;
                                                CodedOutputStream$ArrayEncoder.logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                                                byte[] bytes2 = str2.getBytes(Internal.UTF_8);
                                                try {
                                                    codedOutputStream$ArrayEncoder7.writeUInt32NoTag(bytes2.length);
                                                    codedOutputStream$ArrayEncoder7.write(bytes2, 0, bytes2.length);
                                                    i30++;
                                                    i15 = i9;
                                                    i4 = i10;
                                                    i22 = 2;
                                                } catch (IndexOutOfBoundsException e7) {
                                                    throw new CodedOutputStream$OutOfSpaceException(e7);
                                                }
                                            }
                                        } else {
                                            i10 = i4;
                                            codedOutputStream$ArrayEncoder7.writeUInt32NoTag(Utf8.encodedLength(str2));
                                            int i34 = codedOutputStream$ArrayEncoder7.position;
                                            codedOutputStream$ArrayEncoder7.position = Utf8.processor.encodeUtf8(str2, bArr2, i34, i31 - i34);
                                        }
                                    } catch (Utf8.UnpairedSurrogateException e8) {
                                        e = e8;
                                        i10 = i4;
                                        codedOutputStream$ArrayEncoder7.position = i32;
                                        CodedOutputStream$ArrayEncoder.logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                                        byte[] bytes22 = str2.getBytes(Internal.UTF_8);
                                        codedOutputStream$ArrayEncoder7.writeUInt32NoTag(bytes22.length);
                                        codedOutputStream$ArrayEncoder7.write(bytes22, 0, bytes22.length);
                                        i30++;
                                        i15 = i9;
                                        i4 = i10;
                                        i22 = 2;
                                    }
                                } else {
                                    i9 = i15;
                                    i10 = i4;
                                    ByteString byteString3 = (ByteString) raw;
                                    codedOutputStream$ArrayEncoder7.writeTag(i29, 2);
                                    codedOutputStream$ArrayEncoder7.writeUInt32NoTag(byteString3.size());
                                    ByteString.LiteralByteString literalByteString3 = (ByteString.LiteralByteString) byteString3;
                                    codedOutputStream$ArrayEncoder7.write(literalByteString3.bytes, literalByteString3.getOffsetIntoBytes(), literalByteString3.size());
                                }
                                i30++;
                                i15 = i9;
                                i4 = i10;
                                i22 = 2;
                            }
                        } else {
                            i7 = i15;
                            i8 = i4;
                            for (int i35 = 0; i35 < list.size(); i35++) {
                                String str3 = (String) list.get(i35);
                                codedOutputStream$ArrayEncoder7.writeTag(i29, 2);
                                int i36 = codedOutputStream$ArrayEncoder7.limit;
                                byte[] bArr3 = codedOutputStream$ArrayEncoder7.buffer;
                                int i37 = codedOutputStream$ArrayEncoder7.position;
                                try {
                                    int computeUInt32SizeNoTag5 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(str3.length() * 3);
                                    int computeUInt32SizeNoTag6 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(str3.length());
                                    if (computeUInt32SizeNoTag6 == computeUInt32SizeNoTag5) {
                                        int i38 = i37 + computeUInt32SizeNoTag6;
                                        codedOutputStream$ArrayEncoder7.position = i38;
                                        int encodeUtf83 = Utf8.processor.encodeUtf8(str3, bArr3, i38, i36 - i38);
                                        codedOutputStream$ArrayEncoder7.position = i37;
                                        codedOutputStream$ArrayEncoder7.writeUInt32NoTag((encodeUtf83 - i37) - computeUInt32SizeNoTag6);
                                        codedOutputStream$ArrayEncoder7.position = encodeUtf83;
                                    } else {
                                        codedOutputStream$ArrayEncoder7.writeUInt32NoTag(Utf8.encodedLength(str3));
                                        int i39 = codedOutputStream$ArrayEncoder7.position;
                                        codedOutputStream$ArrayEncoder7.position = Utf8.processor.encodeUtf8(str3, bArr3, i39, i36 - i39);
                                    }
                                } catch (Utf8.UnpairedSurrogateException e9) {
                                    codedOutputStream$ArrayEncoder7.position = i37;
                                    CodedOutputStream$ArrayEncoder.logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e9);
                                    byte[] bytes3 = str3.getBytes(Internal.UTF_8);
                                    try {
                                        codedOutputStream$ArrayEncoder7.writeUInt32NoTag(bytes3.length);
                                        codedOutputStream$ArrayEncoder7.write(bytes3, 0, bytes3.length);
                                    } catch (IndexOutOfBoundsException e10) {
                                        throw new CodedOutputStream$OutOfSpaceException(e10);
                                    }
                                } catch (IndexOutOfBoundsException e11) {
                                    throw new CodedOutputStream$OutOfSpaceException(e11);
                                }
                            }
                            messageSchema = this;
                            i2 = i28;
                            i15 = i7;
                            i4 = i8;
                            i15 += 3;
                            i14 = i2;
                            i16 = i4;
                            i13 = i;
                            iArr = iArr2;
                        }
                    }
                    i7 = i15;
                    i8 = i4;
                    messageSchema = this;
                    i2 = i28;
                    i15 = i7;
                    i4 = i8;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                    break;
                case 27:
                    i11 = i2;
                    int i40 = iArr2[i15];
                    List list2 = (List) unsafe.getObject(obj, j);
                    Schema messageFieldSchema = messageSchema.getMessageFieldSchema(i15);
                    Class cls2 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    if (list2 != null && !list2.isEmpty()) {
                        manifestSchemaFactory.getClass();
                        for (int i41 = 0; i41 < list2.size(); i41++) {
                            manifestSchemaFactory.writeMessage(i40, list2.get(i41), messageFieldSchema);
                        }
                    }
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                    break;
                case 28:
                    i11 = i2;
                    int i42 = iArr2[i15];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    if (list3 != null && !list3.isEmpty()) {
                        manifestSchemaFactory.getClass();
                        for (int i43 = 0; i43 < list3.size(); i43++) {
                            CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder8 = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
                            ByteString byteString4 = (ByteString) list3.get(i43);
                            codedOutputStream$ArrayEncoder8.writeTag(i42, 2);
                            codedOutputStream$ArrayEncoder8.writeUInt32NoTag(byteString4.size());
                            ByteString.LiteralByteString literalByteString4 = (ByteString.LiteralByteString) byteString4;
                            codedOutputStream$ArrayEncoder8.write(literalByteString4.bytes, literalByteString4.getOffsetIntoBytes(), literalByteString4.size());
                        }
                    }
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                    break;
                case 29:
                    i12 = i2;
                    z3 = false;
                    SchemaUtil.writeUInt32List(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    i2 = i12;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 30:
                    i12 = i2;
                    z3 = false;
                    SchemaUtil.writeEnumList(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    i2 = i12;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 31:
                    i12 = i2;
                    z3 = false;
                    SchemaUtil.writeSFixed32List(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    i2 = i12;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 32:
                    i12 = i2;
                    z3 = false;
                    SchemaUtil.writeSFixed64List(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    i2 = i12;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 33:
                    i12 = i2;
                    z3 = false;
                    SchemaUtil.writeSInt32List(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    i2 = i12;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 34:
                    i12 = i2;
                    z3 = false;
                    SchemaUtil.writeSInt64List(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, false);
                    i2 = i12;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 35:
                    i11 = i2;
                    SchemaUtil.writeDoubleList(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, z);
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 36:
                    i11 = i2;
                    SchemaUtil.writeFloatList(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, z);
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 37:
                    i11 = i2;
                    SchemaUtil.writeInt64List(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, z);
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 38:
                    i11 = i2;
                    SchemaUtil.writeUInt64List(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, z);
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 39:
                    i11 = i2;
                    SchemaUtil.writeInt32List(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, z);
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 40:
                    i11 = i2;
                    SchemaUtil.writeFixed64List(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, z);
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 41:
                    i11 = i2;
                    SchemaUtil.writeFixed32List(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, z);
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 42:
                    i11 = i2;
                    SchemaUtil.writeBoolList(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, z);
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 43:
                    i11 = i2;
                    SchemaUtil.writeUInt32List(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, z);
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 44:
                    i11 = i2;
                    SchemaUtil.writeEnumList(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, z);
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 45:
                    i11 = i2;
                    SchemaUtil.writeSFixed32List(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, z);
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 46:
                    i11 = i2;
                    SchemaUtil.writeSFixed64List(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, z);
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 47:
                    i11 = i2;
                    SchemaUtil.writeSInt32List(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, z);
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 48:
                    i11 = i2;
                    SchemaUtil.writeSInt64List(iArr2[i15], (List) unsafe.getObject(obj, j), manifestSchemaFactory, z);
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 49:
                    i11 = i2;
                    int i44 = iArr2[i15];
                    List list4 = (List) unsafe.getObject(obj, j);
                    Schema messageFieldSchema2 = messageSchema.getMessageFieldSchema(i15);
                    Class cls4 = SchemaUtil.GENERATED_MESSAGE_CLASS;
                    if (list4 != null && !list4.isEmpty()) {
                        manifestSchemaFactory.getClass();
                        for (int i45 = 0; i45 < list4.size(); i45++) {
                            manifestSchemaFactory.writeGroup(i44, list4.get(i45), messageFieldSchema2);
                        }
                    }
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                    break;
                case 50:
                    i11 = i2;
                    if (unsafe.getObject(obj, j) != null) {
                        Object mapFieldDefaultEntry = messageSchema.getMapFieldDefaultEntry(i15);
                        messageSchema.mapFieldSchema.getClass();
                        JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(mapFieldDefaultEntry);
                        throw null;
                    }
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 51:
                    i11 = i2;
                    if (messageSchema.isOneofPresent(obj, i17, i15)) {
                        double doubleValue = ((Double) UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, j)).doubleValue();
                        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder9 = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
                        codedOutputStream$ArrayEncoder9.getClass();
                        codedOutputStream$ArrayEncoder9.writeFixed64(i17, Double.doubleToRawLongBits(doubleValue));
                    }
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 52:
                    i11 = i2;
                    if (messageSchema.isOneofPresent(obj, i17, i15)) {
                        float floatValue = ((Float) UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, j)).floatValue();
                        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder10 = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
                        codedOutputStream$ArrayEncoder10.getClass();
                        codedOutputStream$ArrayEncoder10.writeFixed32(i17, Float.floatToRawIntBits(floatValue));
                    }
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 53:
                    i11 = i2;
                    if (messageSchema.isOneofPresent(obj, i17, i15)) {
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeUInt64(i17, oneofLongAt(obj, j));
                    }
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 54:
                    i11 = i2;
                    if (messageSchema.isOneofPresent(obj, i17, i15)) {
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeUInt64(i17, oneofLongAt(obj, j));
                    }
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 55:
                    i11 = i2;
                    if (messageSchema.isOneofPresent(obj, i17, i15)) {
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeInt32(i17, oneofIntAt(obj, j));
                    }
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 56:
                    i11 = i2;
                    if (messageSchema.isOneofPresent(obj, i17, i15)) {
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeFixed64(i17, oneofLongAt(obj, j));
                    }
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 57:
                    i11 = i2;
                    if (messageSchema.isOneofPresent(obj, i17, i15)) {
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeFixed32(i17, oneofIntAt(obj, j));
                    }
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 58:
                    i11 = i2;
                    if (messageSchema.isOneofPresent(obj, i17, i15)) {
                        boolean booleanValue = ((Boolean) UnsafeUtil.MEMORY_ACCESSOR.getObject(obj, j)).booleanValue();
                        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder11 = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
                        codedOutputStream$ArrayEncoder11.writeTag(i17, 0);
                        codedOutputStream$ArrayEncoder11.write(booleanValue ? (byte) 1 : (byte) 0);
                    }
                    i2 = i11;
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 59:
                    if (messageSchema.isOneofPresent(obj, i17, i15)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            String str4 = (String) object2;
                            CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder12 = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
                            codedOutputStream$ArrayEncoder12.writeTag(i17, 2);
                            int i46 = codedOutputStream$ArrayEncoder12.limit;
                            byte[] bArr4 = codedOutputStream$ArrayEncoder12.buffer;
                            int i47 = codedOutputStream$ArrayEncoder12.position;
                            try {
                                try {
                                    int computeUInt32SizeNoTag7 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(str4.length() * 3);
                                    int computeUInt32SizeNoTag8 = CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(str4.length());
                                    if (computeUInt32SizeNoTag8 == computeUInt32SizeNoTag7) {
                                        int i48 = i47 + computeUInt32SizeNoTag8;
                                        codedOutputStream$ArrayEncoder12.position = i48;
                                        i11 = i2;
                                        try {
                                            int encodeUtf84 = Utf8.processor.encodeUtf8(str4, bArr4, i48, i46 - i48);
                                            codedOutputStream$ArrayEncoder12.position = i47;
                                            codedOutputStream$ArrayEncoder12.writeUInt32NoTag((encodeUtf84 - i47) - computeUInt32SizeNoTag8);
                                            codedOutputStream$ArrayEncoder12.position = encodeUtf84;
                                        } catch (Utf8.UnpairedSurrogateException e12) {
                                            e = e12;
                                            codedOutputStream$ArrayEncoder12.position = i47;
                                            CodedOutputStream$ArrayEncoder.logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                                            byte[] bytes4 = str4.getBytes(Internal.UTF_8);
                                            try {
                                                codedOutputStream$ArrayEncoder12.writeUInt32NoTag(bytes4.length);
                                                codedOutputStream$ArrayEncoder12.write(bytes4, 0, bytes4.length);
                                                i2 = i11;
                                                i15 += 3;
                                                i14 = i2;
                                                i16 = i4;
                                                i13 = i;
                                                iArr = iArr2;
                                            } catch (IndexOutOfBoundsException e13) {
                                                throw new CodedOutputStream$OutOfSpaceException(e13);
                                            }
                                        }
                                    } else {
                                        i11 = i2;
                                        codedOutputStream$ArrayEncoder12.writeUInt32NoTag(Utf8.encodedLength(str4));
                                        int i49 = codedOutputStream$ArrayEncoder12.position;
                                        codedOutputStream$ArrayEncoder12.position = Utf8.processor.encodeUtf8(str4, bArr4, i49, i46 - i49);
                                    }
                                } catch (IndexOutOfBoundsException e14) {
                                    throw new CodedOutputStream$OutOfSpaceException(e14);
                                }
                            } catch (Utf8.UnpairedSurrogateException e15) {
                                e = e15;
                                i11 = i2;
                            }
                        } else {
                            i11 = i2;
                            ByteString byteString5 = (ByteString) object2;
                            CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder13 = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
                            codedOutputStream$ArrayEncoder13.writeTag(i17, 2);
                            codedOutputStream$ArrayEncoder13.writeUInt32NoTag(byteString5.size());
                            ByteString.LiteralByteString literalByteString5 = (ByteString.LiteralByteString) byteString5;
                            codedOutputStream$ArrayEncoder13.write(literalByteString5.bytes, literalByteString5.getOffsetIntoBytes(), literalByteString5.size());
                        }
                        i2 = i11;
                    }
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 60:
                    if (messageSchema.isOneofPresent(obj, i17, i15)) {
                        manifestSchemaFactory.writeMessage(i17, unsafe.getObject(obj, j), messageSchema.getMessageFieldSchema(i15));
                    }
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 61:
                    if (messageSchema.isOneofPresent(obj, i17, i15)) {
                        ByteString byteString6 = (ByteString) unsafe.getObject(obj, j);
                        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder14 = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
                        codedOutputStream$ArrayEncoder14.writeTag(i17, 2);
                        codedOutputStream$ArrayEncoder14.writeUInt32NoTag(byteString6.size());
                        ByteString.LiteralByteString literalByteString6 = (ByteString.LiteralByteString) byteString6;
                        codedOutputStream$ArrayEncoder14.write(literalByteString6.bytes, literalByteString6.getOffsetIntoBytes(), literalByteString6.size());
                    }
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 62:
                    if (messageSchema.isOneofPresent(obj, i17, i15)) {
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeUInt32(i17, oneofIntAt(obj, j));
                    }
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 63:
                    if (messageSchema.isOneofPresent(obj, i17, i15)) {
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeInt32(i17, oneofIntAt(obj, j));
                    }
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 64:
                    if (messageSchema.isOneofPresent(obj, i17, i15)) {
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeFixed32(i17, oneofIntAt(obj, j));
                    }
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 65:
                    if (messageSchema.isOneofPresent(obj, i17, i15)) {
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeFixed64(i17, oneofLongAt(obj, j));
                    }
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 66:
                    if (messageSchema.isOneofPresent(obj, i17, i15)) {
                        int oneofIntAt = oneofIntAt(obj, j);
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeUInt32(i17, (oneofIntAt >> 31) ^ (oneofIntAt << 1));
                    }
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 67:
                    if (messageSchema.isOneofPresent(obj, i17, i15)) {
                        long oneofLongAt = oneofLongAt(obj, j);
                        ((CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory).writeUInt64(i17, (oneofLongAt >> 63) ^ (oneofLongAt << z));
                    }
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                case 68:
                    if (messageSchema.isOneofPresent(obj, i17, i15)) {
                        manifestSchemaFactory.writeGroup(i17, unsafe.getObject(obj, j), messageSchema.getMessageFieldSchema(i15));
                    }
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
                default:
                    i15 += 3;
                    i14 = i2;
                    i16 = i4;
                    i13 = i;
                    iArr = iArr2;
            }
        }
        ((UnknownFieldSetLiteSchema) messageSchema.unknownFieldSchema).getClass();
        ((GeneratedMessageLite) obj).unknownFields.writeTo(manifestSchemaFactory);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
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
    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final void mergeFrom(Object obj, Object obj2) {
        Object obj3;
        checkMutable(obj);
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
                                protobufList = protobufList.mutableCopyWithCapacity(size2 + size);
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
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final void mergeFrom(Object obj, byte[] bArr, int i, int i2, ArrayDecoders$Registers arrayDecoders$Registers) {
        parseMessage(obj, bArr, i, i2, 0, arrayDecoders$Registers);
    }
}
