package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class CatchingFishWorkManagerKtor implements CatchingFishRoomHilt {
    public final CatchingFishPicassoHandler CatchingFishCloudMessaging;
    public final int CatchingFishCoroutine;
    public final CatchingFishGlideWebsocket CatchingFishDaggerWebsocket;
    public final CatchingFishReduxViewModel CatchingFishEspressoTesting;
    public final CatchingFishReduxXMLLayout CatchingFishFragmentHandler;
    public final int CatchingFishLayout;
    public final CatchingFishMockkViewModel CatchingFishOkHttp;
    public final int[] CatchingFishParcelableFAB;
    public final int CatchingFishReduxKtor;
    public final Object[] CatchingFishSnackbar;
    public final int CatchingFishViewModelFAB;
    public final int[] CatchingFishViewModelScope;
    public final boolean CatchingFishWorkManager;
    public static final int[] CatchingFishUnitTesting = new int[0];
    public static final Unsafe CatchingFishAnimationMockk = CatchingFishGradleViewModel.CatchingFishLayout();

    public CatchingFishWorkManagerKtor(int[] iArr, Object[] objArr, int i, int i2, CatchingFishGlideWebsocket catchingFishGlideWebsocket, int[] iArr2, int i3, int i4, CatchingFishReduxXMLLayout catchingFishReduxXMLLayout, CatchingFishPicassoHandler catchingFishPicassoHandler, CatchingFishReduxViewModel catchingFishReduxViewModel, CatchingFishGsonEspresso catchingFishGsonEspresso, CatchingFishMockkViewModel catchingFishMockkViewModel) {
        this.CatchingFishParcelableFAB = iArr;
        this.CatchingFishSnackbar = objArr;
        this.CatchingFishCoroutine = i;
        this.CatchingFishReduxKtor = i2;
        this.CatchingFishWorkManager = catchingFishGlideWebsocket instanceof CatchingFishJUnitSharedFlow;
        this.CatchingFishViewModelScope = iArr2;
        this.CatchingFishViewModelFAB = i3;
        this.CatchingFishLayout = i4;
        this.CatchingFishFragmentHandler = catchingFishReduxXMLLayout;
        this.CatchingFishCloudMessaging = catchingFishPicassoHandler;
        this.CatchingFishEspressoTesting = catchingFishReduxViewModel;
        this.CatchingFishDaggerWebsocket = catchingFishGlideWebsocket;
        this.CatchingFishOkHttp = catchingFishMockkViewModel;
    }

    public static long CatchingFishCardViewRealm(long j, Object obj) {
        return ((Long) CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, obj)).longValue();
    }

    public static int CatchingFishDagger(int i) {
        return (i & 267386880) >>> 20;
    }

    public static int CatchingFishGsonAppCompat(long j, Object obj) {
        return ((Integer) CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, obj)).intValue();
    }

    public static Field CatchingFishMutableLiveData(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static long CatchingFishParcelableFlux(int i) {
        return i & 1048575;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CatchingFishWorkManagerKtor CatchingFishSpannableWidget(CatchingFishAndroidXContext catchingFishAndroidXContext, CatchingFishReduxXMLLayout catchingFishReduxXMLLayout, CatchingFishPicassoHandler catchingFishPicassoHandler, CatchingFishReduxViewModel catchingFishReduxViewModel, CatchingFishGsonEspresso catchingFishGsonEspresso, CatchingFishMockkViewModel catchingFishMockkViewModel) {
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
        int i16;
        int i17;
        int i18;
        Class<?> cls;
        int i19;
        int objectFieldOffset;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field CatchingFishMutableLiveData;
        char charAt10;
        int i25;
        int i26;
        Object obj;
        Field CatchingFishMutableLiveData2;
        Object obj2;
        Field CatchingFishMutableLiveData3;
        int i27;
        char charAt11;
        int i28;
        char charAt12;
        int i29;
        char charAt13;
        int i30;
        char charAt14;
        String str = catchingFishAndroidXContext.CatchingFishSnackbar;
        int length = str.length();
        int i31 = 55296;
        if (str.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (str.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int charAt15 = str.charAt(i);
        if (charAt15 >= 55296) {
            int i34 = charAt15 & 8191;
            int i35 = 13;
            while (true) {
                i30 = i33 + 1;
                charAt14 = str.charAt(i33);
                if (charAt14 < 55296) {
                    break;
                }
                i34 |= (charAt14 & 8191) << i35;
                i35 += 13;
                i33 = i30;
            }
            charAt15 = i34 | (charAt14 << i35);
            i33 = i30;
        }
        if (charAt15 == 0) {
            i3 = 0;
            i6 = 0;
            charAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = CatchingFishUnitTesting;
            i4 = 0;
        } else {
            int i36 = i33 + 1;
            int charAt16 = str.charAt(i33);
            if (charAt16 >= 55296) {
                int i37 = charAt16 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    charAt9 = str.charAt(i36);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i37 |= (charAt9 & 8191) << i38;
                    i38 += 13;
                    i36 = i15;
                }
                charAt16 = i37 | (charAt9 << i38);
                i36 = i15;
            }
            int i39 = i36 + 1;
            int charAt17 = str.charAt(i36);
            if (charAt17 >= 55296) {
                int i40 = charAt17 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    charAt8 = str.charAt(i39);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i40 |= (charAt8 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                charAt17 = i40 | (charAt8 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int charAt18 = str.charAt(i39);
            if (charAt18 >= 55296) {
                int i43 = charAt18 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    charAt7 = str.charAt(i42);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i43 |= (charAt7 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                charAt18 = i43 | (charAt7 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int charAt19 = str.charAt(i42);
            if (charAt19 >= 55296) {
                int i46 = charAt19 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    charAt6 = str.charAt(i45);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i46 |= (charAt6 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                charAt19 = i46 | (charAt6 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            charAt = str.charAt(i45);
            if (charAt >= 55296) {
                int i49 = charAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    charAt5 = str.charAt(i48);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i49 |= (charAt5 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                charAt = i49 | (charAt5 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            int charAt20 = str.charAt(i48);
            if (charAt20 >= 55296) {
                int i52 = charAt20 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    charAt4 = str.charAt(i51);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i52 |= (charAt4 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                charAt20 = i52 | (charAt4 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            int charAt21 = str.charAt(i51);
            if (charAt21 >= 55296) {
                int i55 = charAt21 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    charAt3 = str.charAt(i54);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i55 |= (charAt3 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                charAt21 = i55 | (charAt3 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int charAt22 = str.charAt(i54);
            if (charAt22 >= 55296) {
                int i58 = charAt22 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    charAt2 = str.charAt(i57);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i58 |= (charAt2 & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                charAt22 = i58 | (charAt2 << i59);
                i57 = i8;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i60 = (charAt16 * 2) + charAt17;
            int i61 = charAt20;
            i2 = charAt18;
            i3 = i61;
            i4 = charAt16;
            i33 = i57;
            iArr = iArr2;
            i5 = charAt19;
            i6 = i60;
            i7 = charAt22;
        }
        Unsafe unsafe = CatchingFishAnimationMockk;
        Object[] objArr = catchingFishAndroidXContext.CatchingFishCoroutine;
        Class<?> cls2 = catchingFishAndroidXContext.CatchingFishParcelableFAB.getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt * 2];
        int i62 = i7 + i3;
        int i63 = i62;
        int i64 = i7;
        int i65 = 0;
        int i66 = 0;
        while (i33 < length) {
            int i67 = i33 + 1;
            int charAt23 = str.charAt(i33);
            if (charAt23 >= i31) {
                int i68 = charAt23 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i29 = i69 + 1;
                    charAt13 = str.charAt(i69);
                    i16 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i68 |= (charAt13 & 8191) << i70;
                    i70 += 13;
                    i69 = i29;
                    length = i16;
                }
                charAt23 = i68 | (charAt13 << i70);
                i17 = i29;
            } else {
                i16 = length;
                i17 = i67;
            }
            int i71 = i17 + 1;
            int charAt24 = str.charAt(i17);
            Object[] objArr3 = objArr;
            char c = 55296;
            if (charAt24 >= 55296) {
                int i72 = charAt24 & 8191;
                int i73 = 13;
                while (true) {
                    i28 = i71 + 1;
                    charAt12 = str.charAt(i71);
                    if (charAt12 < c) {
                        break;
                    }
                    i72 |= (charAt12 & 8191) << i73;
                    i73 += 13;
                    i71 = i28;
                    c = 55296;
                }
                charAt24 = i72 | (charAt12 << i73);
                i71 = i28;
            }
            int i74 = charAt24 & 255;
            int i75 = charAt23;
            if ((charAt24 & 1024) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            int[] iArr4 = iArr3;
            if (i74 >= 51) {
                int i76 = i71 + 1;
                int charAt25 = str.charAt(i71);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i77 = charAt25 & 8191;
                    int i78 = 13;
                    while (true) {
                        i27 = i76 + 1;
                        charAt11 = str.charAt(i76);
                        if (charAt11 < c2) {
                            break;
                        }
                        i77 |= (charAt11 & 8191) << i78;
                        i78 += 13;
                        i76 = i27;
                        c2 = 55296;
                    }
                    charAt25 = i77 | (charAt11 << i78);
                    i76 = i27;
                }
                int i79 = i74 - 51;
                int i80 = i76;
                if (i79 == 9 || i79 == 17) {
                    i26 = i6 + 1;
                    objArr2[((i66 / 3) * 2) + 1] = objArr3[i6];
                } else {
                    if (i79 == 12 && (CatchingFishMVPLiveData.CatchingFishReduxKtor(catchingFishAndroidXContext.CatchingFishParcelableFAB(), 1) || (charAt24 & 2048) != 0)) {
                        i26 = i6 + 1;
                        objArr2[((i66 / 3) * 2) + 1] = objArr3[i6];
                    }
                    int i81 = charAt25 * 2;
                    obj = objArr3[i81];
                    if (obj instanceof Field) {
                        CatchingFishMutableLiveData2 = CatchingFishMutableLiveData(cls2, (String) obj);
                        objArr3[i81] = CatchingFishMutableLiveData2;
                    } else {
                        CatchingFishMutableLiveData2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(CatchingFishMutableLiveData2);
                    int i82 = i81 + 1;
                    obj2 = objArr3[i82];
                    if (obj2 instanceof Field) {
                        CatchingFishMutableLiveData3 = CatchingFishMutableLiveData(cls2, (String) obj2);
                        objArr3[i82] = CatchingFishMutableLiveData3;
                    } else {
                        CatchingFishMutableLiveData3 = (Field) obj2;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(CatchingFishMutableLiveData3);
                    int i83 = i4;
                    i20 = objectFieldOffset3;
                    i24 = objectFieldOffset2;
                    i18 = i83;
                    i23 = i6;
                    i21 = i80;
                    i22 = 0;
                    cls = cls2;
                }
                i6 = i26;
                int i812 = charAt25 * 2;
                obj = objArr3[i812];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(CatchingFishMutableLiveData2);
                int i822 = i812 + 1;
                obj2 = objArr3[i822];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(CatchingFishMutableLiveData3);
                int i832 = i4;
                i20 = objectFieldOffset32;
                i24 = objectFieldOffset22;
                i18 = i832;
                i23 = i6;
                i21 = i80;
                i22 = 0;
                cls = cls2;
            } else {
                int i84 = i6 + 1;
                Field CatchingFishMutableLiveData4 = CatchingFishMutableLiveData(cls2, (String) objArr3[i6]);
                if (i74 == 9 || i74 == 17) {
                    i18 = i4;
                    objArr2[((i66 / 3) * 2) + 1] = CatchingFishMutableLiveData4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        i18 = i4;
                        i25 = i6 + 2;
                        objArr2[((i66 / 3) * 2) + 1] = objArr3[i84];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        i18 = i4;
                        if (catchingFishAndroidXContext.CatchingFishParcelableFAB() == 1 || (charAt24 & 2048) != 0) {
                            i25 = i6 + 2;
                            objArr2[((i66 / 3) * 2) + 1] = objArr3[i84];
                        }
                    } else if (i74 == 50) {
                        int i85 = i64 + 1;
                        iArr[i64] = i66;
                        int i86 = (i66 / 3) * 2;
                        int i87 = i6 + 2;
                        objArr2[i86] = objArr3[i84];
                        if ((charAt24 & 2048) != 0) {
                            i19 = i6 + 3;
                            objArr2[i86 + 1] = objArr3[i87];
                            i18 = i4;
                            cls = cls2;
                            i64 = i85;
                        } else {
                            cls = cls2;
                            i19 = i87;
                            i64 = i85;
                            i18 = i4;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(CatchingFishMutableLiveData4);
                        if ((charAt24 & 4096) != 0 || i74 > 17) {
                            i20 = 1048575;
                            i21 = i71;
                            i22 = 0;
                        } else {
                            int i88 = i71 + 1;
                            int charAt26 = str.charAt(i71);
                            if (charAt26 >= 55296) {
                                int i89 = charAt26 & 8191;
                                int i90 = 13;
                                while (true) {
                                    i21 = i88 + 1;
                                    charAt10 = str.charAt(i88);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i89 |= (charAt10 & 8191) << i90;
                                    i90 += 13;
                                    i88 = i21;
                                }
                                charAt26 = i89 | (charAt10 << i90);
                            } else {
                                i21 = i88;
                            }
                            int i91 = (charAt26 / 32) + (i18 * 2);
                            Object obj3 = objArr3[i91];
                            if (obj3 instanceof Field) {
                                CatchingFishMutableLiveData = (Field) obj3;
                            } else {
                                CatchingFishMutableLiveData = CatchingFishMutableLiveData(cls, (String) obj3);
                                objArr3[i91] = CatchingFishMutableLiveData;
                            }
                            i20 = (int) unsafe.objectFieldOffset(CatchingFishMutableLiveData);
                            i22 = charAt26 % 32;
                        }
                        if (i74 >= 18 || i74 > 49) {
                            i23 = i19;
                            i24 = objectFieldOffset;
                        } else {
                            iArr[i63] = objectFieldOffset;
                            i23 = i19;
                            i24 = objectFieldOffset;
                            i63++;
                        }
                    } else {
                        i18 = i4;
                    }
                    i19 = i25;
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(CatchingFishMutableLiveData4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i20 = 1048575;
                    i21 = i71;
                    i22 = 0;
                    if (i74 >= 18) {
                    }
                    i23 = i19;
                    i24 = objectFieldOffset;
                }
                cls = cls2;
                i19 = i84;
                objectFieldOffset = (int) unsafe.objectFieldOffset(CatchingFishMutableLiveData4);
                if ((charAt24 & 4096) != 0) {
                }
                i20 = 1048575;
                i21 = i71;
                i22 = 0;
                if (i74 >= 18) {
                }
                i23 = i19;
                i24 = objectFieldOffset;
            }
            int i92 = i66 + 1;
            iArr4[i66] = i75;
            int i93 = i66 + 2;
            String str2 = str;
            iArr4[i92] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20) | i24;
            i66 += 3;
            iArr4[i93] = (i22 << 20) | i20;
            cls2 = cls;
            objArr = objArr3;
            str = str2;
            length = i16;
            i4 = i18;
            i33 = i21;
            i31 = 55296;
            i6 = i23;
            iArr3 = iArr4;
        }
        return new CatchingFishWorkManagerKtor(iArr3, objArr2, i2, i5, catchingFishAndroidXContext.CatchingFishParcelableFAB, iArr, i7, i62, catchingFishReduxXMLLayout, catchingFishPicassoHandler, catchingFishReduxViewModel, catchingFishGsonEspresso, catchingFishMockkViewModel);
    }

    public static boolean CatchingFishStateLiveData(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof CatchingFishJUnitSharedFlow) {
            return ((CatchingFishJUnitSharedFlow) obj).CatchingFishViewModelScope();
        }
        return true;
    }

    public final void CatchingFish(int i, Object obj, Object obj2) {
        if (CatchingFishUnitTesting(i, obj2)) {
            long CatchingFishCameraXIntent = CatchingFishCameraXIntent(i) & 1048575;
            Unsafe unsafe = CatchingFishAnimationMockk;
            Object object = unsafe.getObject(obj2, CatchingFishCameraXIntent);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.CatchingFishParcelableFAB[i] + " is present but null: " + obj2);
            }
            CatchingFishRoomHilt CatchingFishOkHttp = CatchingFishOkHttp(i);
            if (!CatchingFishUnitTesting(i, obj)) {
                if (CatchingFishStateLiveData(object)) {
                    CatchingFishJUnitSharedFlow CatchingFishLayout = CatchingFishOkHttp.CatchingFishLayout();
                    CatchingFishOkHttp.CatchingFishParcelableFAB(CatchingFishLayout, object);
                    unsafe.putObject(obj, CatchingFishCameraXIntent, CatchingFishLayout);
                } else {
                    unsafe.putObject(obj, CatchingFishCameraXIntent, object);
                }
                CatchingFishJobScheduler(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, CatchingFishCameraXIntent);
            if (!CatchingFishStateLiveData(object2)) {
                CatchingFishJUnitSharedFlow CatchingFishLayout2 = CatchingFishOkHttp.CatchingFishLayout();
                CatchingFishOkHttp.CatchingFishParcelableFAB(CatchingFishLayout2, object2);
                unsafe.putObject(obj, CatchingFishCameraXIntent, CatchingFishLayout2);
                object2 = CatchingFishLayout2;
            }
            CatchingFishOkHttp.CatchingFishParcelableFAB(object2, object);
        }
    }

    public final boolean CatchingFishAnimationMockk(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? CatchingFishUnitTesting(i, obj) : (i3 & i4) != 0;
    }

    public final int CatchingFishCameraXIntent(int i) {
        return this.CatchingFishParcelableFAB[i + 1];
    }

    public final void CatchingFishCardViewView(Object obj, long j, CatchingFishWidgetFAB catchingFishWidgetFAB, CatchingFishRoomHilt catchingFishRoomHilt, CatchingFishPayPalBiometric catchingFishPayPalBiometric) {
        int CatchingFishCardViewRealm;
        this.CatchingFishCloudMessaging.getClass();
        CatchingFishManifestRedux CatchingFishParcelableFAB = CatchingFishPicassoHandler.CatchingFishParcelableFAB(j, obj);
        CatchingFishReduxLayout catchingFishReduxLayout = (CatchingFishReduxLayout) catchingFishWidgetFAB.CatchingFishReduxKtor;
        int i = catchingFishWidgetFAB.CatchingFishParcelableFAB;
        if ((i & 7) != 3) {
            throw CatchingFishKtorMVPAndroidX.CatchingFishSnackbar();
        }
        do {
            CatchingFishJUnitSharedFlow CatchingFishLayout = catchingFishRoomHilt.CatchingFishLayout();
            catchingFishWidgetFAB.CatchingFishWorkManager(CatchingFishLayout, catchingFishRoomHilt, catchingFishPayPalBiometric);
            catchingFishRoomHilt.CatchingFishReduxKtor(CatchingFishLayout);
            ((CatchingFishViewPagerLayout) CatchingFishParcelableFAB).add(CatchingFishLayout);
            if (catchingFishReduxLayout.CatchingFishCoroutine() || catchingFishWidgetFAB.CatchingFishCoroutine != 0) {
                return;
            } else {
                CatchingFishCardViewRealm = catchingFishReduxLayout.CatchingFishCardViewRealm();
            }
        } while (CatchingFishCardViewRealm == i);
        catchingFishWidgetFAB.CatchingFishCoroutine = CatchingFishCardViewRealm;
    }

    public final void CatchingFishCloudMessaging(int i, Object obj, Object obj2) {
        int i2 = this.CatchingFishParcelableFAB[i];
        if (CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(CatchingFishCameraXIntent(i) & 1048575, obj) == null) {
            return;
        }
        CatchingFishEspressoTesting(i);
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
    @Override // kotlin.text.CatchingFishRoomHilt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int CatchingFishCoroutine(CatchingFishJUnitSharedFlow catchingFishJUnitSharedFlow) {
        int i;
        int CatchingFishSnackbar;
        int i2;
        int[] iArr = this.CatchingFishParcelableFAB;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int CatchingFishCameraXIntent = CatchingFishCameraXIntent(i4);
            int i5 = iArr[i4];
            long j = 1048575 & CatchingFishCameraXIntent;
            int i6 = 1237;
            int i7 = 37;
            switch (CatchingFishDagger(CatchingFishCameraXIntent)) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    i = i3 * 53;
                    CatchingFishSnackbar = CatchingFishFirebaseBundle.CatchingFishSnackbar(Double.doubleToLongBits(CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishReduxKtor(j, catchingFishJUnitSharedFlow)));
                    i3 = CatchingFishSnackbar + i;
                    break;
                case 1:
                    i = i3 * 53;
                    CatchingFishSnackbar = Float.floatToIntBits(CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishDaggerWebsocket(j, catchingFishJUnitSharedFlow));
                    i3 = CatchingFishSnackbar + i;
                    break;
                case 2:
                    i = i3 * 53;
                    CatchingFishSnackbar = CatchingFishFirebaseBundle.CatchingFishSnackbar(CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelScope(j, catchingFishJUnitSharedFlow));
                    i3 = CatchingFishSnackbar + i;
                    break;
                case 3:
                    i = i3 * 53;
                    CatchingFishSnackbar = CatchingFishFirebaseBundle.CatchingFishSnackbar(CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelScope(j, catchingFishJUnitSharedFlow));
                    i3 = CatchingFishSnackbar + i;
                    break;
                case 4:
                    i = i3 * 53;
                    CatchingFishSnackbar = CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager(j, catchingFishJUnitSharedFlow);
                    i3 = CatchingFishSnackbar + i;
                    break;
                case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                    i = i3 * 53;
                    CatchingFishSnackbar = CatchingFishFirebaseBundle.CatchingFishSnackbar(CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelScope(j, catchingFishJUnitSharedFlow));
                    i3 = CatchingFishSnackbar + i;
                    break;
                case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                    i = i3 * 53;
                    CatchingFishSnackbar = CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager(j, catchingFishJUnitSharedFlow);
                    i3 = CatchingFishSnackbar + i;
                    break;
                case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                    i2 = i3 * 53;
                    boolean CatchingFishCoroutine = CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishCoroutine(j, catchingFishJUnitSharedFlow);
                    Charset charset = CatchingFishFirebaseBundle.CatchingFishParcelableFAB;
                    break;
                case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                    i = i3 * 53;
                    CatchingFishSnackbar = ((String) CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, catchingFishJUnitSharedFlow)).hashCode();
                    i3 = CatchingFishSnackbar + i;
                    break;
                case 9:
                    Object CatchingFishViewModelFAB = CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, catchingFishJUnitSharedFlow);
                    if (CatchingFishViewModelFAB != null) {
                        i7 = CatchingFishViewModelFAB.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    CatchingFishSnackbar = CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, catchingFishJUnitSharedFlow).hashCode();
                    i3 = CatchingFishSnackbar + i;
                    break;
                case 11:
                    i = i3 * 53;
                    CatchingFishSnackbar = CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager(j, catchingFishJUnitSharedFlow);
                    i3 = CatchingFishSnackbar + i;
                    break;
                case 12:
                    i = i3 * 53;
                    CatchingFishSnackbar = CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager(j, catchingFishJUnitSharedFlow);
                    i3 = CatchingFishSnackbar + i;
                    break;
                case 13:
                    i = i3 * 53;
                    CatchingFishSnackbar = CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager(j, catchingFishJUnitSharedFlow);
                    i3 = CatchingFishSnackbar + i;
                    break;
                case 14:
                    i = i3 * 53;
                    CatchingFishSnackbar = CatchingFishFirebaseBundle.CatchingFishSnackbar(CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelScope(j, catchingFishJUnitSharedFlow));
                    i3 = CatchingFishSnackbar + i;
                    break;
                case 15:
                    i = i3 * 53;
                    CatchingFishSnackbar = CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager(j, catchingFishJUnitSharedFlow);
                    i3 = CatchingFishSnackbar + i;
                    break;
                case 16:
                    i = i3 * 53;
                    CatchingFishSnackbar = CatchingFishFirebaseBundle.CatchingFishSnackbar(CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelScope(j, catchingFishJUnitSharedFlow));
                    i3 = CatchingFishSnackbar + i;
                    break;
                case 17:
                    Object CatchingFishViewModelFAB2 = CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, catchingFishJUnitSharedFlow);
                    if (CatchingFishViewModelFAB2 != null) {
                        i7 = CatchingFishViewModelFAB2.hashCode();
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
                    CatchingFishSnackbar = CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, catchingFishJUnitSharedFlow).hashCode();
                    i3 = CatchingFishSnackbar + i;
                    break;
                case 50:
                    i = i3 * 53;
                    CatchingFishSnackbar = CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, catchingFishJUnitSharedFlow).hashCode();
                    i3 = CatchingFishSnackbar + i;
                    break;
                case 51:
                    if (CatchingFishRoomDatabase(i5, i4, catchingFishJUnitSharedFlow)) {
                        i = i3 * 53;
                        CatchingFishSnackbar = CatchingFishFirebaseBundle.CatchingFishSnackbar(Double.doubleToLongBits(((Double) CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, catchingFishJUnitSharedFlow)).doubleValue()));
                        i3 = CatchingFishSnackbar + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (CatchingFishRoomDatabase(i5, i4, catchingFishJUnitSharedFlow)) {
                        i = i3 * 53;
                        CatchingFishSnackbar = Float.floatToIntBits(((Float) CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, catchingFishJUnitSharedFlow)).floatValue());
                        i3 = CatchingFishSnackbar + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (CatchingFishRoomDatabase(i5, i4, catchingFishJUnitSharedFlow)) {
                        i = i3 * 53;
                        CatchingFishSnackbar = CatchingFishFirebaseBundle.CatchingFishSnackbar(CatchingFishCardViewRealm(j, catchingFishJUnitSharedFlow));
                        i3 = CatchingFishSnackbar + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (CatchingFishRoomDatabase(i5, i4, catchingFishJUnitSharedFlow)) {
                        i = i3 * 53;
                        CatchingFishSnackbar = CatchingFishFirebaseBundle.CatchingFishSnackbar(CatchingFishCardViewRealm(j, catchingFishJUnitSharedFlow));
                        i3 = CatchingFishSnackbar + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (CatchingFishRoomDatabase(i5, i4, catchingFishJUnitSharedFlow)) {
                        i = i3 * 53;
                        CatchingFishSnackbar = CatchingFishGsonAppCompat(j, catchingFishJUnitSharedFlow);
                        i3 = CatchingFishSnackbar + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (CatchingFishRoomDatabase(i5, i4, catchingFishJUnitSharedFlow)) {
                        i = i3 * 53;
                        CatchingFishSnackbar = CatchingFishFirebaseBundle.CatchingFishSnackbar(CatchingFishCardViewRealm(j, catchingFishJUnitSharedFlow));
                        i3 = CatchingFishSnackbar + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (CatchingFishRoomDatabase(i5, i4, catchingFishJUnitSharedFlow)) {
                        i = i3 * 53;
                        CatchingFishSnackbar = CatchingFishGsonAppCompat(j, catchingFishJUnitSharedFlow);
                        i3 = CatchingFishSnackbar + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (CatchingFishRoomDatabase(i5, i4, catchingFishJUnitSharedFlow)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, catchingFishJUnitSharedFlow)).booleanValue();
                        Charset charset2 = CatchingFishFirebaseBundle.CatchingFishParcelableFAB;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (CatchingFishRoomDatabase(i5, i4, catchingFishJUnitSharedFlow)) {
                        i = i3 * 53;
                        CatchingFishSnackbar = ((String) CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, catchingFishJUnitSharedFlow)).hashCode();
                        i3 = CatchingFishSnackbar + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (CatchingFishRoomDatabase(i5, i4, catchingFishJUnitSharedFlow)) {
                        i = i3 * 53;
                        CatchingFishSnackbar = CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, catchingFishJUnitSharedFlow).hashCode();
                        i3 = CatchingFishSnackbar + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (CatchingFishRoomDatabase(i5, i4, catchingFishJUnitSharedFlow)) {
                        i = i3 * 53;
                        CatchingFishSnackbar = CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, catchingFishJUnitSharedFlow).hashCode();
                        i3 = CatchingFishSnackbar + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (CatchingFishRoomDatabase(i5, i4, catchingFishJUnitSharedFlow)) {
                        i = i3 * 53;
                        CatchingFishSnackbar = CatchingFishGsonAppCompat(j, catchingFishJUnitSharedFlow);
                        i3 = CatchingFishSnackbar + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (CatchingFishRoomDatabase(i5, i4, catchingFishJUnitSharedFlow)) {
                        i = i3 * 53;
                        CatchingFishSnackbar = CatchingFishGsonAppCompat(j, catchingFishJUnitSharedFlow);
                        i3 = CatchingFishSnackbar + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (CatchingFishRoomDatabase(i5, i4, catchingFishJUnitSharedFlow)) {
                        i = i3 * 53;
                        CatchingFishSnackbar = CatchingFishGsonAppCompat(j, catchingFishJUnitSharedFlow);
                        i3 = CatchingFishSnackbar + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (CatchingFishRoomDatabase(i5, i4, catchingFishJUnitSharedFlow)) {
                        i = i3 * 53;
                        CatchingFishSnackbar = CatchingFishFirebaseBundle.CatchingFishSnackbar(CatchingFishCardViewRealm(j, catchingFishJUnitSharedFlow));
                        i3 = CatchingFishSnackbar + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (CatchingFishRoomDatabase(i5, i4, catchingFishJUnitSharedFlow)) {
                        i = i3 * 53;
                        CatchingFishSnackbar = CatchingFishGsonAppCompat(j, catchingFishJUnitSharedFlow);
                        i3 = CatchingFishSnackbar + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (CatchingFishRoomDatabase(i5, i4, catchingFishJUnitSharedFlow)) {
                        i = i3 * 53;
                        CatchingFishSnackbar = CatchingFishFirebaseBundle.CatchingFishSnackbar(CatchingFishCardViewRealm(j, catchingFishJUnitSharedFlow));
                        i3 = CatchingFishSnackbar + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (CatchingFishRoomDatabase(i5, i4, catchingFishJUnitSharedFlow)) {
                        i = i3 * 53;
                        CatchingFishSnackbar = CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, catchingFishJUnitSharedFlow).hashCode();
                        i3 = CatchingFishSnackbar + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.CatchingFishEspressoTesting.getClass();
        return catchingFishJUnitSharedFlow.unknownFields.hashCode() + (i3 * 53);
    }

    public final Object CatchingFishCoroutineFlow(int i, Object obj) {
        CatchingFishRoomHilt CatchingFishOkHttp = CatchingFishOkHttp(i);
        long CatchingFishCameraXIntent = CatchingFishCameraXIntent(i) & 1048575;
        if (!CatchingFishUnitTesting(i, obj)) {
            return CatchingFishOkHttp.CatchingFishLayout();
        }
        Object object = CatchingFishAnimationMockk.getObject(obj, CatchingFishCameraXIntent);
        if (CatchingFishStateLiveData(object)) {
            return object;
        }
        CatchingFishJUnitSharedFlow CatchingFishLayout = CatchingFishOkHttp.CatchingFishLayout();
        if (object != null) {
            CatchingFishOkHttp.CatchingFishParcelableFAB(CatchingFishLayout, object);
        }
        return CatchingFishLayout;
    }

    public final void CatchingFishCustomView(int i, Object obj, CatchingFishWidgetFAB catchingFishWidgetFAB) {
        CatchingFishReduxLayout catchingFishReduxLayout = (CatchingFishReduxLayout) catchingFishWidgetFAB.CatchingFishReduxKtor;
        if ((536870912 & i) != 0) {
            catchingFishWidgetFAB.CatchingFishPayPal(2);
            CatchingFishGradleViewModel.CatchingFishAnimationMockk(i & 1048575, obj, catchingFishReduxLayout.CatchingFishGsonAppCompat());
        } else if (!this.CatchingFishWorkManager) {
            CatchingFishGradleViewModel.CatchingFishAnimationMockk(i & 1048575, obj, catchingFishWidgetFAB.CatchingFishLayout());
        } else {
            catchingFishWidgetFAB.CatchingFishPayPal(2);
            CatchingFishGradleViewModel.CatchingFishAnimationMockk(i & 1048575, obj, catchingFishReduxLayout.CatchingFishParcelableFlux());
        }
    }

    public final Object CatchingFishDaggerHiltFAB(int i, int i2, Object obj) {
        CatchingFishRoomHilt CatchingFishOkHttp = CatchingFishOkHttp(i2);
        if (!CatchingFishRoomDatabase(i, i2, obj)) {
            return CatchingFishOkHttp.CatchingFishLayout();
        }
        Object object = CatchingFishAnimationMockk.getObject(obj, CatchingFishCameraXIntent(i2) & 1048575);
        if (CatchingFishStateLiveData(object)) {
            return object;
        }
        CatchingFishJUnitSharedFlow CatchingFishLayout = CatchingFishOkHttp.CatchingFishLayout();
        if (object != null) {
            CatchingFishOkHttp.CatchingFishParcelableFAB(CatchingFishLayout, object);
        }
        return CatchingFishLayout;
    }

    @Override // kotlin.text.CatchingFishRoomHilt
    public final void CatchingFishDaggerWebsocket(Object obj, CatchingFishServiceHilt catchingFishServiceHilt) {
        catchingFishServiceHilt.getClass();
        CatchingFishHandler(obj, catchingFishServiceHilt);
    }

    public final void CatchingFishEspressoMockk(Object obj, int i, int i2, CatchingFishGlideWebsocket catchingFishGlideWebsocket) {
        CatchingFishAnimationMockk.putObject(obj, CatchingFishCameraXIntent(i2) & 1048575, catchingFishGlideWebsocket);
        CatchingFishPayPalService(i, i2, obj);
    }

    public final void CatchingFishEspressoTesting(int i) {
        if (this.CatchingFishSnackbar[((i / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final void CatchingFishFragmentFactory(int i, Object obj, CatchingFishWidgetFAB catchingFishWidgetFAB) {
        int i2 = 536870912 & i;
        CatchingFishPicassoHandler catchingFishPicassoHandler = this.CatchingFishCloudMessaging;
        if (i2 != 0) {
            catchingFishPicassoHandler.getClass();
            catchingFishWidgetFAB.CatchingFishSpannableWidget(CatchingFishPicassoHandler.CatchingFishParcelableFAB(i & 1048575, obj), true);
        } else {
            catchingFishPicassoHandler.getClass();
            catchingFishWidgetFAB.CatchingFishSpannableWidget(CatchingFishPicassoHandler.CatchingFishParcelableFAB(i & 1048575, obj), false);
        }
    }

    public final boolean CatchingFishFragmentHandler(CatchingFishJUnitSharedFlow catchingFishJUnitSharedFlow, CatchingFishJUnitSharedFlow catchingFishJUnitSharedFlow2, int i) {
        return CatchingFishUnitTesting(i, catchingFishJUnitSharedFlow) == CatchingFishUnitTesting(i, catchingFishJUnitSharedFlow2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void CatchingFishHandler(Object obj, CatchingFishServiceHilt catchingFishServiceHilt) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        CatchingFishWorkManagerKtor catchingFishWorkManagerKtor = this;
        int[] iArr = catchingFishWorkManagerKtor.CatchingFishParcelableFAB;
        int length = iArr.length;
        Unsafe unsafe = CatchingFishAnimationMockk;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int CatchingFishCameraXIntent = catchingFishWorkManagerKtor.CatchingFishCameraXIntent(i7);
            int i9 = iArr[i7];
            int CatchingFishDagger = CatchingFishDagger(CatchingFishCameraXIntent);
            if (CatchingFishDagger <= 17) {
                int i10 = iArr[i7 + 2];
                int i11 = i10 & i5;
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i = CatchingFishCameraXIntent;
                i2 = 1 << (i10 >>> 20);
            } else {
                i = CatchingFishCameraXIntent;
                i2 = 0;
            }
            long j = i & i5;
            switch (CatchingFishDagger) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(obj, i7, i6, i8, i2)) {
                        double CatchingFishReduxKtor = CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishReduxKtor(j, obj);
                        CatchingFishViewSnackbar catchingFishViewSnackbar = (CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
                        catchingFishViewSnackbar.getClass();
                        catchingFishViewSnackbar.CatchingFishWidget(i9, Double.doubleToRawLongBits(CatchingFishReduxKtor));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(obj, i7, i6, i8, i2)) {
                        float CatchingFishDaggerWebsocket = CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishDaggerWebsocket(j, obj);
                        CatchingFishViewSnackbar catchingFishViewSnackbar2 = (CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
                        catchingFishViewSnackbar2.getClass();
                        catchingFishViewSnackbar2.CatchingFishGraphQLGlide(i9, Float.floatToRawIntBits(CatchingFishDaggerWebsocket));
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case 2:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(obj, i7, i6, i8, i2)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishKtor(i9, unsafe.getLong(obj, j));
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case 3:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(obj, i7, i6, i8, i2)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishKtor(i9, unsafe.getLong(obj, j));
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case 4:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(obj, i7, i6, i8, i2)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishWebSocketMockk(i9, unsafe.getInt(obj, j));
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(obj, i7, i6, i8, i2)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishWidget(i9, unsafe.getLong(obj, j));
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(obj, i7, i6, i8, i2)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishGraphQLGlide(i9, unsafe.getInt(obj, j));
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(obj, i7, i6, i8, i2)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishServiceMVIJUnit(i9, CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishCoroutine(j, obj));
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(obj, i7, i6, i8, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishDynamicFeature((String) object, i9);
                        } else {
                            ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishGlideWidgetKtor(i9, (CatchingFishCameraXRealm) object);
                        }
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case 9:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(obj, i7, i6, i8, i2)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishRealmKtorRealm(i9, (CatchingFishGlideWebsocket) unsafe.getObject(obj, j), catchingFishWorkManagerKtor.CatchingFishOkHttp(i7));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(obj, i7, i6, i8, i2)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishGlideWidgetKtor(i9, (CatchingFishCameraXRealm) unsafe.getObject(obj, j));
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case 11:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(obj, i7, i6, i8, i2)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishCameraX(i9, unsafe.getInt(obj, j));
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case 12:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(obj, i7, i6, i8, i2)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishWebSocketMockk(i9, unsafe.getInt(obj, j));
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case 13:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(obj, i7, i6, i8, i2)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishGraphQLGlide(i9, unsafe.getInt(obj, j));
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case 14:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(obj, i7, i6, i8, i2)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishWidget(i9, unsafe.getLong(obj, j));
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case 15:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(obj, i7, i6, i8, i2)) {
                        int i12 = unsafe.getInt(obj, j);
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishCameraX(i9, (i12 >> 31) ^ (i12 << 1));
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case 16:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(obj, i7, i6, i8, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishKtor(i9, (j2 >> 63) ^ (j2 << 1));
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case 17:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(obj, i7, i6, i8, i2)) {
                        catchingFishServiceHilt.CatchingFishPayPal(i9, unsafe.getObject(obj, j), catchingFishWorkManagerKtor.CatchingFishOkHttp(i7));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i3 = i6;
                    CatchingFishCameraXLayout.CatchingFishUnitTesting(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, false);
                    i6 = i3;
                    break;
                case 19:
                    i3 = i6;
                    CatchingFishCameraXLayout.CatchingFishNavigation(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, false);
                    i6 = i3;
                    break;
                case 20:
                    i3 = i6;
                    CatchingFishCameraXLayout.CatchingFishJetpackCompose(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, false);
                    i6 = i3;
                    break;
                case 21:
                    i3 = i6;
                    CatchingFishCameraXLayout.CatchingFishCardViewRealm(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, false);
                    i6 = i3;
                    break;
                case 22:
                    i3 = i6;
                    CatchingFishCameraXLayout.CatchingFish(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, false);
                    i6 = i3;
                    break;
                case 23:
                    i3 = i6;
                    CatchingFishCameraXLayout.CatchingFishRoomDatabase(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, false);
                    i6 = i3;
                    break;
                case 24:
                    i3 = i6;
                    CatchingFishCameraXLayout.CatchingFishStateLiveData(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, false);
                    i6 = i3;
                    break;
                case 25:
                    i3 = i6;
                    CatchingFishCameraXLayout.CatchingFishOkHttp(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, false);
                    i6 = i3;
                    break;
                case 26:
                    i4 = i6;
                    int i13 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    if (list != null && !list.isEmpty()) {
                        catchingFishServiceHilt.getClass();
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishDynamicFeature((String) list.get(i14), i13);
                        }
                    }
                    i6 = i4;
                    break;
                case 27:
                    i4 = i6;
                    int i15 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    CatchingFishRoomHilt CatchingFishOkHttp = catchingFishWorkManagerKtor.CatchingFishOkHttp(i7);
                    Class cls2 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    if (list2 != null && !list2.isEmpty()) {
                        catchingFishServiceHilt.getClass();
                        for (int i16 = 0; i16 < list2.size(); i16++) {
                            ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishRealmKtorRealm(i15, (CatchingFishGlideWebsocket) list2.get(i16), CatchingFishOkHttp);
                        }
                    }
                    i6 = i4;
                    break;
                case 28:
                    i4 = i6;
                    int i17 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    if (list3 != null && !list3.isEmpty()) {
                        catchingFishServiceHilt.getClass();
                        for (int i18 = 0; i18 < list3.size(); i18++) {
                            ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishGlideWidgetKtor(i17, (CatchingFishCameraXRealm) list3.get(i18));
                        }
                    }
                    i6 = i4;
                    break;
                case 29:
                    i3 = i6;
                    z = false;
                    CatchingFishCameraXLayout.CatchingFishGsonAppCompat(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, false);
                    i6 = i3;
                    break;
                case 30:
                    i3 = i6;
                    z = false;
                    CatchingFishCameraXLayout.CatchingFishAnimationMockk(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, false);
                    i6 = i3;
                    break;
                case 31:
                    i3 = i6;
                    z = false;
                    CatchingFishCameraXLayout.CatchingFishCoroutineFlow(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, false);
                    i6 = i3;
                    break;
                case 32:
                    i3 = i6;
                    z = false;
                    CatchingFishCameraXLayout.CatchingFishDaggerHiltFAB(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, false);
                    i6 = i3;
                    break;
                case 33:
                    i3 = i6;
                    z = false;
                    CatchingFishCameraXLayout.CatchingFishSpannableWidget(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, false);
                    i6 = i3;
                    break;
                case 34:
                    i3 = i6;
                    z = false;
                    CatchingFishCameraXLayout.CatchingFishParcelableFlux(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, false);
                    i6 = i3;
                    break;
                case 35:
                    i4 = i6;
                    CatchingFishCameraXLayout.CatchingFishUnitTesting(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, true);
                    i6 = i4;
                    break;
                case 36:
                    i4 = i6;
                    CatchingFishCameraXLayout.CatchingFishNavigation(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, true);
                    i6 = i4;
                    break;
                case 37:
                    i4 = i6;
                    CatchingFishCameraXLayout.CatchingFishJetpackCompose(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, true);
                    i6 = i4;
                    break;
                case 38:
                    i4 = i6;
                    CatchingFishCameraXLayout.CatchingFishCardViewRealm(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, true);
                    i6 = i4;
                    break;
                case 39:
                    i4 = i6;
                    CatchingFishCameraXLayout.CatchingFish(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, true);
                    i6 = i4;
                    break;
                case 40:
                    i4 = i6;
                    CatchingFishCameraXLayout.CatchingFishRoomDatabase(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, true);
                    i6 = i4;
                    break;
                case 41:
                    i4 = i6;
                    CatchingFishCameraXLayout.CatchingFishStateLiveData(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, true);
                    i6 = i4;
                    break;
                case 42:
                    i4 = i6;
                    CatchingFishCameraXLayout.CatchingFishOkHttp(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, true);
                    i6 = i4;
                    break;
                case 43:
                    i4 = i6;
                    CatchingFishCameraXLayout.CatchingFishGsonAppCompat(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, true);
                    i6 = i4;
                    break;
                case 44:
                    i4 = i6;
                    CatchingFishCameraXLayout.CatchingFishAnimationMockk(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, true);
                    i6 = i4;
                    break;
                case 45:
                    i4 = i6;
                    CatchingFishCameraXLayout.CatchingFishCoroutineFlow(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, true);
                    i6 = i4;
                    break;
                case 46:
                    i4 = i6;
                    CatchingFishCameraXLayout.CatchingFishDaggerHiltFAB(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, true);
                    i6 = i4;
                    break;
                case 47:
                    i4 = i6;
                    CatchingFishCameraXLayout.CatchingFishSpannableWidget(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, true);
                    i6 = i4;
                    break;
                case 48:
                    i4 = i6;
                    CatchingFishCameraXLayout.CatchingFishParcelableFlux(iArr[i7], (List) unsafe.getObject(obj, j), catchingFishServiceHilt, true);
                    i6 = i4;
                    break;
                case 49:
                    i4 = i6;
                    int i19 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    CatchingFishRoomHilt CatchingFishOkHttp2 = catchingFishWorkManagerKtor.CatchingFishOkHttp(i7);
                    Class cls4 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    if (list4 != null && !list4.isEmpty()) {
                        catchingFishServiceHilt.getClass();
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            catchingFishServiceHilt.CatchingFishPayPal(i19, list4.get(i20), CatchingFishOkHttp2);
                        }
                    }
                    i6 = i4;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i21 = 2;
                        Object obj2 = catchingFishWorkManagerKtor.CatchingFishSnackbar[(i7 / 3) * 2];
                        catchingFishWorkManagerKtor.CatchingFishOkHttp.getClass();
                        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = ((CatchingFishDaggerSpannable) obj2).CatchingFishParcelableFAB;
                        CatchingFishViewSnackbar catchingFishViewSnackbar3 = (CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
                        catchingFishViewSnackbar3.getClass();
                        for (Map.Entry entry : ((CatchingFishMockkAppCompat) object2).entrySet()) {
                            catchingFishViewSnackbar3.CatchingFishSharedFlow(i9, i21);
                            catchingFishViewSnackbar3.CatchingFishLifecycle(CatchingFishDaggerSpannable.CatchingFishParcelableFAB(catchingFishAsyncTaskDagger, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            CatchingFishFluxRetrofit.CatchingFishSnackbar(catchingFishViewSnackbar3, (CatchingFishReduxBiometric) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket, 1, key);
                            i21 = 2;
                            CatchingFishFluxRetrofit.CatchingFishSnackbar(catchingFishViewSnackbar3, (CatchingFishReduxBiometric) catchingFishAsyncTaskDagger.CatchingFishWorkManager, 2, value);
                            i6 = i6;
                        }
                    }
                    i4 = i6;
                    i6 = i4;
                    break;
                case 51:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i9, i7, obj)) {
                        double doubleValue = ((Double) CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, obj)).doubleValue();
                        CatchingFishViewSnackbar catchingFishViewSnackbar4 = (CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
                        catchingFishViewSnackbar4.getClass();
                        catchingFishViewSnackbar4.CatchingFishWidget(i9, Double.doubleToRawLongBits(doubleValue));
                    }
                    break;
                case 52:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i9, i7, obj)) {
                        float floatValue = ((Float) CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, obj)).floatValue();
                        CatchingFishViewSnackbar catchingFishViewSnackbar5 = (CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
                        catchingFishViewSnackbar5.getClass();
                        catchingFishViewSnackbar5.CatchingFishGraphQLGlide(i9, Float.floatToRawIntBits(floatValue));
                    }
                    break;
                case 53:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i9, i7, obj)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishKtor(i9, CatchingFishCardViewRealm(j, obj));
                    }
                    break;
                case 54:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i9, i7, obj)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishKtor(i9, CatchingFishCardViewRealm(j, obj));
                    }
                    break;
                case 55:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i9, i7, obj)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishWebSocketMockk(i9, CatchingFishGsonAppCompat(j, obj));
                    }
                    break;
                case 56:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i9, i7, obj)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishWidget(i9, CatchingFishCardViewRealm(j, obj));
                    }
                    break;
                case 57:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i9, i7, obj)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishGraphQLGlide(i9, CatchingFishGsonAppCompat(j, obj));
                    }
                    break;
                case 58:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i9, i7, obj)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishServiceMVIJUnit(i9, ((Boolean) CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i9, i7, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishDynamicFeature((String) object3, i9);
                        } else {
                            ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishGlideWidgetKtor(i9, (CatchingFishCameraXRealm) object3);
                        }
                    }
                    break;
                case 60:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i9, i7, obj)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishRealmKtorRealm(i9, (CatchingFishGlideWebsocket) unsafe.getObject(obj, j), catchingFishWorkManagerKtor.CatchingFishOkHttp(i7));
                    }
                    break;
                case 61:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i9, i7, obj)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishGlideWidgetKtor(i9, (CatchingFishCameraXRealm) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i9, i7, obj)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishCameraX(i9, CatchingFishGsonAppCompat(j, obj));
                    }
                    break;
                case 63:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i9, i7, obj)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishWebSocketMockk(i9, CatchingFishGsonAppCompat(j, obj));
                    }
                    break;
                case 64:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i9, i7, obj)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishGraphQLGlide(i9, CatchingFishGsonAppCompat(j, obj));
                    }
                    break;
                case 65:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i9, i7, obj)) {
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishWidget(i9, CatchingFishCardViewRealm(j, obj));
                    }
                    break;
                case 66:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i9, i7, obj)) {
                        int CatchingFishGsonAppCompat = CatchingFishGsonAppCompat(j, obj);
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishCameraX(i9, (CatchingFishGsonAppCompat >> 31) ^ (CatchingFishGsonAppCompat << 1));
                    }
                    break;
                case 67:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i9, i7, obj)) {
                        long CatchingFishCardViewRealm = CatchingFishCardViewRealm(j, obj);
                        ((CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket).CatchingFishKtor(i9, (CatchingFishCardViewRealm << 1) ^ (CatchingFishCardViewRealm >> 63));
                    }
                    break;
                case 68:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i9, i7, obj)) {
                        catchingFishServiceHilt.CatchingFishPayPal(i9, unsafe.getObject(obj, j), catchingFishWorkManagerKtor.CatchingFishOkHttp(i7));
                    }
                    break;
            }
            i7 += 3;
            i5 = 1048575;
        }
        catchingFishWorkManagerKtor.CatchingFishEspressoTesting.getClass();
        ((CatchingFishJUnitSharedFlow) obj).unknownFields.CatchingFishReduxKtor(catchingFishServiceHilt);
    }

    public final void CatchingFishJetpackCompose(int i, Object obj, Object obj2) {
        int[] iArr = this.CatchingFishParcelableFAB;
        int i2 = iArr[i];
        if (CatchingFishRoomDatabase(i2, i, obj2)) {
            long CatchingFishCameraXIntent = CatchingFishCameraXIntent(i) & 1048575;
            Unsafe unsafe = CatchingFishAnimationMockk;
            Object object = unsafe.getObject(obj2, CatchingFishCameraXIntent);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            CatchingFishRoomHilt CatchingFishOkHttp = CatchingFishOkHttp(i);
            if (!CatchingFishRoomDatabase(i2, i, obj)) {
                if (CatchingFishStateLiveData(object)) {
                    CatchingFishJUnitSharedFlow CatchingFishLayout = CatchingFishOkHttp.CatchingFishLayout();
                    CatchingFishOkHttp.CatchingFishParcelableFAB(CatchingFishLayout, object);
                    unsafe.putObject(obj, CatchingFishCameraXIntent, CatchingFishLayout);
                } else {
                    unsafe.putObject(obj, CatchingFishCameraXIntent, object);
                }
                CatchingFishPayPalService(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, CatchingFishCameraXIntent);
            if (!CatchingFishStateLiveData(object2)) {
                CatchingFishJUnitSharedFlow CatchingFishLayout2 = CatchingFishOkHttp.CatchingFishLayout();
                CatchingFishOkHttp.CatchingFishParcelableFAB(CatchingFishLayout2, object2);
                unsafe.putObject(obj, CatchingFishCameraXIntent, CatchingFishLayout2);
                object2 = CatchingFishLayout2;
            }
            CatchingFishOkHttp.CatchingFishParcelableFAB(object2, object);
        }
    }

    public final void CatchingFishJobScheduler(int i, Object obj) {
        int i2 = this.CatchingFishParcelableFAB[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        CatchingFishGradleViewModel.CatchingFishOkHttp(obj, j, (1 << (i2 >>> 20)) | CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager(j, obj));
    }

    @Override // kotlin.text.CatchingFishRoomHilt
    public final CatchingFishJUnitSharedFlow CatchingFishLayout() {
        this.CatchingFishFragmentHandler.getClass();
        return ((CatchingFishJUnitSharedFlow) this.CatchingFishDaggerWebsocket).CatchingFishLayout();
    }

    public final void CatchingFishMVPRobolectric(Object obj, int i, CatchingFishWidgetFAB catchingFishWidgetFAB, CatchingFishRoomHilt catchingFishRoomHilt, CatchingFishPayPalBiometric catchingFishPayPalBiometric) {
        int CatchingFishCardViewRealm;
        this.CatchingFishCloudMessaging.getClass();
        CatchingFishManifestRedux CatchingFishParcelableFAB = CatchingFishPicassoHandler.CatchingFishParcelableFAB(i & 1048575, obj);
        CatchingFishReduxLayout catchingFishReduxLayout = (CatchingFishReduxLayout) catchingFishWidgetFAB.CatchingFishReduxKtor;
        int i2 = catchingFishWidgetFAB.CatchingFishParcelableFAB;
        if ((i2 & 7) != 2) {
            throw CatchingFishKtorMVPAndroidX.CatchingFishSnackbar();
        }
        do {
            CatchingFishJUnitSharedFlow CatchingFishLayout = catchingFishRoomHilt.CatchingFishLayout();
            catchingFishWidgetFAB.CatchingFishViewModelScope(CatchingFishLayout, catchingFishRoomHilt, catchingFishPayPalBiometric);
            catchingFishRoomHilt.CatchingFishReduxKtor(CatchingFishLayout);
            ((CatchingFishViewPagerLayout) CatchingFishParcelableFAB).add(CatchingFishLayout);
            if (catchingFishReduxLayout.CatchingFishCoroutine() || catchingFishWidgetFAB.CatchingFishCoroutine != 0) {
                return;
            } else {
                CatchingFishCardViewRealm = catchingFishReduxLayout.CatchingFishCardViewRealm();
            }
        } while (CatchingFishCardViewRealm == i2);
        catchingFishWidgetFAB.CatchingFishCoroutine = CatchingFishCardViewRealm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        r10.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        r0.CatchingFishViewModelFAB(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishNavigation(Object obj, int i, Object obj2, CatchingFishPayPalBiometric catchingFishPayPalBiometric, CatchingFishWidgetFAB catchingFishWidgetFAB) {
        long CatchingFishCameraXIntent = CatchingFishCameraXIntent(i) & 1048575;
        Object CatchingFishViewModelFAB = CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(CatchingFishCameraXIntent, obj);
        CatchingFishMockkViewModel catchingFishMockkViewModel = this.CatchingFishOkHttp;
        if (CatchingFishViewModelFAB == null) {
            catchingFishMockkViewModel.getClass();
            CatchingFishViewModelFAB = CatchingFishMockkAppCompat.CatchingFishDaggerWebsocket.CatchingFishSnackbar();
            CatchingFishGradleViewModel.CatchingFishAnimationMockk(CatchingFishCameraXIntent, obj, CatchingFishViewModelFAB);
        } else {
            catchingFishMockkViewModel.getClass();
            if (!((CatchingFishMockkAppCompat) CatchingFishViewModelFAB).CatchingFishReduxKtor) {
                CatchingFishMockkAppCompat CatchingFishSnackbar = CatchingFishMockkAppCompat.CatchingFishDaggerWebsocket.CatchingFishSnackbar();
                CatchingFishMockkViewModel.CatchingFishParcelableFAB(CatchingFishSnackbar, CatchingFishViewModelFAB);
                CatchingFishGradleViewModel.CatchingFishAnimationMockk(CatchingFishCameraXIntent, obj, CatchingFishSnackbar);
                CatchingFishViewModelFAB = CatchingFishSnackbar;
            }
        }
        catchingFishMockkViewModel.getClass();
        CatchingFishMockkAppCompat catchingFishMockkAppCompat = (CatchingFishMockkAppCompat) CatchingFishViewModelFAB;
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = ((CatchingFishDaggerSpannable) obj2).CatchingFishParcelableFAB;
        catchingFishWidgetFAB.CatchingFishPayPal(2);
        CatchingFishReduxLayout catchingFishReduxLayout = (CatchingFishReduxLayout) catchingFishWidgetFAB.CatchingFishReduxKtor;
        int CatchingFishLayout = catchingFishReduxLayout.CatchingFishLayout(catchingFishReduxLayout.CatchingFishPayPal());
        Object obj3 = catchingFishAsyncTaskDagger.CatchingFishViewModelScope;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int CatchingFishCoroutine = catchingFishWidgetFAB.CatchingFishCoroutine();
                if (CatchingFishCoroutine == Integer.MAX_VALUE || catchingFishReduxLayout.CatchingFishCoroutine()) {
                    break;
                }
                if (CatchingFishCoroutine == 1) {
                    obj4 = catchingFishWidgetFAB.CatchingFishOkHttp((CatchingFishReduxBiometric) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket, null, null);
                } else if (CatchingFishCoroutine != 2) {
                    try {
                        if (!catchingFishWidgetFAB.CatchingFishCardViewView()) {
                            throw new CatchingFishKtorMVPAndroidX("Unable to parse map entry.");
                        }
                    } catch (CatchingFishBiometricAdMob unused) {
                        if (!catchingFishWidgetFAB.CatchingFishCardViewView()) {
                            throw new CatchingFishKtorMVPAndroidX("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = catchingFishWidgetFAB.CatchingFishOkHttp((CatchingFishReduxBiometric) catchingFishAsyncTaskDagger.CatchingFishWorkManager, obj3.getClass(), catchingFishPayPalBiometric);
                }
            } catch (Throwable th) {
                catchingFishReduxLayout.CatchingFishViewModelFAB(CatchingFishLayout);
                throw th;
            }
        }
    }

    public final CatchingFishRoomHilt CatchingFishOkHttp(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.CatchingFishSnackbar;
        CatchingFishRoomHilt catchingFishRoomHilt = (CatchingFishRoomHilt) objArr[i2];
        if (catchingFishRoomHilt != null) {
            return catchingFishRoomHilt;
        }
        CatchingFishRoomHilt CatchingFishParcelableFAB = CatchingFishCoroutineHilt.CatchingFishCoroutine.CatchingFishParcelableFAB((Class) objArr[i2 + 1]);
        objArr[i2] = CatchingFishParcelableFAB;
        return CatchingFishParcelableFAB;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // kotlin.text.CatchingFishRoomHilt
    public final void CatchingFishParcelableFAB(Object obj, Object obj2) {
        Object obj3;
        if (!CatchingFishStateLiveData(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.CatchingFishParcelableFAB;
            if (i >= iArr.length) {
                CatchingFishCameraXLayout.CatchingFishCloudMessaging(this.CatchingFishEspressoTesting, obj, obj2);
                return;
            }
            int CatchingFishCameraXIntent = CatchingFishCameraXIntent(i);
            long j = 1048575 & CatchingFishCameraXIntent;
            int i2 = iArr[i];
            switch (CatchingFishDagger(CatchingFishCameraXIntent)) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (CatchingFishUnitTesting(i, obj2)) {
                        CatchingFishJUnitRealm catchingFishJUnitRealm = CatchingFishGradleViewModel.CatchingFishCoroutine;
                        obj3 = obj;
                        catchingFishJUnitRealm.CatchingFishEspressoTesting(obj3, j, catchingFishJUnitRealm.CatchingFishReduxKtor(j, obj2));
                        CatchingFishJobScheduler(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (CatchingFishUnitTesting(i, obj2)) {
                        CatchingFishJUnitRealm catchingFishJUnitRealm2 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                        catchingFishJUnitRealm2.CatchingFishOkHttp(obj, j, catchingFishJUnitRealm2.CatchingFishDaggerWebsocket(j, obj2));
                        CatchingFishJobScheduler(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (CatchingFishUnitTesting(i, obj2)) {
                        CatchingFishGradleViewModel.CatchingFishUnitTesting(obj, j, CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelScope(j, obj2));
                        CatchingFishJobScheduler(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (CatchingFishUnitTesting(i, obj2)) {
                        CatchingFishGradleViewModel.CatchingFishUnitTesting(obj, j, CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelScope(j, obj2));
                        CatchingFishJobScheduler(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (CatchingFishUnitTesting(i, obj2)) {
                        CatchingFishGradleViewModel.CatchingFishOkHttp(obj, j, CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager(j, obj2));
                        CatchingFishJobScheduler(i, obj);
                    }
                    obj3 = obj;
                    break;
                case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                    if (CatchingFishUnitTesting(i, obj2)) {
                        CatchingFishGradleViewModel.CatchingFishUnitTesting(obj, j, CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelScope(j, obj2));
                        CatchingFishJobScheduler(i, obj);
                    }
                    obj3 = obj;
                    break;
                case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (CatchingFishUnitTesting(i, obj2)) {
                        CatchingFishGradleViewModel.CatchingFishOkHttp(obj, j, CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager(j, obj2));
                        CatchingFishJobScheduler(i, obj);
                    }
                    obj3 = obj;
                    break;
                case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (CatchingFishUnitTesting(i, obj2)) {
                        CatchingFishJUnitRealm catchingFishJUnitRealm3 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                        catchingFishJUnitRealm3.CatchingFishFragmentHandler(obj, j, catchingFishJUnitRealm3.CatchingFishCoroutine(j, obj2));
                        CatchingFishJobScheduler(i, obj);
                    }
                    obj3 = obj;
                    break;
                case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                    if (CatchingFishUnitTesting(i, obj2)) {
                        CatchingFishGradleViewModel.CatchingFishAnimationMockk(j, obj, CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, obj2));
                        CatchingFishJobScheduler(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    CatchingFish(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (CatchingFishUnitTesting(i, obj2)) {
                        CatchingFishGradleViewModel.CatchingFishAnimationMockk(j, obj, CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, obj2));
                        CatchingFishJobScheduler(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (CatchingFishUnitTesting(i, obj2)) {
                        CatchingFishGradleViewModel.CatchingFishOkHttp(obj, j, CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager(j, obj2));
                        CatchingFishJobScheduler(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (CatchingFishUnitTesting(i, obj2)) {
                        CatchingFishGradleViewModel.CatchingFishOkHttp(obj, j, CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager(j, obj2));
                        CatchingFishJobScheduler(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (CatchingFishUnitTesting(i, obj2)) {
                        CatchingFishGradleViewModel.CatchingFishOkHttp(obj, j, CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager(j, obj2));
                        CatchingFishJobScheduler(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (CatchingFishUnitTesting(i, obj2)) {
                        CatchingFishGradleViewModel.CatchingFishUnitTesting(obj, j, CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelScope(j, obj2));
                        CatchingFishJobScheduler(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (CatchingFishUnitTesting(i, obj2)) {
                        CatchingFishGradleViewModel.CatchingFishOkHttp(obj, j, CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager(j, obj2));
                        CatchingFishJobScheduler(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (CatchingFishUnitTesting(i, obj2)) {
                        CatchingFishGradleViewModel.CatchingFishUnitTesting(obj, j, CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelScope(j, obj2));
                        CatchingFishJobScheduler(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    CatchingFish(i, obj, obj2);
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
                    this.CatchingFishCloudMessaging.getClass();
                    CatchingFishJUnitRealm catchingFishJUnitRealm4 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                    CatchingFishManifestRedux catchingFishManifestRedux = (CatchingFishManifestRedux) catchingFishJUnitRealm4.CatchingFishViewModelFAB(j, obj);
                    CatchingFishManifestRedux catchingFishManifestRedux2 = (CatchingFishManifestRedux) catchingFishJUnitRealm4.CatchingFishViewModelFAB(j, obj2);
                    CatchingFishViewPagerLayout catchingFishViewPagerLayout = (CatchingFishViewPagerLayout) catchingFishManifestRedux;
                    int i3 = catchingFishViewPagerLayout.CatchingFishWorkManager;
                    int i4 = ((CatchingFishViewPagerLayout) catchingFishManifestRedux2).CatchingFishWorkManager;
                    if (i3 > 0 && i4 > 0) {
                        if (!((CatchingFishNavigation) catchingFishManifestRedux).CatchingFishReduxKtor) {
                            catchingFishManifestRedux = catchingFishViewPagerLayout.CatchingFishCoroutine(i4 + i3);
                        }
                        ((CatchingFishNavigation) catchingFishManifestRedux).addAll(catchingFishManifestRedux2);
                    }
                    if (i3 > 0) {
                        catchingFishManifestRedux2 = catchingFishManifestRedux;
                    }
                    CatchingFishGradleViewModel.CatchingFishAnimationMockk(j, obj, catchingFishManifestRedux2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    CatchingFishJUnitRealm catchingFishJUnitRealm5 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                    Object CatchingFishViewModelFAB = catchingFishJUnitRealm5.CatchingFishViewModelFAB(j, obj);
                    Object CatchingFishViewModelFAB2 = catchingFishJUnitRealm5.CatchingFishViewModelFAB(j, obj2);
                    this.CatchingFishOkHttp.getClass();
                    CatchingFishGradleViewModel.CatchingFishAnimationMockk(j, obj, CatchingFishMockkViewModel.CatchingFishParcelableFAB(CatchingFishViewModelFAB, CatchingFishViewModelFAB2));
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
                    if (CatchingFishRoomDatabase(i2, i, obj2)) {
                        CatchingFishGradleViewModel.CatchingFishAnimationMockk(j, obj, CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, obj2));
                        CatchingFishPayPalService(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    CatchingFishJetpackCompose(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (CatchingFishRoomDatabase(i2, i, obj2)) {
                        CatchingFishGradleViewModel.CatchingFishAnimationMockk(j, obj, CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, obj2));
                        CatchingFishPayPalService(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    CatchingFishJetpackCompose(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    public final int CatchingFishPayPal(int i) {
        if (i >= this.CatchingFishCoroutine && i <= this.CatchingFishReduxKtor) {
            int[] iArr = this.CatchingFishParcelableFAB;
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
        }
        return -1;
    }

    public final void CatchingFishPayPalService(int i, int i2, Object obj) {
        CatchingFishGradleViewModel.CatchingFishOkHttp(obj, this.CatchingFishParcelableFAB[i2 + 2] & 1048575, i);
    }

    @Override // kotlin.text.CatchingFishRoomHilt
    public final void CatchingFishReduxKtor(Object obj) {
        if (CatchingFishStateLiveData(obj)) {
            if (obj instanceof CatchingFishJUnitSharedFlow) {
                CatchingFishJUnitSharedFlow catchingFishJUnitSharedFlow = (CatchingFishJUnitSharedFlow) obj;
                catchingFishJUnitSharedFlow.CatchingFishCloudMessaging(Integer.MAX_VALUE);
                catchingFishJUnitSharedFlow.memoizedHashCode = 0;
                catchingFishJUnitSharedFlow.CatchingFishViewModelFAB();
            }
            int[] iArr = this.CatchingFishParcelableFAB;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int CatchingFishCameraXIntent = CatchingFishCameraXIntent(i);
                long j = 1048575 & CatchingFishCameraXIntent;
                int CatchingFishDagger = CatchingFishDagger(CatchingFishCameraXIntent);
                if (CatchingFishDagger != 9) {
                    if (CatchingFishDagger != 60 && CatchingFishDagger != 68) {
                        switch (CatchingFishDagger) {
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
                                this.CatchingFishCloudMessaging.getClass();
                                CatchingFishNavigation catchingFishNavigation = (CatchingFishNavigation) ((CatchingFishManifestRedux) CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j, obj));
                                if (catchingFishNavigation.CatchingFishReduxKtor) {
                                    catchingFishNavigation.CatchingFishReduxKtor = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Unsafe unsafe = CatchingFishAnimationMockk;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.CatchingFishOkHttp.getClass();
                                    ((CatchingFishMockkAppCompat) object).CatchingFishReduxKtor = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (CatchingFishRoomDatabase(iArr[i], i, obj)) {
                        CatchingFishOkHttp(i).CatchingFishReduxKtor(CatchingFishAnimationMockk.getObject(obj, j));
                    }
                }
                if (CatchingFishUnitTesting(i, obj)) {
                    CatchingFishOkHttp(i).CatchingFishReduxKtor(CatchingFishAnimationMockk.getObject(obj, j));
                }
            }
            this.CatchingFishEspressoTesting.getClass();
            CatchingFishToastDaggerHilt catchingFishToastDaggerHilt = ((CatchingFishJUnitSharedFlow) obj).unknownFields;
            if (catchingFishToastDaggerHilt.CatchingFishDaggerWebsocket) {
                catchingFishToastDaggerHilt.CatchingFishDaggerWebsocket = false;
            }
        }
    }

    public final boolean CatchingFishRoomDatabase(int i, int i2, Object obj) {
        return CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager((long) (this.CatchingFishParcelableFAB[i2 + 2] & 1048575), obj) == i;
    }

    public final void CatchingFishSensorManager(Object obj, int i, CatchingFishGlideWebsocket catchingFishGlideWebsocket) {
        CatchingFishAnimationMockk.putObject(obj, CatchingFishCameraXIntent(i) & 1048575, catchingFishGlideWebsocket);
        CatchingFishJobScheduler(i, obj);
    }

    @Override // kotlin.text.CatchingFishRoomHilt
    public final int CatchingFishSnackbar(CatchingFishJUnitSharedFlow catchingFishJUnitSharedFlow) {
        int i;
        int CatchingFishReduxMoshi;
        int CatchingFishReduxMoshi2;
        int CatchingFishReduxMoshi3;
        int CatchingFishFirebase;
        int CatchingFishReduxMoshi4;
        int CatchingFishFirebase2;
        int CatchingFishReduxMoshi5;
        int CatchingFishReduxMoshi6;
        int CatchingFishDaggerMVVM;
        int CatchingFishReduxMoshi7;
        int CatchingFishParcelableFAB;
        int CatchingFishCoroutine;
        int CatchingFishReduxMoshi8;
        int size;
        int CatchingFishLayout;
        int CatchingFishReduxMoshi9;
        int CatchingFishReduxMoshi10;
        int size2;
        int CatchingFishReduxMoshi11;
        int CatchingFishPicasso;
        int i2;
        int i3;
        int CatchingFishReduxMoshi12;
        int CatchingFishPicasso2;
        CatchingFishWorkManagerKtor catchingFishWorkManagerKtor = this;
        CatchingFishJUnitSharedFlow catchingFishJUnitSharedFlow2 = catchingFishJUnitSharedFlow;
        Unsafe unsafe = CatchingFishAnimationMockk;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr = catchingFishWorkManagerKtor.CatchingFishParcelableFAB;
            if (i5 >= iArr.length) {
                catchingFishWorkManagerKtor.CatchingFishEspressoTesting.getClass();
                return catchingFishJUnitSharedFlow2.unknownFields.CatchingFishSnackbar() + i7;
            }
            int CatchingFishCameraXIntent = catchingFishWorkManagerKtor.CatchingFishCameraXIntent(i5);
            int CatchingFishDagger = CatchingFishDagger(CatchingFishCameraXIntent);
            int i8 = iArr[i5];
            int i9 = iArr[i5 + 2];
            int i10 = i9 & 1048575;
            if (CatchingFishDagger <= 17) {
                if (i10 != i4) {
                    i6 = i10 == 1048575 ? 0 : unsafe.getInt(catchingFishJUnitSharedFlow2, i10);
                    i4 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = CatchingFishCameraXIntent & 1048575;
            if (CatchingFishDagger >= CatchingFishKtorService.CatchingFishDaggerWebsocket.CatchingFishReduxKtor) {
                int i11 = CatchingFishKtorService.CatchingFishWorkManager.CatchingFishReduxKtor;
            }
            switch (CatchingFishDagger) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(catchingFishJUnitSharedFlow2, i5, i4, i6, i)) {
                        CatchingFishReduxMoshi = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishCoroutine = CatchingFishReduxMoshi + 8;
                        i7 += CatchingFishCoroutine;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(catchingFishJUnitSharedFlow2, i5, i4, i6, i)) {
                        CatchingFishReduxMoshi2 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishReduxMoshi6 = CatchingFishReduxMoshi2 + 4;
                        i7 += CatchingFishReduxMoshi6;
                    }
                    catchingFishWorkManagerKtor = this;
                    catchingFishJUnitSharedFlow2 = catchingFishJUnitSharedFlow;
                    break;
                case 2:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(catchingFishJUnitSharedFlow2, i5, i4, i6, i)) {
                        long j2 = unsafe.getLong(catchingFishJUnitSharedFlow2, j);
                        CatchingFishReduxMoshi3 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishFirebase = CatchingFishViewSnackbar.CatchingFishFirebase(j2);
                        i7 += CatchingFishFirebase + CatchingFishReduxMoshi3;
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case 3:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(catchingFishJUnitSharedFlow2, i5, i4, i6, i)) {
                        long j3 = unsafe.getLong(catchingFishJUnitSharedFlow2, j);
                        CatchingFishReduxMoshi3 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishFirebase = CatchingFishViewSnackbar.CatchingFishFirebase(j3);
                        i7 += CatchingFishFirebase + CatchingFishReduxMoshi3;
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case 4:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(catchingFishJUnitSharedFlow2, i5, i4, i6, i)) {
                        int i12 = unsafe.getInt(catchingFishJUnitSharedFlow2, j);
                        CatchingFishReduxMoshi4 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishFirebase2 = CatchingFishViewSnackbar.CatchingFishFirebase(i12);
                        CatchingFishDaggerMVVM = CatchingFishFirebase2 + CatchingFishReduxMoshi4;
                        i7 += CatchingFishDaggerMVVM;
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(catchingFishJUnitSharedFlow2, i5, i4, i6, i)) {
                        CatchingFishReduxMoshi5 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishReduxMoshi6 = CatchingFishReduxMoshi5 + 8;
                        i7 += CatchingFishReduxMoshi6;
                    }
                    catchingFishWorkManagerKtor = this;
                    catchingFishJUnitSharedFlow2 = catchingFishJUnitSharedFlow;
                    break;
                case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(catchingFishJUnitSharedFlow2, i5, i4, i6, i)) {
                        CatchingFishReduxMoshi2 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishReduxMoshi6 = CatchingFishReduxMoshi2 + 4;
                        i7 += CatchingFishReduxMoshi6;
                    }
                    catchingFishWorkManagerKtor = this;
                    catchingFishJUnitSharedFlow2 = catchingFishJUnitSharedFlow;
                    break;
                case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(catchingFishJUnitSharedFlow2, i5, i4, i6, i)) {
                        CatchingFishReduxMoshi6 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8) + 1;
                        i7 += CatchingFishReduxMoshi6;
                    }
                    catchingFishWorkManagerKtor = this;
                    catchingFishJUnitSharedFlow2 = catchingFishJUnitSharedFlow;
                    break;
                case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(catchingFishJUnitSharedFlow2, i5, i4, i6, i)) {
                        Object object = unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                        i7 = (object instanceof CatchingFishCameraXRealm ? CatchingFishViewSnackbar.CatchingFishDaggerMVVM(i8, (CatchingFishCameraXRealm) object) : CatchingFishViewSnackbar.CatchingFishMockkOkHttp((String) object) + CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8)) + i7;
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case 9:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(catchingFishJUnitSharedFlow2, i5, i4, i6, i)) {
                        Object object2 = unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                        CatchingFishRoomHilt CatchingFishOkHttp = catchingFishWorkManagerKtor.CatchingFishOkHttp(i5);
                        Class cls = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                        int CatchingFishReduxMoshi13 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        int CatchingFishParcelableFAB2 = ((CatchingFishGlideWebsocket) object2).CatchingFishParcelableFAB(CatchingFishOkHttp);
                        i7 += CatchingFishViewSnackbar.CatchingFishPicasso(CatchingFishParcelableFAB2) + CatchingFishParcelableFAB2 + CatchingFishReduxMoshi13;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(catchingFishJUnitSharedFlow2, i5, i4, i6, i)) {
                        CatchingFishDaggerMVVM = CatchingFishViewSnackbar.CatchingFishDaggerMVVM(i8, (CatchingFishCameraXRealm) unsafe.getObject(catchingFishJUnitSharedFlow2, j));
                        i7 += CatchingFishDaggerMVVM;
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case 11:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(catchingFishJUnitSharedFlow2, i5, i4, i6, i)) {
                        int i13 = unsafe.getInt(catchingFishJUnitSharedFlow2, j);
                        CatchingFishReduxMoshi4 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishFirebase2 = CatchingFishViewSnackbar.CatchingFishPicasso(i13);
                        CatchingFishDaggerMVVM = CatchingFishFirebase2 + CatchingFishReduxMoshi4;
                        i7 += CatchingFishDaggerMVVM;
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case 12:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(catchingFishJUnitSharedFlow2, i5, i4, i6, i)) {
                        int i14 = unsafe.getInt(catchingFishJUnitSharedFlow2, j);
                        CatchingFishReduxMoshi4 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishFirebase2 = CatchingFishViewSnackbar.CatchingFishFirebase(i14);
                        CatchingFishDaggerMVVM = CatchingFishFirebase2 + CatchingFishReduxMoshi4;
                        i7 += CatchingFishDaggerMVVM;
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case 13:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(catchingFishJUnitSharedFlow2, i5, i4, i6, i)) {
                        CatchingFishReduxMoshi2 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishReduxMoshi6 = CatchingFishReduxMoshi2 + 4;
                        i7 += CatchingFishReduxMoshi6;
                    }
                    catchingFishWorkManagerKtor = this;
                    catchingFishJUnitSharedFlow2 = catchingFishJUnitSharedFlow;
                    break;
                case 14:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(catchingFishJUnitSharedFlow2, i5, i4, i6, i)) {
                        CatchingFishReduxMoshi5 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishReduxMoshi6 = CatchingFishReduxMoshi5 + 8;
                        i7 += CatchingFishReduxMoshi6;
                    }
                    catchingFishWorkManagerKtor = this;
                    catchingFishJUnitSharedFlow2 = catchingFishJUnitSharedFlow;
                    break;
                case 15:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(catchingFishJUnitSharedFlow2, i5, i4, i6, i)) {
                        int i15 = unsafe.getInt(catchingFishJUnitSharedFlow2, j);
                        CatchingFishReduxMoshi4 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishFirebase2 = CatchingFishViewSnackbar.CatchingFishPicasso((i15 >> 31) ^ (i15 << 1));
                        CatchingFishDaggerMVVM = CatchingFishFirebase2 + CatchingFishReduxMoshi4;
                        i7 += CatchingFishDaggerMVVM;
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case 16:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(catchingFishJUnitSharedFlow2, i5, i4, i6, i)) {
                        long j4 = unsafe.getLong(catchingFishJUnitSharedFlow2, j);
                        CatchingFishReduxMoshi3 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishFirebase = CatchingFishViewSnackbar.CatchingFishFirebase((j4 << 1) ^ (j4 >> 63));
                        i7 += CatchingFishFirebase + CatchingFishReduxMoshi3;
                    }
                    catchingFishWorkManagerKtor = this;
                    break;
                case 17:
                    if (catchingFishWorkManagerKtor.CatchingFishAnimationMockk(catchingFishJUnitSharedFlow2, i5, i4, i6, i)) {
                        CatchingFishGlideWebsocket catchingFishGlideWebsocket = (CatchingFishGlideWebsocket) unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                        CatchingFishRoomHilt CatchingFishOkHttp2 = catchingFishWorkManagerKtor.CatchingFishOkHttp(i5);
                        CatchingFishReduxMoshi7 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8) * 2;
                        CatchingFishParcelableFAB = catchingFishGlideWebsocket.CatchingFishParcelableFAB(CatchingFishOkHttp2);
                        CatchingFishCoroutine = CatchingFishParcelableFAB + CatchingFishReduxMoshi7;
                        i7 += CatchingFishCoroutine;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    CatchingFishCoroutine = CatchingFishCameraXLayout.CatchingFishCoroutine(i8, (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j));
                    i7 += CatchingFishCoroutine;
                    break;
                case 19:
                    CatchingFishCoroutine = CatchingFishCameraXLayout.CatchingFishSnackbar(i8, (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j));
                    i7 += CatchingFishCoroutine;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                    Class cls2 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    if (list.size() != 0) {
                        CatchingFishReduxMoshi8 = (CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8) * list.size()) + CatchingFishCameraXLayout.CatchingFishDaggerWebsocket(list);
                        i7 += CatchingFishReduxMoshi8;
                        break;
                    }
                    CatchingFishReduxMoshi8 = 0;
                    i7 += CatchingFishReduxMoshi8;
                case 21:
                    List list2 = (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                    Class cls3 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    size = list2.size();
                    if (size != 0) {
                        CatchingFishLayout = CatchingFishCameraXLayout.CatchingFishLayout(list2);
                        CatchingFishReduxMoshi9 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishReduxMoshi8 = (CatchingFishReduxMoshi9 * size) + CatchingFishLayout;
                        i7 += CatchingFishReduxMoshi8;
                        break;
                    }
                    CatchingFishReduxMoshi8 = 0;
                    i7 += CatchingFishReduxMoshi8;
                case 22:
                    List list3 = (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                    Class cls4 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    size = list3.size();
                    if (size != 0) {
                        CatchingFishLayout = CatchingFishCameraXLayout.CatchingFishReduxKtor(list3);
                        CatchingFishReduxMoshi9 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishReduxMoshi8 = (CatchingFishReduxMoshi9 * size) + CatchingFishLayout;
                        i7 += CatchingFishReduxMoshi8;
                        break;
                    }
                    CatchingFishReduxMoshi8 = 0;
                    i7 += CatchingFishReduxMoshi8;
                case 23:
                    CatchingFishCoroutine = CatchingFishCameraXLayout.CatchingFishCoroutine(i8, (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j));
                    i7 += CatchingFishCoroutine;
                    break;
                case 24:
                    CatchingFishCoroutine = CatchingFishCameraXLayout.CatchingFishSnackbar(i8, (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j));
                    i7 += CatchingFishCoroutine;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                    Class cls5 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    int size3 = list4.size();
                    i7 += size3 == 0 ? 0 : (CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                    Class cls6 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        CatchingFishReduxMoshi8 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8) * size4;
                        for (int i16 = 0; i16 < size4; i16++) {
                            Object obj = list5.get(i16);
                            if (obj instanceof CatchingFishCameraXRealm) {
                                int size5 = ((CatchingFishCameraXRealm) obj).size();
                                CatchingFishReduxMoshi8 = CatchingFishViewSnackbar.CatchingFishPicasso(size5) + size5 + CatchingFishReduxMoshi8;
                            } else {
                                CatchingFishReduxMoshi8 = CatchingFishViewSnackbar.CatchingFishMockkOkHttp((String) obj) + CatchingFishReduxMoshi8;
                            }
                        }
                        i7 += CatchingFishReduxMoshi8;
                        break;
                    }
                    CatchingFishReduxMoshi8 = 0;
                    i7 += CatchingFishReduxMoshi8;
                case 27:
                    List list6 = (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                    CatchingFishRoomHilt CatchingFishOkHttp3 = catchingFishWorkManagerKtor.CatchingFishOkHttp(i5);
                    Class cls7 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    int size6 = list6.size();
                    if (size6 != 0) {
                        CatchingFishReduxMoshi10 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8) * size6;
                        for (int i17 = 0; i17 < size6; i17++) {
                            int CatchingFishParcelableFAB3 = ((CatchingFishGlideWebsocket) list6.get(i17)).CatchingFishParcelableFAB(CatchingFishOkHttp3);
                            CatchingFishReduxMoshi10 += CatchingFishViewSnackbar.CatchingFishPicasso(CatchingFishParcelableFAB3) + CatchingFishParcelableFAB3;
                        }
                        i7 += CatchingFishReduxMoshi10;
                        break;
                    }
                    CatchingFishReduxMoshi10 = 0;
                    i7 += CatchingFishReduxMoshi10;
                case 28:
                    List list7 = (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                    Class cls8 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        CatchingFishReduxMoshi8 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8) * size7;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int size8 = ((CatchingFishCameraXRealm) list7.get(i18)).size();
                            CatchingFishReduxMoshi8 += CatchingFishViewSnackbar.CatchingFishPicasso(size8) + size8;
                        }
                        i7 += CatchingFishReduxMoshi8;
                        break;
                    }
                    CatchingFishReduxMoshi8 = 0;
                    i7 += CatchingFishReduxMoshi8;
                case 29:
                    List list8 = (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                    Class cls9 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    size = list8.size();
                    if (size != 0) {
                        CatchingFishLayout = CatchingFishCameraXLayout.CatchingFishViewModelFAB(list8);
                        CatchingFishReduxMoshi9 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishReduxMoshi8 = (CatchingFishReduxMoshi9 * size) + CatchingFishLayout;
                        i7 += CatchingFishReduxMoshi8;
                        break;
                    }
                    CatchingFishReduxMoshi8 = 0;
                    i7 += CatchingFishReduxMoshi8;
                case 30:
                    List list9 = (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                    Class cls10 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    size = list9.size();
                    if (size != 0) {
                        CatchingFishLayout = CatchingFishCameraXLayout.CatchingFishParcelableFAB(list9);
                        CatchingFishReduxMoshi9 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishReduxMoshi8 = (CatchingFishReduxMoshi9 * size) + CatchingFishLayout;
                        i7 += CatchingFishReduxMoshi8;
                        break;
                    }
                    CatchingFishReduxMoshi8 = 0;
                    i7 += CatchingFishReduxMoshi8;
                case 31:
                    CatchingFishCoroutine = CatchingFishCameraXLayout.CatchingFishSnackbar(i8, (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j));
                    i7 += CatchingFishCoroutine;
                    break;
                case 32:
                    CatchingFishCoroutine = CatchingFishCameraXLayout.CatchingFishCoroutine(i8, (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j));
                    i7 += CatchingFishCoroutine;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                    Class cls11 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    size = list10.size();
                    if (size != 0) {
                        CatchingFishLayout = CatchingFishCameraXLayout.CatchingFishWorkManager(list10);
                        CatchingFishReduxMoshi9 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishReduxMoshi8 = (CatchingFishReduxMoshi9 * size) + CatchingFishLayout;
                        i7 += CatchingFishReduxMoshi8;
                        break;
                    }
                    CatchingFishReduxMoshi8 = 0;
                    i7 += CatchingFishReduxMoshi8;
                case 34:
                    List list11 = (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                    Class cls12 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    size = list11.size();
                    if (size != 0) {
                        CatchingFishLayout = CatchingFishCameraXLayout.CatchingFishViewModelScope(list11);
                        CatchingFishReduxMoshi9 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishReduxMoshi8 = (CatchingFishReduxMoshi9 * size) + CatchingFishLayout;
                        i7 += CatchingFishReduxMoshi8;
                        break;
                    }
                    CatchingFishReduxMoshi8 = 0;
                    i7 += CatchingFishReduxMoshi8;
                case 35:
                    List list12 = (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                    Class cls13 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        CatchingFishReduxMoshi11 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishPicasso = CatchingFishViewSnackbar.CatchingFishPicasso(size2);
                        i2 = CatchingFishPicasso + CatchingFishReduxMoshi11;
                        CatchingFishPicasso2 = i2 + size2;
                        i7 += CatchingFishPicasso2;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                    Class cls14 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        CatchingFishReduxMoshi11 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishPicasso = CatchingFishViewSnackbar.CatchingFishPicasso(size2);
                        i2 = CatchingFishPicasso + CatchingFishReduxMoshi11;
                        CatchingFishPicasso2 = i2 + size2;
                        i7 += CatchingFishPicasso2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = CatchingFishCameraXLayout.CatchingFishDaggerWebsocket((List) unsafe.getObject(catchingFishJUnitSharedFlow2, j));
                    if (size2 > 0) {
                        CatchingFishReduxMoshi11 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishPicasso = CatchingFishViewSnackbar.CatchingFishPicasso(size2);
                        i2 = CatchingFishPicasso + CatchingFishReduxMoshi11;
                        CatchingFishPicasso2 = i2 + size2;
                        i7 += CatchingFishPicasso2;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = CatchingFishCameraXLayout.CatchingFishLayout((List) unsafe.getObject(catchingFishJUnitSharedFlow2, j));
                    if (size2 > 0) {
                        CatchingFishReduxMoshi11 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishPicasso = CatchingFishViewSnackbar.CatchingFishPicasso(size2);
                        i2 = CatchingFishPicasso + CatchingFishReduxMoshi11;
                        CatchingFishPicasso2 = i2 + size2;
                        i7 += CatchingFishPicasso2;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = CatchingFishCameraXLayout.CatchingFishReduxKtor((List) unsafe.getObject(catchingFishJUnitSharedFlow2, j));
                    if (size2 > 0) {
                        CatchingFishReduxMoshi11 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishPicasso = CatchingFishViewSnackbar.CatchingFishPicasso(size2);
                        i2 = CatchingFishPicasso + CatchingFishReduxMoshi11;
                        CatchingFishPicasso2 = i2 + size2;
                        i7 += CatchingFishPicasso2;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                    Class cls15 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        CatchingFishReduxMoshi11 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishPicasso = CatchingFishViewSnackbar.CatchingFishPicasso(size2);
                        i2 = CatchingFishPicasso + CatchingFishReduxMoshi11;
                        CatchingFishPicasso2 = i2 + size2;
                        i7 += CatchingFishPicasso2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                    Class cls16 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        CatchingFishReduxMoshi11 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishPicasso = CatchingFishViewSnackbar.CatchingFishPicasso(size2);
                        i2 = CatchingFishPicasso + CatchingFishReduxMoshi11;
                        CatchingFishPicasso2 = i2 + size2;
                        i7 += CatchingFishPicasso2;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                    Class cls17 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    size2 = list16.size();
                    if (size2 > 0) {
                        CatchingFishReduxMoshi11 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishPicasso = CatchingFishViewSnackbar.CatchingFishPicasso(size2);
                        i2 = CatchingFishPicasso + CatchingFishReduxMoshi11;
                        CatchingFishPicasso2 = i2 + size2;
                        i7 += CatchingFishPicasso2;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = CatchingFishCameraXLayout.CatchingFishViewModelFAB((List) unsafe.getObject(catchingFishJUnitSharedFlow2, j));
                    if (size2 > 0) {
                        CatchingFishReduxMoshi11 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishPicasso = CatchingFishViewSnackbar.CatchingFishPicasso(size2);
                        i2 = CatchingFishPicasso + CatchingFishReduxMoshi11;
                        CatchingFishPicasso2 = i2 + size2;
                        i7 += CatchingFishPicasso2;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = CatchingFishCameraXLayout.CatchingFishParcelableFAB((List) unsafe.getObject(catchingFishJUnitSharedFlow2, j));
                    if (size2 > 0) {
                        CatchingFishReduxMoshi11 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishPicasso = CatchingFishViewSnackbar.CatchingFishPicasso(size2);
                        i2 = CatchingFishPicasso + CatchingFishReduxMoshi11;
                        CatchingFishPicasso2 = i2 + size2;
                        i7 += CatchingFishPicasso2;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                    Class cls18 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        CatchingFishReduxMoshi11 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishPicasso = CatchingFishViewSnackbar.CatchingFishPicasso(size2);
                        i2 = CatchingFishPicasso + CatchingFishReduxMoshi11;
                        CatchingFishPicasso2 = i2 + size2;
                        i7 += CatchingFishPicasso2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                    Class cls19 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        CatchingFishReduxMoshi11 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishPicasso = CatchingFishViewSnackbar.CatchingFishPicasso(size2);
                        i2 = CatchingFishPicasso + CatchingFishReduxMoshi11;
                        CatchingFishPicasso2 = i2 + size2;
                        i7 += CatchingFishPicasso2;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = CatchingFishCameraXLayout.CatchingFishWorkManager((List) unsafe.getObject(catchingFishJUnitSharedFlow2, j));
                    if (size2 > 0) {
                        CatchingFishReduxMoshi11 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishPicasso = CatchingFishViewSnackbar.CatchingFishPicasso(size2);
                        i2 = CatchingFishPicasso + CatchingFishReduxMoshi11;
                        CatchingFishPicasso2 = i2 + size2;
                        i7 += CatchingFishPicasso2;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = CatchingFishCameraXLayout.CatchingFishViewModelScope((List) unsafe.getObject(catchingFishJUnitSharedFlow2, j));
                    if (size2 > 0) {
                        CatchingFishReduxMoshi11 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishPicasso = CatchingFishViewSnackbar.CatchingFishPicasso(size2);
                        i2 = CatchingFishPicasso + CatchingFishReduxMoshi11;
                        CatchingFishPicasso2 = i2 + size2;
                        i7 += CatchingFishPicasso2;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                    CatchingFishRoomHilt CatchingFishOkHttp4 = catchingFishWorkManagerKtor.CatchingFishOkHttp(i5);
                    Class cls20 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i19 = 0; i19 < size9; i19++) {
                            i3 += ((CatchingFishGlideWebsocket) list19.get(i19)).CatchingFishParcelableFAB(CatchingFishOkHttp4) + (CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8) * 2);
                        }
                    }
                    i7 += i3;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                    Object obj2 = catchingFishWorkManagerKtor.CatchingFishSnackbar[(i5 / 3) * 2];
                    catchingFishWorkManagerKtor.CatchingFishOkHttp.getClass();
                    CatchingFishMockkAppCompat catchingFishMockkAppCompat = (CatchingFishMockkAppCompat) object3;
                    CatchingFishDaggerSpannable catchingFishDaggerSpannable = (CatchingFishDaggerSpannable) obj2;
                    if (!catchingFishMockkAppCompat.isEmpty()) {
                        CatchingFishReduxMoshi10 = 0;
                        for (Map.Entry entry : catchingFishMockkAppCompat.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            catchingFishDaggerSpannable.getClass();
                            int CatchingFishReduxMoshi14 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                            int CatchingFishParcelableFAB4 = CatchingFishDaggerSpannable.CatchingFishParcelableFAB(catchingFishDaggerSpannable.CatchingFishParcelableFAB, key, value);
                            CatchingFishReduxMoshi10 += CatchingFishViewSnackbar.CatchingFishPicasso(CatchingFishParcelableFAB4) + CatchingFishParcelableFAB4 + CatchingFishReduxMoshi14;
                        }
                        i7 += CatchingFishReduxMoshi10;
                        break;
                    }
                    CatchingFishReduxMoshi10 = 0;
                    i7 += CatchingFishReduxMoshi10;
                case 51:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i8, i5, catchingFishJUnitSharedFlow2)) {
                        CatchingFishReduxMoshi = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishCoroutine = CatchingFishReduxMoshi + 8;
                        i7 += CatchingFishCoroutine;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i8, i5, catchingFishJUnitSharedFlow2)) {
                        CatchingFishReduxMoshi12 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishCoroutine = CatchingFishReduxMoshi12 + 4;
                        i7 += CatchingFishCoroutine;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i8, i5, catchingFishJUnitSharedFlow2)) {
                        long CatchingFishCardViewRealm = CatchingFishCardViewRealm(j, catchingFishJUnitSharedFlow2);
                        size2 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        i2 = CatchingFishViewSnackbar.CatchingFishFirebase(CatchingFishCardViewRealm);
                        CatchingFishPicasso2 = i2 + size2;
                        i7 += CatchingFishPicasso2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i8, i5, catchingFishJUnitSharedFlow2)) {
                        long CatchingFishCardViewRealm2 = CatchingFishCardViewRealm(j, catchingFishJUnitSharedFlow2);
                        size2 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        i2 = CatchingFishViewSnackbar.CatchingFishFirebase(CatchingFishCardViewRealm2);
                        CatchingFishPicasso2 = i2 + size2;
                        i7 += CatchingFishPicasso2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i8, i5, catchingFishJUnitSharedFlow2)) {
                        int CatchingFishGsonAppCompat = CatchingFishGsonAppCompat(j, catchingFishJUnitSharedFlow2);
                        CatchingFishReduxMoshi7 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishParcelableFAB = CatchingFishViewSnackbar.CatchingFishFirebase(CatchingFishGsonAppCompat);
                        CatchingFishCoroutine = CatchingFishParcelableFAB + CatchingFishReduxMoshi7;
                        i7 += CatchingFishCoroutine;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i8, i5, catchingFishJUnitSharedFlow2)) {
                        CatchingFishReduxMoshi = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishCoroutine = CatchingFishReduxMoshi + 8;
                        i7 += CatchingFishCoroutine;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i8, i5, catchingFishJUnitSharedFlow2)) {
                        CatchingFishReduxMoshi12 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishCoroutine = CatchingFishReduxMoshi12 + 4;
                        i7 += CatchingFishCoroutine;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i8, i5, catchingFishJUnitSharedFlow2)) {
                        CatchingFishCoroutine = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8) + 1;
                        i7 += CatchingFishCoroutine;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i8, i5, catchingFishJUnitSharedFlow2)) {
                        Object object4 = unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                        i7 = (object4 instanceof CatchingFishCameraXRealm ? CatchingFishViewSnackbar.CatchingFishDaggerMVVM(i8, (CatchingFishCameraXRealm) object4) : CatchingFishViewSnackbar.CatchingFishMockkOkHttp((String) object4) + CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8)) + i7;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i8, i5, catchingFishJUnitSharedFlow2)) {
                        Object object5 = unsafe.getObject(catchingFishJUnitSharedFlow2, j);
                        CatchingFishRoomHilt CatchingFishOkHttp5 = catchingFishWorkManagerKtor.CatchingFishOkHttp(i5);
                        Class cls21 = CatchingFishCameraXLayout.CatchingFishParcelableFAB;
                        int CatchingFishReduxMoshi15 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        int CatchingFishParcelableFAB5 = ((CatchingFishGlideWebsocket) object5).CatchingFishParcelableFAB(CatchingFishOkHttp5);
                        CatchingFishPicasso2 = CatchingFishViewSnackbar.CatchingFishPicasso(CatchingFishParcelableFAB5) + CatchingFishParcelableFAB5 + CatchingFishReduxMoshi15;
                        i7 += CatchingFishPicasso2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i8, i5, catchingFishJUnitSharedFlow2)) {
                        CatchingFishCoroutine = CatchingFishViewSnackbar.CatchingFishDaggerMVVM(i8, (CatchingFishCameraXRealm) unsafe.getObject(catchingFishJUnitSharedFlow2, j));
                        i7 += CatchingFishCoroutine;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i8, i5, catchingFishJUnitSharedFlow2)) {
                        int CatchingFishGsonAppCompat2 = CatchingFishGsonAppCompat(j, catchingFishJUnitSharedFlow2);
                        CatchingFishReduxMoshi7 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishParcelableFAB = CatchingFishViewSnackbar.CatchingFishPicasso(CatchingFishGsonAppCompat2);
                        CatchingFishCoroutine = CatchingFishParcelableFAB + CatchingFishReduxMoshi7;
                        i7 += CatchingFishCoroutine;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i8, i5, catchingFishJUnitSharedFlow2)) {
                        int CatchingFishGsonAppCompat3 = CatchingFishGsonAppCompat(j, catchingFishJUnitSharedFlow2);
                        CatchingFishReduxMoshi7 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishParcelableFAB = CatchingFishViewSnackbar.CatchingFishFirebase(CatchingFishGsonAppCompat3);
                        CatchingFishCoroutine = CatchingFishParcelableFAB + CatchingFishReduxMoshi7;
                        i7 += CatchingFishCoroutine;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i8, i5, catchingFishJUnitSharedFlow2)) {
                        CatchingFishReduxMoshi12 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishCoroutine = CatchingFishReduxMoshi12 + 4;
                        i7 += CatchingFishCoroutine;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i8, i5, catchingFishJUnitSharedFlow2)) {
                        CatchingFishReduxMoshi = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishCoroutine = CatchingFishReduxMoshi + 8;
                        i7 += CatchingFishCoroutine;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i8, i5, catchingFishJUnitSharedFlow2)) {
                        int CatchingFishGsonAppCompat4 = CatchingFishGsonAppCompat(j, catchingFishJUnitSharedFlow2);
                        CatchingFishReduxMoshi7 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        CatchingFishParcelableFAB = CatchingFishViewSnackbar.CatchingFishPicasso((CatchingFishGsonAppCompat4 >> 31) ^ (CatchingFishGsonAppCompat4 << 1));
                        CatchingFishCoroutine = CatchingFishParcelableFAB + CatchingFishReduxMoshi7;
                        i7 += CatchingFishCoroutine;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i8, i5, catchingFishJUnitSharedFlow2)) {
                        long CatchingFishCardViewRealm3 = CatchingFishCardViewRealm(j, catchingFishJUnitSharedFlow2);
                        size2 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8);
                        i2 = CatchingFishViewSnackbar.CatchingFishFirebase((CatchingFishCardViewRealm3 << 1) ^ (CatchingFishCardViewRealm3 >> 63));
                        CatchingFishPicasso2 = i2 + size2;
                        i7 += CatchingFishPicasso2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (catchingFishWorkManagerKtor.CatchingFishRoomDatabase(i8, i5, catchingFishJUnitSharedFlow2)) {
                        CatchingFishCoroutine = ((CatchingFishGlideWebsocket) unsafe.getObject(catchingFishJUnitSharedFlow2, j)).CatchingFishParcelableFAB(catchingFishWorkManagerKtor.CatchingFishOkHttp(i5)) + (CatchingFishViewSnackbar.CatchingFishReduxMoshi(i8) * 2);
                        i7 += CatchingFishCoroutine;
                        break;
                    } else {
                        break;
                    }
            }
            i5 += 3;
        }
    }

    public final boolean CatchingFishUnitTesting(int i, Object obj) {
        int i2 = this.CatchingFishParcelableFAB[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int CatchingFishCameraXIntent = CatchingFishCameraXIntent(i);
            long j2 = CatchingFishCameraXIntent & 1048575;
            switch (CatchingFishDagger(CatchingFishCameraXIntent)) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (Double.doubleToRawLongBits(CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishReduxKtor(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishDaggerWebsocket(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelScope(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelScope(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                    if (CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelScope(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                    return CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishCoroutine(j2, obj);
                case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                    Object CatchingFishViewModelFAB = CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j2, obj);
                    if (CatchingFishViewModelFAB instanceof String) {
                        return !((String) CatchingFishViewModelFAB).isEmpty();
                    }
                    if (CatchingFishViewModelFAB instanceof CatchingFishCameraXRealm) {
                        return !CatchingFishCameraXRealm.CatchingFishWorkManager.equals(CatchingFishViewModelFAB);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !CatchingFishCameraXRealm.CatchingFishWorkManager.equals(CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j2, obj));
                case 11:
                    if (CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelScope(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelScope(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishWorkManager(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (kotlin.text.CatchingFishCameraXLayout.CatchingFishEspressoTesting(r5.CatchingFishViewModelFAB(r7, r12), r5.CatchingFishViewModelFAB(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.CatchingFishViewModelScope(r7, r12) == r5.CatchingFishViewModelScope(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.CatchingFishWorkManager(r7, r12) == r5.CatchingFishWorkManager(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.CatchingFishViewModelScope(r7, r12) == r5.CatchingFishViewModelScope(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.CatchingFishWorkManager(r7, r12) == r5.CatchingFishWorkManager(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.CatchingFishWorkManager(r7, r12) == r5.CatchingFishWorkManager(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.CatchingFishWorkManager(r7, r12) == r5.CatchingFishWorkManager(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (kotlin.text.CatchingFishCameraXLayout.CatchingFishEspressoTesting(r5.CatchingFishViewModelFAB(r7, r12), r5.CatchingFishViewModelFAB(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (kotlin.text.CatchingFishCameraXLayout.CatchingFishEspressoTesting(r5.CatchingFishViewModelFAB(r7, r12), r5.CatchingFishViewModelFAB(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (kotlin.text.CatchingFishCameraXLayout.CatchingFishEspressoTesting(r5.CatchingFishViewModelFAB(r7, r12), r5.CatchingFishViewModelFAB(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.CatchingFishCoroutine(r7, r12) == r5.CatchingFishCoroutine(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.CatchingFishWorkManager(r7, r12) == r5.CatchingFishWorkManager(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.CatchingFishViewModelScope(r7, r12) == r5.CatchingFishViewModelScope(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.CatchingFishWorkManager(r7, r12) == r5.CatchingFishWorkManager(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.CatchingFishViewModelScope(r7, r12) == r5.CatchingFishViewModelScope(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.CatchingFishViewModelScope(r7, r12) == r5.CatchingFishViewModelScope(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.CatchingFishDaggerWebsocket(r7, r12)) == java.lang.Float.floatToIntBits(r5.CatchingFishDaggerWebsocket(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.CatchingFishReduxKtor(r7, r12)) == java.lang.Double.doubleToLongBits(r5.CatchingFishReduxKtor(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (kotlin.text.CatchingFishCameraXLayout.CatchingFishEspressoTesting(r9.CatchingFishViewModelFAB(r7, r12), r9.CatchingFishViewModelFAB(r7, r13)) != false) goto L105;
     */
    @Override // kotlin.text.CatchingFishRoomHilt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishViewModelFAB(CatchingFishJUnitSharedFlow catchingFishJUnitSharedFlow, CatchingFishJUnitSharedFlow catchingFishJUnitSharedFlow2) {
        int[] iArr = this.CatchingFishParcelableFAB;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int CatchingFishCameraXIntent = CatchingFishCameraXIntent(i);
                long j = CatchingFishCameraXIntent & 1048575;
                switch (CatchingFishDagger(CatchingFishCameraXIntent)) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        if (CatchingFishFragmentHandler(catchingFishJUnitSharedFlow, catchingFishJUnitSharedFlow2, i)) {
                            CatchingFishJUnitRealm catchingFishJUnitRealm = CatchingFishGradleViewModel.CatchingFishCoroutine;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (CatchingFishFragmentHandler(catchingFishJUnitSharedFlow, catchingFishJUnitSharedFlow2, i)) {
                            CatchingFishJUnitRealm catchingFishJUnitRealm2 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (CatchingFishFragmentHandler(catchingFishJUnitSharedFlow, catchingFishJUnitSharedFlow2, i)) {
                            CatchingFishJUnitRealm catchingFishJUnitRealm3 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (CatchingFishFragmentHandler(catchingFishJUnitSharedFlow, catchingFishJUnitSharedFlow2, i)) {
                            CatchingFishJUnitRealm catchingFishJUnitRealm4 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (CatchingFishFragmentHandler(catchingFishJUnitSharedFlow, catchingFishJUnitSharedFlow2, i)) {
                            CatchingFishJUnitRealm catchingFishJUnitRealm5 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                            break;
                        }
                        z = false;
                        break;
                    case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                        if (CatchingFishFragmentHandler(catchingFishJUnitSharedFlow, catchingFishJUnitSharedFlow2, i)) {
                            CatchingFishJUnitRealm catchingFishJUnitRealm6 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                            break;
                        }
                        z = false;
                        break;
                    case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (CatchingFishFragmentHandler(catchingFishJUnitSharedFlow, catchingFishJUnitSharedFlow2, i)) {
                            CatchingFishJUnitRealm catchingFishJUnitRealm7 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                            break;
                        }
                        z = false;
                        break;
                    case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (CatchingFishFragmentHandler(catchingFishJUnitSharedFlow, catchingFishJUnitSharedFlow2, i)) {
                            CatchingFishJUnitRealm catchingFishJUnitRealm8 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                            break;
                        }
                        z = false;
                        break;
                    case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                        if (CatchingFishFragmentHandler(catchingFishJUnitSharedFlow, catchingFishJUnitSharedFlow2, i)) {
                            CatchingFishJUnitRealm catchingFishJUnitRealm9 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (CatchingFishFragmentHandler(catchingFishJUnitSharedFlow, catchingFishJUnitSharedFlow2, i)) {
                            CatchingFishJUnitRealm catchingFishJUnitRealm10 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (CatchingFishFragmentHandler(catchingFishJUnitSharedFlow, catchingFishJUnitSharedFlow2, i)) {
                            CatchingFishJUnitRealm catchingFishJUnitRealm11 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (CatchingFishFragmentHandler(catchingFishJUnitSharedFlow, catchingFishJUnitSharedFlow2, i)) {
                            CatchingFishJUnitRealm catchingFishJUnitRealm12 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (CatchingFishFragmentHandler(catchingFishJUnitSharedFlow, catchingFishJUnitSharedFlow2, i)) {
                            CatchingFishJUnitRealm catchingFishJUnitRealm13 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (CatchingFishFragmentHandler(catchingFishJUnitSharedFlow, catchingFishJUnitSharedFlow2, i)) {
                            CatchingFishJUnitRealm catchingFishJUnitRealm14 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (CatchingFishFragmentHandler(catchingFishJUnitSharedFlow, catchingFishJUnitSharedFlow2, i)) {
                            CatchingFishJUnitRealm catchingFishJUnitRealm15 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (CatchingFishFragmentHandler(catchingFishJUnitSharedFlow, catchingFishJUnitSharedFlow2, i)) {
                            CatchingFishJUnitRealm catchingFishJUnitRealm16 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (CatchingFishFragmentHandler(catchingFishJUnitSharedFlow, catchingFishJUnitSharedFlow2, i)) {
                            CatchingFishJUnitRealm catchingFishJUnitRealm17 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (CatchingFishFragmentHandler(catchingFishJUnitSharedFlow, catchingFishJUnitSharedFlow2, i)) {
                            CatchingFishJUnitRealm catchingFishJUnitRealm18 = CatchingFishGradleViewModel.CatchingFishCoroutine;
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
                        CatchingFishJUnitRealm catchingFishJUnitRealm19 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                        z = CatchingFishCameraXLayout.CatchingFishEspressoTesting(catchingFishJUnitRealm19.CatchingFishViewModelFAB(j, catchingFishJUnitSharedFlow), catchingFishJUnitRealm19.CatchingFishViewModelFAB(j, catchingFishJUnitSharedFlow2));
                        break;
                    case 50:
                        CatchingFishJUnitRealm catchingFishJUnitRealm20 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                        z = CatchingFishCameraXLayout.CatchingFishEspressoTesting(catchingFishJUnitRealm20.CatchingFishViewModelFAB(j, catchingFishJUnitSharedFlow), catchingFishJUnitRealm20.CatchingFishViewModelFAB(j, catchingFishJUnitSharedFlow2));
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
                        CatchingFishJUnitRealm catchingFishJUnitRealm21 = CatchingFishGradleViewModel.CatchingFishCoroutine;
                        if (catchingFishJUnitRealm21.CatchingFishWorkManager(j2, catchingFishJUnitSharedFlow) == catchingFishJUnitRealm21.CatchingFishWorkManager(j2, catchingFishJUnitSharedFlow2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                this.CatchingFishEspressoTesting.getClass();
                if (catchingFishJUnitSharedFlow.unknownFields.equals(catchingFishJUnitSharedFlow2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // kotlin.text.CatchingFishRoomHilt
    public final void CatchingFishViewModelScope(java.lang.Object r19, kotlin.text.CatchingFishWidgetFAB r20, kotlin.text.CatchingFishPayPalBiometric r21) {
        /*
            Method dump skipped, instructions count: 1940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.CatchingFishWorkManagerKtor.CatchingFishViewModelScope(java.lang.Object, kotlin.text.CatchingFishWidgetFAB, kotlin.text.CatchingFishPayPalBiometric):void");
    }

    @Override // kotlin.text.CatchingFishRoomHilt
    public final boolean CatchingFishWorkManager(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.CatchingFishViewModelFAB) {
            int i7 = this.CatchingFishViewModelScope[i6];
            int[] iArr = this.CatchingFishParcelableFAB;
            int i8 = iArr[i7];
            int CatchingFishCameraXIntent = CatchingFishCameraXIntent(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = CatchingFishAnimationMockk.getInt(obj, i10);
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
            if ((268435456 & CatchingFishCameraXIntent) == 0 || CatchingFishAnimationMockk(obj, i2, i, i3, i11)) {
                int CatchingFishDagger = CatchingFishDagger(CatchingFishCameraXIntent);
                if (CatchingFishDagger == 9 || CatchingFishDagger == 17) {
                    if (CatchingFishAnimationMockk(obj, i2, i, i3, i11)) {
                        if (!CatchingFishOkHttp(i2).CatchingFishWorkManager(CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(CatchingFishCameraXIntent & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (CatchingFishDagger != 27) {
                        if (CatchingFishDagger == 60 || CatchingFishDagger == 68) {
                            if (CatchingFishRoomDatabase(i8, i2, obj)) {
                                if (!CatchingFishOkHttp(i2).CatchingFishWorkManager(CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(CatchingFishCameraXIntent & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        } else if (CatchingFishDagger != 49) {
                            if (CatchingFishDagger != 50) {
                                continue;
                            } else {
                                Object CatchingFishViewModelFAB = CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(CatchingFishCameraXIntent & 1048575, obj);
                                this.CatchingFishOkHttp.getClass();
                                CatchingFishMockkAppCompat catchingFishMockkAppCompat = (CatchingFishMockkAppCompat) CatchingFishViewModelFAB;
                                if (catchingFishMockkAppCompat.isEmpty()) {
                                    continue;
                                } else {
                                    if (((CatchingFishReduxBiometric) ((CatchingFishDaggerSpannable) this.CatchingFishSnackbar[(i2 / 3) * 2]).CatchingFishParcelableFAB.CatchingFishWorkManager).CatchingFishReduxKtor != CatchingFishExoPlayerDagger.MESSAGE) {
                                        continue;
                                    } else {
                                        CatchingFishRoomHilt catchingFishRoomHilt = null;
                                        for (Object obj2 : catchingFishMockkAppCompat.values()) {
                                            if (catchingFishRoomHilt == null) {
                                                catchingFishRoomHilt = CatchingFishCoroutineHilt.CatchingFishCoroutine.CatchingFishParcelableFAB(obj2.getClass());
                                            }
                                            if (!catchingFishRoomHilt.CatchingFishWorkManager(obj2)) {
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
                    List list = (List) CatchingFishGradleViewModel.CatchingFishCoroutine.CatchingFishViewModelFAB(CatchingFishCameraXIntent & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        CatchingFishRoomHilt CatchingFishOkHttp = CatchingFishOkHttp(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (CatchingFishOkHttp.CatchingFishWorkManager(list.get(i13))) {
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
}
