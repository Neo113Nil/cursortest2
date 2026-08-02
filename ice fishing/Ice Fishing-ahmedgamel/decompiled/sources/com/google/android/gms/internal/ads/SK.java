package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import java.lang.Character;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import r2.C4906k;
import s2.C4969z0;

/* loaded from: classes2.dex */
public abstract class SK implements T0 {

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f28178r0 = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f28173n = {com.anythink.basead.exoplayer.k.o.f9249u, com.anythink.basead.exoplayer.k.o.f9250v, com.anythink.basead.exoplayer.k.o.f9248t};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f28179u = {44100, 48000, 32000};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f28180v = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f28181w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f28182x = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f28183y = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f28184z = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: A, reason: collision with root package name */
    public static final C3516l5 f28145A = new C3516l5("gads:afs:csa:experiment_id", "", 4);

    /* renamed from: B, reason: collision with root package name */
    public static final C3516l5 f28146B = new C3516l5("gads:app_index:experiment_id", "", 4);

    /* renamed from: C, reason: collision with root package name */
    public static final C3516l5 f28147C = new C3516l5("gads:block_autoclicks_experiment_id", "", 4);

    /* renamed from: D, reason: collision with root package name */
    public static final C3516l5 f28148D = new C3516l5("gads:sdk_core_experiment_id", "", 4);

    /* renamed from: E, reason: collision with root package name */
    public static final C3516l5 f28149E = new C3516l5("gads:spam_app_context:experiment_id", "", 4);

    /* renamed from: F, reason: collision with root package name */
    public static final C3516l5 f28150F = new C3516l5("gads:temporary_experiment_id:1", "", 4);

    /* renamed from: G, reason: collision with root package name */
    public static final C3516l5 f28151G = new C3516l5("gads:temporary_experiment_id:10", "", 4);

    /* renamed from: H, reason: collision with root package name */
    public static final C3516l5 f28152H = new C3516l5("gads:temporary_experiment_id:11", "", 4);

    /* renamed from: I, reason: collision with root package name */
    public static final C3516l5 f28153I = new C3516l5("gads:temporary_experiment_id:12", "", 4);
    public static final C3516l5 J = new C3516l5("gads:temporary_experiment_id:13", "", 4);

    /* renamed from: K, reason: collision with root package name */
    public static final C3516l5 f28154K = new C3516l5("gads:temporary_experiment_id:14", "", 4);

    /* renamed from: L, reason: collision with root package name */
    public static final C3516l5 f28155L = new C3516l5("gads:temporary_experiment_id:15", "", 4);

    /* renamed from: M, reason: collision with root package name */
    public static final C3516l5 f28156M = new C3516l5("gads:temporary_experiment_id:2", "", 4);

    /* renamed from: N, reason: collision with root package name */
    public static final C3516l5 f28157N = new C3516l5("gads:temporary_experiment_id:3", "", 4);

    /* renamed from: O, reason: collision with root package name */
    public static final C3516l5 f28158O = new C3516l5("gads:temporary_experiment_id:4", "", 4);

    /* renamed from: P, reason: collision with root package name */
    public static final C3516l5 f28159P = new C3516l5("gads:temporary_experiment_id:5", "", 4);

    /* renamed from: Q, reason: collision with root package name */
    public static final C3516l5 f28160Q = new C3516l5("gads:temporary_experiment_id:6", "", 4);

    /* renamed from: R, reason: collision with root package name */
    public static final C3516l5 f28161R = new C3516l5("gads:temporary_experiment_id:7", "", 4);

    /* renamed from: S, reason: collision with root package name */
    public static final C3516l5 f28162S = new C3516l5("gads:temporary_experiment_id:8", "", 4);

    /* renamed from: T, reason: collision with root package name */
    public static final C3516l5 f28163T = new C3516l5("gads:temporary_experiment_id:9", "", 4);

    /* renamed from: U, reason: collision with root package name */
    public static final C3516l5 f28164U = new C3516l5("gads:corewebview:experiment_id", "", 4);

    /* renamed from: V, reason: collision with root package name */
    public static final C4112w8 f28165V = new C4112w8(11);

    /* renamed from: W, reason: collision with root package name */
    public static final C4112w8 f28166W = new C4112w8(17);

    /* renamed from: X, reason: collision with root package name */
    public static final C2851Vl f28167X = new C2851Vl(1);
    public static final C2851Vl Y = new C2851Vl(12);

    /* renamed from: Z, reason: collision with root package name */
    public static final C2851Vl f28168Z = new C2851Vl(18);

    /* renamed from: i0, reason: collision with root package name */
    public static final C2851Vl f28169i0 = new C2851Vl(23);

    /* renamed from: j0, reason: collision with root package name */
    public static final Bs f28170j0 = new Bs(4);

    /* renamed from: k0, reason: collision with root package name */
    public static final Bs f28171k0 = new Bs(10);

    /* renamed from: l0, reason: collision with root package name */
    public static final Bs f28172l0 = new Bs(15);
    public static final byte[] m0 = {0, 0, 0, 1};

    /* renamed from: n0, reason: collision with root package name */
    public static final float[] f28174n0 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: o0, reason: collision with root package name */
    public static final Object f28175o0 = new Object();

    /* renamed from: p0, reason: collision with root package name */
    public static int[] f28176p0 = new int[10];

    /* renamed from: q0, reason: collision with root package name */
    public static final int[] f28177q0 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    public static final ResolveInfo A(Intent intent, ArrayList arrayList, Context context) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, com.anythink.basead.exoplayer.b.aX);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, com.anythink.basead.exoplayer.b.aX);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i = 0;
                while (true) {
                    if (i >= queryIntentActivities.size()) {
                        break;
                    }
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    }
                    i++;
                }
            }
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            C4906k.f40186C.f40196h.d("OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent", th);
            return resolveInfo;
        }
    }

    public static C4969z0 B(int i, C4969z0 c4969z0) {
        if (i == 0) {
            throw null;
        }
        if (i == 8) {
            if (((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.v9)).intValue() > 0) {
                return c4969z0;
            }
            i = 8;
        }
        return F(i, null, c4969z0);
    }

    public static int C(ByteBuffer byteBuffer) {
        int i = 0;
        for (int i4 = 0; i4 < 8; i4++) {
            byte b9 = byteBuffer.get();
            i |= (b9 & Byte.MAX_VALUE) << (i4 * 7);
            if ((b9 & com.anythink.core.common.s.a.c.f17103a) == 0) {
                return i;
            }
        }
        return i;
    }

    public static final Intent D(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static C3245g2 E(int i, String str, Cr cr) {
        int b9 = cr.b();
        if (cr.b() == 1684108385) {
            cr.G(8);
            return new C3245g2(str, null, RB.j(cr.l(b9 - 16)));
        }
        AbstractC2991bG.y("MetadataUtil", "Failed to parse text attribute: ".concat(AbstractC3399ix.g(i)));
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C4969z0 F(int i, String str, C4969z0 c4969z0) {
        String str2;
        int i4 = i - 1;
        if (str == null) {
            if (i == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i4) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.y9)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                        break;
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i == 0) {
            throw null;
        }
        int i6 = 0;
        int i9 = 2;
        switch (i4) {
            case 0:
            case 11:
            case 15:
                i9 = i6;
                return new C4969z0(i9, str3, "com.google.android.gms.ads", c4969z0, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i9 = 1;
                return new C4969z0(i9, str3, "com.google.android.gms.ads", c4969z0, null);
            case 2:
            case 10:
            case 18:
                i9 = 3;
                return new C4969z0(i9, str3, "com.google.android.gms.ads", c4969z0, null);
            case 3:
                i6 = 8;
                i9 = i6;
                return new C4969z0(i9, str3, "com.google.android.gms.ads", c4969z0, null);
            case 4:
            case 8:
            case 17:
                return new C4969z0(i9, str3, "com.google.android.gms.ads", c4969z0, null);
            case 7:
                i6 = 4;
                i9 = i6;
                return new C4969z0(i9, str3, "com.google.android.gms.ads", c4969z0, null);
            case 12:
                if (((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.y9)).intValue() <= 0) {
                    i6 = 9;
                    i9 = i6;
                    return new C4969z0(i9, str3, "com.google.android.gms.ads", c4969z0, null);
                }
                i9 = 3;
                return new C4969z0(i9, str3, "com.google.android.gms.ads", c4969z0, null);
            case 13:
                i6 = 10;
                i9 = i6;
                return new C4969z0(i9, str3, "com.google.android.gms.ads", c4969z0, null);
            case 14:
                i6 = 11;
                i9 = i6;
                return new C4969z0(i9, str3, "com.google.android.gms.ads", c4969z0, null);
            default:
                switch (i) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }

    public static boolean G(byte[] bArr, int i, DP dp) {
        int i4;
        String str = dp.f25176o;
        if (Objects.equals(str, com.anythink.basead.exoplayer.k.o.f9237h)) {
            byte b9 = bArr[4];
            if (((b9 & 96) >> 5) == 0 && ((i4 = b9 & 31) == 1 || i4 == 9 || i4 == 14)) {
                return false;
            }
        } else if (Objects.equals(str, com.anythink.basead.exoplayer.k.o.i)) {
            A3.r U8 = U(new C0(bArr, 4, i + 4));
            int i6 = U8.f184a;
            if (i6 == 35) {
                return false;
            }
            if (i6 <= 14 && i6 % 2 == 0) {
                if (U8.f186c == dp.f25153G - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static AbstractC2923a2 H(int i, String str, Cr cr, boolean z6, boolean z9) {
        int K7 = K(cr);
        if (z9) {
            K7 = Math.min(1, K7);
        }
        if (K7 >= 0) {
            return z6 ? new C3245g2(str, null, RB.j(Integer.toString(K7))) : new Y1(com.anythink.basead.exoplayer.b.ar, str, Integer.toString(K7));
        }
        AbstractC2991bG.y("MetadataUtil", "Failed to parse uint8 attribute: ".concat(AbstractC3399ix.g(i)));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0212 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3413jA I(byte[] bArr, int i, int i4) {
        int n9;
        int i6;
        int i9;
        int n10;
        int i10;
        int n11;
        boolean k9;
        int i11;
        int i12;
        int i13;
        float f2;
        int i14;
        int i15;
        int i16;
        float f9;
        int i17;
        int i18;
        int i19;
        boolean k10;
        boolean k11;
        int i20;
        C0 c02 = new C0(bArr, i, i4);
        int l9 = c02.l(8);
        int l10 = c02.l(8);
        int l11 = c02.l(8);
        int n12 = c02.n();
        if (l9 != 100 && l9 != 110 && l9 != 122 && l9 != 244 && l9 != 44 && l9 != 83 && l9 != 86 && l9 != 118 && l9 != 128) {
            if (l9 != 138) {
                n9 = 1;
                i9 = 16;
                i10 = 0;
                n10 = 0;
                c02.n();
                n11 = c02.n();
                if (n11 != 0) {
                    c02.n();
                } else if (n11 == 1) {
                    c02.k();
                    c02.m();
                    c02.m();
                    long n13 = c02.n();
                    for (int i21 = 0; i21 < n13; i21++) {
                        c02.n();
                    }
                }
                c02.n();
                c02.e();
                int n14 = c02.n() + 1;
                int n15 = c02.n() + 1;
                k9 = c02.k();
                int i22 = 2 - (k9 ? 1 : 0);
                if (!k9) {
                    c02.e();
                }
                c02.e();
                int i23 = n14 * 16;
                int i24 = n15 * i22 * 16;
                if (c02.k()) {
                    int n16 = c02.n();
                    int n17 = c02.n();
                    int n18 = c02.n();
                    int n19 = c02.n();
                    if (n9 == 0) {
                        i20 = 1;
                    } else {
                        i20 = n9 == 3 ? 1 : 2;
                        i22 *= n9 == 1 ? 2 : 1;
                    }
                    i23 -= (n16 + n17) * i20;
                    i24 -= (n18 + n19) * i22;
                }
                int i25 = i24;
                int i26 = i23;
                if (l9 != 44 || l9 == 86 || l9 == 100 || l9 == 110 || l9 == 122) {
                    i11 = l9;
                } else {
                    i11 = 244;
                    if (l9 != 244) {
                        i12 = i9;
                        if (c02.k()) {
                            if (c02.k()) {
                                int l12 = c02.l(8);
                                if (l12 == 255) {
                                    int i27 = i9;
                                    int l13 = c02.l(i27);
                                    int l14 = c02.l(i27);
                                    if (l13 != 0 && l14 != 0) {
                                        f9 = l13 / l14;
                                        if (c02.k()) {
                                            c02.e();
                                        }
                                        if (c02.k()) {
                                            c02.h(3);
                                            int i28 = true != c02.k() ? 2 : 1;
                                            if (c02.k()) {
                                                int l15 = c02.l(8);
                                                int l16 = c02.l(8);
                                                c02.h(8);
                                                int b9 = KJ.b(l15);
                                                int i29 = i28;
                                                i18 = KJ.c(l16);
                                                i17 = b9;
                                                i19 = i29;
                                            } else {
                                                i19 = i28;
                                                i17 = -1;
                                                i18 = -1;
                                            }
                                        } else {
                                            i17 = -1;
                                            i18 = -1;
                                            i19 = -1;
                                        }
                                        if (c02.k()) {
                                            c02.n();
                                            c02.n();
                                        }
                                        if (c02.k()) {
                                            c02.h(65);
                                        }
                                        k10 = c02.k();
                                        if (k10) {
                                            W(c02);
                                        }
                                        k11 = c02.k();
                                        if (k11) {
                                            W(c02);
                                        }
                                        if (!k10 || k11) {
                                            c02.e();
                                        }
                                        c02.e();
                                        if (c02.k()) {
                                            c02.e();
                                            c02.n();
                                            c02.n();
                                            c02.n();
                                            c02.n();
                                            i12 = c02.n();
                                            c02.n();
                                        }
                                        i14 = i17;
                                        i15 = i19;
                                        i13 = i12;
                                        f2 = f9;
                                        i16 = i18;
                                    }
                                } else if (l12 < 17) {
                                    f9 = f28174n0[l12];
                                    if (c02.k()) {
                                    }
                                    if (c02.k()) {
                                    }
                                    if (c02.k()) {
                                    }
                                    if (c02.k()) {
                                    }
                                    k10 = c02.k();
                                    if (k10) {
                                    }
                                    k11 = c02.k();
                                    if (k11) {
                                    }
                                    if (!k10) {
                                    }
                                    c02.e();
                                    c02.e();
                                    if (c02.k()) {
                                    }
                                    i14 = i17;
                                    i15 = i19;
                                    i13 = i12;
                                    f2 = f9;
                                    i16 = i18;
                                } else {
                                    com.IceFishing.LiveIceFishing.k.t(l12, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil", new StringBuilder(String.valueOf(l12).length() + 35));
                                }
                            }
                            f9 = 1.0f;
                            if (c02.k()) {
                            }
                            if (c02.k()) {
                            }
                            if (c02.k()) {
                            }
                            if (c02.k()) {
                            }
                            k10 = c02.k();
                            if (k10) {
                            }
                            k11 = c02.k();
                            if (k11) {
                            }
                            if (!k10) {
                            }
                            c02.e();
                            c02.e();
                            if (c02.k()) {
                            }
                            i14 = i17;
                            i15 = i19;
                            i13 = i12;
                            f2 = f9;
                            i16 = i18;
                        } else {
                            i13 = i12;
                            f2 = 1.0f;
                            i14 = -1;
                            i15 = -1;
                            i16 = -1;
                        }
                        return new C3413jA(l9, l10, l11, n12, i26, i25, f2, i10, n10, i14, i15, i16, i13);
                    }
                }
                if ((l10 & 16) == 0) {
                    l9 = i11;
                    i12 = 0;
                } else {
                    i12 = i9;
                    l9 = i11;
                }
                if (c02.k()) {
                }
                return new C3413jA(l9, l10, l11, n12, i26, i25, f2, i10, n10, i14, i15, i16, i13);
            }
            l9 = 138;
        }
        n9 = c02.n();
        if (n9 == 3) {
            c02.k();
            i6 = 3;
        } else {
            i6 = n9;
        }
        i9 = 16;
        int n20 = c02.n();
        n10 = c02.n();
        c02.e();
        if (c02.k()) {
            int i30 = i6 != 3 ? 8 : 12;
            int i31 = 0;
            while (i31 < i30) {
                if (c02.k()) {
                    int i32 = i31 < 6 ? 16 : 64;
                    int i33 = 8;
                    int i34 = 8;
                    for (int i35 = 0; i35 < i32; i35++) {
                        if (i33 != 0) {
                            i33 = ((c02.m() + i34) + 256) % 256;
                        }
                        if (i33 != 0) {
                            i34 = i33;
                        }
                    }
                }
                i31++;
            }
        }
        i10 = n20;
        c02.n();
        n11 = c02.n();
        if (n11 != 0) {
        }
        c02.n();
        c02.e();
        int n142 = c02.n() + 1;
        int n152 = c02.n() + 1;
        k9 = c02.k();
        int i222 = 2 - (k9 ? 1 : 0);
        if (!k9) {
        }
        c02.e();
        int i232 = n142 * 16;
        int i242 = n152 * i222 * 16;
        if (c02.k()) {
        }
        int i252 = i242;
        int i262 = i232;
        if (l9 != 44) {
        }
        i11 = l9;
        if ((l10 & 16) == 0) {
        }
        if (c02.k()) {
        }
        return new C3413jA(l9, l10, l11, n12, i262, i252, f2, i10, n10, i14, i15, i16, i13);
    }

    public static void J(SQLiteDatabase sQLiteDatabase, long j6, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.anythink.expressad.foundation.d.d.f19383u, Long.valueOf(j6));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j6)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static int K(Cr cr) {
        int b9 = cr.b();
        if (cr.b() == 1684108385) {
            cr.G(8);
            int i = b9 - 16;
            if (i == 1) {
                return cr.K();
            }
            if (i == 2) {
                return cr.L();
            }
            if (i == 3) {
                return cr.O();
            }
            if (i == 4 && (cr.I() & 128) == 0) {
                return cr.h();
            }
        }
        AbstractC2991bG.y("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2590Gf L(byte[] bArr, int i, int i4) {
        int[] iArr;
        C3067cm c3067cm;
        int i6;
        int i9;
        int i10;
        int i11;
        boolean z6;
        boolean z9;
        int i12;
        int[] iArr2;
        boolean[][] zArr;
        int i13;
        C3523lC c3523lC;
        boolean[][] zArr2;
        int[] iArr3;
        int i14;
        int i15;
        int i16;
        boolean k9;
        int i17;
        int i18;
        int i19;
        int i20;
        int n9;
        int i21;
        int i22;
        boolean z10;
        boolean z11;
        C0 c02 = new C0(bArr, i, i4);
        U(c02);
        c02.h(4);
        boolean k10 = c02.k();
        boolean k11 = c02.k();
        int l9 = c02.l(6);
        int i23 = l9 + 1;
        int l10 = c02.l(3);
        c02.h(17);
        C4155wy V8 = V(c02, true, l10, null);
        for (int i24 = true != c02.k() ? l10 : 0; i24 <= l10; i24++) {
            c02.n();
            c02.n();
            c02.n();
        }
        int l11 = c02.l(6);
        int n10 = c02.n() + 1;
        int i25 = 6;
        S0.l lVar = new S0.l(RB.j(V8), new int[1]);
        boolean z12 = i23 >= 2 && n10 >= 2;
        boolean z13 = k10 && k11;
        int i26 = l11 + 1;
        if (!z12 || !z13 || i26 < i23) {
            return new C2590Gf((C3523lC) null, lVar, (S0.s) null, (C3067cm) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, n10, i26);
        int i27 = 1;
        int[] iArr5 = new int[n10];
        int[] iArr6 = new int[n10];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i28 = 1; i28 < n10; i28++) {
            int i29 = 0;
            for (int i30 = 0; i30 <= l11; i30++) {
                if (c02.k()) {
                    iArr4[i28][i29] = i30;
                    iArr6[i28] = i30;
                    i29++;
                }
                iArr5[i28] = i29;
            }
        }
        if (c02.k()) {
            c02.h(64);
            if (c02.k()) {
                c02.n();
            }
            int n11 = c02.n();
            int i31 = 0;
            while (i31 < n11) {
                c02.n();
                if (i31 == 0 || c02.k()) {
                    boolean k12 = c02.k();
                    boolean k13 = c02.k();
                    z11 = k12;
                    z10 = k13;
                    if (k12 || k13) {
                        k9 = c02.k();
                        if (k9) {
                            c02.h(19);
                        }
                        c02.h(8);
                        if (k9) {
                            c02.h(4);
                        }
                        c02.h(15);
                        i18 = k12;
                        i17 = k13;
                        i19 = 0;
                        while (i19 <= l10) {
                            if (c02.k() || c02.k()) {
                                c02.n();
                            } else if (c02.k()) {
                                i20 = i31;
                                n9 = 0;
                                int[][] iArr7 = iArr4;
                                i21 = i18 + i17;
                                int[] iArr8 = iArr6;
                                i22 = 0;
                                while (i22 < i21) {
                                    int i32 = i21;
                                    for (int i33 = 0; i33 <= n9; i33++) {
                                        c02.n();
                                        c02.n();
                                        if (k9) {
                                            c02.n();
                                            c02.n();
                                        }
                                        c02.e();
                                    }
                                    i22++;
                                    i21 = i32;
                                }
                                i19++;
                                iArr4 = iArr7;
                                i31 = i20;
                                iArr6 = iArr8;
                            }
                            i20 = i31;
                            n9 = c02.n();
                            int[][] iArr72 = iArr4;
                            i21 = i18 + i17;
                            int[] iArr82 = iArr6;
                            i22 = 0;
                            while (i22 < i21) {
                            }
                            i19++;
                            iArr4 = iArr72;
                            i31 = i20;
                            iArr6 = iArr82;
                        }
                        i31++;
                    }
                } else {
                    z11 = false;
                    z10 = false;
                }
                k9 = false;
                i18 = z11;
                i17 = z10;
                i19 = 0;
                while (i19 <= l10) {
                }
                i31++;
            }
        }
        int[][] iArr9 = iArr4;
        int[] iArr10 = iArr6;
        if (!c02.k()) {
            return new C2590Gf((C3523lC) null, lVar, (S0.s) null, (C3067cm) null);
        }
        int i34 = c02.f24769x;
        if (i34 > 0) {
            c02.h(8 - i34);
        }
        C4155wy V9 = V(c02, false, l10, V8);
        boolean k14 = c02.k();
        boolean[] zArr3 = new boolean[16];
        int i35 = 0;
        for (int i36 = 0; i36 < 16; i36++) {
            boolean k15 = c02.k();
            zArr3[i36] = k15;
            if (k15) {
                i35++;
            }
        }
        if (i35 == 0 || !zArr3[1]) {
            return new C2590Gf((C3523lC) null, lVar, (S0.s) null, (C3067cm) null);
        }
        int i37 = i35 + 1;
        int[] iArr11 = new int[i35];
        for (int i38 = 0; i38 < i35 - (k14 ? 1 : 0); i38++) {
            iArr11[i38] = c02.l(3);
        }
        int[] iArr12 = new int[i37];
        if (k14) {
            for (int i39 = 1; i39 < i35; i39++) {
                for (int i40 = 0; i40 < i39; i40++) {
                    iArr12[i39] = iArr11[i40] + 1 + iArr12[i39];
                }
            }
            iArr12[i35] = 6;
        }
        int[][] iArr13 = (int[][]) Array.newInstance((Class<?>) cls, i23, i35);
        int[] iArr14 = new int[i23];
        iArr14[0] = 0;
        boolean k16 = c02.k();
        int i41 = 1;
        while (i41 < i23) {
            if (k16) {
                iArr14[i41] = c02.l(i25);
            } else {
                iArr14[i41] = i41;
            }
            if (k14) {
                i16 = i41;
                for (int i42 = 0; i42 < i35; i42++) {
                    iArr13[i16][i42] = (iArr14[i16] & ((1 << iArr12[r32]) - 1)) >> iArr12[i42];
                }
            } else {
                int i43 = 0;
                while (i43 < i35) {
                    iArr13[i41][i43] = c02.l(iArr11[i43] + 1);
                    i43++;
                    i41 = i41;
                }
                i16 = i41;
            }
            i41 = i16 + 1;
            i25 = 6;
        }
        int[] iArr15 = new int[i26];
        int i44 = 1;
        int i45 = 0;
        while (i45 < i23) {
            iArr15[iArr14[i45]] = -1;
            int[] iArr16 = iArr15;
            int i46 = 0;
            int i47 = 0;
            while (i46 < 16) {
                if (zArr3[i46]) {
                    i15 = i27;
                    if (i46 == i15) {
                        iArr16[iArr14[i45]] = iArr13[i45][i47];
                        i46 = i15;
                    }
                    i47++;
                } else {
                    i15 = i27;
                }
                i46 += i15;
                i27 = i15;
            }
            if (i45 > 0) {
                int i48 = 0;
                while (true) {
                    if (i48 >= i45) {
                        i44++;
                        break;
                    }
                    int i49 = i48;
                    if (iArr16[iArr14[i45]] == iArr16[iArr14[i48]]) {
                        break;
                    }
                    i48 = i49 + 1;
                }
            }
            i45++;
            iArr15 = iArr16;
            i27 = 1;
        }
        int[] iArr17 = iArr15;
        int l12 = c02.l(4);
        if (i44 < 2 || l12 == 0) {
            return new C2590Gf((C3523lC) null, lVar, (S0.s) null, (C3067cm) null);
        }
        int[] iArr18 = new int[i44];
        for (int i50 = 0; i50 < i44; i50++) {
            iArr18[i50] = c02.l(l12);
        }
        int[] iArr19 = new int[i26];
        for (int i51 = 0; i51 < i23; i51++) {
            iArr19[Math.min(iArr14[i51], l11)] = i51;
        }
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i52 = i44;
        int i53 = 0;
        int i54 = 0;
        while (i54 <= l11) {
            int[] iArr20 = iArr19;
            int[] iArr21 = iArr14;
            int min = Math.min(iArr17[i54], i52 - 1);
            int i55 = i54;
            Xx xx = new Xx(iArr20[i55], min >= 0 ? iArr18[min] : -1);
            int length = objArr.length;
            int i56 = i53 + 1;
            int d9 = MB.d(length, i56);
            if (d9 > length) {
                objArr = Arrays.copyOf(objArr, d9);
            }
            objArr[i53] = xx;
            i54 = i55 + 1;
            i53 = i56;
            iArr19 = iArr20;
            iArr14 = iArr21;
        }
        int[] iArr22 = iArr14;
        C3523lC p9 = RB.p(objArr, i53);
        if (((Xx) p9.get(0)).f29389b == -1) {
            return new C2590Gf((C3523lC) null, lVar, (S0.s) null, (C3067cm) null);
        }
        int i57 = 1;
        while (true) {
            if (i57 > l11) {
                i57 = -1;
                break;
            }
            if (((Xx) p9.get(i57)).f29389b != -1) {
                break;
            }
            i57++;
        }
        if (i57 == -1) {
            return new C2590Gf((C3523lC) null, lVar, (S0.s) null, (C3067cm) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i23, i23);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i23, i23);
        int i58 = 1;
        while (i58 < i23) {
            boolean[][] zArr6 = zArr5;
            for (int i59 = 0; i59 < i58; i59++) {
                boolean[] zArr7 = zArr4[i58];
                boolean[] zArr8 = zArr6[i58];
                boolean k17 = c02.k();
                zArr8[i59] = k17;
                zArr7[i59] = k17;
            }
            i58++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i60 = 1; i60 < i23; i60++) {
            int i61 = 0;
            while (i61 < l9) {
                boolean[][] zArr10 = zArr4;
                int i62 = 0;
                while (true) {
                    if (i62 < i60) {
                        boolean[] zArr11 = zArr9[i60];
                        if (zArr11[i62] && zArr9[i62][i61]) {
                            zArr11[i61] = true;
                            break;
                        }
                        i62++;
                    }
                }
                i61++;
                zArr4 = zArr10;
            }
        }
        boolean[][] zArr12 = zArr4;
        int[] iArr23 = new int[i26];
        for (int i63 = 0; i63 < i23; i63++) {
            int i64 = 0;
            for (int i65 = 0; i65 < i63; i65++) {
                i64 += zArr12[i63][i65] ? 1 : 0;
            }
            iArr23[iArr22[i63]] = i64;
        }
        int i66 = 0;
        for (int i67 = 0; i67 < i23; i67++) {
            if (iArr23[iArr22[i67]] == 0) {
                i66++;
            }
        }
        if (i66 > 1) {
            return new C2590Gf((C3523lC) null, lVar, (S0.s) null, (C3067cm) null);
        }
        int[] iArr24 = new int[i23];
        int[] iArr25 = new int[n10];
        if (c02.k()) {
            iArr = iArr23;
            int i68 = 0;
            while (i68 < i23) {
                int i69 = i68;
                iArr24[i69] = c02.l(3);
                i68 = i69 + 1;
            }
        } else {
            iArr = iArr23;
            Arrays.fill(iArr24, 0, i23, l10);
        }
        int i70 = 0;
        while (i70 < n10) {
            int i71 = i70;
            int[] iArr26 = iArr24;
            int[] iArr27 = iArr25;
            int i72 = 0;
            for (int i73 = 0; i73 < iArr5[i71]; i73++) {
                i72 = Math.max(i72, iArr26[((Xx) p9.get(iArr9[i71][i73])).f29388a]);
            }
            iArr27[i71] = i72 + 1;
            i70 = i71 + 1;
            iArr24 = iArr26;
            iArr25 = iArr27;
        }
        int[] iArr28 = iArr25;
        if (c02.k()) {
            int i74 = 0;
            while (i74 < l9) {
                int i75 = i74 + 1;
                int i76 = i75;
                while (i76 < i23) {
                    if (zArr12[i76][i74]) {
                        i14 = l9;
                        c02.h(3);
                    } else {
                        i14 = l9;
                    }
                    i76++;
                    l9 = i14;
                }
                i74 = i75;
            }
        }
        c02.e();
        int n12 = c02.n() + 1;
        OB ob = new OB(4);
        ob.a(V8);
        if (n12 > 1) {
            ob.a(V9);
            for (int i77 = 2; i77 < n12; i77++) {
                V9 = V(c02, c02.k(), l10, V9);
                ob.a(V9);
            }
        }
        C3523lC f2 = ob.f();
        int n13 = c02.n() + n10;
        if (n13 > n10) {
            return new C2590Gf((C3523lC) null, lVar, (S0.s) null, (C3067cm) null);
        }
        int l13 = c02.l(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, n13, i26);
        int[] iArr29 = new int[n13];
        int i78 = 0;
        int[] iArr30 = new int[n13];
        int i79 = 0;
        while (i79 < n10) {
            iArr29[i79] = i78;
            int i80 = i79;
            int i81 = iArr10[i80];
            iArr30[i80] = i81;
            if (l13 == 0) {
                zArr2 = zArr13;
                c3523lC = f2;
                iArr3 = iArr29;
                Arrays.fill(zArr13[i80], i78, iArr5[i80], true);
                iArr3[i80] = iArr5[i80];
            } else {
                c3523lC = f2;
                zArr2 = zArr13;
                iArr3 = iArr29;
                if (l13 == 1) {
                    for (int i82 = 0; i82 < iArr5[i80]; i82++) {
                        zArr2[i80][i82] = iArr9[i80][i82] == i81;
                    }
                    iArr3[i80] = 1;
                } else {
                    i78 = 0;
                    zArr2[0][0] = true;
                    iArr3[0] = 1;
                    i79 = i80 + 1;
                    zArr13 = zArr2;
                    iArr29 = iArr3;
                    f2 = c3523lC;
                }
            }
            i78 = 0;
            i79 = i80 + 1;
            zArr13 = zArr2;
            iArr29 = iArr3;
            f2 = c3523lC;
        }
        C3523lC c3523lC2 = f2;
        boolean[][] zArr14 = zArr13;
        int[] iArr31 = iArr29;
        int[] iArr32 = new int[i26];
        int i83 = 2;
        int[] iArr33 = new int[2];
        iArr33[1] = i26;
        iArr33[i78] = n13;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr33);
        int i84 = 1;
        int i85 = 0;
        while (i84 < n13) {
            if (l13 == i83) {
                for (int i86 = 0; i86 < iArr5[i84]; i86++) {
                    zArr14[i84][i86] = c02.k();
                    int i87 = iArr31[i84];
                    boolean z14 = zArr14[i84][i86];
                    iArr31[i84] = i87 + (z14 ? 1 : 0);
                    if (z14) {
                        iArr30[i84] = iArr9[i84][i86];
                    }
                }
            }
            if (i85 == 0) {
                i12 = 0;
                if (iArr9[i84][0] == 0 && zArr14[i84][0]) {
                    i85 = 0;
                    for (int i88 = 1; i88 < iArr5[i84]; i88++) {
                        if (iArr9[i84][i88] == i57 && zArr14[i84][i57]) {
                            i85 = i84;
                        }
                    }
                } else {
                    i85 = 0;
                }
            } else {
                i12 = 0;
            }
            int i89 = i12;
            while (i89 < iArr5[i84]) {
                if (n12 > 1) {
                    zArr15[i84][i89] = zArr14[i84][i89];
                    iArr2 = iArr32;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int b9 = MC.b(n12);
                    if (!zArr[i84][i89]) {
                        Xx xx2 = (Xx) p9.get(iArr9[i84][i89]);
                        i13 = n12;
                        int i90 = i12;
                        while (true) {
                            if (i90 >= i89) {
                                break;
                            }
                            int i91 = i90;
                            if (zArr9[xx2.f29388a][((Xx) p9.get(iArr9[i84][i91])).f29388a]) {
                                zArr[i84][i89] = true;
                                break;
                            }
                            i90 = i91 + 1;
                        }
                    } else {
                        i13 = n12;
                    }
                    if (zArr[i84][i89]) {
                        if (i85 <= 0 || i84 != i85) {
                            c02.h(b9);
                        } else {
                            iArr2[i89] = c02.l(b9);
                        }
                    }
                } else {
                    iArr2 = iArr32;
                    zArr = zArr15;
                    i13 = n12;
                }
                i89++;
                iArr32 = iArr2;
                zArr15 = zArr;
                n12 = i13;
            }
            int[] iArr34 = iArr32;
            boolean[][] zArr16 = zArr15;
            int i92 = n12;
            if (iArr31[i84] == 1 && iArr[iArr30[i84]] > 0) {
                c02.e();
            }
            i84++;
            iArr32 = iArr34;
            zArr15 = zArr16;
            n12 = i92;
            i83 = 2;
        }
        int[] iArr35 = iArr32;
        boolean[][] zArr17 = zArr15;
        if (i85 == 0) {
            return new C2590Gf((C3523lC) null, lVar, (S0.s) null, (C3067cm) null);
        }
        int n14 = c02.n();
        int i93 = n14 + 1;
        MA.q(i93, "expectedSize");
        MA.q(i93, "initialCapacity");
        int[] iArr36 = new int[i23];
        Object[] objArr2 = new Object[i93];
        int i94 = 0;
        int i95 = 0;
        boolean z15 = false;
        while (i94 < i93) {
            int l14 = c02.l(16);
            int l15 = c02.l(16);
            if (c02.k()) {
                i6 = i94;
                i9 = c02.l(2);
                if (i9 == 3) {
                    c02.e();
                }
                i10 = c02.l(4);
                i11 = c02.l(4);
            } else {
                i6 = i94;
                i9 = 0;
                i10 = 0;
                i11 = 0;
            }
            if (c02.k()) {
                int n15 = c02.n();
                int n16 = c02.n();
                int n17 = c02.n();
                int n18 = c02.n();
                z6 = z15;
                l14 -= (n15 + n16) * ((i9 == 1 || i9 == 2) ? 2 : 1);
                l15 -= (n17 + n18) * (i9 == 1 ? 2 : 1);
            } else {
                z6 = z15;
            }
            Wy wy = new Wy(i9, i10, i11, l14, l15);
            int length2 = objArr2.length;
            int d10 = MB.d(length2, i95 + 1);
            if (d10 > length2 || z6) {
                objArr2 = Arrays.copyOf(objArr2, d10);
                z9 = false;
            } else {
                z9 = z6;
            }
            objArr2[i95] = wy;
            i95++;
            i94 = i6 + 1;
            z15 = z9;
        }
        if (i93 <= 1 || !c02.k()) {
            for (int i96 = 1; i96 < i23; i96++) {
                iArr36[i96] = Math.min(i96, n14);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int b10 = MC.b(i93);
            for (int i97 = 1; i97 < i23; i97++) {
                iArr36[i97] = c02.l(b10);
            }
        }
        S0.s sVar = new S0.s(RB.p(objArr2, i95), iArr36);
        c02.h(2);
        for (int i98 = 1; i98 < i23; i98++) {
            if (iArr[iArr22[i98]] == 0) {
                c02.e();
            }
        }
        for (int i99 = 1; i99 < n13; i99++) {
            boolean k18 = c02.k();
            int i100 = 0;
            while (i100 < iArr28[i99]) {
                if ((i100 <= 0 || !k18) ? i100 == 0 : c02.k()) {
                    for (int i101 = 0; i101 < iArr5[i99]; i101++) {
                        if (zArr17[i99][i101]) {
                            c02.n();
                        }
                    }
                    c02.n();
                    c02.n();
                }
                i100++;
            }
        }
        int n19 = c02.n() + 2;
        if (c02.k()) {
            c02.h(n19);
        } else {
            for (int i102 = 1; i102 < i23; i102++) {
                for (int i103 = 0; i103 < i102; i103++) {
                    if (zArr12[i102][i103]) {
                        c02.h(n19);
                    }
                }
            }
        }
        int n20 = c02.n();
        for (int i104 = 1; i104 <= n20; i104++) {
            c02.h(8);
        }
        if (c02.k()) {
            int i105 = c02.f24769x;
            if (i105 > 0) {
                c02.h(8 - i105);
            }
            if (c02.k() || c02.k()) {
                c02.e();
            }
            boolean k19 = c02.k();
            boolean k20 = c02.k();
            if (k19 || k20) {
                for (int i106 = 0; i106 < n10; i106++) {
                    for (int i107 = 0; i107 < iArr28[i106]; i107++) {
                        boolean k21 = k19 ? c02.k() : false;
                        boolean k22 = k20 ? c02.k() : false;
                        if (k21) {
                            c02.h(32);
                        }
                        if (k22) {
                            c02.h(18);
                        }
                    }
                }
            }
            boolean k23 = c02.k();
            int l16 = k23 ? c02.l(4) + 1 : i23;
            MA.q(l16, "expectedSize");
            MA.q(l16, "initialCapacity");
            int[] iArr37 = new int[i23];
            Object[] objArr3 = new Object[l16];
            int i108 = 0;
            int i109 = 0;
            boolean z16 = false;
            while (i108 < l16) {
                c02.h(3);
                int i110 = true != c02.k() ? 2 : 1;
                int b11 = KJ.b(c02.l(8));
                int c9 = KJ.c(c02.l(8));
                c02.h(8);
                Gz gz = new Gz(b11, i110, c9);
                int length3 = objArr3.length;
                int d11 = MB.d(length3, i109 + 1);
                if (d11 > length3 || z16) {
                    objArr3 = Arrays.copyOf(objArr3, d11);
                    z16 = false;
                }
                objArr3[i109] = gz;
                i108++;
                i109++;
                z16 = z16;
            }
            if (k23 && l16 > 1) {
                for (int i111 = 0; i111 < i23; i111++) {
                    iArr37[i111] = c02.l(4);
                }
            }
            c3067cm = new C3067cm(RB.p(objArr3, i109), iArr37);
        } else {
            c3067cm = null;
        }
        return new C2590Gf(p9, new S0.l(c3523lC2, iArr35), sVar, c3067cm);
    }

    public static Cursor M(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i == 1) {
            strArr2[0] = "total_requests";
        } else if (i != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    public static C3245g2 N(int i, String str, Cr cr) {
        int b9 = cr.b();
        if (cr.b() == 1684108385 && b9 >= 22) {
            cr.G(10);
            int L2 = cr.L();
            if (L2 > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(L2).length());
                sb.append(L2);
                String sb2 = sb.toString();
                int L6 = cr.L();
                if (L6 > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + String.valueOf(L6).length());
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(L6);
                    sb2 = sb3.toString();
                }
                return new C3245g2(str, null, RB.j(sb2));
            }
        }
        AbstractC2991bG.y("MetadataUtil", "Failed to parse index/count attribute: ".concat(AbstractC3399ix.g(i)));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3994tz O(byte[] bArr, int i, int i4, C2590Gf c2590Gf) {
        int i6;
        boolean z6;
        int i9;
        int i10;
        int i11;
        int i12;
        int n9;
        int i13;
        int i14;
        int i15;
        int i16;
        int n10;
        int i17;
        float f2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        C3067cm c3067cm;
        int i25;
        int i26;
        int i27;
        S0.s sVar;
        A3.r U8 = U(new C0(bArr, i, i4));
        C0 c02 = new C0(bArr, i + 2, i4);
        int i28 = 4;
        c02.h(4);
        int l9 = c02.l(3);
        int i29 = U8.f185b;
        if (i29 == 0 || l9 != 7) {
            i6 = l9;
            z6 = false;
        } else {
            z6 = true;
            i6 = 7;
        }
        if (c2590Gf != null) {
            RB rb = (RB) c2590Gf.f25830u;
            if (!rb.isEmpty()) {
                i9 = ((Xx) rb.get(Math.min(i29, rb.size() - 1))).f29388a;
                C4155wy c4155wy = null;
                if (z6) {
                    c02.e();
                    c4155wy = V(c02, true, i6, null);
                } else if (c2590Gf != null) {
                    S0.l lVar = (S0.l) c2590Gf.f25831v;
                    int i30 = ((int[]) lVar.f2927v)[i9];
                    RB rb2 = (RB) lVar.f2926u;
                    if (rb2.size() > i30) {
                        c4155wy = (C4155wy) rb2.get(i30);
                    }
                }
                C4155wy c4155wy2 = c4155wy;
                c02.n();
                if (z6) {
                    int n11 = c02.n();
                    if (n11 == 3) {
                        c02.e();
                        n11 = 3;
                    }
                    int n12 = c02.n();
                    int n13 = c02.n();
                    if (c02.k()) {
                        int n14 = c02.n();
                        int n15 = c02.n();
                        int n16 = c02.n();
                        int n17 = c02.n();
                        i10 = n12 - ((n14 + n15) * ((n11 == 1 || n11 == 2) ? 2 : 1));
                        i11 = n13 - ((n16 + n17) * (n11 == 1 ? 2 : 1));
                    } else {
                        i10 = n12;
                        i11 = n13;
                    }
                    int n18 = c02.n();
                    i12 = n12;
                    n9 = c02.n();
                    i13 = n13;
                    i14 = i10;
                    i15 = n18;
                } else {
                    int l10 = c02.k() ? c02.l(8) : -1;
                    if (c2590Gf != null && (sVar = (S0.s) c2590Gf.f25832w) != null) {
                        if (l10 == -1) {
                            l10 = ((int[]) sVar.f2970v)[i9];
                        }
                        if (l10 != -1) {
                            RB rb3 = (RB) sVar.f2969u;
                            if (rb3.size() > l10) {
                                Wy wy = (Wy) rb3.get(l10);
                                int i31 = wy.f29229a;
                                int i32 = wy.f29232d;
                                int i33 = wy.f29233e;
                                int i34 = wy.f29230b;
                                i12 = i32;
                                i13 = i33;
                                n9 = wy.f29231c;
                                i14 = i12;
                                i15 = i34;
                                i11 = i13;
                            }
                        }
                    }
                    i11 = 0;
                    i15 = 0;
                    n9 = 0;
                    i14 = 0;
                    i12 = 0;
                    i13 = 0;
                }
                int n19 = c02.n();
                if (z6) {
                    int i35 = -1;
                    for (int i36 = true != c02.k() ? i6 : 0; i36 <= i6; i36++) {
                        c02.n();
                        i35 = Math.max(c02.n(), i35);
                        c02.n();
                    }
                    i16 = i35;
                } else {
                    i16 = -1;
                }
                c02.n();
                c02.n();
                c02.n();
                c02.n();
                c02.n();
                c02.n();
                if (c02.k()) {
                    if (z6 && c02.k()) {
                        c02.h(6);
                    } else if (c02.k()) {
                        int i37 = 0;
                        while (i37 < i28) {
                            int i38 = 0;
                            while (i38 < 6) {
                                if (c02.k()) {
                                    int min = Math.min(64, 1 << ((i37 + i37) + i28));
                                    if (i37 > 1) {
                                        c02.m();
                                    }
                                    for (int i39 = 0; i39 < min; i39++) {
                                        c02.m();
                                    }
                                } else {
                                    c02.n();
                                }
                                i38 += i37 == 3 ? 3 : 1;
                                i28 = 4;
                            }
                            i37++;
                            i28 = 4;
                        }
                    }
                }
                c02.h(2);
                if (c02.k()) {
                    c02.h(8);
                    c02.n();
                    c02.n();
                    c02.e();
                }
                n10 = c02.n();
                int[] iArr = new int[0];
                int[] iArr2 = new int[0];
                i17 = 0;
                int i40 = -1;
                int i41 = -1;
                while (i17 < n10) {
                    if (i17 == 0 || !c02.k()) {
                        i25 = n10;
                        i26 = i9;
                        int n20 = c02.n();
                        int n21 = c02.n();
                        int[] iArr3 = new int[n20];
                        int i42 = 0;
                        while (i42 < n20) {
                            iArr3[i42] = (i42 > 0 ? iArr3[i42 - 1] : 0) - (c02.n() + 1);
                            c02.e();
                            i42++;
                        }
                        int[] iArr4 = new int[n21];
                        int i43 = 0;
                        while (i43 < n21) {
                            iArr4[i43] = c02.n() + 1 + (i43 > 0 ? iArr4[i43 - 1] : 0);
                            c02.e();
                            i43++;
                        }
                        i41 = n21;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        i40 = n20;
                    } else {
                        int i44 = i40 + i41;
                        boolean k9 = c02.k();
                        int n22 = c02.n() + 1;
                        int i45 = 1 - ((k9 ? 1 : 0) + (k9 ? 1 : 0));
                        i25 = n10;
                        int i46 = i44 + 1;
                        i26 = i9;
                        boolean[] zArr = new boolean[i46];
                        for (int i47 = 0; i47 <= i44; i47++) {
                            if (c02.k()) {
                                zArr[i47] = true;
                            } else {
                                zArr[i47] = c02.k();
                            }
                        }
                        int i48 = i41 - 1;
                        int[] iArr5 = new int[i46];
                        int[] iArr6 = new int[i46];
                        int i49 = 0;
                        while (true) {
                            i27 = i45 * n22;
                            if (i48 < 0) {
                                break;
                            }
                            int i50 = iArr2[i48] + i27;
                            if (i50 < 0 && zArr[i40 + i48]) {
                                iArr5[i49] = i50;
                                i49++;
                            }
                            i48--;
                        }
                        if (i27 < 0 && zArr[i44]) {
                            iArr5[i49] = i27;
                            i49++;
                        }
                        int[] iArr7 = iArr;
                        int i51 = i49;
                        for (int i52 = 0; i52 < i40; i52++) {
                            int i53 = iArr7[i52] + i27;
                            if (i53 < 0 && zArr[i52]) {
                                iArr5[i51] = i53;
                                i51++;
                            }
                        }
                        int[] copyOf = Arrays.copyOf(iArr5, i51);
                        int i54 = 0;
                        for (int i55 = i40 - 1; i55 >= 0; i55--) {
                            int i56 = iArr7[i55] + i27;
                            if (i56 > 0 && zArr[i55]) {
                                iArr6[i54] = i56;
                                i54++;
                            }
                        }
                        if (i27 > 0 && zArr[i44]) {
                            iArr6[i54] = i27;
                            i54++;
                        }
                        int i57 = i54;
                        for (int i58 = 0; i58 < i41; i58++) {
                            int i59 = iArr2[i58] + i27;
                            if (i59 > 0 && zArr[i40 + i58]) {
                                iArr6[i57] = i59;
                                i57++;
                            }
                        }
                        iArr2 = Arrays.copyOf(iArr6, i57);
                        i40 = i51;
                        i41 = i57;
                        iArr = copyOf;
                    }
                    i17++;
                    n10 = i25;
                    i9 = i26;
                }
                int i60 = i9;
                if (c02.k()) {
                    int n23 = c02.n();
                    for (int i61 = 0; i61 < n23; i61++) {
                        c02.h(n19 + 5);
                    }
                }
                c02.h(2);
                float f9 = 1.0f;
                if (c02.k()) {
                    f2 = 1.0f;
                    i18 = i11;
                    i19 = -1;
                    i20 = -1;
                    i21 = -1;
                } else {
                    if (c02.k()) {
                        int l11 = c02.l(8);
                        if (l11 == 255) {
                            int l12 = c02.l(16);
                            int l13 = c02.l(16);
                            if (l12 != 0 && l13 != 0) {
                                f9 = l12 / l13;
                            }
                        } else if (l11 < 17) {
                            f9 = f28174n0[l11];
                        } else {
                            com.IceFishing.LiveIceFishing.k.t(l11, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil", new StringBuilder(String.valueOf(l11).length() + 35));
                        }
                    }
                    if (c02.k()) {
                        c02.e();
                    }
                    if (c02.k()) {
                        c02.h(3);
                        i24 = true != c02.k() ? 2 : 1;
                        if (c02.k()) {
                            int l14 = c02.l(8);
                            int l15 = c02.l(8);
                            c02.h(8);
                            i22 = KJ.b(l14);
                            i23 = KJ.c(l15);
                        } else {
                            i22 = -1;
                            i23 = -1;
                        }
                    } else {
                        if (c2590Gf != null && (c3067cm = (C3067cm) c2590Gf.f25833x) != null) {
                            int i62 = ((int[]) c3067cm.f30366v)[i60];
                            RB rb4 = (RB) c3067cm.f30365u;
                            if (rb4.size() > i62) {
                                Gz gz = (Gz) rb4.get(i62);
                                int i63 = gz.f25966a;
                                int i64 = gz.f25967b;
                                i23 = gz.f25968c;
                                i22 = i63;
                                i24 = i64;
                            }
                        }
                        i22 = -1;
                        i23 = -1;
                        i24 = -1;
                    }
                    if (c02.k()) {
                        c02.n();
                        c02.n();
                    }
                    c02.e();
                    if (c02.k()) {
                        i11 += i11;
                    }
                    i19 = i22;
                    i21 = i23;
                    f2 = f9;
                    i20 = i24;
                    i18 = i11;
                }
                return new C3994tz(i6, c4155wy2, i15, n9, i14, i18, i12, i13, f2, i16, i19, i20, i21);
            }
        }
        i9 = 0;
        C4155wy c4155wy3 = null;
        if (z6) {
        }
        C4155wy c4155wy22 = c4155wy3;
        c02.n();
        if (z6) {
        }
        int n192 = c02.n();
        if (z6) {
        }
        c02.n();
        c02.n();
        c02.n();
        c02.n();
        c02.n();
        c02.n();
        if (c02.k()) {
        }
        c02.h(2);
        if (c02.k()) {
        }
        n10 = c02.n();
        int[] iArr8 = new int[0];
        int[] iArr22 = new int[0];
        i17 = 0;
        int i402 = -1;
        int i412 = -1;
        while (i17 < n10) {
        }
        int i602 = i9;
        if (c02.k()) {
        }
        c02.h(2);
        float f92 = 1.0f;
        if (c02.k()) {
        }
        return new C3994tz(i6, c4155wy22, i15, n9, i14, i18, i12, i13, f2, i16, i19, i20, i21);
    }

    public static void P(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    public static int Q(byte[] bArr, int i, int i4, boolean[] zArr) {
        int i6 = i4 - i;
        AbstractC2792Sd.H(i6 >= 0);
        if (i6 == 0) {
            return i4;
        }
        if (zArr[0]) {
            S(zArr);
            return i - 3;
        }
        if (i6 > 1 && zArr[1] && bArr[i] == 1) {
            S(zArr);
            return i - 2;
        }
        if (i6 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            S(zArr);
            return i - 1;
        }
        int i9 = i4 - 1;
        int i10 = i + 2;
        while (i10 < i9) {
            byte b9 = bArr[i10];
            if ((b9 & 254) == 0) {
                int i11 = i10 - 2;
                if (bArr[i11] == 0 && bArr[i10 - 1] == 0 && b9 == 1) {
                    S(zArr);
                    return i11;
                }
                i10 = i11;
            }
            i10 += 3;
        }
        zArr[0] = i6 <= 2 ? !(i6 != 2 ? !(zArr[1] && bArr[i9] == 1) : !(zArr[2] && bArr[i4 + (-2)] == 0 && bArr[i9] == 1)) : bArr[i4 + (-3)] == 0 && bArr[i4 + (-2)] == 0 && bArr[i9] == 1;
        zArr[1] = i6 <= 1 ? zArr[2] && bArr[i9] == 0 : bArr[i4 + (-2)] == 0 && bArr[i9] == 0;
        zArr[2] = bArr[i9] == 0;
        return i4;
    }

    public static void R(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void S(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String T(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                PB pb = RB.f27933u;
                MA.q(4, "initialCapacity");
                Object[] objArr = new Object[4];
                int i4 = 0;
                int i6 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i4 >= length2) {
                        break;
                    }
                    int Q8 = Q(bArr, i4, length2, zArr);
                    if (Q8 != length2) {
                        Integer valueOf = Integer.valueOf(Q8);
                        int length3 = objArr.length;
                        int i9 = i6 + 1;
                        int d9 = MB.d(length3, i9);
                        if (d9 > length3) {
                            objArr = Arrays.copyOf(objArr, d9);
                        }
                        objArr[i6] = valueOf;
                        i6 = i9;
                    }
                    i4 = Q8 + 3;
                }
                C3523lC p9 = RB.p(objArr, i6);
                for (int i10 = 0; i10 < p9.f32527w; i10++) {
                    if (((Integer) p9.get(i10)).intValue() + 3 < length) {
                        C0 c02 = new C0(bArr, ((Integer) p9.get(i10)).intValue() + 3, length);
                        A3.r U8 = U(c02);
                        if (U8.f184a == 33 && U8.f185b == 0) {
                            c02.h(4);
                            int l9 = c02.l(3);
                            c02.e();
                            C4155wy V8 = V(c02, true, l9, null);
                            return AbstractC4305zm.a(V8.f35691a, V8.f35692b, V8.f35693c, V8.f35694d, V8.f35695e, V8.f35696f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static A3.r U(C0 c02) {
        c02.e();
        return new A3.r(c02.l(6), c02.l(6), c02.l(3) - 1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4155wy V(C0 c02, boolean z6, int i, C4155wy c4155wy) {
        int[] iArr;
        int i4;
        boolean z9;
        int i6;
        int i9;
        boolean z10;
        int i10;
        int i11;
        int[] iArr2 = new int[6];
        if (z6) {
            int l9 = c02.l(2);
            z10 = c02.k();
            i10 = c02.l(5);
            i11 = 0;
            for (int i12 = 0; i12 < 32; i12++) {
                if (c02.k()) {
                    i11 |= 1 << i12;
                }
            }
            for (int i13 = 0; i13 < 6; i13++) {
                iArr2[i13] = c02.l(8);
            }
            i4 = l9;
        } else {
            if (c4155wy == null) {
                iArr = iArr2;
                i4 = 0;
                z9 = false;
                i6 = 0;
                i9 = 0;
                int l10 = c02.l(8);
                int i14 = 0;
                for (int i15 = 0; i15 < i; i15++) {
                    if (c02.k()) {
                        i14 += 88;
                    }
                    if (c02.k()) {
                        i14 += 8;
                    }
                }
                c02.h(i14);
                if (i > 0) {
                    int i16 = 8 - i;
                    c02.h(i16 + i16);
                }
                return new C4155wy(i4, z9, i6, i9, iArr, l10);
            }
            int i17 = c4155wy.f35691a;
            z10 = c4155wy.f35692b;
            i10 = c4155wy.f35693c;
            i11 = c4155wy.f35694d;
            iArr2 = c4155wy.f35695e;
            i4 = i17;
        }
        iArr = iArr2;
        z9 = z10;
        i6 = i10;
        i9 = i11;
        int l102 = c02.l(8);
        int i142 = 0;
        while (i15 < i) {
        }
        c02.h(i142);
        if (i > 0) {
        }
        return new C4155wy(i4, z9, i6, i9, iArr, l102);
    }

    public static void W(C0 c02) {
        int n9 = c02.n() + 1;
        c02.h(8);
        for (int i = 0; i < n9; i++) {
            c02.n();
            c02.n();
            c02.e();
        }
        c02.h(20);
    }

    public static String X(DP dp) {
        String str;
        String str2 = dp.f25176o;
        if (Objects.equals(str2, "video/dolby-vision") && (str = dp.f25172k) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return com.anythink.basead.exoplayer.k.o.f9237h;
            }
            if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                return com.anythink.basead.exoplayer.k.o.i;
            }
        }
        return str2;
    }

    public static int a(int i) {
        int i4;
        int i6;
        int i9;
        int i10;
        if (!((i & (-2097152)) == -2097152) || (i4 = (i >>> 19) & 3) == 1 || (i6 = (i >>> 17) & 3) == 0 || (i9 = (i >>> 12) & 15) == 0 || i9 == 15 || (i10 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i11 = i9 - 1;
        int i12 = f28179u[i10];
        if (i4 == 2) {
            i12 /= 2;
        } else if (i4 == 0) {
            i12 /= 4;
        }
        int i13 = (i >>> 9) & 1;
        if (i6 == 3) {
            return ((((i4 == 3 ? f28180v[i11] : f28181w[i11]) * 12) / i12) + i13) * 4;
        }
        int i14 = i4 == 3 ? i6 == 2 ? f28182x[i11] : f28183y[i11] : f28184z[i11];
        if (i4 == 3) {
            return ((i14 * 144) / i12) + i13;
        }
        return (((i6 == 1 ? 72 : 144) * i14) / i12) + i13;
    }

    public static int b(int i, byte[] bArr) {
        int i4;
        synchronized (f28175o0) {
            int i6 = 0;
            int i9 = 0;
            while (i6 < i) {
                while (true) {
                    try {
                        if (i6 >= i - 2) {
                            i6 = i;
                            break;
                        }
                        int i10 = i6 + 1;
                        if (bArr[i6] == 0 && bArr[i10] == 0 && bArr[i6 + 2] == 3) {
                            break;
                        }
                        i6 = i10;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i6 < i) {
                    int[] iArr = f28176p0;
                    int length = iArr.length;
                    if (length <= i9) {
                        f28176p0 = Arrays.copyOf(iArr, length + length);
                    }
                    f28176p0[i9] = i6;
                    i6 += 3;
                    i9++;
                }
            }
            i4 = i - i9;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i9; i13++) {
                int i14 = f28176p0[i13] - i11;
                System.arraycopy(bArr, i11, bArr, i12, i14);
                int i15 = i12 + i14;
                int i16 = i15 + 1;
                bArr[i15] = 0;
                i12 = i15 + 2;
                bArr[i16] = 0;
                i11 += i14 + 3;
            }
            System.arraycopy(bArr, i11, bArr, i12, i4 - i12);
        }
        return i4;
    }

    public static int e(String str) {
        int i;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        int i4 = 0;
        int i6 = 0;
        while (true) {
            i = length & (-4);
            if (i4 >= i) {
                break;
            }
            int i9 = ((bytes[i4] & 255) | ((bytes[i4 + 1] & 255) << 8) | ((bytes[i4 + 2] & 255) << 16) | (bytes[i4 + 3] << 24)) * (-862048943);
            int i10 = i6 ^ (((i9 >>> 17) | (i9 << 15)) * 461845907);
            i6 = (((i10 >>> 19) | (i10 << 13)) * 5) - 430675100;
            i4 += 4;
        }
        int i11 = length & 3;
        if (i11 != 1) {
            if (i11 != 2) {
                r1 = i11 == 3 ? (bytes[i + 2] & 255) << 16 : 0;
                int i12 = i6 ^ length;
                int i13 = (i12 ^ (i12 >>> 16)) * (-2048144789);
                int i14 = (i13 ^ (i13 >>> 13)) * (-1028477387);
                return i14 ^ (i14 >>> 16);
            }
            r1 |= (bytes[i + 1] & 255) << 8;
        }
        int i15 = ((bytes[i] & 255) | r1) * (-862048943);
        i6 ^= ((i15 >>> 17) | (i15 << 15)) * 461845907;
        int i122 = i6 ^ length;
        int i132 = (i122 ^ (i122 >>> 16)) * (-2048144789);
        int i142 = (i132 ^ (i132 >>> 13)) * (-1028477387);
        return i142 ^ (i142 >>> 16);
    }

    public static long f(long j6, long j9, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j10 = j6 / j9;
        long j11 = j6 - (j9 * j10);
        if (j11 == 0) {
            return j10;
        }
        int i = ((int) ((j6 ^ j9) >> 63)) | 1;
        switch (PC.f27529a[roundingMode.ordinal()]) {
            case 1:
                QC.j(false);
                return j10;
            case 2:
                return j10;
            case 3:
                if (i >= 0) {
                    return j10;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j10;
                }
                break;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j11);
                long abs2 = abs - (Math.abs(j9) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j10) == 0)) {
                        return j10;
                    }
                } else if (abs2 <= 0) {
                    return j10;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j10 + i;
    }

    public static long g(String str) {
        String str2 = AbstractC3182eu.f30782a;
        String[] split = str.split("\\.", 2);
        long j6 = 0;
        for (String str3 : split[0].split(":", -1)) {
            j6 = (j6 * 60) + Long.parseLong(str3);
        }
        long j9 = j6 * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(trim));
            }
            j9 += Long.parseLong(trim);
        }
        return j9 * 1000;
    }

    public static W4 h(C3087d5 c3087d5) {
        long j6;
        boolean z6;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = c3087d5.f30481c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long r9 = str != null ? r(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z6 = false;
            j9 = 0;
            j10 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j10 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j9 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z6 = true;
                }
                i++;
            }
            j6 = 0;
            i = 1;
        } else {
            j6 = 0;
            z6 = false;
            j9 = 0;
            j10 = 0;
        }
        String str3 = (String) map.get("Expires");
        long r10 = str3 != null ? r(str3) : j6;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j11 = currentTimeMillis;
            j12 = r(str4);
        } else {
            j11 = currentTimeMillis;
            j12 = j6;
        }
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            long j15 = (j10 * 1000) + j11;
            j14 = z6 ? j15 : (j9 * 1000) + j15;
            j13 = j15;
        } else {
            j13 = (r9 <= j6 || r10 < r9) ? j6 : (r10 - r9) + j11;
            j14 = j13;
        }
        W4 w42 = new W4(0);
        w42.f29111a = c3087d5.f30480b;
        w42.f29112b = str5;
        w42.f29116f = j13;
        w42.f29115e = j14;
        w42.f29113c = r9;
        w42.f29114d = j12;
        w42.f29117g = map;
        w42.f29118h = c3087d5.f30482d;
        return w42;
    }

    public static String i(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static ArrayList j(ByteBuffer byteBuffer) {
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
            try {
                byte b9 = asReadOnlyBuffer.get();
                int i = b9 >> 3;
                if (((b9 >> 2) & 1) != 0) {
                    asReadOnlyBuffer.get();
                }
                int C8 = ((b9 >> 1) & 1) != 0 ? C(asReadOnlyBuffer) : asReadOnlyBuffer.remaining();
                if (asReadOnlyBuffer.position() + C8 > asReadOnlyBuffer.limit()) {
                    break;
                }
                duplicate.limit(asReadOnlyBuffer.position());
                ByteBuffer duplicate2 = asReadOnlyBuffer.duplicate();
                duplicate2.limit(asReadOnlyBuffer.position() + C8);
                arrayList.add(new C3200fB(i & 15, duplicate2));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + C8);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static C4969z0 k(Throwable th) {
        if (th instanceof C3554lq) {
            C3554lq c3554lq = (C3554lq) th;
            return B(c3554lq.f31218n, c3554lq.f32639u);
        }
        if (th instanceof C3231fp) {
            return th.getMessage() == null ? F(((C3231fp) th).f31218n, null, null) : F(((C3231fp) th).f31218n, th.getMessage(), null);
        }
        if (!(th instanceof w2.l)) {
            return F(1, null, null);
        }
        w2.l lVar = (w2.l) th;
        int i = lVar.f41686n;
        String message = lVar.getMessage();
        if (message == null) {
            message = "";
        }
        return new C4969z0(i, message, "com.google.android.gms.ads", null, null);
    }

    public static void l(int i, O3 o32, C3322hP c3322hP, O3 o33, O3... o3Arr) {
        if (o33 == null) {
            o33 = new O3(new InterfaceC3945t3[0]);
        }
        if (o32 != null) {
            PB pb = RB.f27933u;
            MA.q(4, "initialCapacity");
            Object[] objArr = new Object[4];
            int i4 = 0;
            for (InterfaceC3945t3 interfaceC3945t3 : o32.f27368a) {
                if (C3668nw.class.isAssignableFrom(interfaceC3945t3.getClass())) {
                    InterfaceC3945t3 interfaceC3945t32 = (InterfaceC3945t3) C3668nw.class.cast(interfaceC3945t3);
                    interfaceC3945t32.getClass();
                    int length = objArr.length;
                    int i6 = i4 + 1;
                    int d9 = MB.d(length, i6);
                    if (d9 > length) {
                        objArr = Arrays.copyOf(objArr, d9);
                    }
                    objArr[i4] = interfaceC3945t32;
                    i4 = i6;
                }
            }
            C3523lC p9 = RB.p(objArr, i4);
            int i9 = p9.f32527w;
            for (int i10 = 0; i10 < i9; i10++) {
                C3668nw c3668nw = (C3668nw) p9.get(i10);
                if (!c3668nw.f33595a.equals("com.android.capture.fps") || i == 2) {
                    o33 = o33.c(c3668nw);
                }
            }
        }
        for (O3 o34 : o3Arr) {
            o33 = o33.b(o34);
        }
        if (o33.f27368a.length > 0) {
            c3322hP.f31555k = o33;
        }
    }

    public static void m(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i4) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i4, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i4 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i4, 33);
    }

    public static boolean n(String str) {
        return str == null || str.isEmpty();
    }

    public static int o(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static float p(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long q(long j6, long j9) {
        QC.e("a", j6);
        QC.e("b", j9);
        if (j6 == 0) {
            return j9;
        }
        if (j9 == 0) {
            return j6;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j6);
        long j10 = j6 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j9);
        long j11 = j9 >> numberOfTrailingZeros2;
        while (j10 != j11) {
            long j12 = j10 - j11;
            long j13 = (j12 >> 63) & j12;
            long j14 = (j12 - j13) - j13;
            j10 = j14 >> Long.numberOfTrailingZeros(j14);
            j11 += j13;
        }
        return j10 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long r(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e9) {
            if ("0".equals(str) || "-1".equals(str)) {
                AbstractC3462k5.a("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", AbstractC3462k5.d("Unable to parse dateStr: %s, falling back to 0", str), e9);
            return 0L;
        }
    }

    public static PK s() {
        ClassLoader classLoader = SK.class.getClassLoader();
        if (PK.class.equals(PK.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0]) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e9) {
                    throw new IllegalStateException(e9);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new SK[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e10) {
                    Logger.getLogger(OK.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(PK.class.getSimpleName()), (Throwable) e10);
                }
            }
            if (arrayList.size() == 1) {
                return (PK) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (PK) PK.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static C4969z0 t(Throwable th, C3608mq c3608mq) {
        C4969z0 c4969z0;
        C4969z0 k9 = k(th);
        int i = k9.f40512n;
        if ((i == 3 || i == 0) && (c4969z0 = k9.f40515w) != null && !c4969z0.f40514v.equals("com.google.android.gms.ads")) {
            k9.f40515w = null;
        }
        if (c3608mq != null) {
            k9.f40516x = new BinderC3871rk(c3608mq.f33373e, "", c3608mq, c3608mq.f33372d, c3608mq.f33371c);
        }
        return k9;
    }

    public static boolean u(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ee, code lost:
    
        if (true != r4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f0, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f1, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
    
        if (true != r4) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] v(String str, boolean z6) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int i = 0;
        boolean z9 = false;
        int i4 = 0;
        while (i < str.length()) {
            int codePointAt = Character.codePointAt(charArray, i);
            int charCount = Character.charCount(codePointAt);
            if (Character.isLetter(codePointAt)) {
                Character.UnicodeBlock of = Character.UnicodeBlock.of(codePointAt);
                if (of.equals(Character.UnicodeBlock.BOPOMOFO) || of.equals(Character.UnicodeBlock.BOPOMOFO_EXTENDED) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || of.equals(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || of.equals(Character.UnicodeBlock.HANGUL_JAMO) || of.equals(Character.UnicodeBlock.HANGUL_SYLLABLES) || of.equals(Character.UnicodeBlock.HIRAGANA) || of.equals(Character.UnicodeBlock.KATAKANA) || of.equals(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) || ((codePointAt >= 65382 && codePointAt <= 65437) || (codePointAt >= 65441 && codePointAt <= 65500))) {
                    if (z9) {
                        arrayList.add(new String(charArray, i4, i - i4));
                    }
                    arrayList.add(new String(charArray, i, charCount));
                    z9 = false;
                    i += charCount;
                }
            }
            if (!Character.isLetterOrDigit(codePointAt) && Character.getType(codePointAt) != 6 && Character.getType(codePointAt) != 8) {
                if (!z6 || Character.charCount(codePointAt) != 1 || Character.toChars(codePointAt)[0] != '\'') {
                    if (z9) {
                        arrayList.add(new String(charArray, i4, i - i4));
                    }
                    z9 = false;
                }
            }
            i += charCount;
        }
        if (z9) {
            arrayList.add(new String(charArray, i4, i - i4));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int w(SQLiteDatabase sQLiteDatabase, int i) {
        int i4 = 0;
        if (i == 2) {
            return 0;
        }
        Cursor M8 = M(sQLiteDatabase, i);
        if (M8.getCount() > 0) {
            M8.moveToNext();
            i4 = M8.getInt(M8.getColumnIndexOrThrow("value"));
        }
        M8.close();
        return i4;
    }

    public static int x(DP dp) {
        String X8 = X(dp);
        if (Objects.equals(X8, com.anythink.basead.exoplayer.k.o.f9237h)) {
            return 1;
        }
        return (Objects.equals(X8, com.anythink.basead.exoplayer.k.o.i) || Objects.equals(X8, "video/vvc")) ? 2 : 0;
    }

    public static long y(long j6, long j9) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j9) + Long.numberOfLeadingZeros(j9) + Long.numberOfLeadingZeros(~j6) + Long.numberOfLeadingZeros(j6);
        if (numberOfLeadingZeros > 65) {
            return j6 * j9;
        }
        long j10 = j6 ^ j9;
        long j11 = (j10 >>> 63) + Long.MAX_VALUE;
        if (!((numberOfLeadingZeros < 64) | ((j9 == Long.MIN_VALUE) & (j6 < 0)))) {
            long j12 = j6 * j9;
            if (j6 == 0 || j12 / j6 == j9) {
                return j12;
            }
        }
        return j11;
    }

    public static S0.s z(Cr cr) {
        cr.G(1);
        int O8 = cr.O();
        long j6 = cr.f24998b;
        long j9 = O8;
        int i = O8 / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i4 = 0;
        while (true) {
            if (i4 >= i) {
                break;
            }
            long d9 = cr.d();
            if (d9 == -1) {
                jArr = Arrays.copyOf(jArr, i4);
                jArr2 = Arrays.copyOf(jArr2, i4);
                break;
            }
            jArr[i4] = d9;
            jArr2[i4] = cr.d();
            cr.G(2);
            i4++;
        }
        cr.G((int) ((j6 + j9) - cr.f24998b));
        return new S0.s(10, jArr, jArr2);
    }
}
