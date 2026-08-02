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
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.Collections;
import java.util.Map;
import r2.C4896a;
import r2.C4906k;
import s2.C4949p;

/* renamed from: com.google.android.gms.internal.ads.jc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3432jc implements InterfaceC3272gc {

    /* renamed from: w, reason: collision with root package name */
    public static final Map f32050w;

    /* renamed from: n, reason: collision with root package name */
    public final C4896a f32051n;

    /* renamed from: u, reason: collision with root package name */
    public final C2907Zd f32052u;

    /* renamed from: v, reason: collision with root package name */
    public final Qx f32053v;

    static {
        String[] strArr = {com.onesignal.inAppMessages.internal.display.impl.m.EVENT_TYPE_RESIZE, "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        s.b bVar = new s.b(7);
        for (int i = 0; i < 7; i++) {
            bVar.put(strArr[i], numArr[i]);
        }
        f32050w = Collections.unmodifiableMap(bVar);
    }

    public C3432jc(C4896a c4896a, C2907Zd c2907Zd, Qx qx) {
        this.f32051n = c4896a;
        this.f32052u = c2907Zd;
        this.f32053v = qx;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:150:0x044d A[Catch: all -> 0x01ca, TryCatch #1 {all -> 0x01ca, blocks: (B:92:0x01bf, B:94:0x01c3, B:95:0x01c8, B:97:0x01cd, B:99:0x01d7, B:100:0x01dc, B:102:0x01de, B:104:0x01ea, B:105:0x01ef, B:107:0x01f1, B:109:0x01f9, B:110:0x01fe, B:112:0x0200, B:114:0x020e, B:115:0x0220, B:117:0x022e, B:118:0x0240, B:120:0x024e, B:121:0x0260, B:123:0x026e, B:124:0x0280, B:126:0x028e, B:127:0x029c, B:129:0x02aa, B:130:0x02ac, B:132:0x02b0, B:134:0x02b4, B:136:0x02ba, B:139:0x02c2, B:142:0x02f6, B:147:0x0304, B:150:0x044d, B:151:0x0452, B:153:0x0454, B:155:0x047a, B:157:0x0483, B:158:0x04b2, B:189:0x056a, B:190:0x059d, B:192:0x05b5, B:193:0x05dd, B:195:0x05e5, B:196:0x05f0, B:197:0x0615, B:201:0x0618, B:203:0x0643, B:204:0x0652, B:206:0x0571, B:207:0x0578, B:208:0x0581, B:209:0x0588, B:210:0x058e, B:211:0x0597, B:212:0x04af, B:213:0x0654, B:214:0x0659, B:216:0x0310, B:218:0x0314, B:233:0x036e, B:234:0x0378, B:236:0x03cb, B:238:0x03cf, B:240:0x03d3, B:244:0x03df, B:245:0x03ee, B:248:0x0424, B:251:0x0434, B:252:0x042a, B:254:0x0432, B:255:0x041b, B:257:0x0421, B:259:0x037c, B:260:0x0386, B:261:0x038d, B:262:0x0399, B:263:0x03a1, B:264:0x03b5, B:265:0x03c1, B:284:0x0439, B:286:0x0442, B:287:0x065b, B:288:0x0660, B:290:0x0662, B:291:0x0667), top: B:91:0x01bf, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0454 A[Catch: all -> 0x01ca, TryCatch #1 {all -> 0x01ca, blocks: (B:92:0x01bf, B:94:0x01c3, B:95:0x01c8, B:97:0x01cd, B:99:0x01d7, B:100:0x01dc, B:102:0x01de, B:104:0x01ea, B:105:0x01ef, B:107:0x01f1, B:109:0x01f9, B:110:0x01fe, B:112:0x0200, B:114:0x020e, B:115:0x0220, B:117:0x022e, B:118:0x0240, B:120:0x024e, B:121:0x0260, B:123:0x026e, B:124:0x0280, B:126:0x028e, B:127:0x029c, B:129:0x02aa, B:130:0x02ac, B:132:0x02b0, B:134:0x02b4, B:136:0x02ba, B:139:0x02c2, B:142:0x02f6, B:147:0x0304, B:150:0x044d, B:151:0x0452, B:153:0x0454, B:155:0x047a, B:157:0x0483, B:158:0x04b2, B:189:0x056a, B:190:0x059d, B:192:0x05b5, B:193:0x05dd, B:195:0x05e5, B:196:0x05f0, B:197:0x0615, B:201:0x0618, B:203:0x0643, B:204:0x0652, B:206:0x0571, B:207:0x0578, B:208:0x0581, B:209:0x0588, B:210:0x058e, B:211:0x0597, B:212:0x04af, B:213:0x0654, B:214:0x0659, B:216:0x0310, B:218:0x0314, B:233:0x036e, B:234:0x0378, B:236:0x03cb, B:238:0x03cf, B:240:0x03d3, B:244:0x03df, B:245:0x03ee, B:248:0x0424, B:251:0x0434, B:252:0x042a, B:254:0x0432, B:255:0x041b, B:257:0x0421, B:259:0x037c, B:260:0x0386, B:261:0x038d, B:262:0x0399, B:263:0x03a1, B:264:0x03b5, B:265:0x03c1, B:284:0x0439, B:286:0x0442, B:287:0x065b, B:288:0x0660, B:290:0x0662, B:291:0x0667), top: B:91:0x01bf, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03cb A[Catch: all -> 0x01ca, TryCatch #1 {all -> 0x01ca, blocks: (B:92:0x01bf, B:94:0x01c3, B:95:0x01c8, B:97:0x01cd, B:99:0x01d7, B:100:0x01dc, B:102:0x01de, B:104:0x01ea, B:105:0x01ef, B:107:0x01f1, B:109:0x01f9, B:110:0x01fe, B:112:0x0200, B:114:0x020e, B:115:0x0220, B:117:0x022e, B:118:0x0240, B:120:0x024e, B:121:0x0260, B:123:0x026e, B:124:0x0280, B:126:0x028e, B:127:0x029c, B:129:0x02aa, B:130:0x02ac, B:132:0x02b0, B:134:0x02b4, B:136:0x02ba, B:139:0x02c2, B:142:0x02f6, B:147:0x0304, B:150:0x044d, B:151:0x0452, B:153:0x0454, B:155:0x047a, B:157:0x0483, B:158:0x04b2, B:189:0x056a, B:190:0x059d, B:192:0x05b5, B:193:0x05dd, B:195:0x05e5, B:196:0x05f0, B:197:0x0615, B:201:0x0618, B:203:0x0643, B:204:0x0652, B:206:0x0571, B:207:0x0578, B:208:0x0581, B:209:0x0588, B:210:0x058e, B:211:0x0597, B:212:0x04af, B:213:0x0654, B:214:0x0659, B:216:0x0310, B:218:0x0314, B:233:0x036e, B:234:0x0378, B:236:0x03cb, B:238:0x03cf, B:240:0x03d3, B:244:0x03df, B:245:0x03ee, B:248:0x0424, B:251:0x0434, B:252:0x042a, B:254:0x0432, B:255:0x041b, B:257:0x0421, B:259:0x037c, B:260:0x0386, B:261:0x038d, B:262:0x0399, B:263:0x03a1, B:264:0x03b5, B:265:0x03c1, B:284:0x0439, B:286:0x0442, B:287:0x065b, B:288:0x0660, B:290:0x0662, B:291:0x0667), top: B:91:0x01bf, inners: #0 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Object obj, Map map) {
        int i;
        int[] iArr;
        int i4;
        char c9;
        int i6;
        int i9;
        int i10;
        int i11;
        int i12 = 0;
        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) obj;
        int intValue = ((Integer) f32050w.get((String) map.get("a"))).intValue();
        char c10 = 1;
        if (intValue != 5) {
            if (intValue != 7) {
                C4896a c4896a = this.f32051n;
                if (!c4896a.a()) {
                    c4896a.b(null);
                    return;
                }
                if (intValue == 1) {
                    C2907Zd c2907Zd = this.f32052u;
                    synchronized (c2907Zd.f29675E) {
                        try {
                            Activity activity = c2907Zd.f29677G;
                            if (activity == null) {
                                c2907Zd.x("Not an activity context. Cannot resize.");
                                return;
                            }
                            C2575Fh c2575Fh = c2907Zd.f29676F;
                            if (c2575Fh.f25606n.j0() == null) {
                                c2907Zd.x("Webview is not yet available, size is not set.");
                                return;
                            }
                            if (c2575Fh.f25606n.j0().b()) {
                                c2907Zd.x("Is interstitial. Cannot resize an interstitial.");
                                return;
                            }
                            if (c2575Fh.f25606n.G0()) {
                                c2907Zd.x("Cannot resize an expanded banner.");
                                return;
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                                w2.D d9 = C4906k.f40186C.f40191c;
                                c2907Zd.f29674D = w2.D.n((String) map.get("width"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                                w2.D d10 = C4906k.f40186C.f40191c;
                                c2907Zd.f29671A = w2.D.n((String) map.get("height"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                                w2.D d11 = C4906k.f40186C.f40191c;
                                c2907Zd.f29672B = w2.D.n((String) map.get("offsetX"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                                w2.D d12 = C4906k.f40186C.f40191c;
                                c2907Zd.f29673C = w2.D.n((String) map.get("offsetY"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                                c2907Zd.f29685x = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                            }
                            String str = (String) map.get("customClosePosition");
                            if (!TextUtils.isEmpty(str)) {
                                c2907Zd.f29684w = str;
                            }
                            if (c2907Zd.f29674D < 0 || c2907Zd.f29671A < 0) {
                                c2907Zd.x("Invalid width and height options. Cannot resize.");
                                return;
                            }
                            Window window = activity.getWindow();
                            if (window != null && window.getDecorView() != null) {
                                w2.D d13 = C4906k.f40186C.f40191c;
                                int[] p9 = w2.D.p(activity);
                                C4949p c4949p = C4949p.f40498g;
                                int[] iArr2 = {c4949p.f40499a.h(activity, p9[0]), c4949p.f40499a.h(activity, p9[1])};
                                int[] q8 = w2.D.q(activity);
                                int i13 = iArr2[0];
                                int i14 = iArr2[1];
                                int i15 = c2907Zd.f29674D;
                                if (i15 < 50 || i15 > i13) {
                                    i = 50;
                                    int i16 = w2.z.f41712b;
                                    x2.i.f("Width is too small or too large.");
                                } else {
                                    int i17 = c2907Zd.f29671A;
                                    if (i17 < 50 || i17 > i14) {
                                        i = 50;
                                        int i18 = w2.z.f41712b;
                                        x2.i.f("Height is too small or too large.");
                                    } else {
                                        if (i17 != i14 || i15 != i13) {
                                            boolean z6 = c2907Zd.f29685x;
                                            if (z6) {
                                                i = 50;
                                                String str2 = c2907Zd.f29684w;
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
                                                    i6 = c2907Zd.f29672B + c2907Zd.f29686y;
                                                    i9 = c2907Zd.f29687z;
                                                } else if (c9 != 1) {
                                                    if (c9 != 2) {
                                                        if (c9 == 3) {
                                                            i6 = c2907Zd.f29672B + c2907Zd.f29686y;
                                                            i11 = c2907Zd.f29687z;
                                                        } else if (c9 == 4) {
                                                            i6 = ((c2907Zd.f29686y + c2907Zd.f29672B) + (i15 >> 1)) - 25;
                                                            i11 = c2907Zd.f29687z;
                                                        } else if (c9 != 5) {
                                                            i6 = ((c2907Zd.f29686y + c2907Zd.f29672B) + i15) - 50;
                                                            i9 = c2907Zd.f29687z;
                                                        } else {
                                                            i6 = ((c2907Zd.f29686y + c2907Zd.f29672B) + i15) - 50;
                                                            i11 = c2907Zd.f29687z;
                                                        }
                                                        i10 = ((i11 + c2907Zd.f29673C) + i17) - 50;
                                                    } else {
                                                        i6 = ((c2907Zd.f29686y + c2907Zd.f29672B) + (i15 >> 1)) - 25;
                                                        i10 = ((c2907Zd.f29687z + c2907Zd.f29673C) + (i17 >> 1)) - 25;
                                                    }
                                                    if (i6 >= 0) {
                                                        if (i6 + 50 <= i13) {
                                                            if (i10 >= q8[0]) {
                                                                if (i10 + 50 <= q8[1]) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i6 = ((c2907Zd.f29686y + c2907Zd.f29672B) + (i15 >> 1)) - 25;
                                                    i9 = c2907Zd.f29687z;
                                                }
                                                i10 = i9 + c2907Zd.f29673C;
                                                if (i6 >= 0) {
                                                }
                                            } else {
                                                i = 50;
                                            }
                                            if (z6) {
                                                iArr = new int[]{c2907Zd.f29686y + c2907Zd.f29672B, c2907Zd.f29687z + c2907Zd.f29673C};
                                            } else {
                                                int[] p10 = w2.D.p(activity);
                                                int[] iArr3 = {c4949p.f40499a.h(activity, p10[0]), c4949p.f40499a.h(activity, p10[1])};
                                                int[] q9 = w2.D.q(activity);
                                                int i19 = iArr3[0];
                                                int i20 = c2907Zd.f29686y + c2907Zd.f29672B;
                                                int i21 = c2907Zd.f29687z + c2907Zd.f29673C;
                                                if (i20 < 0) {
                                                    i4 = 0;
                                                } else {
                                                    int i22 = c2907Zd.f29674D;
                                                    i4 = i20 + i22 > i19 ? i19 - i22 : i20;
                                                }
                                                int i23 = q9[0];
                                                if (i21 < i23) {
                                                    i21 = i23;
                                                } else {
                                                    int i24 = c2907Zd.f29671A;
                                                    int i25 = i21 + i24;
                                                    int i26 = q9[1];
                                                    if (i25 > i26) {
                                                        i21 = i26 - i24;
                                                    }
                                                }
                                                iArr = new int[]{i4, i21};
                                            }
                                            if (iArr != null) {
                                                c2907Zd.x("Resize location out of screen or close button is not visible.");
                                                return;
                                            }
                                            x2.d dVar = c4949p.f40499a;
                                            int r9 = x2.d.r(activity.getResources().getDisplayMetrics(), c2907Zd.f29674D);
                                            int r10 = x2.d.r(activity.getResources().getDisplayMetrics(), c2907Zd.f29671A);
                                            ViewParent parent = c2575Fh.getParent();
                                            if (!(parent instanceof ViewGroup)) {
                                                c2907Zd.x("Webview is detached, probably in the middle of a resize or expand.");
                                                return;
                                            }
                                            ViewGroup viewGroup = (ViewGroup) parent;
                                            viewGroup.removeView(c2575Fh);
                                            PopupWindow popupWindow = c2907Zd.f29681L;
                                            if (popupWindow == null) {
                                                c2907Zd.f29683N = viewGroup;
                                                c2575Fh.setDrawingCacheEnabled(true);
                                                Bitmap createBitmap = Bitmap.createBitmap(c2575Fh.getDrawingCache());
                                                c2575Fh.setDrawingCacheEnabled(false);
                                                ImageView imageView = new ImageView(activity);
                                                c2907Zd.f29679I = imageView;
                                                imageView.setImageBitmap(createBitmap);
                                                c2907Zd.f29678H = c2575Fh.f25606n.j0();
                                                c2907Zd.f29683N.addView(c2907Zd.f29679I);
                                            } else {
                                                popupWindow.dismiss();
                                            }
                                            RelativeLayout relativeLayout = new RelativeLayout(activity);
                                            c2907Zd.f29682M = relativeLayout;
                                            relativeLayout.setBackgroundColor(0);
                                            c2907Zd.f29682M.setLayoutParams(new ViewGroup.LayoutParams(r9, r10));
                                            PopupWindow popupWindow2 = new PopupWindow((View) c2907Zd.f29682M, r9, r10, false);
                                            c2907Zd.f29681L = popupWindow2;
                                            popupWindow2.setOutsideTouchable(false);
                                            c2907Zd.f29681L.setTouchable(true);
                                            c2907Zd.f29681L.setClippingEnabled(!c2907Zd.f29685x);
                                            char c11 = 65535;
                                            c2907Zd.f29682M.addView(c2575Fh, -1, -1);
                                            c2907Zd.J = new LinearLayout(activity);
                                            int i27 = i;
                                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(x2.d.r(activity.getResources().getDisplayMetrics(), i27), x2.d.r(activity.getResources().getDisplayMetrics(), i27));
                                            String str3 = c2907Zd.f29684w;
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
                                            c2907Zd.J.setOnClickListener(new ViewOnClickListenerC2891Yd(c2907Zd));
                                            c2907Zd.J.setContentDescription("Close button");
                                            c2907Zd.f29682M.addView(c2907Zd.J, layoutParams);
                                            try {
                                                c2907Zd.f29681L.showAtLocation(window.getDecorView(), 0, x2.d.r(activity.getResources().getDisplayMetrics(), iArr[0]), x2.d.r(activity.getResources().getDisplayMetrics(), iArr[1]));
                                                int i28 = iArr[0];
                                                int i29 = iArr[1];
                                                Qx qx = c2907Zd.f29680K;
                                                if (qx != null) {
                                                    ((C2632In) qx.f27895u).f26322c.M1(C2958ak.f29890z);
                                                }
                                                c2907Zd.f29676F.f1(new A3.r(1, r9, r10));
                                                c2907Zd.y(iArr[0], iArr[1] - w2.D.q(c2907Zd.f29677G)[0], c2907Zd.f29674D, c2907Zd.f29671A);
                                                c2907Zd.z(com.anythink.core.express.b.a.i);
                                                return;
                                            } catch (RuntimeException e9) {
                                                String message = e9.getMessage();
                                                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                                                sb.append("Cannot show popup window: ");
                                                sb.append(message);
                                                c2907Zd.x(sb.toString());
                                                RelativeLayout relativeLayout2 = c2907Zd.f29682M;
                                                C2575Fh c2575Fh2 = c2907Zd.f29676F;
                                                relativeLayout2.removeView(c2575Fh2);
                                                ViewGroup viewGroup2 = c2907Zd.f29683N;
                                                if (viewGroup2 != null) {
                                                    viewGroup2.removeView(c2907Zd.f29679I);
                                                    c2907Zd.f29683N.addView(c2575Fh2);
                                                    c2575Fh2.f1(c2907Zd.f29678H);
                                                }
                                                return;
                                            }
                                        }
                                        int i30 = w2.z.f41712b;
                                        x2.i.f("Cannot resize to a full-screen ad.");
                                        i = 50;
                                    }
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                            }
                            c2907Zd.x("Activity context is not ready, cannot get window or decor view.");
                            return;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (intValue == 3) {
                    C3006be c3006be = new C3006be(interfaceC4084vh, map);
                    Activity activity2 = c3006be.f30087w;
                    if (activity2 == null) {
                        c3006be.x("Activity context is not available");
                        return;
                    }
                    C4906k c4906k = C4906k.f40186C;
                    w2.D d14 = c4906k.f40191c;
                    if (!((Boolean) A8.b.y(activity2, CallableC3162ea.f30725b)).booleanValue() || X2.b.a(activity2).f60u.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        c3006be.x("Feature is not supported by the device.");
                        return;
                    }
                    String str4 = (String) map.get("iurl");
                    if (TextUtils.isEmpty(str4)) {
                        c3006be.x("Image url cannot be empty.");
                        return;
                    }
                    if (!URLUtil.isValidUrl(str4)) {
                        c3006be.x("Invalid image url: ".concat(String.valueOf(str4)));
                        return;
                    }
                    String lastPathSegment = Uri.parse(str4).getLastPathSegment();
                    if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                        c3006be.x("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
                        return;
                    }
                    Resources c12 = c4906k.f40196h.c();
                    AlertDialog.Builder k9 = w2.D.k(activity2);
                    k9.setTitle(c12 != null ? c12.getString(C5248R.string.s1) : "Save image");
                    k9.setMessage(c12 != null ? c12.getString(C5248R.string.s2) : "Allow Ad to store image in Picture gallery?");
                    k9.setPositiveButton(c12 != null ? c12.getString(C5248R.string.s3) : "Accept", new DialogInterfaceOnClickListenerC2887Xp(c3006be, str4, lastPathSegment));
                    k9.setNegativeButton(c12 != null ? c12.getString(C5248R.string.s4) : "Decline", new DialogInterfaceOnClickListenerC2952ae(0, c3006be));
                    k9.create().show();
                    return;
                }
                if (intValue == 4) {
                    C2875Xd c2875Xd = new C2875Xd(interfaceC4084vh, map);
                    Activity activity3 = c2875Xd.f29312x;
                    if (activity3 == null) {
                        c2875Xd.x("Activity context is not available.");
                        return;
                    }
                    C4906k c4906k2 = C4906k.f40186C;
                    w2.D d15 = c4906k2.f40191c;
                    Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
                    R2.w.i(type, "Intent can not be null");
                    if (activity3.getPackageManager().queryIntentActivities(type, 0).isEmpty()) {
                        c2875Xd.x("This feature is not available on the device.");
                        return;
                    }
                    AlertDialog.Builder k10 = w2.D.k(activity3);
                    Resources c13 = c4906k2.f40196h.c();
                    k10.setTitle(c13 != null ? c13.getString(C5248R.string.s5) : "Create calendar event");
                    k10.setMessage(c13 != null ? c13.getString(C5248R.string.s6) : "Allow Ad to create a calendar event?");
                    k10.setPositiveButton(c13 != null ? c13.getString(C5248R.string.s3) : "Accept", new DialogInterfaceOnClickListenerC2859Wd(c2875Xd, i12));
                    k10.setNegativeButton(c13 != null ? c13.getString(C5248R.string.s4) : "Decline", new DialogInterfaceOnClickListenerC2859Wd(c2875Xd, c10 == true ? 1 : 0));
                    k10.create().show();
                    return;
                }
                if (intValue != 5) {
                    if (intValue == 6) {
                        this.f32052u.B(true);
                        return;
                    } else if (intValue != 7) {
                        int i31 = w2.z.f41712b;
                        x2.i.e("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            ((C2632In) this.f32053v.f27895u).f26331m.t();
            return;
        }
        String str5 = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (interfaceC4084vh != null) {
            interfaceC4084vh.l0("portrait".equalsIgnoreCase(str5) ? 7 : "landscape".equalsIgnoreCase(str5) ? 6 : parseBoolean ? -1 : 14);
        } else {
            int i32 = w2.z.f41712b;
            x2.i.f("AdWebView is null");
        }
    }
}
