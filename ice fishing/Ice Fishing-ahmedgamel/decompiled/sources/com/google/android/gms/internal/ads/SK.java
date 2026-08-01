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
import p2.C4835j;
import q2.C4920z0;

/* loaded from: classes2.dex */
public abstract class SK implements T0 {

    /* renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f27468w0 = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f27455n = {com.anythink.basead.exoplayer.k.o.f8463u, com.anythink.basead.exoplayer.k.o.f8464v, com.anythink.basead.exoplayer.k.o.f8462t};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f27463u = {44100, 48000, 32000};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f27465v = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f27467w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f27469x = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f27470y = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f27471z = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: A, reason: collision with root package name */
    public static final C3493l5 f27431A = new C3493l5("gads:afs:csa:experiment_id", "", 4);

    /* renamed from: B, reason: collision with root package name */
    public static final C3493l5 f27432B = new C3493l5("gads:app_index:experiment_id", "", 4);

    /* renamed from: C, reason: collision with root package name */
    public static final C3493l5 f27433C = new C3493l5("gads:block_autoclicks_experiment_id", "", 4);

    /* renamed from: D, reason: collision with root package name */
    public static final C3493l5 f27434D = new C3493l5("gads:sdk_core_experiment_id", "", 4);

    /* renamed from: E, reason: collision with root package name */
    public static final C3493l5 f27435E = new C3493l5("gads:spam_app_context:experiment_id", "", 4);

    /* renamed from: F, reason: collision with root package name */
    public static final C3493l5 f27436F = new C3493l5("gads:temporary_experiment_id:1", "", 4);

    /* renamed from: G, reason: collision with root package name */
    public static final C3493l5 f27437G = new C3493l5("gads:temporary_experiment_id:10", "", 4);

    /* renamed from: H, reason: collision with root package name */
    public static final C3493l5 f27438H = new C3493l5("gads:temporary_experiment_id:11", "", 4);

    /* renamed from: I, reason: collision with root package name */
    public static final C3493l5 f27439I = new C3493l5("gads:temporary_experiment_id:12", "", 4);
    public static final C3493l5 J = new C3493l5("gads:temporary_experiment_id:13", "", 4);

    /* renamed from: K, reason: collision with root package name */
    public static final C3493l5 f27440K = new C3493l5("gads:temporary_experiment_id:14", "", 4);

    /* renamed from: L, reason: collision with root package name */
    public static final C3493l5 f27441L = new C3493l5("gads:temporary_experiment_id:15", "", 4);

    /* renamed from: M, reason: collision with root package name */
    public static final C3493l5 f27442M = new C3493l5("gads:temporary_experiment_id:2", "", 4);

    /* renamed from: N, reason: collision with root package name */
    public static final C3493l5 f27443N = new C3493l5("gads:temporary_experiment_id:3", "", 4);

    /* renamed from: O, reason: collision with root package name */
    public static final C3493l5 f27444O = new C3493l5("gads:temporary_experiment_id:4", "", 4);

    /* renamed from: P, reason: collision with root package name */
    public static final C3493l5 f27445P = new C3493l5("gads:temporary_experiment_id:5", "", 4);

    /* renamed from: Q, reason: collision with root package name */
    public static final C3493l5 f27446Q = new C3493l5("gads:temporary_experiment_id:6", "", 4);

    /* renamed from: R, reason: collision with root package name */
    public static final C3493l5 f27447R = new C3493l5("gads:temporary_experiment_id:7", "", 4);

    /* renamed from: S, reason: collision with root package name */
    public static final C3493l5 f27448S = new C3493l5("gads:temporary_experiment_id:8", "", 4);

    /* renamed from: T, reason: collision with root package name */
    public static final C3493l5 f27449T = new C3493l5("gads:temporary_experiment_id:9", "", 4);

    /* renamed from: U, reason: collision with root package name */
    public static final C3493l5 f27450U = new C3493l5("gads:corewebview:experiment_id", "", 4);

    /* renamed from: V, reason: collision with root package name */
    public static final C4089w8 f27451V = new C4089w8(11);

    /* renamed from: W, reason: collision with root package name */
    public static final C4089w8 f27452W = new C4089w8(17);

    /* renamed from: X, reason: collision with root package name */
    public static final C2812Ul f27453X = new C2812Ul(1);
    public static final C2812Ul Y = new C2812Ul(12);

    /* renamed from: Z, reason: collision with root package name */
    public static final C2812Ul f27454Z = new C2812Ul(18);

    /* renamed from: n0, reason: collision with root package name */
    public static final C2812Ul f27456n0 = new C2812Ul(23);

    /* renamed from: o0, reason: collision with root package name */
    public static final Bs f27457o0 = new Bs(4);

    /* renamed from: p0, reason: collision with root package name */
    public static final Bs f27458p0 = new Bs(10);

    /* renamed from: q0, reason: collision with root package name */
    public static final Bs f27459q0 = new Bs(15);

    /* renamed from: r0, reason: collision with root package name */
    public static final byte[] f27460r0 = {0, 0, 0, 1};

    /* renamed from: s0, reason: collision with root package name */
    public static final float[] f27461s0 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: t0, reason: collision with root package name */
    public static final Object f27462t0 = new Object();

    /* renamed from: u0, reason: collision with root package name */
    public static int[] f27464u0 = new int[10];

    /* renamed from: v0, reason: collision with root package name */
    public static final int[] f27466v0 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

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
            C4835j.f39733C.f39743h.d("OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent", th);
            return resolveInfo;
        }
    }

    public static C4920z0 B(int i, C4920z0 c4920z0) {
        if (i == 0) {
            throw null;
        }
        if (i == 8) {
            if (((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.v9)).intValue() > 0) {
                return c4920z0;
            }
            i = 8;
        }
        return F(i, null, c4920z0);
    }

    public static int C(ByteBuffer byteBuffer) {
        int i = 0;
        for (int i6 = 0; i6 < 8; i6++) {
            byte b9 = byteBuffer.get();
            i |= (b9 & Byte.MAX_VALUE) << (i6 * 7);
            if ((b9 & com.anythink.core.common.s.a.c.f16316a) == 0) {
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

    public static C3222g2 E(int i, String str, Cr cr) {
        int b9 = cr.b();
        if (cr.b() == 1684108385) {
            cr.G(8);
            return new C3222g2(str, null, RB.j(cr.l(b9 - 16)));
        }
        AbstractC2968bG.y("MetadataUtil", "Failed to parse text attribute: ".concat(AbstractC3376ix.g(i)));
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C4920z0 F(int i, String str, C4920z0 c4920z0) {
        String str2;
        int i6 = i - 1;
        if (str == null) {
            if (i == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i6) {
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
                    if (((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.y9)).intValue() <= 0) {
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
        int i9 = 0;
        int i10 = 2;
        switch (i6) {
            case 0:
            case 11:
            case 15:
                i10 = i9;
                return new C4920z0(i10, str3, "com.google.android.gms.ads", c4920z0, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i10 = 1;
                return new C4920z0(i10, str3, "com.google.android.gms.ads", c4920z0, null);
            case 2:
            case 10:
            case 18:
                i10 = 3;
                return new C4920z0(i10, str3, "com.google.android.gms.ads", c4920z0, null);
            case 3:
                i9 = 8;
                i10 = i9;
                return new C4920z0(i10, str3, "com.google.android.gms.ads", c4920z0, null);
            case 4:
            case 8:
            case 17:
                return new C4920z0(i10, str3, "com.google.android.gms.ads", c4920z0, null);
            case 7:
                i9 = 4;
                i10 = i9;
                return new C4920z0(i10, str3, "com.google.android.gms.ads", c4920z0, null);
            case 12:
                if (((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.y9)).intValue() <= 0) {
                    i9 = 9;
                    i10 = i9;
                    return new C4920z0(i10, str3, "com.google.android.gms.ads", c4920z0, null);
                }
                i10 = 3;
                return new C4920z0(i10, str3, "com.google.android.gms.ads", c4920z0, null);
            case 13:
                i9 = 10;
                i10 = i9;
                return new C4920z0(i10, str3, "com.google.android.gms.ads", c4920z0, null);
            case 14:
                i9 = 11;
                i10 = i9;
                return new C4920z0(i10, str3, "com.google.android.gms.ads", c4920z0, null);
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
        int i6;
        String str = dp.f24431o;
        if (Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8451h)) {
            byte b9 = bArr[4];
            if (((b9 & 96) >> 5) == 0 && ((i6 = b9 & 31) == 1 || i6 == 9 || i6 == 14)) {
                return false;
            }
        } else if (Objects.equals(str, com.anythink.basead.exoplayer.k.o.i)) {
            X2.b U3 = U(new C0(bArr, 4, i + 4));
            int i9 = U3.f3771a;
            if (i9 == 35) {
                return false;
            }
            if (i9 <= 14 && i9 % 2 == 0) {
                if (U3.f3773c == dp.f24408G - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static AbstractC2900a2 H(int i, String str, Cr cr, boolean z3, boolean z6) {
        int K7 = K(cr);
        if (z6) {
            K7 = Math.min(1, K7);
        }
        if (K7 >= 0) {
            return z3 ? new C3222g2(str, null, RB.j(Integer.toString(K7))) : new Y1(com.anythink.basead.exoplayer.b.ar, str, Integer.toString(K7));
        }
        AbstractC2968bG.y("MetadataUtil", "Failed to parse uint8 attribute: ".concat(AbstractC3376ix.g(i)));
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
    public static C3390jA I(byte[] bArr, int i, int i6) {
        int n9;
        int i9;
        int i10;
        int n10;
        int i11;
        int n11;
        boolean k9;
        int i12;
        int i13;
        int i14;
        float f3;
        int i15;
        int i16;
        int i17;
        float f9;
        int i18;
        int i19;
        int i20;
        boolean k10;
        boolean k11;
        int i21;
        C0 c02 = new C0(bArr, i, i6);
        int l9 = c02.l(8);
        int l10 = c02.l(8);
        int l11 = c02.l(8);
        int n12 = c02.n();
        if (l9 != 100 && l9 != 110 && l9 != 122 && l9 != 244 && l9 != 44 && l9 != 83 && l9 != 86 && l9 != 118 && l9 != 128) {
            if (l9 != 138) {
                n9 = 1;
                i10 = 16;
                i11 = 0;
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
                    for (int i22 = 0; i22 < n13; i22++) {
                        c02.n();
                    }
                }
                c02.n();
                c02.e();
                int n14 = c02.n() + 1;
                int n15 = c02.n() + 1;
                k9 = c02.k();
                int i23 = 2 - (k9 ? 1 : 0);
                if (!k9) {
                    c02.e();
                }
                c02.e();
                int i24 = n14 * 16;
                int i25 = n15 * i23 * 16;
                if (c02.k()) {
                    int n16 = c02.n();
                    int n17 = c02.n();
                    int n18 = c02.n();
                    int n19 = c02.n();
                    if (n9 == 0) {
                        i21 = 1;
                    } else {
                        i21 = n9 == 3 ? 1 : 2;
                        i23 *= n9 == 1 ? 2 : 1;
                    }
                    i24 -= (n16 + n17) * i21;
                    i25 -= (n18 + n19) * i23;
                }
                int i26 = i25;
                int i27 = i24;
                if (l9 != 44 || l9 == 86 || l9 == 100 || l9 == 110 || l9 == 122) {
                    i12 = l9;
                } else {
                    i12 = 244;
                    if (l9 != 244) {
                        i13 = i10;
                        if (c02.k()) {
                            if (c02.k()) {
                                int l12 = c02.l(8);
                                if (l12 == 255) {
                                    int i28 = i10;
                                    int l13 = c02.l(i28);
                                    int l14 = c02.l(i28);
                                    if (l13 != 0 && l14 != 0) {
                                        f9 = l13 / l14;
                                        if (c02.k()) {
                                            c02.e();
                                        }
                                        if (c02.k()) {
                                            c02.h(3);
                                            int i29 = true != c02.k() ? 2 : 1;
                                            if (c02.k()) {
                                                int l15 = c02.l(8);
                                                int l16 = c02.l(8);
                                                c02.h(8);
                                                int b9 = KJ.b(l15);
                                                int i30 = i29;
                                                i19 = KJ.c(l16);
                                                i18 = b9;
                                                i20 = i30;
                                            } else {
                                                i20 = i29;
                                                i18 = -1;
                                                i19 = -1;
                                            }
                                        } else {
                                            i18 = -1;
                                            i19 = -1;
                                            i20 = -1;
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
                                            i13 = c02.n();
                                            c02.n();
                                        }
                                        i15 = i18;
                                        i16 = i20;
                                        i14 = i13;
                                        f3 = f9;
                                        i17 = i19;
                                    }
                                } else if (l12 < 17) {
                                    f9 = f27461s0[l12];
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
                                    i15 = i18;
                                    i16 = i20;
                                    i14 = i13;
                                    f3 = f9;
                                    i17 = i19;
                                } else {
                                    com.anythink.basead.exoplayer.f.f.q(l12, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil", new StringBuilder(String.valueOf(l12).length() + 35));
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
                            i15 = i18;
                            i16 = i20;
                            i14 = i13;
                            f3 = f9;
                            i17 = i19;
                        } else {
                            i14 = i13;
                            f3 = 1.0f;
                            i15 = -1;
                            i16 = -1;
                            i17 = -1;
                        }
                        return new C3390jA(l9, l10, l11, n12, i27, i26, f3, i11, n10, i15, i16, i17, i14);
                    }
                }
                if ((l10 & 16) == 0) {
                    l9 = i12;
                    i13 = 0;
                } else {
                    i13 = i10;
                    l9 = i12;
                }
                if (c02.k()) {
                }
                return new C3390jA(l9, l10, l11, n12, i27, i26, f3, i11, n10, i15, i16, i17, i14);
            }
            l9 = 138;
        }
        n9 = c02.n();
        if (n9 == 3) {
            c02.k();
            i9 = 3;
        } else {
            i9 = n9;
        }
        i10 = 16;
        int n20 = c02.n();
        n10 = c02.n();
        c02.e();
        if (c02.k()) {
            int i31 = i9 != 3 ? 8 : 12;
            int i32 = 0;
            while (i32 < i31) {
                if (c02.k()) {
                    int i33 = i32 < 6 ? 16 : 64;
                    int i34 = 8;
                    int i35 = 8;
                    for (int i36 = 0; i36 < i33; i36++) {
                        if (i34 != 0) {
                            i34 = ((c02.m() + i35) + 256) % 256;
                        }
                        if (i34 != 0) {
                            i35 = i34;
                        }
                    }
                }
                i32++;
            }
        }
        i11 = n20;
        c02.n();
        n11 = c02.n();
        if (n11 != 0) {
        }
        c02.n();
        c02.e();
        int n142 = c02.n() + 1;
        int n152 = c02.n() + 1;
        k9 = c02.k();
        int i232 = 2 - (k9 ? 1 : 0);
        if (!k9) {
        }
        c02.e();
        int i242 = n142 * 16;
        int i252 = n152 * i232 * 16;
        if (c02.k()) {
        }
        int i262 = i252;
        int i272 = i242;
        if (l9 != 44) {
        }
        i12 = l9;
        if ((l10 & 16) == 0) {
        }
        if (c02.k()) {
        }
        return new C3390jA(l9, l10, l11, n12, i272, i262, f3, i11, n10, i15, i16, i17, i14);
    }

    public static void J(SQLiteDatabase sQLiteDatabase, long j6, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.anythink.expressad.foundation.d.d.f18596u, Long.valueOf(j6));
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
        AbstractC2968bG.y("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2570Gf L(byte[] bArr, int i, int i6) {
        int[] iArr;
        C2991bm c2991bm;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z3;
        boolean z6;
        int i13;
        int[] iArr2;
        boolean[][] zArr;
        int i14;
        C3500lC c3500lC;
        boolean[][] zArr2;
        int[] iArr3;
        int i15;
        int i16;
        int i17;
        boolean k9;
        int i18;
        int i19;
        int i20;
        int i21;
        int n9;
        int i22;
        int i23;
        boolean z9;
        boolean z10;
        C0 c02 = new C0(bArr, i, i6);
        U(c02);
        c02.h(4);
        boolean k10 = c02.k();
        boolean k11 = c02.k();
        int l9 = c02.l(6);
        int i24 = l9 + 1;
        int l10 = c02.l(3);
        c02.h(17);
        C4132wy V8 = V(c02, true, l10, null);
        for (int i25 = true != c02.k() ? l10 : 0; i25 <= l10; i25++) {
            c02.n();
            c02.n();
            c02.n();
        }
        int l11 = c02.l(6);
        int n10 = c02.n() + 1;
        int i26 = 6;
        S0.l lVar = new S0.l(RB.j(V8), new int[1]);
        boolean z11 = i24 >= 2 && n10 >= 2;
        boolean z12 = k10 && k11;
        int i27 = l11 + 1;
        if (!z11 || !z12 || i27 < i24) {
            return new C2570Gf((C3500lC) null, lVar, (S0.s) null, (C2991bm) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, n10, i27);
        int i28 = 1;
        int[] iArr5 = new int[n10];
        int[] iArr6 = new int[n10];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i29 = 1; i29 < n10; i29++) {
            int i30 = 0;
            for (int i31 = 0; i31 <= l11; i31++) {
                if (c02.k()) {
                    iArr4[i29][i30] = i31;
                    iArr6[i29] = i31;
                    i30++;
                }
                iArr5[i29] = i30;
            }
        }
        if (c02.k()) {
            c02.h(64);
            if (c02.k()) {
                c02.n();
            }
            int n11 = c02.n();
            int i32 = 0;
            while (i32 < n11) {
                c02.n();
                if (i32 == 0 || c02.k()) {
                    boolean k12 = c02.k();
                    boolean k13 = c02.k();
                    z10 = k12;
                    z9 = k13;
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
                        i19 = k12;
                        i18 = k13;
                        i20 = 0;
                        while (i20 <= l10) {
                            if (c02.k() || c02.k()) {
                                c02.n();
                            } else if (c02.k()) {
                                i21 = i32;
                                n9 = 0;
                                int[][] iArr7 = iArr4;
                                i22 = i19 + i18;
                                int[] iArr8 = iArr6;
                                i23 = 0;
                                while (i23 < i22) {
                                    int i33 = i22;
                                    for (int i34 = 0; i34 <= n9; i34++) {
                                        c02.n();
                                        c02.n();
                                        if (k9) {
                                            c02.n();
                                            c02.n();
                                        }
                                        c02.e();
                                    }
                                    i23++;
                                    i22 = i33;
                                }
                                i20++;
                                iArr4 = iArr7;
                                i32 = i21;
                                iArr6 = iArr8;
                            }
                            i21 = i32;
                            n9 = c02.n();
                            int[][] iArr72 = iArr4;
                            i22 = i19 + i18;
                            int[] iArr82 = iArr6;
                            i23 = 0;
                            while (i23 < i22) {
                            }
                            i20++;
                            iArr4 = iArr72;
                            i32 = i21;
                            iArr6 = iArr82;
                        }
                        i32++;
                    }
                } else {
                    z10 = false;
                    z9 = false;
                }
                k9 = false;
                i19 = z10;
                i18 = z9;
                i20 = 0;
                while (i20 <= l10) {
                }
                i32++;
            }
        }
        int[][] iArr9 = iArr4;
        int[] iArr10 = iArr6;
        if (!c02.k()) {
            return new C2570Gf((C3500lC) null, lVar, (S0.s) null, (C2991bm) null);
        }
        int i35 = c02.f24006x;
        if (i35 > 0) {
            c02.h(8 - i35);
        }
        C4132wy V9 = V(c02, false, l10, V8);
        boolean k14 = c02.k();
        boolean[] zArr3 = new boolean[16];
        int i36 = 0;
        for (int i37 = 0; i37 < 16; i37++) {
            boolean k15 = c02.k();
            zArr3[i37] = k15;
            if (k15) {
                i36++;
            }
        }
        if (i36 == 0 || !zArr3[1]) {
            return new C2570Gf((C3500lC) null, lVar, (S0.s) null, (C2991bm) null);
        }
        int i38 = i36 + 1;
        int[] iArr11 = new int[i36];
        for (int i39 = 0; i39 < i36 - (k14 ? 1 : 0); i39++) {
            iArr11[i39] = c02.l(3);
        }
        int[] iArr12 = new int[i38];
        if (k14) {
            for (int i40 = 1; i40 < i36; i40++) {
                for (int i41 = 0; i41 < i40; i41++) {
                    iArr12[i40] = iArr11[i41] + 1 + iArr12[i40];
                }
            }
            iArr12[i36] = 6;
        }
        int[][] iArr13 = (int[][]) Array.newInstance((Class<?>) cls, i24, i36);
        int[] iArr14 = new int[i24];
        iArr14[0] = 0;
        boolean k16 = c02.k();
        int i42 = 1;
        while (i42 < i24) {
            if (k16) {
                iArr14[i42] = c02.l(i26);
            } else {
                iArr14[i42] = i42;
            }
            if (k14) {
                i17 = i42;
                for (int i43 = 0; i43 < i36; i43++) {
                    iArr13[i17][i43] = (iArr14[i17] & ((1 << iArr12[r32]) - 1)) >> iArr12[i43];
                }
            } else {
                int i44 = 0;
                while (i44 < i36) {
                    iArr13[i42][i44] = c02.l(iArr11[i44] + 1);
                    i44++;
                    i42 = i42;
                }
                i17 = i42;
            }
            i42 = i17 + 1;
            i26 = 6;
        }
        int[] iArr15 = new int[i27];
        int i45 = 1;
        int i46 = 0;
        while (i46 < i24) {
            iArr15[iArr14[i46]] = -1;
            int[] iArr16 = iArr15;
            int i47 = 0;
            int i48 = 0;
            while (i47 < 16) {
                if (zArr3[i47]) {
                    i16 = i28;
                    if (i47 == i16) {
                        iArr16[iArr14[i46]] = iArr13[i46][i48];
                        i47 = i16;
                    }
                    i48++;
                } else {
                    i16 = i28;
                }
                i47 += i16;
                i28 = i16;
            }
            if (i46 > 0) {
                int i49 = 0;
                while (true) {
                    if (i49 >= i46) {
                        i45++;
                        break;
                    }
                    int i50 = i49;
                    if (iArr16[iArr14[i46]] == iArr16[iArr14[i49]]) {
                        break;
                    }
                    i49 = i50 + 1;
                }
            }
            i46++;
            iArr15 = iArr16;
            i28 = 1;
        }
        int[] iArr17 = iArr15;
        int l12 = c02.l(4);
        if (i45 < 2 || l12 == 0) {
            return new C2570Gf((C3500lC) null, lVar, (S0.s) null, (C2991bm) null);
        }
        int[] iArr18 = new int[i45];
        for (int i51 = 0; i51 < i45; i51++) {
            iArr18[i51] = c02.l(l12);
        }
        int[] iArr19 = new int[i27];
        for (int i52 = 0; i52 < i24; i52++) {
            iArr19[Math.min(iArr14[i52], l11)] = i52;
        }
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i53 = i45;
        int i54 = 0;
        int i55 = 0;
        while (i55 <= l11) {
            int[] iArr20 = iArr19;
            int[] iArr21 = iArr14;
            int min = Math.min(iArr17[i55], i53 - 1);
            int i56 = i55;
            Xx xx = new Xx(iArr20[i56], min >= 0 ? iArr18[min] : -1);
            int length = objArr.length;
            int i57 = i54 + 1;
            int d2 = MB.d(length, i57);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i54] = xx;
            i55 = i56 + 1;
            i54 = i57;
            iArr19 = iArr20;
            iArr14 = iArr21;
        }
        int[] iArr22 = iArr14;
        C3500lC p9 = RB.p(objArr, i54);
        if (((Xx) p9.get(0)).f28612b == -1) {
            return new C2570Gf((C3500lC) null, lVar, (S0.s) null, (C2991bm) null);
        }
        int i58 = 1;
        while (true) {
            if (i58 > l11) {
                i58 = -1;
                break;
            }
            if (((Xx) p9.get(i58)).f28612b != -1) {
                break;
            }
            i58++;
        }
        if (i58 == -1) {
            return new C2570Gf((C3500lC) null, lVar, (S0.s) null, (C2991bm) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i24, i24);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i24, i24);
        int i59 = 1;
        while (i59 < i24) {
            boolean[][] zArr6 = zArr5;
            for (int i60 = 0; i60 < i59; i60++) {
                boolean[] zArr7 = zArr4[i59];
                boolean[] zArr8 = zArr6[i59];
                boolean k17 = c02.k();
                zArr8[i60] = k17;
                zArr7[i60] = k17;
            }
            i59++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i61 = 1; i61 < i24; i61++) {
            int i62 = 0;
            while (i62 < l9) {
                boolean[][] zArr10 = zArr4;
                int i63 = 0;
                while (true) {
                    if (i63 < i61) {
                        boolean[] zArr11 = zArr9[i61];
                        if (zArr11[i63] && zArr9[i63][i62]) {
                            zArr11[i62] = true;
                            break;
                        }
                        i63++;
                    }
                }
                i62++;
                zArr4 = zArr10;
            }
        }
        boolean[][] zArr12 = zArr4;
        int[] iArr23 = new int[i27];
        for (int i64 = 0; i64 < i24; i64++) {
            int i65 = 0;
            for (int i66 = 0; i66 < i64; i66++) {
                i65 += zArr12[i64][i66] ? 1 : 0;
            }
            iArr23[iArr22[i64]] = i65;
        }
        int i67 = 0;
        for (int i68 = 0; i68 < i24; i68++) {
            if (iArr23[iArr22[i68]] == 0) {
                i67++;
            }
        }
        if (i67 > 1) {
            return new C2570Gf((C3500lC) null, lVar, (S0.s) null, (C2991bm) null);
        }
        int[] iArr24 = new int[i24];
        int[] iArr25 = new int[n10];
        if (c02.k()) {
            iArr = iArr23;
            int i69 = 0;
            while (i69 < i24) {
                int i70 = i69;
                iArr24[i70] = c02.l(3);
                i69 = i70 + 1;
            }
        } else {
            iArr = iArr23;
            Arrays.fill(iArr24, 0, i24, l10);
        }
        int i71 = 0;
        while (i71 < n10) {
            int i72 = i71;
            int[] iArr26 = iArr24;
            int[] iArr27 = iArr25;
            int i73 = 0;
            for (int i74 = 0; i74 < iArr5[i72]; i74++) {
                i73 = Math.max(i73, iArr26[((Xx) p9.get(iArr9[i72][i74])).f28611a]);
            }
            iArr27[i72] = i73 + 1;
            i71 = i72 + 1;
            iArr24 = iArr26;
            iArr25 = iArr27;
        }
        int[] iArr28 = iArr25;
        if (c02.k()) {
            int i75 = 0;
            while (i75 < l9) {
                int i76 = i75 + 1;
                int i77 = i76;
                while (i77 < i24) {
                    if (zArr12[i77][i75]) {
                        i15 = l9;
                        c02.h(3);
                    } else {
                        i15 = l9;
                    }
                    i77++;
                    l9 = i15;
                }
                i75 = i76;
            }
        }
        c02.e();
        int n12 = c02.n() + 1;
        OB ob = new OB(4);
        ob.a(V8);
        if (n12 > 1) {
            ob.a(V9);
            for (int i78 = 2; i78 < n12; i78++) {
                V9 = V(c02, c02.k(), l10, V9);
                ob.a(V9);
            }
        }
        C3500lC f3 = ob.f();
        int n13 = c02.n() + n10;
        if (n13 > n10) {
            return new C2570Gf((C3500lC) null, lVar, (S0.s) null, (C2991bm) null);
        }
        int l13 = c02.l(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, n13, i27);
        int[] iArr29 = new int[n13];
        int i79 = 0;
        int[] iArr30 = new int[n13];
        int i80 = 0;
        while (i80 < n10) {
            iArr29[i80] = i79;
            int i81 = i80;
            int i82 = iArr10[i81];
            iArr30[i81] = i82;
            if (l13 == 0) {
                zArr2 = zArr13;
                c3500lC = f3;
                iArr3 = iArr29;
                Arrays.fill(zArr13[i81], i79, iArr5[i81], true);
                iArr3[i81] = iArr5[i81];
            } else {
                c3500lC = f3;
                zArr2 = zArr13;
                iArr3 = iArr29;
                if (l13 == 1) {
                    for (int i83 = 0; i83 < iArr5[i81]; i83++) {
                        zArr2[i81][i83] = iArr9[i81][i83] == i82;
                    }
                    iArr3[i81] = 1;
                } else {
                    i79 = 0;
                    zArr2[0][0] = true;
                    iArr3[0] = 1;
                    i80 = i81 + 1;
                    zArr13 = zArr2;
                    iArr29 = iArr3;
                    f3 = c3500lC;
                }
            }
            i79 = 0;
            i80 = i81 + 1;
            zArr13 = zArr2;
            iArr29 = iArr3;
            f3 = c3500lC;
        }
        C3500lC c3500lC2 = f3;
        boolean[][] zArr14 = zArr13;
        int[] iArr31 = iArr29;
        int[] iArr32 = new int[i27];
        int i84 = 2;
        int[] iArr33 = new int[2];
        iArr33[1] = i27;
        iArr33[i79] = n13;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr33);
        int i85 = 1;
        int i86 = 0;
        while (i85 < n13) {
            if (l13 == i84) {
                for (int i87 = 0; i87 < iArr5[i85]; i87++) {
                    zArr14[i85][i87] = c02.k();
                    int i88 = iArr31[i85];
                    boolean z13 = zArr14[i85][i87];
                    iArr31[i85] = i88 + (z13 ? 1 : 0);
                    if (z13) {
                        iArr30[i85] = iArr9[i85][i87];
                    }
                }
            }
            if (i86 == 0) {
                i13 = 0;
                if (iArr9[i85][0] == 0 && zArr14[i85][0]) {
                    i86 = 0;
                    for (int i89 = 1; i89 < iArr5[i85]; i89++) {
                        if (iArr9[i85][i89] == i58 && zArr14[i85][i58]) {
                            i86 = i85;
                        }
                    }
                } else {
                    i86 = 0;
                }
            } else {
                i13 = 0;
            }
            int i90 = i13;
            while (i90 < iArr5[i85]) {
                if (n12 > 1) {
                    zArr15[i85][i90] = zArr14[i85][i90];
                    iArr2 = iArr32;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int b9 = MC.b(n12);
                    if (!zArr[i85][i90]) {
                        Xx xx2 = (Xx) p9.get(iArr9[i85][i90]);
                        i14 = n12;
                        int i91 = i13;
                        while (true) {
                            if (i91 >= i90) {
                                break;
                            }
                            int i92 = i91;
                            if (zArr9[xx2.f28611a][((Xx) p9.get(iArr9[i85][i92])).f28611a]) {
                                zArr[i85][i90] = true;
                                break;
                            }
                            i91 = i92 + 1;
                        }
                    } else {
                        i14 = n12;
                    }
                    if (zArr[i85][i90]) {
                        if (i86 <= 0 || i85 != i86) {
                            c02.h(b9);
                        } else {
                            iArr2[i90] = c02.l(b9);
                        }
                    }
                } else {
                    iArr2 = iArr32;
                    zArr = zArr15;
                    i14 = n12;
                }
                i90++;
                iArr32 = iArr2;
                zArr15 = zArr;
                n12 = i14;
            }
            int[] iArr34 = iArr32;
            boolean[][] zArr16 = zArr15;
            int i93 = n12;
            if (iArr31[i85] == 1 && iArr[iArr30[i85]] > 0) {
                c02.e();
            }
            i85++;
            iArr32 = iArr34;
            zArr15 = zArr16;
            n12 = i93;
            i84 = 2;
        }
        int[] iArr35 = iArr32;
        boolean[][] zArr17 = zArr15;
        if (i86 == 0) {
            return new C2570Gf((C3500lC) null, lVar, (S0.s) null, (C2991bm) null);
        }
        int n14 = c02.n();
        int i94 = n14 + 1;
        MA.q(i94, "expectedSize");
        MA.q(i94, "initialCapacity");
        int[] iArr36 = new int[i24];
        Object[] objArr2 = new Object[i94];
        int i95 = 0;
        int i96 = 0;
        boolean z14 = false;
        while (i95 < i94) {
            int l14 = c02.l(16);
            int l15 = c02.l(16);
            if (c02.k()) {
                i9 = i95;
                i10 = c02.l(2);
                if (i10 == 3) {
                    c02.e();
                }
                i11 = c02.l(4);
                i12 = c02.l(4);
            } else {
                i9 = i95;
                i10 = 0;
                i11 = 0;
                i12 = 0;
            }
            if (c02.k()) {
                int n15 = c02.n();
                int n16 = c02.n();
                int n17 = c02.n();
                int n18 = c02.n();
                z3 = z14;
                l14 -= (n15 + n16) * ((i10 == 1 || i10 == 2) ? 2 : 1);
                l15 -= (n17 + n18) * (i10 == 1 ? 2 : 1);
            } else {
                z3 = z14;
            }
            Wy wy = new Wy(i10, i11, i12, l14, l15);
            int length2 = objArr2.length;
            int d9 = MB.d(length2, i96 + 1);
            if (d9 > length2 || z3) {
                objArr2 = Arrays.copyOf(objArr2, d9);
                z6 = false;
            } else {
                z6 = z3;
            }
            objArr2[i96] = wy;
            i96++;
            i95 = i9 + 1;
            z14 = z6;
        }
        if (i94 <= 1 || !c02.k()) {
            for (int i97 = 1; i97 < i24; i97++) {
                iArr36[i97] = Math.min(i97, n14);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int b10 = MC.b(i94);
            for (int i98 = 1; i98 < i24; i98++) {
                iArr36[i98] = c02.l(b10);
            }
        }
        S0.s sVar = new S0.s(RB.p(objArr2, i96), iArr36);
        c02.h(2);
        for (int i99 = 1; i99 < i24; i99++) {
            if (iArr[iArr22[i99]] == 0) {
                c02.e();
            }
        }
        for (int i100 = 1; i100 < n13; i100++) {
            boolean k18 = c02.k();
            int i101 = 0;
            while (i101 < iArr28[i100]) {
                if ((i101 <= 0 || !k18) ? i101 == 0 : c02.k()) {
                    for (int i102 = 0; i102 < iArr5[i100]; i102++) {
                        if (zArr17[i100][i102]) {
                            c02.n();
                        }
                    }
                    c02.n();
                    c02.n();
                }
                i101++;
            }
        }
        int n19 = c02.n() + 2;
        if (c02.k()) {
            c02.h(n19);
        } else {
            for (int i103 = 1; i103 < i24; i103++) {
                for (int i104 = 0; i104 < i103; i104++) {
                    if (zArr12[i103][i104]) {
                        c02.h(n19);
                    }
                }
            }
        }
        int n20 = c02.n();
        for (int i105 = 1; i105 <= n20; i105++) {
            c02.h(8);
        }
        if (c02.k()) {
            int i106 = c02.f24006x;
            if (i106 > 0) {
                c02.h(8 - i106);
            }
            if (c02.k() || c02.k()) {
                c02.e();
            }
            boolean k19 = c02.k();
            boolean k20 = c02.k();
            if (k19 || k20) {
                for (int i107 = 0; i107 < n10; i107++) {
                    for (int i108 = 0; i108 < iArr28[i107]; i108++) {
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
            int l16 = k23 ? c02.l(4) + 1 : i24;
            MA.q(l16, "expectedSize");
            MA.q(l16, "initialCapacity");
            int[] iArr37 = new int[i24];
            Object[] objArr3 = new Object[l16];
            int i109 = 0;
            int i110 = 0;
            boolean z15 = false;
            while (i109 < l16) {
                c02.h(3);
                int i111 = true != c02.k() ? 2 : 1;
                int b11 = KJ.b(c02.l(8));
                int c9 = KJ.c(c02.l(8));
                c02.h(8);
                Gz gz = new Gz(b11, i111, c9);
                int length3 = objArr3.length;
                int d10 = MB.d(length3, i110 + 1);
                if (d10 > length3 || z15) {
                    objArr3 = Arrays.copyOf(objArr3, d10);
                    z15 = false;
                }
                objArr3[i110] = gz;
                i109++;
                i110++;
                z15 = z15;
            }
            if (k23 && l16 > 1) {
                for (int i112 = 0; i112 < i24; i112++) {
                    iArr37[i112] = c02.l(4);
                }
            }
            c2991bm = new C2991bm(RB.p(objArr3, i110), iArr37);
        } else {
            c2991bm = null;
        }
        return new C2570Gf(p9, new S0.l(c3500lC2, iArr35), sVar, c2991bm);
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

    public static C3222g2 N(int i, String str, Cr cr) {
        int b9 = cr.b();
        if (cr.b() == 1684108385 && b9 >= 22) {
            cr.G(10);
            int L6 = cr.L();
            if (L6 > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(L6).length());
                sb.append(L6);
                String sb2 = sb.toString();
                int L8 = cr.L();
                if (L8 > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + String.valueOf(L8).length());
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(L8);
                    sb2 = sb3.toString();
                }
                return new C3222g2(str, null, RB.j(sb2));
            }
        }
        AbstractC2968bG.y("MetadataUtil", "Failed to parse index/count attribute: ".concat(AbstractC3376ix.g(i)));
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
    public static C3971tz O(byte[] bArr, int i, int i6, C2570Gf c2570Gf) {
        int i9;
        boolean z3;
        int i10;
        int i11;
        int i12;
        int i13;
        int n9;
        int i14;
        int i15;
        int i16;
        int i17;
        int n10;
        int i18;
        float f3;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        C2991bm c2991bm;
        int i26;
        int i27;
        int i28;
        S0.s sVar;
        X2.b U3 = U(new C0(bArr, i, i6));
        C0 c02 = new C0(bArr, i + 2, i6);
        int i29 = 4;
        c02.h(4);
        int l9 = c02.l(3);
        int i30 = U3.f3772b;
        if (i30 == 0 || l9 != 7) {
            i9 = l9;
            z3 = false;
        } else {
            z3 = true;
            i9 = 7;
        }
        if (c2570Gf != null) {
            RB rb = (RB) c2570Gf.f25042u;
            if (!rb.isEmpty()) {
                i10 = ((Xx) rb.get(Math.min(i30, rb.size() - 1))).f28611a;
                C4132wy c4132wy = null;
                if (z3) {
                    c02.e();
                    c4132wy = V(c02, true, i9, null);
                } else if (c2570Gf != null) {
                    S0.l lVar = (S0.l) c2570Gf.f25043v;
                    int i31 = ((int[]) lVar.f2798v)[i10];
                    RB rb2 = (RB) lVar.f2797u;
                    if (rb2.size() > i31) {
                        c4132wy = (C4132wy) rb2.get(i31);
                    }
                }
                C4132wy c4132wy2 = c4132wy;
                c02.n();
                if (z3) {
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
                        i11 = n12 - ((n14 + n15) * ((n11 == 1 || n11 == 2) ? 2 : 1));
                        i12 = n13 - ((n16 + n17) * (n11 == 1 ? 2 : 1));
                    } else {
                        i11 = n12;
                        i12 = n13;
                    }
                    int n18 = c02.n();
                    i13 = n12;
                    n9 = c02.n();
                    i14 = n13;
                    i15 = i11;
                    i16 = n18;
                } else {
                    int l10 = c02.k() ? c02.l(8) : -1;
                    if (c2570Gf != null && (sVar = (S0.s) c2570Gf.f25044w) != null) {
                        if (l10 == -1) {
                            l10 = ((int[]) sVar.f2841v)[i10];
                        }
                        if (l10 != -1) {
                            RB rb3 = (RB) sVar.f2840u;
                            if (rb3.size() > l10) {
                                Wy wy = (Wy) rb3.get(l10);
                                int i32 = wy.f28449a;
                                int i33 = wy.f28452d;
                                int i34 = wy.f28453e;
                                int i35 = wy.f28450b;
                                i13 = i33;
                                i14 = i34;
                                n9 = wy.f28451c;
                                i15 = i13;
                                i16 = i35;
                                i12 = i14;
                            }
                        }
                    }
                    i12 = 0;
                    i16 = 0;
                    n9 = 0;
                    i15 = 0;
                    i13 = 0;
                    i14 = 0;
                }
                int n19 = c02.n();
                if (z3) {
                    int i36 = -1;
                    for (int i37 = true != c02.k() ? i9 : 0; i37 <= i9; i37++) {
                        c02.n();
                        i36 = Math.max(c02.n(), i36);
                        c02.n();
                    }
                    i17 = i36;
                } else {
                    i17 = -1;
                }
                c02.n();
                c02.n();
                c02.n();
                c02.n();
                c02.n();
                c02.n();
                if (c02.k()) {
                    if (z3 && c02.k()) {
                        c02.h(6);
                    } else if (c02.k()) {
                        int i38 = 0;
                        while (i38 < i29) {
                            int i39 = 0;
                            while (i39 < 6) {
                                if (c02.k()) {
                                    int min = Math.min(64, 1 << ((i38 + i38) + i29));
                                    if (i38 > 1) {
                                        c02.m();
                                    }
                                    for (int i40 = 0; i40 < min; i40++) {
                                        c02.m();
                                    }
                                } else {
                                    c02.n();
                                }
                                i39 += i38 == 3 ? 3 : 1;
                                i29 = 4;
                            }
                            i38++;
                            i29 = 4;
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
                i18 = 0;
                int i41 = -1;
                int i42 = -1;
                while (i18 < n10) {
                    if (i18 == 0 || !c02.k()) {
                        i26 = n10;
                        i27 = i10;
                        int n20 = c02.n();
                        int n21 = c02.n();
                        int[] iArr3 = new int[n20];
                        int i43 = 0;
                        while (i43 < n20) {
                            iArr3[i43] = (i43 > 0 ? iArr3[i43 - 1] : 0) - (c02.n() + 1);
                            c02.e();
                            i43++;
                        }
                        int[] iArr4 = new int[n21];
                        int i44 = 0;
                        while (i44 < n21) {
                            iArr4[i44] = c02.n() + 1 + (i44 > 0 ? iArr4[i44 - 1] : 0);
                            c02.e();
                            i44++;
                        }
                        i42 = n21;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        i41 = n20;
                    } else {
                        int i45 = i41 + i42;
                        boolean k9 = c02.k();
                        int n22 = c02.n() + 1;
                        int i46 = 1 - ((k9 ? 1 : 0) + (k9 ? 1 : 0));
                        i26 = n10;
                        int i47 = i45 + 1;
                        i27 = i10;
                        boolean[] zArr = new boolean[i47];
                        for (int i48 = 0; i48 <= i45; i48++) {
                            if (c02.k()) {
                                zArr[i48] = true;
                            } else {
                                zArr[i48] = c02.k();
                            }
                        }
                        int i49 = i42 - 1;
                        int[] iArr5 = new int[i47];
                        int[] iArr6 = new int[i47];
                        int i50 = 0;
                        while (true) {
                            i28 = i46 * n22;
                            if (i49 < 0) {
                                break;
                            }
                            int i51 = iArr2[i49] + i28;
                            if (i51 < 0 && zArr[i41 + i49]) {
                                iArr5[i50] = i51;
                                i50++;
                            }
                            i49--;
                        }
                        if (i28 < 0 && zArr[i45]) {
                            iArr5[i50] = i28;
                            i50++;
                        }
                        int[] iArr7 = iArr;
                        int i52 = i50;
                        for (int i53 = 0; i53 < i41; i53++) {
                            int i54 = iArr7[i53] + i28;
                            if (i54 < 0 && zArr[i53]) {
                                iArr5[i52] = i54;
                                i52++;
                            }
                        }
                        int[] copyOf = Arrays.copyOf(iArr5, i52);
                        int i55 = 0;
                        for (int i56 = i41 - 1; i56 >= 0; i56--) {
                            int i57 = iArr7[i56] + i28;
                            if (i57 > 0 && zArr[i56]) {
                                iArr6[i55] = i57;
                                i55++;
                            }
                        }
                        if (i28 > 0 && zArr[i45]) {
                            iArr6[i55] = i28;
                            i55++;
                        }
                        int i58 = i55;
                        for (int i59 = 0; i59 < i42; i59++) {
                            int i60 = iArr2[i59] + i28;
                            if (i60 > 0 && zArr[i41 + i59]) {
                                iArr6[i58] = i60;
                                i58++;
                            }
                        }
                        iArr2 = Arrays.copyOf(iArr6, i58);
                        i41 = i52;
                        i42 = i58;
                        iArr = copyOf;
                    }
                    i18++;
                    n10 = i26;
                    i10 = i27;
                }
                int i61 = i10;
                if (c02.k()) {
                    int n23 = c02.n();
                    for (int i62 = 0; i62 < n23; i62++) {
                        c02.h(n19 + 5);
                    }
                }
                c02.h(2);
                float f9 = 1.0f;
                if (c02.k()) {
                    f3 = 1.0f;
                    i19 = i12;
                    i20 = -1;
                    i21 = -1;
                    i22 = -1;
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
                            f9 = f27461s0[l11];
                        } else {
                            com.anythink.basead.exoplayer.f.f.q(l11, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil", new StringBuilder(String.valueOf(l11).length() + 35));
                        }
                    }
                    if (c02.k()) {
                        c02.e();
                    }
                    if (c02.k()) {
                        c02.h(3);
                        i25 = true != c02.k() ? 2 : 1;
                        if (c02.k()) {
                            int l14 = c02.l(8);
                            int l15 = c02.l(8);
                            c02.h(8);
                            i23 = KJ.b(l14);
                            i24 = KJ.c(l15);
                        } else {
                            i23 = -1;
                            i24 = -1;
                        }
                    } else {
                        if (c2570Gf != null && (c2991bm = (C2991bm) c2570Gf.f25045x) != null) {
                            int i63 = ((int[]) c2991bm.f29324v)[i61];
                            RB rb4 = (RB) c2991bm.f29323u;
                            if (rb4.size() > i63) {
                                Gz gz = (Gz) rb4.get(i63);
                                int i64 = gz.f25194a;
                                int i65 = gz.f25195b;
                                i24 = gz.f25196c;
                                i23 = i64;
                                i25 = i65;
                            }
                        }
                        i23 = -1;
                        i24 = -1;
                        i25 = -1;
                    }
                    if (c02.k()) {
                        c02.n();
                        c02.n();
                    }
                    c02.e();
                    if (c02.k()) {
                        i12 += i12;
                    }
                    i20 = i23;
                    i22 = i24;
                    f3 = f9;
                    i21 = i25;
                    i19 = i12;
                }
                return new C3971tz(i9, c4132wy2, i16, n9, i15, i19, i13, i14, f3, i17, i20, i21, i22);
            }
        }
        i10 = 0;
        C4132wy c4132wy3 = null;
        if (z3) {
        }
        C4132wy c4132wy22 = c4132wy3;
        c02.n();
        if (z3) {
        }
        int n192 = c02.n();
        if (z3) {
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
        i18 = 0;
        int i412 = -1;
        int i422 = -1;
        while (i18 < n10) {
        }
        int i612 = i10;
        if (c02.k()) {
        }
        c02.h(2);
        float f92 = 1.0f;
        if (c02.k()) {
        }
        return new C3971tz(i9, c4132wy22, i16, n9, i15, i19, i13, i14, f3, i17, i20, i21, i22);
    }

    public static void P(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    public static int Q(byte[] bArr, int i, int i6, boolean[] zArr) {
        int i9 = i6 - i;
        AbstractC2772Sd.H(i9 >= 0);
        if (i9 == 0) {
            return i6;
        }
        if (zArr[0]) {
            S(zArr);
            return i - 3;
        }
        if (i9 > 1 && zArr[1] && bArr[i] == 1) {
            S(zArr);
            return i - 2;
        }
        if (i9 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            S(zArr);
            return i - 1;
        }
        int i10 = i6 - 1;
        int i11 = i + 2;
        while (i11 < i10) {
            byte b9 = bArr[i11];
            if ((b9 & 254) == 0) {
                int i12 = i11 - 2;
                if (bArr[i12] == 0 && bArr[i11 - 1] == 0 && b9 == 1) {
                    S(zArr);
                    return i12;
                }
                i11 = i12;
            }
            i11 += 3;
        }
        zArr[0] = i9 <= 2 ? !(i9 != 2 ? !(zArr[1] && bArr[i10] == 1) : !(zArr[2] && bArr[i6 + (-2)] == 0 && bArr[i10] == 1)) : bArr[i6 + (-3)] == 0 && bArr[i6 + (-2)] == 0 && bArr[i10] == 1;
        zArr[1] = i9 <= 1 ? zArr[2] && bArr[i10] == 0 : bArr[i6 + (-2)] == 0 && bArr[i10] == 0;
        zArr[2] = bArr[i10] == 0;
        return i6;
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
                PB pb = RB.f27177u;
                MA.q(4, "initialCapacity");
                Object[] objArr = new Object[4];
                int i6 = 0;
                int i9 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i6 >= length2) {
                        break;
                    }
                    int Q8 = Q(bArr, i6, length2, zArr);
                    if (Q8 != length2) {
                        Integer valueOf = Integer.valueOf(Q8);
                        int length3 = objArr.length;
                        int i10 = i9 + 1;
                        int d2 = MB.d(length3, i10);
                        if (d2 > length3) {
                            objArr = Arrays.copyOf(objArr, d2);
                        }
                        objArr[i9] = valueOf;
                        i9 = i10;
                    }
                    i6 = Q8 + 3;
                }
                C3500lC p9 = RB.p(objArr, i9);
                for (int i11 = 0; i11 < p9.f31747w; i11++) {
                    if (((Integer) p9.get(i11)).intValue() + 3 < length) {
                        C0 c02 = new C0(bArr, ((Integer) p9.get(i11)).intValue() + 3, length);
                        X2.b U3 = U(c02);
                        if (U3.f3771a == 33 && U3.f3772b == 0) {
                            c02.h(4);
                            int l9 = c02.l(3);
                            c02.e();
                            C4132wy V8 = V(c02, true, l9, null);
                            return AbstractC4228ym.a(V8.f34910a, V8.f34911b, V8.f34912c, V8.f34913d, V8.f34914e, V8.f34915f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static X2.b U(C0 c02) {
        c02.e();
        return new X2.b(c02.l(6), c02.l(6), c02.l(3) - 1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4132wy V(C0 c02, boolean z3, int i, C4132wy c4132wy) {
        int[] iArr;
        int i6;
        boolean z6;
        int i9;
        int i10;
        boolean z9;
        int i11;
        int i12;
        int[] iArr2 = new int[6];
        if (z3) {
            int l9 = c02.l(2);
            z9 = c02.k();
            i11 = c02.l(5);
            i12 = 0;
            for (int i13 = 0; i13 < 32; i13++) {
                if (c02.k()) {
                    i12 |= 1 << i13;
                }
            }
            for (int i14 = 0; i14 < 6; i14++) {
                iArr2[i14] = c02.l(8);
            }
            i6 = l9;
        } else {
            if (c4132wy == null) {
                iArr = iArr2;
                i6 = 0;
                z6 = false;
                i9 = 0;
                i10 = 0;
                int l10 = c02.l(8);
                int i15 = 0;
                for (int i16 = 0; i16 < i; i16++) {
                    if (c02.k()) {
                        i15 += 88;
                    }
                    if (c02.k()) {
                        i15 += 8;
                    }
                }
                c02.h(i15);
                if (i > 0) {
                    int i17 = 8 - i;
                    c02.h(i17 + i17);
                }
                return new C4132wy(i6, z6, i9, i10, iArr, l10);
            }
            int i18 = c4132wy.f34910a;
            z9 = c4132wy.f34911b;
            i11 = c4132wy.f34912c;
            i12 = c4132wy.f34913d;
            iArr2 = c4132wy.f34914e;
            i6 = i18;
        }
        iArr = iArr2;
        z6 = z9;
        i9 = i11;
        i10 = i12;
        int l102 = c02.l(8);
        int i152 = 0;
        while (i16 < i) {
        }
        c02.h(i152);
        if (i > 0) {
        }
        return new C4132wy(i6, z6, i9, i10, iArr, l102);
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
        String str2 = dp.f24431o;
        if (Objects.equals(str2, "video/dolby-vision") && (str = dp.f24427k) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return com.anythink.basead.exoplayer.k.o.f8451h;
            }
            if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                return com.anythink.basead.exoplayer.k.o.i;
            }
        }
        return str2;
    }

    public static int a(int i) {
        int i6;
        int i9;
        int i10;
        int i11;
        if (!((i & (-2097152)) == -2097152) || (i6 = (i >>> 19) & 3) == 1 || (i9 = (i >>> 17) & 3) == 0 || (i10 = (i >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i12 = i10 - 1;
        int i13 = f27463u[i11];
        if (i6 == 2) {
            i13 /= 2;
        } else if (i6 == 0) {
            i13 /= 4;
        }
        int i14 = (i >>> 9) & 1;
        if (i9 == 3) {
            return ((((i6 == 3 ? f27465v[i12] : f27467w[i12]) * 12) / i13) + i14) * 4;
        }
        int i15 = i6 == 3 ? i9 == 2 ? f27469x[i12] : f27470y[i12] : f27471z[i12];
        if (i6 == 3) {
            return ((i15 * 144) / i13) + i14;
        }
        return (((i9 == 1 ? 72 : 144) * i15) / i13) + i14;
    }

    public static int b(int i, byte[] bArr) {
        int i6;
        synchronized (f27462t0) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < i) {
                while (true) {
                    try {
                        if (i9 >= i - 2) {
                            i9 = i;
                            break;
                        }
                        int i11 = i9 + 1;
                        if (bArr[i9] == 0 && bArr[i11] == 0 && bArr[i9 + 2] == 3) {
                            break;
                        }
                        i9 = i11;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i9 < i) {
                    int[] iArr = f27464u0;
                    int length = iArr.length;
                    if (length <= i10) {
                        f27464u0 = Arrays.copyOf(iArr, length + length);
                    }
                    f27464u0[i10] = i9;
                    i9 += 3;
                    i10++;
                }
            }
            i6 = i - i10;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = f27464u0[i14] - i12;
                System.arraycopy(bArr, i12, bArr, i13, i15);
                int i16 = i13 + i15;
                int i17 = i16 + 1;
                bArr[i16] = 0;
                i13 = i16 + 2;
                bArr[i17] = 0;
                i12 += i15 + 3;
            }
            System.arraycopy(bArr, i12, bArr, i13, i6 - i13);
        }
        return i6;
    }

    public static int e(String str) {
        int i;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        int i6 = 0;
        int i9 = 0;
        while (true) {
            i = length & (-4);
            if (i6 >= i) {
                break;
            }
            int i10 = ((bytes[i6] & 255) | ((bytes[i6 + 1] & 255) << 8) | ((bytes[i6 + 2] & 255) << 16) | (bytes[i6 + 3] << 24)) * (-862048943);
            int i11 = i9 ^ (((i10 >>> 17) | (i10 << 15)) * 461845907);
            i9 = (((i11 >>> 19) | (i11 << 13)) * 5) - 430675100;
            i6 += 4;
        }
        int i12 = length & 3;
        if (i12 != 1) {
            if (i12 != 2) {
                r1 = i12 == 3 ? (bytes[i + 2] & 255) << 16 : 0;
                int i13 = i9 ^ length;
                int i14 = (i13 ^ (i13 >>> 16)) * (-2048144789);
                int i15 = (i14 ^ (i14 >>> 13)) * (-1028477387);
                return i15 ^ (i15 >>> 16);
            }
            r1 |= (bytes[i + 1] & 255) << 8;
        }
        int i16 = ((bytes[i] & 255) | r1) * (-862048943);
        i9 ^= ((i16 >>> 17) | (i16 << 15)) * 461845907;
        int i132 = i9 ^ length;
        int i142 = (i132 ^ (i132 >>> 16)) * (-2048144789);
        int i152 = (i142 ^ (i142 >>> 13)) * (-1028477387);
        return i152 ^ (i152 >>> 16);
    }

    public static long f(long j6, long j9, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j10 = j6 / j9;
        long j11 = j6 - (j9 * j10);
        if (j11 == 0) {
            return j10;
        }
        int i = ((int) ((j6 ^ j9) >> 63)) | 1;
        switch (PC.f26746a[roundingMode.ordinal()]) {
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
        String str2 = AbstractC3159eu.f29993a;
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

    public static W4 h(C3064d5 c3064d5) {
        long j6;
        boolean z3;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = c3064d5.f29709c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long r9 = str != null ? r(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z3 = false;
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
                    z3 = true;
                }
                i++;
            }
            j6 = 0;
            i = 1;
        } else {
            j6 = 0;
            z3 = false;
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
            j14 = z3 ? j15 : (j9 * 1000) + j15;
            j13 = j15;
        } else {
            j13 = (r9 <= j6 || r10 < r9) ? j6 : (r10 - r9) + j11;
            j14 = j13;
        }
        W4 w42 = new W4(0);
        w42.f28313a = c3064d5.f29708b;
        w42.f28314b = str5;
        w42.f28318f = j13;
        w42.f28317e = j14;
        w42.f28315c = r9;
        w42.f28316d = j12;
        w42.f28319g = map;
        w42.f28320h = c3064d5.f29710d;
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
                arrayList.add(new C3177fB(i & 15, duplicate2));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + C8);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static C4920z0 k(Throwable th) {
        if (th instanceof C3531lq) {
            C3531lq c3531lq = (C3531lq) th;
            return B(c3531lq.f30455n, c3531lq.f31859u);
        }
        if (th instanceof C3208fp) {
            return th.getMessage() == null ? F(((C3208fp) th).f30455n, null, null) : F(((C3208fp) th).f30455n, th.getMessage(), null);
        }
        if (!(th instanceof u2.l)) {
            return F(1, null, null);
        }
        u2.l lVar = (u2.l) th;
        int i = lVar.f41296n;
        String message = lVar.getMessage();
        if (message == null) {
            message = "";
        }
        return new C4920z0(i, message, "com.google.android.gms.ads", null, null);
    }

    public static void l(int i, O3 o32, C3299hP c3299hP, O3 o33, O3... o3Arr) {
        if (o33 == null) {
            o33 = new O3(new InterfaceC3922t3[0]);
        }
        if (o32 != null) {
            PB pb = RB.f27177u;
            MA.q(4, "initialCapacity");
            Object[] objArr = new Object[4];
            int i6 = 0;
            for (InterfaceC3922t3 interfaceC3922t3 : o32.f26586a) {
                if (C3591mw.class.isAssignableFrom(interfaceC3922t3.getClass())) {
                    InterfaceC3922t3 interfaceC3922t32 = (InterfaceC3922t3) C3591mw.class.cast(interfaceC3922t3);
                    interfaceC3922t32.getClass();
                    int length = objArr.length;
                    int i9 = i6 + 1;
                    int d2 = MB.d(length, i9);
                    if (d2 > length) {
                        objArr = Arrays.copyOf(objArr, d2);
                    }
                    objArr[i6] = interfaceC3922t32;
                    i6 = i9;
                }
            }
            C3500lC p9 = RB.p(objArr, i6);
            int i10 = p9.f31747w;
            for (int i11 = 0; i11 < i10; i11++) {
                C3591mw c3591mw = (C3591mw) p9.get(i11);
                if (!c3591mw.f32627a.equals("com.android.capture.fps") || i == 2) {
                    o33 = o33.c(c3591mw);
                }
            }
        }
        for (O3 o34 : o3Arr) {
            o33 = o33.b(o34);
        }
        if (o33.f26586a.length > 0) {
            c3299hP.f30789k = o33;
        }
    }

    public static void m(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i6) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i6, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i6 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i6, 33);
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
                AbstractC3439k5.a("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", AbstractC3439k5.d("Unable to parse dateStr: %s, falling back to 0", str), e9);
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

    public static C4920z0 t(Throwable th, C3585mq c3585mq) {
        C4920z0 c4920z0;
        C4920z0 k9 = k(th);
        int i = k9.f40213n;
        if ((i == 3 || i == 0) && (c4920z0 = k9.f40216w) != null && !c4920z0.f40215v.equals("com.google.android.gms.ads")) {
            k9.f40216w = null;
        }
        if (c3585mq != null) {
            k9.f40217x = new BinderC3848rk(c3585mq.f32595e, "", c3585mq, c3585mq.f32594d, c3585mq.f32593c);
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
    public static String[] v(String str, boolean z3) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int i = 0;
        boolean z6 = false;
        int i6 = 0;
        while (i < str.length()) {
            int codePointAt = Character.codePointAt(charArray, i);
            int charCount = Character.charCount(codePointAt);
            if (Character.isLetter(codePointAt)) {
                Character.UnicodeBlock of = Character.UnicodeBlock.of(codePointAt);
                if (of.equals(Character.UnicodeBlock.BOPOMOFO) || of.equals(Character.UnicodeBlock.BOPOMOFO_EXTENDED) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || of.equals(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || of.equals(Character.UnicodeBlock.HANGUL_JAMO) || of.equals(Character.UnicodeBlock.HANGUL_SYLLABLES) || of.equals(Character.UnicodeBlock.HIRAGANA) || of.equals(Character.UnicodeBlock.KATAKANA) || of.equals(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) || ((codePointAt >= 65382 && codePointAt <= 65437) || (codePointAt >= 65441 && codePointAt <= 65500))) {
                    if (z6) {
                        arrayList.add(new String(charArray, i6, i - i6));
                    }
                    arrayList.add(new String(charArray, i, charCount));
                    z6 = false;
                    i += charCount;
                }
            }
            if (!Character.isLetterOrDigit(codePointAt) && Character.getType(codePointAt) != 6 && Character.getType(codePointAt) != 8) {
                if (!z3 || Character.charCount(codePointAt) != 1 || Character.toChars(codePointAt)[0] != '\'') {
                    if (z6) {
                        arrayList.add(new String(charArray, i6, i - i6));
                    }
                    z6 = false;
                }
            }
            i += charCount;
        }
        if (z6) {
            arrayList.add(new String(charArray, i6, i - i6));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int w(SQLiteDatabase sQLiteDatabase, int i) {
        int i6 = 0;
        if (i == 2) {
            return 0;
        }
        Cursor M8 = M(sQLiteDatabase, i);
        if (M8.getCount() > 0) {
            M8.moveToNext();
            i6 = M8.getInt(M8.getColumnIndexOrThrow("value"));
        }
        M8.close();
        return i6;
    }

    public static int x(DP dp) {
        String X8 = X(dp);
        if (Objects.equals(X8, com.anythink.basead.exoplayer.k.o.f8451h)) {
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
        long j6 = cr.f24253b;
        long j9 = O8;
        int i = O8 / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i6 = 0;
        while (true) {
            if (i6 >= i) {
                break;
            }
            long d2 = cr.d();
            if (d2 == -1) {
                jArr = Arrays.copyOf(jArr, i6);
                jArr2 = Arrays.copyOf(jArr2, i6);
                break;
            }
            jArr[i6] = d2;
            jArr2[i6] = cr.d();
            cr.G(2);
            i6++;
        }
        cr.G((int) ((j6 + j9) - cr.f24253b));
        return new S0.s(8, jArr, jArr2);
    }
}
