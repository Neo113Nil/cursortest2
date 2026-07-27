package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.icefishing.icefishinglive2.C5275R;
import java.util.Collections;
import java.util.Map;
import p2.C4826a;
import p2.C4835j;
import q2.C4900p;

/* renamed from: com.google.android.gms.internal.ads.jc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3409jc implements InterfaceC3249gc {

    /* renamed from: w, reason: collision with root package name */
    public static final Map f31263w;

    /* renamed from: n, reason: collision with root package name */
    public final C4826a f31264n;

    /* renamed from: u, reason: collision with root package name */
    public final C2884Zd f31265u;

    /* renamed from: v, reason: collision with root package name */
    public final Qx f31266v;

    static {
        String[] strArr = {com.onesignal.inAppMessages.internal.display.impl.m.EVENT_TYPE_RESIZE, "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        s.b bVar = new s.b(7);
        for (int i = 0; i < 7; i++) {
            bVar.put(strArr[i], numArr[i]);
        }
        f31263w = Collections.unmodifiableMap(bVar);
    }

    public C3409jc(C4826a c4826a, C2884Zd c2884Zd, Qx qx) {
        this.f31264n = c4826a;
        this.f31265u = c2884Zd;
        this.f31266v = qx;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:150:0x044d A[Catch: all -> 0x01ca, TryCatch #1 {all -> 0x01ca, blocks: (B:92:0x01bf, B:94:0x01c3, B:95:0x01c8, B:97:0x01cd, B:99:0x01d7, B:100:0x01dc, B:102:0x01de, B:104:0x01ea, B:105:0x01ef, B:107:0x01f1, B:109:0x01f9, B:110:0x01fe, B:112:0x0200, B:114:0x020e, B:115:0x0220, B:117:0x022e, B:118:0x0240, B:120:0x024e, B:121:0x0260, B:123:0x026e, B:124:0x0280, B:126:0x028e, B:127:0x029c, B:129:0x02aa, B:130:0x02ac, B:132:0x02b0, B:134:0x02b4, B:136:0x02ba, B:139:0x02c2, B:142:0x02f6, B:147:0x0304, B:150:0x044d, B:151:0x0452, B:153:0x0454, B:155:0x047a, B:157:0x0483, B:158:0x04b2, B:189:0x056a, B:190:0x059d, B:192:0x05b5, B:193:0x05dd, B:195:0x05e5, B:196:0x05f0, B:197:0x0615, B:201:0x0618, B:203:0x0643, B:204:0x0652, B:206:0x0571, B:207:0x0578, B:208:0x0581, B:209:0x0588, B:210:0x058e, B:211:0x0597, B:212:0x04af, B:213:0x0654, B:214:0x0659, B:216:0x0310, B:218:0x0314, B:233:0x036e, B:234:0x0378, B:236:0x03cb, B:238:0x03cf, B:240:0x03d3, B:244:0x03df, B:245:0x03ee, B:248:0x0424, B:251:0x0434, B:252:0x042a, B:254:0x0432, B:255:0x041b, B:257:0x0421, B:259:0x037c, B:260:0x0386, B:261:0x038d, B:262:0x0399, B:263:0x03a1, B:264:0x03b5, B:265:0x03c1, B:284:0x0439, B:286:0x0442, B:287:0x065b, B:288:0x0660, B:290:0x0662, B:291:0x0667), top: B:91:0x01bf, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0454 A[Catch: all -> 0x01ca, TryCatch #1 {all -> 0x01ca, blocks: (B:92:0x01bf, B:94:0x01c3, B:95:0x01c8, B:97:0x01cd, B:99:0x01d7, B:100:0x01dc, B:102:0x01de, B:104:0x01ea, B:105:0x01ef, B:107:0x01f1, B:109:0x01f9, B:110:0x01fe, B:112:0x0200, B:114:0x020e, B:115:0x0220, B:117:0x022e, B:118:0x0240, B:120:0x024e, B:121:0x0260, B:123:0x026e, B:124:0x0280, B:126:0x028e, B:127:0x029c, B:129:0x02aa, B:130:0x02ac, B:132:0x02b0, B:134:0x02b4, B:136:0x02ba, B:139:0x02c2, B:142:0x02f6, B:147:0x0304, B:150:0x044d, B:151:0x0452, B:153:0x0454, B:155:0x047a, B:157:0x0483, B:158:0x04b2, B:189:0x056a, B:190:0x059d, B:192:0x05b5, B:193:0x05dd, B:195:0x05e5, B:196:0x05f0, B:197:0x0615, B:201:0x0618, B:203:0x0643, B:204:0x0652, B:206:0x0571, B:207:0x0578, B:208:0x0581, B:209:0x0588, B:210:0x058e, B:211:0x0597, B:212:0x04af, B:213:0x0654, B:214:0x0659, B:216:0x0310, B:218:0x0314, B:233:0x036e, B:234:0x0378, B:236:0x03cb, B:238:0x03cf, B:240:0x03d3, B:244:0x03df, B:245:0x03ee, B:248:0x0424, B:251:0x0434, B:252:0x042a, B:254:0x0432, B:255:0x041b, B:257:0x0421, B:259:0x037c, B:260:0x0386, B:261:0x038d, B:262:0x0399, B:263:0x03a1, B:264:0x03b5, B:265:0x03c1, B:284:0x0439, B:286:0x0442, B:287:0x065b, B:288:0x0660, B:290:0x0662, B:291:0x0667), top: B:91:0x01bf, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03cb A[Catch: all -> 0x01ca, TryCatch #1 {all -> 0x01ca, blocks: (B:92:0x01bf, B:94:0x01c3, B:95:0x01c8, B:97:0x01cd, B:99:0x01d7, B:100:0x01dc, B:102:0x01de, B:104:0x01ea, B:105:0x01ef, B:107:0x01f1, B:109:0x01f9, B:110:0x01fe, B:112:0x0200, B:114:0x020e, B:115:0x0220, B:117:0x022e, B:118:0x0240, B:120:0x024e, B:121:0x0260, B:123:0x026e, B:124:0x0280, B:126:0x028e, B:127:0x029c, B:129:0x02aa, B:130:0x02ac, B:132:0x02b0, B:134:0x02b4, B:136:0x02ba, B:139:0x02c2, B:142:0x02f6, B:147:0x0304, B:150:0x044d, B:151:0x0452, B:153:0x0454, B:155:0x047a, B:157:0x0483, B:158:0x04b2, B:189:0x056a, B:190:0x059d, B:192:0x05b5, B:193:0x05dd, B:195:0x05e5, B:196:0x05f0, B:197:0x0615, B:201:0x0618, B:203:0x0643, B:204:0x0652, B:206:0x0571, B:207:0x0578, B:208:0x0581, B:209:0x0588, B:210:0x058e, B:211:0x0597, B:212:0x04af, B:213:0x0654, B:214:0x0659, B:216:0x0310, B:218:0x0314, B:233:0x036e, B:234:0x0378, B:236:0x03cb, B:238:0x03cf, B:240:0x03d3, B:244:0x03df, B:245:0x03ee, B:248:0x0424, B:251:0x0434, B:252:0x042a, B:254:0x0432, B:255:0x041b, B:257:0x0421, B:259:0x037c, B:260:0x0386, B:261:0x038d, B:262:0x0399, B:263:0x03a1, B:264:0x03b5, B:265:0x03c1, B:284:0x0439, B:286:0x0442, B:287:0x065b, B:288:0x0660, B:290:0x0662, B:291:0x0667), top: B:91:0x01bf, inners: #0 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Object obj, Map map) {
        int i;
        int[] iArr;
        int i6;
        char c9;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) obj;
        int intValue = ((Integer) f31263w.get((String) map.get("a"))).intValue();
        char c10 = 1;
        if (intValue != 5) {
            if (intValue != 7) {
                C4826a c4826a = this.f31264n;
                if (!c4826a.a()) {
                    c4826a.b(null);
                    return;
                }
                if (intValue == 1) {
                    C2884Zd c2884Zd = this.f31265u;
                    synchronized (c2884Zd.f28898E) {
                        try {
                            Activity activity = c2884Zd.f28900G;
                            if (activity == null) {
                                c2884Zd.y("Not an activity context. Cannot resize.");
                                return;
                            }
                            C2555Fh c2555Fh = c2884Zd.f28899F;
                            if (c2555Fh.f24817n.i0() == null) {
                                c2884Zd.y("Webview is not yet available, size is not set.");
                                return;
                            }
                            if (c2555Fh.f24817n.i0().b()) {
                                c2884Zd.y("Is interstitial. Cannot resize an interstitial.");
                                return;
                            }
                            if (c2555Fh.f24817n.H0()) {
                                c2884Zd.y("Cannot resize an expanded banner.");
                                return;
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                                u2.D d2 = C4835j.f39730C.f39735c;
                                c2884Zd.f28897D = u2.D.n((String) map.get("width"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                                u2.D d9 = C4835j.f39730C.f39735c;
                                c2884Zd.f28894A = u2.D.n((String) map.get("height"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                                u2.D d10 = C4835j.f39730C.f39735c;
                                c2884Zd.f28895B = u2.D.n((String) map.get("offsetX"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                                u2.D d11 = C4835j.f39730C.f39735c;
                                c2884Zd.f28896C = u2.D.n((String) map.get("offsetY"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                                c2884Zd.f28908x = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                            }
                            String str = (String) map.get("customClosePosition");
                            if (!TextUtils.isEmpty(str)) {
                                c2884Zd.f28907w = str;
                            }
                            if (c2884Zd.f28897D < 0 || c2884Zd.f28894A < 0) {
                                c2884Zd.y("Invalid width and height options. Cannot resize.");
                                return;
                            }
                            Window window = activity.getWindow();
                            if (window != null && window.getDecorView() != null) {
                                u2.D d12 = C4835j.f39730C.f39735c;
                                int[] p9 = u2.D.p(activity);
                                C4900p c4900p = C4900p.f40196g;
                                int[] iArr2 = {c4900p.f40197a.h(activity, p9[0]), c4900p.f40197a.h(activity, p9[1])};
                                int[] q8 = u2.D.q(activity);
                                int i14 = iArr2[0];
                                int i15 = iArr2[1];
                                int i16 = c2884Zd.f28897D;
                                if (i16 < 50 || i16 > i14) {
                                    i = 50;
                                    int i17 = u2.z.f41319b;
                                    v2.i.f("Width is too small or too large.");
                                } else {
                                    int i18 = c2884Zd.f28894A;
                                    if (i18 < 50 || i18 > i15) {
                                        i = 50;
                                        int i19 = u2.z.f41319b;
                                        v2.i.f("Height is too small or too large.");
                                    } else {
                                        if (i18 != i15 || i16 != i14) {
                                            boolean z3 = c2884Zd.f28908x;
                                            if (z3) {
                                                i = 50;
                                                String str2 = c2884Zd.f28907w;
                                                switch (str2.hashCode()) {
                                                    case -1364013995:
                                                        if (str2.equals("center")) {
                                                            c9 = 2;
                                                            break;
                                                        }
                                                        c9 = 65535;
                                                        break;
                                                    case -1012429441:
                                                        if (str2.equals("top-left")) {
                                                            c9 = 0;
                                                            break;
                                                        }
                                                        c9 = 65535;
                                                        break;
                                                    case -655373719:
                                                        if (str2.equals("bottom-left")) {
                                                            c9 = 3;
                                                            break;
                                                        }
                                                        c9 = 65535;
                                                        break;
                                                    case 1163912186:
                                                        if (str2.equals("bottom-right")) {
                                                            c9 = 5;
                                                            break;
                                                        }
                                                        c9 = 65535;
                                                        break;
                                                    case 1288627767:
                                                        if (str2.equals("bottom-center")) {
                                                            c9 = 4;
                                                            break;
                                                        }
                                                        c9 = 65535;
                                                        break;
                                                    case 1755462605:
                                                        if (str2.equals("top-center")) {
                                                            c9 = 1;
                                                            break;
                                                        }
                                                        c9 = 65535;
                                                        break;
                                                    default:
                                                        c9 = 65535;
                                                        break;
                                                }
                                                if (c9 == 0) {
                                                    i9 = c2884Zd.f28895B + c2884Zd.f28909y;
                                                    i10 = c2884Zd.f28910z;
                                                } else if (c9 != 1) {
                                                    if (c9 != 2) {
                                                        if (c9 == 3) {
                                                            i9 = c2884Zd.f28895B + c2884Zd.f28909y;
                                                            i12 = c2884Zd.f28910z;
                                                        } else if (c9 == 4) {
                                                            i9 = ((c2884Zd.f28909y + c2884Zd.f28895B) + (i16 >> 1)) - 25;
                                                            i12 = c2884Zd.f28910z;
                                                        } else if (c9 != 5) {
                                                            i9 = ((c2884Zd.f28909y + c2884Zd.f28895B) + i16) - 50;
                                                            i10 = c2884Zd.f28910z;
                                                        } else {
                                                            i9 = ((c2884Zd.f28909y + c2884Zd.f28895B) + i16) - 50;
                                                            i12 = c2884Zd.f28910z;
                                                        }
                                                        i11 = ((i12 + c2884Zd.f28896C) + i18) - 50;
                                                    } else {
                                                        i9 = ((c2884Zd.f28909y + c2884Zd.f28895B) + (i16 >> 1)) - 25;
                                                        i11 = ((c2884Zd.f28910z + c2884Zd.f28896C) + (i18 >> 1)) - 25;
                                                    }
                                                    if (i9 >= 0) {
                                                        if (i9 + 50 <= i14) {
                                                            if (i11 >= q8[0]) {
                                                                if (i11 + 50 <= q8[1]) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i9 = ((c2884Zd.f28909y + c2884Zd.f28895B) + (i16 >> 1)) - 25;
                                                    i10 = c2884Zd.f28910z;
                                                }
                                                i11 = i10 + c2884Zd.f28896C;
                                                if (i9 >= 0) {
                                                }
                                            } else {
                                                i = 50;
                                            }
                                            if (z3) {
                                                iArr = new int[]{c2884Zd.f28909y + c2884Zd.f28895B, c2884Zd.f28910z + c2884Zd.f28896C};
                                            } else {
                                                int[] p10 = u2.D.p(activity);
                                                int[] iArr3 = {c4900p.f40197a.h(activity, p10[0]), c4900p.f40197a.h(activity, p10[1])};
                                                int[] q9 = u2.D.q(activity);
                                                int i20 = iArr3[0];
                                                int i21 = c2884Zd.f28909y + c2884Zd.f28895B;
                                                int i22 = c2884Zd.f28910z + c2884Zd.f28896C;
                                                if (i21 < 0) {
                                                    i6 = 0;
                                                } else {
                                                    int i23 = c2884Zd.f28897D;
                                                    i6 = i21 + i23 > i20 ? i20 - i23 : i21;
                                                }
                                                int i24 = q9[0];
                                                if (i22 < i24) {
                                                    i22 = i24;
                                                } else {
                                                    int i25 = c2884Zd.f28894A;
                                                    int i26 = i22 + i25;
                                                    int i27 = q9[1];
                                                    if (i26 > i27) {
                                                        i22 = i27 - i25;
                                                    }
                                                }
                                                iArr = new int[]{i6, i22};
                                            }
                                            if (iArr != null) {
                                                c2884Zd.y("Resize location out of screen or close button is not visible.");
                                                return;
                                            }
                                            v2.d dVar = c4900p.f40197a;
                                            int r9 = v2.d.r(activity.getResources().getDisplayMetrics(), c2884Zd.f28897D);
                                            int r10 = v2.d.r(activity.getResources().getDisplayMetrics(), c2884Zd.f28894A);
                                            ViewParent parent = c2555Fh.getParent();
                                            if (!(parent instanceof ViewGroup)) {
                                                c2884Zd.y("Webview is detached, probably in the middle of a resize or expand.");
                                                return;
                                            }
                                            ViewGroup viewGroup = (ViewGroup) parent;
                                            viewGroup.removeView(c2555Fh);
                                            PopupWindow popupWindow = c2884Zd.f28904L;
                                            if (popupWindow == null) {
                                                c2884Zd.f28906N = viewGroup;
                                                c2555Fh.setDrawingCacheEnabled(true);
                                                Bitmap createBitmap = Bitmap.createBitmap(c2555Fh.getDrawingCache());
                                                c2555Fh.setDrawingCacheEnabled(false);
                                                ImageView imageView = new ImageView(activity);
                                                c2884Zd.f28902I = imageView;
                                                imageView.setImageBitmap(createBitmap);
                                                c2884Zd.f28901H = c2555Fh.f24817n.i0();
                                                c2884Zd.f28906N.addView(c2884Zd.f28902I);
                                            } else {
                                                popupWindow.dismiss();
                                            }
                                            RelativeLayout relativeLayout = new RelativeLayout(activity);
                                            c2884Zd.f28905M = relativeLayout;
                                            relativeLayout.setBackgroundColor(0);
                                            c2884Zd.f28905M.setLayoutParams(new ViewGroup.LayoutParams(r9, r10));
                                            PopupWindow popupWindow2 = new PopupWindow((View) c2884Zd.f28905M, r9, r10, false);
                                            c2884Zd.f28904L = popupWindow2;
                                            popupWindow2.setOutsideTouchable(false);
                                            c2884Zd.f28904L.setTouchable(true);
                                            c2884Zd.f28904L.setClippingEnabled(!c2884Zd.f28908x);
                                            char c11 = 65535;
                                            c2884Zd.f28905M.addView(c2555Fh, -1, -1);
                                            c2884Zd.J = new LinearLayout(activity);
                                            int i28 = i;
                                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v2.d.r(activity.getResources().getDisplayMetrics(), i28), v2.d.r(activity.getResources().getDisplayMetrics(), i28));
                                            String str3 = c2884Zd.f28907w;
                                            switch (str3.hashCode()) {
                                                case -1364013995:
                                                    if (str3.equals("center")) {
                                                        c11 = 2;
                                                        break;
                                                    }
                                                    break;
                                                case -1012429441:
                                                    if (str3.equals("top-left")) {
                                                        c11 = 0;
                                                        break;
                                                    }
                                                    break;
                                                case -655373719:
                                                    if (str3.equals("bottom-left")) {
                                                        c11 = 3;
                                                        break;
                                                    }
                                                    break;
                                                case 1163912186:
                                                    if (str3.equals("bottom-right")) {
                                                        c11 = 5;
                                                        break;
                                                    }
                                                    break;
                                                case 1288627767:
                                                    if (str3.equals("bottom-center")) {
                                                        c11 = 4;
                                                        break;
                                                    }
                                                    break;
                                                case 1755462605:
                                                    if (str3.equals("top-center")) {
                                                        c11 = 1;
                                                        break;
                                                    }
                                                    break;
                                            }
                                            if (c11 == 0) {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(9);
                                            } else if (c11 == 1) {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(14);
                                            } else if (c11 == 2) {
                                                layoutParams.addRule(13);
                                            } else if (c11 == 3) {
                                                layoutParams.addRule(12);
                                                layoutParams.addRule(9);
                                            } else if (c11 == 4) {
                                                layoutParams.addRule(12);
                                                layoutParams.addRule(14);
                                            } else if (c11 != 5) {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(11);
                                            } else {
                                                layoutParams.addRule(12);
                                                layoutParams.addRule(11);
                                            }
                                            c2884Zd.J.setOnClickListener(new ViewOnClickListenerC2868Yd(c2884Zd));
                                            c2884Zd.J.setContentDescription("Close button");
                                            c2884Zd.f28905M.addView(c2884Zd.J, layoutParams);
                                            try {
                                                c2884Zd.f28904L.showAtLocation(window.getDecorView(), 0, v2.d.r(activity.getResources().getDisplayMetrics(), iArr[0]), v2.d.r(activity.getResources().getDisplayMetrics(), iArr[1]));
                                                int i29 = iArr[0];
                                                int i30 = iArr[1];
                                                Qx qx = c2884Zd.f28903K;
                                                if (qx != null) {
                                                    ((C2595Hn) qx.f27139u).f25358c.M1(C2935ak.f29115z);
                                                }
                                                c2884Zd.f28899F.o0(new X2.b(1, r9, r10));
                                                c2884Zd.z(iArr[0], iArr[1] - u2.D.q(c2884Zd.f28900G)[0], c2884Zd.f28897D, c2884Zd.f28894A);
                                                c2884Zd.A(com.anythink.core.express.b.a.i);
                                                return;
                                            } catch (RuntimeException e9) {
                                                String message = e9.getMessage();
                                                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                                                sb.append("Cannot show popup window: ");
                                                sb.append(message);
                                                c2884Zd.y(sb.toString());
                                                RelativeLayout relativeLayout2 = c2884Zd.f28905M;
                                                C2555Fh c2555Fh2 = c2884Zd.f28899F;
                                                relativeLayout2.removeView(c2555Fh2);
                                                ViewGroup viewGroup2 = c2884Zd.f28906N;
                                                if (viewGroup2 != null) {
                                                    viewGroup2.removeView(c2884Zd.f28902I);
                                                    c2884Zd.f28906N.addView(c2555Fh2);
                                                    c2555Fh2.o0(c2884Zd.f28901H);
                                                }
                                                return;
                                            }
                                        }
                                        int i31 = u2.z.f41319b;
                                        v2.i.f("Cannot resize to a full-screen ad.");
                                        i = 50;
                                    }
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                            }
                            c2884Zd.y("Activity context is not ready, cannot get window or decor view.");
                            return;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (intValue == 3) {
                    C2983be c2983be = new C2983be(interfaceC4061vh, map);
                    Activity activity2 = c2983be.f29298w;
                    if (activity2 == null) {
                        c2983be.y("Activity context is not available");
                        return;
                    }
                    C4835j c4835j = C4835j.f39730C;
                    u2.D d13 = c4835j.f39735c;
                    if (!((Boolean) O3.b.G(activity2, CallableC3139ea.f29934b)).booleanValue() || V2.c.a(activity2).f3273u.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        c2983be.y("Feature is not supported by the device.");
                        return;
                    }
                    String str4 = (String) map.get("iurl");
                    if (TextUtils.isEmpty(str4)) {
                        c2983be.y("Image url cannot be empty.");
                        return;
                    }
                    if (!URLUtil.isValidUrl(str4)) {
                        c2983be.y("Invalid image url: ".concat(String.valueOf(str4)));
                        return;
                    }
                    String lastPathSegment = Uri.parse(str4).getLastPathSegment();
                    if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                        c2983be.y("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
                        return;
                    }
                    Resources c12 = c4835j.f39740h.c();
                    AlertDialog.Builder k9 = u2.D.k(activity2);
                    k9.setTitle(c12 != null ? c12.getString(C5275R.string.s1) : "Save image");
                    k9.setMessage(c12 != null ? c12.getString(C5275R.string.s2) : "Allow Ad to store image in Picture gallery?");
                    k9.setPositiveButton(c12 != null ? c12.getString(C5275R.string.s3) : "Accept", new DialogInterfaceOnClickListenerC2864Xp(c2983be, str4, lastPathSegment));
                    k9.setNegativeButton(c12 != null ? c12.getString(C5275R.string.s4) : "Decline", new DialogInterfaceOnClickListenerC2929ae(0, c2983be));
                    k9.create().show();
                    return;
                }
                if (intValue == 4) {
                    C2852Xd c2852Xd = new C2852Xd(interfaceC4061vh, map);
                    Activity activity3 = c2852Xd.f28540x;
                    if (activity3 == null) {
                        c2852Xd.y("Activity context is not available.");
                        return;
                    }
                    C4835j c4835j2 = C4835j.f39730C;
                    u2.D d14 = c4835j2.f39735c;
                    Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
                    P2.w.i(type, "Intent can not be null");
                    if (activity3.getPackageManager().queryIntentActivities(type, 0).isEmpty()) {
                        c2852Xd.y("This feature is not available on the device.");
                        return;
                    }
                    AlertDialog.Builder k10 = u2.D.k(activity3);
                    Resources c13 = c4835j2.f39740h.c();
                    k10.setTitle(c13 != null ? c13.getString(C5275R.string.s5) : "Create calendar event");
                    k10.setMessage(c13 != null ? c13.getString(C5275R.string.s6) : "Allow Ad to create a calendar event?");
                    k10.setPositiveButton(c13 != null ? c13.getString(C5275R.string.s3) : "Accept", new DialogInterfaceOnClickListenerC2836Wd(c2852Xd, i13));
                    k10.setNegativeButton(c13 != null ? c13.getString(C5275R.string.s4) : "Decline", new DialogInterfaceOnClickListenerC2836Wd(c2852Xd, c10 == true ? 1 : 0));
                    k10.create().show();
                    return;
                }
                if (intValue != 5) {
                    if (intValue == 6) {
                        this.f31265u.C(true);
                        return;
                    } else if (intValue != 7) {
                        int i32 = u2.z.f41319b;
                        v2.i.e("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            ((C2595Hn) this.f31266v.f27139u).f25367m.t();
            return;
        }
        String str5 = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (interfaceC4061vh != null) {
            interfaceC4061vh.l0("portrait".equalsIgnoreCase(str5) ? 7 : "landscape".equalsIgnoreCase(str5) ? 6 : parseBoolean ? -1 : 14);
        } else {
            int i33 = u2.z.f41319b;
            v2.i.f("AdWebView is null");
        }
    }
}
