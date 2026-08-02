package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.PointF;
import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.graphics.text.LineBreakConfig;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.discovery.provider.ssdp.Argument;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.passport.api.v2;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class rb {
    public static Serializable A(Intent intent) {
        return intent.getSerializableExtra("platform", v2.class);
    }

    public static String B(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static final BoringLayout.Metrics C(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static final boolean D(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    public static final boolean E(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static boolean F(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final void G(jhm jhmVar, lo0 lo0Var) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (lo0Var == null || (findOnBackInvokedDispatcher = jhmVar.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, lo0Var);
    }

    public static final void H(jhm jhmVar, lo0 lo0Var) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (lo0Var == null || (findOnBackInvokedDispatcher = jhmVar.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(lo0Var);
    }

    public static void I(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj2);
    }

    public static final void J(CursorAnchorInfo.Builder builder, ynn ynnVar) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(uwf.E(ynnVar)).setHandwritingBounds(uwf.E(ynnVar)).build());
    }

    public static final void K(CursorAnchorInfo.Builder builder, ynn ynnVar) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(uwf.E(ynnVar)).setHandwritingBounds(uwf.E(ynnVar)).build());
    }

    public static void L(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }

    public static final void M(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }

    public static void N(InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }

    public static void O(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    public static Unit a(fk0 fk0Var, RuntimeShader runtimeShader, boolean z, long j, zco zcoVar) {
        zcoVar.getClass();
        float floatValue = ((Number) fk0Var.e()).floatValue();
        if (floatValue <= 0.0f || floatValue >= 2.5f) {
            zcoVar.h(null);
        } else {
            runtimeShader.setFloatUniform("iResolution", nmq.d(zcoVar.p), nmq.b(zcoVar.p));
            long j2 = zcoVar.p;
            if (z) {
                runtimeShader.setFloatUniform("iOrigin", nmq.d(j2), nmq.b(zcoVar.p) * 0.5f);
            } else {
                runtimeShader.setFloatUniform("iOrigin", nmq.d(j2) * 0.5f, nmq.b(zcoVar.p));
            }
            runtimeShader.setFloatUniform("iTime", floatValue);
            runtimeShader.setFloatUniform("iAmplitude", 22.0f);
            runtimeShader.setFloatUniform("iFrequency", 7.5f);
            runtimeShader.setFloatUniform("iDecay", 1.5f);
            runtimeShader.setFloatUniform("iSpeed", 3500.0f);
            runtimeShader.setFloatUniform("iWaveColor", d85.h(j), d85.g(j), d85.e(j));
            RenderEffect createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShader, "inputShader");
            createRuntimeShaderEffect.getClass();
            zcoVar.h(new fi0(createRuntimeShaderEffect));
        }
        return Unit.a;
    }

    public static Unit b(float f, swn swnVar, float f2, RuntimeShader runtimeShader, RuntimeShader runtimeShader2, zco zcoVar) {
        zcoVar.getClass();
        zcoVar.k(f);
        zcoVar.n(f);
        if (nmq.d(zcoVar.p) > 0.0f && nmq.b(zcoVar.p) > 0.0f) {
            if (swnVar.a != nmq.d(zcoVar.p) || swnVar.b != nmq.b(zcoVar.p) || swnVar.c != f2) {
                swnVar.a = nmq.d(zcoVar.p);
                swnVar.b = nmq.b(zcoVar.p);
                swnVar.c = f2;
                runtimeShader.setFloatUniform("resolution", nmq.d(zcoVar.p), nmq.b(zcoVar.p));
                runtimeShader2.setFloatUniform("resolution", nmq.d(zcoVar.p), nmq.b(zcoVar.p));
                runtimeShader.setFloatUniform("blurRadiusPx", f2);
                runtimeShader2.setFloatUniform("blurRadiusPx", f2);
                RenderEffect createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShader, "image");
                createRuntimeShaderEffect.getClass();
                RenderEffect createRuntimeShaderEffect2 = RenderEffect.createRuntimeShaderEffect(runtimeShader2, "image");
                createRuntimeShaderEffect2.getClass();
                swnVar.d = RenderEffect.createChainEffect(createRuntimeShaderEffect2, createRuntimeShaderEffect);
            }
            RenderEffect renderEffect = swnVar.d;
            zcoVar.h(renderEffect != null ? new fi0(renderEffect) : null);
        }
        return Unit.a;
    }

    public static yci c(final fk0 fk0Var, final boolean z, final long j, yci yciVar, hq5 hq5Var) {
        yciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-1629379806);
        Object K = oq5Var.K();
        Object obj = gq5.a;
        if (K == obj) {
            K = new RuntimeShader("\n    uniform shader inputShader;\n    uniform vec2  iResolution;\n    uniform vec2  iOrigin;\n    uniform float iTime;\n    uniform float iAmplitude;\n    uniform float iFrequency;\n    uniform float iDecay;\n    uniform float iSpeed;\n    uniform vec3  iWaveColor;\n\n    vec4 main(vec2 fragCoord) {\n        float dist   = length(fragCoord - iOrigin);\n        float delay  = dist / iSpeed;\n        float time   = max(0.0, iTime - delay);\n        float ripple = iAmplitude * sin(iFrequency * time) * exp(-iDecay * time);\n        vec2  d      = fragCoord - iOrigin;\n        float len    = length(d);\n        vec2  n      = len > 1e-4 ? normalize(d) : vec2(0.0, -1.0);\n        vec2  pos    = fragCoord + ripple * n;\n        vec4  color  = inputShader.eval(pos);\n        float wave   = max(0.0, ripple / iAmplitude);\n        color.rgb    = mix(color.rgb, iWaveColor, wave * 0.75);\n        return color;\n    }\n");
            oq5Var.k0(K);
        }
        final RuntimeShader runtimeShader = (RuntimeShader) K;
        boolean h = oq5Var.h(fk0Var) | oq5Var.h(runtimeShader) | oq5Var.g(z) | oq5Var.e(j);
        Object K2 = oq5Var.K();
        if (h || K2 == obj) {
            K2 = new Function1() { // from class: heo
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return rb.a(fk0.this, runtimeShader, z, j, (zco) obj2);
                }
            };
            oq5Var.k0(K2);
        }
        yci a = a.a(yciVar, (Function1) K2);
        oq5Var.p(false);
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ad, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r7.K(), java.lang.Integer.valueOf(r6)) == false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(klu kluVar, owu owuVar, zpd zpdVar, boolean z, yci yciVar, yci yciVar2, uoi uoiVar, d85 d85Var, gz2 gz2Var, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar3;
        int i4;
        gz2 gz2Var2;
        yci yciVar4;
        gz2 gz2Var3;
        boolean h;
        Object K;
        Object obj;
        Object K2;
        int i5;
        int i6;
        Object K3;
        Object K4;
        String str;
        yci yciVar5;
        kluVar.getClass();
        owuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-601401947);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(kluVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(owuVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.d(zpdVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i7 = i2 & 32;
        if (i7 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            yciVar3 = yciVar2;
            i3 |= oq5Var.f(yciVar3) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            if ((1572864 & i) == 0) {
                i3 |= oq5Var.f(uoiVar) ? 1048576 : 524288;
            }
            if ((12582912 & i) == 0) {
                i3 |= oq5Var.f(d85Var) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
            }
            i4 = i2 & 256;
            if (i4 == 0) {
                i3 |= 100663296;
            } else if ((100663296 & i) == 0) {
                gz2Var2 = gz2Var;
                i3 |= oq5Var.f(gz2Var2) ? 67108864 : 33554432;
                if ((38347923 & i3) == 38347922 || !oq5Var.z()) {
                    oq5Var.U();
                    if ((i & 1) != 0 || oq5Var.y()) {
                        yci yciVar6 = i7 != 0 ? null : yciVar3;
                        if (i4 != 0) {
                            yciVar4 = yciVar6;
                            gz2Var3 = b2c.n;
                            oq5Var.q();
                            aqi M = gld.M(owuVar.c(), oq5Var);
                            h = oq5Var.h(owuVar) | oq5Var.f(M);
                            K = oq5Var.K();
                            obj = gq5.a;
                            if (!h || K == obj) {
                                K = new zp(owuVar, M, 0);
                                oq5Var.k0(K);
                            }
                            yci d = androidx.compose.foundation.a.d(yciVar, uoiVar, null, false, null, null, (Function0) K, 28);
                            K2 = oq5Var.K();
                            if (K2 == obj) {
                                K2 = new u4(15);
                                oq5Var.k0(K2);
                            }
                            yci b = nfp.b(d, false, (Function1) K2);
                            kx0 kx0Var = qx0.c;
                            ta5 a = sa5.a(kx0Var, gz2Var3, oq5Var, (((i3 >> 18) & 896) >> 3) & 112);
                            int i8 = oq5Var.P;
                            androidx.compose.runtime.internal.a l = oq5Var.l();
                            yci H = vnj.H(oq5Var, b);
                            xp5.T.getClass();
                            Function0 function0 = wp5.b;
                            oq5Var.d0();
                            gz2 gz2Var4 = gz2Var3;
                            if (oq5Var.O) {
                                oq5Var.n0();
                            } else {
                                oq5Var.k(function0);
                            }
                            kb5 kb5Var = wp5.f;
                            g0g.U(oq5Var, a, kb5Var);
                            kb5 kb5Var2 = wp5.e;
                            g0g.U(oq5Var, l, kb5Var2);
                            kb5 kb5Var3 = wp5.g;
                            if (oq5Var.O) {
                                i5 = i3;
                            } else {
                                i5 = i3;
                            }
                            ouj.x(i8, oq5Var, i8, kb5Var3);
                            kb5 kb5Var4 = wp5.d;
                            g0g.U(oq5Var, H, kb5Var4);
                            qmu qmuVar = (qmu) M.getValue();
                            vci vciVar = vci.a;
                            int i9 = (i5 & 14) | ((i5 >> 3) & 896);
                            int i10 = i5 >> 6;
                            n(kluVar, qmuVar, z, yciVar4 != null ? vciVar : yciVar4, uoiVar, d85Var, !owuVar.a(), oq5Var, i9 | (i10 & 57344) | (i10 & 458752), 0);
                            u1g.l(oq5Var, d.e(vciVar, 8));
                            float M2 = j66.M(zpdVar, oq5Var);
                            int i11 = zpdVar.b;
                            int i12 = zpdVar.a;
                            yci e = d.e(vciVar, M2);
                            gz2 gz2Var5 = b2c.o;
                            yci f = e.f(new HorizontalAlignElement(gz2Var5));
                            ta5 a2 = sa5.a(kx0Var, gz2Var5, oq5Var, 48);
                            i6 = oq5Var.P;
                            androidx.compose.runtime.internal.a l2 = oq5Var.l();
                            yci H2 = vnj.H(oq5Var, f);
                            oq5Var.d0();
                            if (oq5Var.O) {
                                oq5Var.n0();
                            } else {
                                oq5Var.k(function0);
                            }
                            g0g.U(oq5Var, a2, kb5Var);
                            g0g.U(oq5Var, l2, kb5Var2);
                            if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                                ouj.x(i6, oq5Var, i6, kb5Var3);
                            }
                            g0g.U(oq5Var, H2, kb5Var4);
                            K3 = oq5Var.K();
                            if (K3 == obj) {
                                K3 = k5r.h(i12, oq5Var);
                            }
                            u6k u6kVar = (u6k) K3;
                            String str2 = kluVar.a;
                            ozm ozmVar = eq0.a;
                            long j = ((dq0) oq5Var.j(ozmVar)).b.a;
                            ges j2 = nu0.j();
                            yci a3 = androidx.compose.ui.platform.a.a(vciVar, "name");
                            int i13 = zpdVar.a;
                            K4 = oq5Var.K();
                            if (K4 == obj) {
                                K4 = new aq(u6kVar, 0);
                                oq5Var.k0(K4);
                            }
                            xv7.j(str2, a3, j, 0L, 0L, 3, 0L, 2, false, i13, 0, (Function1) K4, j2, oq5Var, 48, 196656, 22264);
                            str = kluVar.b;
                            if (str != null) {
                                oq5Var.Z(815625544);
                            } else {
                                oq5Var.Z(815625545);
                                if (i11 > 0) {
                                    oq5Var.Z(-1464622992);
                                    int h2 = ((i12 + i11) + zpdVar.c) - u6kVar.h();
                                    int i14 = h2 < 0 ? 0 : h2;
                                    u1g.l(oq5Var, d.e(vciVar, upd.a));
                                    xv7.j(str, androidx.compose.ui.platform.a.a(vciVar, DeviceService.KEY_DESC), ((dq0) oq5Var.j(ozmVar)).b.b, 0L, 0L, 3, 0L, 2, false, i14, 0, null, nu0.i(), oq5Var, 48, 48, 55032);
                                } else {
                                    oq5Var.Z(-1470880497);
                                }
                                oq5Var.p(false);
                            }
                            oq5Var.p(false);
                            oq5Var.p(true);
                            oq5Var.p(true);
                            yciVar5 = yciVar4;
                            gz2Var2 = gz2Var4;
                        } else {
                            yciVar4 = yciVar6;
                        }
                    } else {
                        oq5Var.S();
                        yciVar4 = yciVar3;
                    }
                    gz2Var3 = gz2Var2;
                    oq5Var.q();
                    aqi M3 = gld.M(owuVar.c(), oq5Var);
                    h = oq5Var.h(owuVar) | oq5Var.f(M3);
                    K = oq5Var.K();
                    obj = gq5.a;
                    if (!h) {
                    }
                    K = new zp(owuVar, M3, 0);
                    oq5Var.k0(K);
                    yci d2 = androidx.compose.foundation.a.d(yciVar, uoiVar, null, false, null, null, (Function0) K, 28);
                    K2 = oq5Var.K();
                    if (K2 == obj) {
                    }
                    yci b2 = nfp.b(d2, false, (Function1) K2);
                    kx0 kx0Var2 = qx0.c;
                    ta5 a4 = sa5.a(kx0Var2, gz2Var3, oq5Var, (((i3 >> 18) & 896) >> 3) & 112);
                    int i82 = oq5Var.P;
                    androidx.compose.runtime.internal.a l3 = oq5Var.l();
                    yci H3 = vnj.H(oq5Var, b2);
                    xp5.T.getClass();
                    Function0 function02 = wp5.b;
                    oq5Var.d0();
                    gz2 gz2Var42 = gz2Var3;
                    if (oq5Var.O) {
                    }
                    kb5 kb5Var5 = wp5.f;
                    g0g.U(oq5Var, a4, kb5Var5);
                    kb5 kb5Var22 = wp5.e;
                    g0g.U(oq5Var, l3, kb5Var22);
                    kb5 kb5Var32 = wp5.g;
                    if (oq5Var.O) {
                    }
                    ouj.x(i82, oq5Var, i82, kb5Var32);
                    kb5 kb5Var42 = wp5.d;
                    g0g.U(oq5Var, H3, kb5Var42);
                    qmu qmuVar2 = (qmu) M3.getValue();
                    vci vciVar2 = vci.a;
                    int i92 = (i5 & 14) | ((i5 >> 3) & 896);
                    int i102 = i5 >> 6;
                    n(kluVar, qmuVar2, z, yciVar4 != null ? vciVar2 : yciVar4, uoiVar, d85Var, !owuVar.a(), oq5Var, i92 | (i102 & 57344) | (i102 & 458752), 0);
                    u1g.l(oq5Var, d.e(vciVar2, 8));
                    float M22 = j66.M(zpdVar, oq5Var);
                    int i112 = zpdVar.b;
                    int i122 = zpdVar.a;
                    yci e2 = d.e(vciVar2, M22);
                    gz2 gz2Var52 = b2c.o;
                    yci f2 = e2.f(new HorizontalAlignElement(gz2Var52));
                    ta5 a22 = sa5.a(kx0Var2, gz2Var52, oq5Var, 48);
                    i6 = oq5Var.P;
                    androidx.compose.runtime.internal.a l22 = oq5Var.l();
                    yci H22 = vnj.H(oq5Var, f2);
                    oq5Var.d0();
                    if (oq5Var.O) {
                    }
                    g0g.U(oq5Var, a22, kb5Var5);
                    g0g.U(oq5Var, l22, kb5Var22);
                    if (!oq5Var.O) {
                    }
                    ouj.x(i6, oq5Var, i6, kb5Var32);
                    g0g.U(oq5Var, H22, kb5Var42);
                    K3 = oq5Var.K();
                    if (K3 == obj) {
                    }
                    u6k u6kVar2 = (u6k) K3;
                    String str22 = kluVar.a;
                    ozm ozmVar2 = eq0.a;
                    long j3 = ((dq0) oq5Var.j(ozmVar2)).b.a;
                    ges j22 = nu0.j();
                    yci a32 = androidx.compose.ui.platform.a.a(vciVar2, "name");
                    int i132 = zpdVar.a;
                    K4 = oq5Var.K();
                    if (K4 == obj) {
                    }
                    xv7.j(str22, a32, j3, 0L, 0L, 3, 0L, 2, false, i132, 0, (Function1) K4, j22, oq5Var, 48, 196656, 22264);
                    str = kluVar.b;
                    if (str != null) {
                    }
                    oq5Var.p(false);
                    oq5Var.p(true);
                    oq5Var.p(true);
                    yciVar5 = yciVar4;
                    gz2Var2 = gz2Var42;
                } else {
                    oq5Var.S();
                    yciVar5 = yciVar3;
                }
                xmn r = oq5Var.r();
                if (r != null) {
                    r.d = new bq(kluVar, owuVar, zpdVar, z, yciVar, yciVar5, uoiVar, d85Var, gz2Var2, i, i2);
                    return;
                }
                return;
            }
            gz2Var2 = gz2Var;
            if ((38347923 & i3) == 38347922) {
            }
            oq5Var.U();
            if ((i & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
        }
        yciVar3 = yciVar2;
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        i4 = i2 & 256;
        if (i4 == 0) {
        }
        gz2Var2 = gz2Var;
        if ((38347923 & i3) == 38347922) {
        }
        oq5Var.U();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
    }

    public static final void e(String str, boolean z, klu kluVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1266371296);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(kluVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            clu K = p1g.K(kluVar.e, kluVar.f, oq5Var, 0);
            PointF pointF = lzg.a;
            i(str, z, y1g.R(new ezg[]{y1g.S(Integer.valueOf(K.a), new String[]{"**", "color", "**"}, oq5Var), y1g.S(Integer.valueOf(K.b), new String[]{"**", "glow_1", "**"}, oq5Var), y1g.S(Integer.valueOf(K.c), new String[]{"**", "glow_2", "**"}, oq5Var)}, oq5Var), yciVar, null, null, oq5Var, (i2 & 126) | RemoteCameraConfig.Mic.BUFFER_SIZE | (i2 & 7168), 48);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp(str, z, kluVar, yciVar, i, 3);
        }
    }

    public static final void f(klu kluVar, clu cluVar, boolean z, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(722696118);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(kluVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(cluVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            PointF pointF = lzg.a;
            l(new ezg[]{y1g.S(Integer.valueOf(cluVar.a), new String[]{"**", "color", "**"}, oq5Var), y1g.S(Integer.valueOf(cluVar.b), new String[]{"**", "glow_1", "**"}, oq5Var), y1g.S(Integer.valueOf(cluVar.c), new String[]{"**", "glow_2", "**"}, oq5Var)}, kluVar.d, z, yciVar, oq5Var, i2 & 8064);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp((Object) kluVar, (Object) cluVar, z, yciVar, i, 2);
        }
    }

    public static final void g(String str, qo6 qo6Var, boolean z, dup dupVar, klu kluVar, uoi uoiVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(401203953);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.d(qo6Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(dupVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(kluVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i & 196608) == 0) {
            i2 |= oq5Var.f(uoiVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var.f(yciVar) ? 1048576 : 524288;
        }
        int i3 = i2;
        if ((599187 & i3) == 599186 && oq5Var.z()) {
            oq5Var.S();
        } else {
            clu K = p1g.K(kluVar.e, kluVar.f, oq5Var, 0);
            PointF pointF = lzg.a;
            i(str, z, y1g.R(new ezg[]{y1g.S(Integer.valueOf(K.a), new String[]{"color", "**"}, oq5Var)}, oq5Var), yciVar, dupVar, ild.C(-892968120, new wl(kluVar, dupVar, uoiVar, qo6Var, 1), oq5Var), oq5Var, (i3 & 14) | 196608 | ((i3 >> 3) & 112) | RemoteCameraConfig.Mic.BUFFER_SIZE | ((i3 >> 9) & 7168) | (57344 & (i3 << 3)), 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new eq(str, qo6Var, z, dupVar, kluVar, uoiVar, yciVar, i, 1);
        }
    }

    public static final void h(clu cluVar, String str, boolean z, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1002374983);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(cluVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            PointF pointF = lzg.a;
            l(new ezg[]{y1g.S(Integer.valueOf(cluVar.a), new String[]{"color", "**"}, oq5Var)}, str, z, yciVar, oq5Var, i2 & 8176);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp((Object) cluVar, (Object) str, z, (Object) yciVar, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(String str, boolean z, final dzg dzgVar, yci yciVar, dup dupVar, Function2 function2, hq5 hq5Var, int i, int i2) {
        int i3;
        dup dupVar2;
        int i4;
        Function2 function22;
        Object K;
        Object obj;
        Object K2;
        Object K3;
        float f;
        Object obj2;
        Object K4;
        Object K5;
        oq5 oq5Var;
        Function2 function23;
        xmn r;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1508366820);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var2.f(dzgVar) : oq5Var2.h(dzgVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            dupVar2 = dupVar;
            i3 |= oq5Var2.f(dupVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                function22 = function2;
                i3 |= oq5Var2.h(function22) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                if ((74899 & i3) == 74898 || !oq5Var2.z()) {
                    final dup dupVar3 = i5 != 0 ? null : dupVar2;
                    final Function2 function24 = i4 != 0 ? lxe.a : function22;
                    oq5Var2.Z(1808391855);
                    str.getClass();
                    final jyg Q = y1g.Q(new nyg(str), oq5Var2);
                    oq5Var2.p(false);
                    K = oq5Var2.K();
                    obj = gq5.a;
                    if (K == obj) {
                        K = tlm.h(0.0f, oq5Var2);
                    }
                    final poi poiVar = (poi) K;
                    ayg value = Q.getValue();
                    K2 = oq5Var2.K();
                    if (K2 == obj) {
                        K2 = new rp(poiVar, 0);
                        oq5Var2.k0(K2);
                    }
                    k(value, z, (Function1) K2, oq5Var2, (i3 & 112) | 384);
                    final jx7 jx7Var = (jx7) oq5Var2.j(es5.h);
                    final float n0 = jx7Var.n0(10);
                    K3 = oq5Var2.K();
                    if (K3 == obj) {
                        RuntimeShader runtimeShader = new RuntimeShader("\nuniform shader image;\nuniform float2 resolution;\nuniform float blurRadiusPx;\nuniform float2 direction; // (1,0) pass 1, (0,1) pass 2\n\n// 1-D kernel: tap spacing = (blurRadiusPx / R) * amount.\nconst int R = 8; // 17 taps per pass\n// Blur strength at fixed blurRadiusPx: smaller divisor = flatter weights = stronger blur.\n// /3.0 truncates at 3-sigma (faint outer taps); /2.0 gives the outer taps real weight so the\n// kernel actually uses its full blurRadiusPx reach.\nconst float SIGMA = float(R) / 2.0;\nconst float TWO_SIGMA_SQ = 2.0 * SIGMA * SIGMA;\n\nhalf4 sampleSafe(float2 c) {\n    // EDGE CLAMP (not zero). Returning transparent-black for out-of-bounds taps\n    // and still counting their weight in `total` lowers color+alpha at the\n    // corners, letting the light background bleed through as a faint white glow.\n    // Clamp to the nearest border texel instead — matches Shader.TileMode.CLAMP\n    // / Modifier.blur's default edge treatment.\n    float2 cc = clamp(c, float2(0.5), resolution - float2(0.5));\n    return image.eval(cc);\n}\n\n// Half-width (in diagonal-t units: 0 at the center band, 0.5 at the top-left/bottom-right corners)\n// of the fully-sharp center. Everything inside it stays crisp — raise it for a wider clearly-visible\n// center, lower it to let the blur creep further inward. Must stay < BLUR_EDGE.\nconst float SHARP_HALF = 0.11;\n\n// Diagonal-t distance from center at which the blur reaches full strength. 0.2 keeps the blurred\n// boundary pinned to the container's 0.3/0.7 gradient stops. Lower it to pull the fully-blurred band\n// inward (more of the frame at max blur); raise it toward 0.5 for a gentler rim.\nconst float BLUR_EDGE = 0.24;\n\nfloat maskAt(float2 p) {\n    // Diagonal position top-left(0) -> bottom-right(1), matching the linearGradient direction of\n    // GradientBlurredContainer (start (0,0) -> end (w,h)). 1.0 (sharp) in the center band, easing to\n    // 0.0 (fully blurred) toward the top-left/bottom-right corners; SHARP_HALF widens the sharp\n    // middle and BLUR_EDGE sets where the corners reach full blur.\n    float2 uv = p / resolution;\n    float t = (uv.x + uv.y) * 0.5;\n    float d = abs(t - 0.5); // 0 at center, 0.5 at corners\n    // smoothstep (Hermite) rather than a linear ramp: the blur eases in at the sharp-band edge\n    // (d == SHARP_HALF) and eases out at the fully-blurred boundary (d == BLUR_EDGE) with no hard\n    // kinks, so the center->corner falloff reads as a smooth gradient.\n    return 1.0 - smoothstep(SHARP_HALF, BLUR_EDGE, d);\n}\n\nhalf4 main(float2 p) {\n    float amount = 1.0 - maskAt(p); // 0 at center, 1 at corners\n    float tapSpacing = (blurRadiusPx / float(R)) * amount;\n    if (tapSpacing < 0.25) { // effectively sharp -> skip loop\n        return image.eval(p);\n    }\n\n    half4 sum = half4(0.0);\n    float total = 0.0;\n    for (int i = -R; i <= R; i++) {\n        float w = exp(-float(i * i) / TWO_SIGMA_SQ);\n        sum += sampleSafe(p + direction * (float(i) * tapSpacing)) * w;\n        total += w;\n    }\n    return sum / total;\n}\n");
                        f = 0.0f;
                        runtimeShader.setFloatUniform(Argument.TAG_DIRECTION, 1.0f, 0.0f);
                        oq5Var2.k0(runtimeShader);
                        obj2 = runtimeShader;
                    } else {
                        f = 0.0f;
                        obj2 = K3;
                    }
                    final RuntimeShader d = wb8.d(obj2);
                    K4 = oq5Var2.K();
                    Object obj3 = K4;
                    if (K4 == obj) {
                        RuntimeShader runtimeShader2 = new RuntimeShader("\nuniform shader image;\nuniform float2 resolution;\nuniform float blurRadiusPx;\nuniform float2 direction; // (1,0) pass 1, (0,1) pass 2\n\n// 1-D kernel: tap spacing = (blurRadiusPx / R) * amount.\nconst int R = 8; // 17 taps per pass\n// Blur strength at fixed blurRadiusPx: smaller divisor = flatter weights = stronger blur.\n// /3.0 truncates at 3-sigma (faint outer taps); /2.0 gives the outer taps real weight so the\n// kernel actually uses its full blurRadiusPx reach.\nconst float SIGMA = float(R) / 2.0;\nconst float TWO_SIGMA_SQ = 2.0 * SIGMA * SIGMA;\n\nhalf4 sampleSafe(float2 c) {\n    // EDGE CLAMP (not zero). Returning transparent-black for out-of-bounds taps\n    // and still counting their weight in `total` lowers color+alpha at the\n    // corners, letting the light background bleed through as a faint white glow.\n    // Clamp to the nearest border texel instead — matches Shader.TileMode.CLAMP\n    // / Modifier.blur's default edge treatment.\n    float2 cc = clamp(c, float2(0.5), resolution - float2(0.5));\n    return image.eval(cc);\n}\n\n// Half-width (in diagonal-t units: 0 at the center band, 0.5 at the top-left/bottom-right corners)\n// of the fully-sharp center. Everything inside it stays crisp — raise it for a wider clearly-visible\n// center, lower it to let the blur creep further inward. Must stay < BLUR_EDGE.\nconst float SHARP_HALF = 0.11;\n\n// Diagonal-t distance from center at which the blur reaches full strength. 0.2 keeps the blurred\n// boundary pinned to the container's 0.3/0.7 gradient stops. Lower it to pull the fully-blurred band\n// inward (more of the frame at max blur); raise it toward 0.5 for a gentler rim.\nconst float BLUR_EDGE = 0.24;\n\nfloat maskAt(float2 p) {\n    // Diagonal position top-left(0) -> bottom-right(1), matching the linearGradient direction of\n    // GradientBlurredContainer (start (0,0) -> end (w,h)). 1.0 (sharp) in the center band, easing to\n    // 0.0 (fully blurred) toward the top-left/bottom-right corners; SHARP_HALF widens the sharp\n    // middle and BLUR_EDGE sets where the corners reach full blur.\n    float2 uv = p / resolution;\n    float t = (uv.x + uv.y) * 0.5;\n    float d = abs(t - 0.5); // 0 at center, 0.5 at corners\n    // smoothstep (Hermite) rather than a linear ramp: the blur eases in at the sharp-band edge\n    // (d == SHARP_HALF) and eases out at the fully-blurred boundary (d == BLUR_EDGE) with no hard\n    // kinks, so the center->corner falloff reads as a smooth gradient.\n    return 1.0 - smoothstep(SHARP_HALF, BLUR_EDGE, d);\n}\n\nhalf4 main(float2 p) {\n    float amount = 1.0 - maskAt(p); // 0 at center, 1 at corners\n    float tapSpacing = (blurRadiusPx / float(R)) * amount;\n    if (tapSpacing < 0.25) { // effectively sharp -> skip loop\n        return image.eval(p);\n    }\n\n    half4 sum = half4(0.0);\n    float total = 0.0;\n    for (int i = -R; i <= R; i++) {\n        float w = exp(-float(i * i) / TWO_SIGMA_SQ);\n        sum += sampleSafe(p + direction * (float(i) * tapSpacing)) * w;\n        total += w;\n    }\n    return sum / total;\n}\n");
                        runtimeShader2.setFloatUniform(Argument.TAG_DIRECTION, f, 1.0f);
                        oq5Var2.k0(runtimeShader2);
                        obj3 = runtimeShader2;
                    }
                    final RuntimeShader d2 = wb8.d(obj3);
                    K5 = oq5Var2.K();
                    Object obj4 = K5;
                    if (K5 == obj) {
                        swn swnVar = new swn();
                        swnVar.c = -1.0f;
                        oq5Var2.k0(swnVar);
                        obj4 = swnVar;
                    }
                    final swn swnVar2 = (swn) obj4;
                    yci d3 = androidx.compose.foundation.layout.a.d(yciVar, 1.0f);
                    iz2 iz2Var = b2c.f;
                    pyc pycVar = new pyc() { // from class: sp
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            oq5 oq5Var3;
                            final RuntimeShader runtimeShader3 = d;
                            final RuntimeShader runtimeShader4 = d2;
                            c cVar = (c) obj5;
                            hq5 hq5Var2 = (hq5) obj6;
                            int intValue = ((Integer) obj7).intValue();
                            cVar.getClass();
                            if ((intValue & 6) == 0) {
                                intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                            }
                            if ((intValue & 19) == 18) {
                                oq5 oq5Var4 = (oq5) hq5Var2;
                                if (oq5Var4.z()) {
                                    oq5Var4.S();
                                    return Unit.a;
                                }
                            }
                            int i6 = ga6.i(cVar.b);
                            Integer valueOf = Integer.valueOf(i6);
                            if (i6 == Integer.MAX_VALUE) {
                                valueOf = null;
                            }
                            Float valueOf2 = valueOf != null ? Float.valueOf(valueOf.intValue()) : null;
                            float c = valueOf2 != null ? yhn.c(valueOf2.floatValue() * 0.8f, 340.0f, 480.0f) : 480.0f;
                            float floatValue = valueOf2 != null ? valueOf2.floatValue() / c : 1.0f;
                            float f2 = n0;
                            if (valueOf2 != null) {
                                f2 = yhn.c(valueOf2.floatValue() * 0.06f, 0.45f * f2, f2);
                            }
                            final float f3 = f2 / floatValue;
                            vci vciVar = vci.a;
                            yci i7 = valueOf2 != null ? d.i(vciVar, jx7Var.d0(c)) : d.c(vciVar, 1.0f);
                            oq5 oq5Var5 = (oq5) hq5Var2;
                            boolean c2 = oq5Var5.c(floatValue);
                            final float f4 = floatValue;
                            final swn swnVar3 = swnVar2;
                            boolean h = c2 | oq5Var5.h(swnVar3) | oq5Var5.c(f3) | oq5Var5.h(runtimeShader3) | oq5Var5.h(runtimeShader4);
                            Object K6 = oq5Var5.K();
                            kjn kjnVar = gq5.a;
                            if (h || K6 == kjnVar) {
                                Function1 function1 = new Function1() { // from class: yp
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj8) {
                                        return rb.b(f4, swnVar3, f3, runtimeShader3, runtimeShader4, (zco) obj8);
                                    }
                                };
                                oq5Var5.k0(function1);
                                K6 = function1;
                            }
                            yci a = a.a(i7, (Function1) K6);
                            iz2 iz2Var2 = b2c.b;
                            kfh d4 = ug3.d(iz2Var2, false);
                            int i8 = oq5Var5.P;
                            androidx.compose.runtime.internal.a l = oq5Var5.l();
                            yci H = vnj.H(oq5Var5, a);
                            xp5.T.getClass();
                            grb grbVar = wp5.b;
                            oq5Var5.d0();
                            if (oq5Var5.O) {
                                oq5Var5.k(grbVar);
                            } else {
                                oq5Var5.n0();
                            }
                            kb5 kb5Var = wp5.f;
                            g0g.U(oq5Var5, d4, kb5Var);
                            kb5 kb5Var2 = wp5.e;
                            g0g.U(oq5Var5, l, kb5Var2);
                            kb5 kb5Var3 = wp5.g;
                            if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i8))) {
                                ouj.x(i8, oq5Var5, i8, kb5Var3);
                            }
                            kb5 kb5Var4 = wp5.d;
                            g0g.U(oq5Var5, H, kb5Var4);
                            yci L = gdg.L(d.c(vciVar, 1.0f), 0.82f, 0.82f);
                            dup dupVar4 = dupVar3;
                            if (dupVar4 != null) {
                                L = L.f(xp3.u(vciVar, dupVar4));
                            }
                            kfh d5 = ug3.d(iz2Var2, false);
                            int i9 = oq5Var5.P;
                            androidx.compose.runtime.internal.a l2 = oq5Var5.l();
                            yci H2 = vnj.H(oq5Var5, L);
                            oq5Var5.d0();
                            if (oq5Var5.O) {
                                oq5Var5.k(grbVar);
                            } else {
                                oq5Var5.n0();
                            }
                            g0g.U(oq5Var5, d5, kb5Var);
                            g0g.U(oq5Var5, l2, kb5Var2);
                            if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i9))) {
                                ouj.x(i9, oq5Var5, i9, kb5Var3);
                            }
                            g0g.U(oq5Var5, H2, kb5Var4);
                            function24.invoke(oq5Var5, 0);
                            jyg jygVar = Q;
                            if (jygVar.getValue() != null) {
                                oq5Var5.Z(-1480125951);
                                ayg value2 = jygVar.getValue();
                                yci c3 = d.c(vciVar, 1.0f);
                                Object K7 = oq5Var5.K();
                                if (K7 == kjnVar) {
                                    K7 = new wp(poiVar, 1);
                                    oq5Var5.k0(K7);
                                }
                                u1g.d(value2, (Function0) K7, c3, true, wwn.b, dzgVar, null, null, false, oq5Var5, 1087898032, 0, 130360);
                                oq5Var3 = oq5Var5;
                            } else {
                                oq5Var3 = oq5Var5;
                                oq5Var3.Z(-1502337792);
                            }
                            oq5Var3.p(false);
                            oq5Var3.p(true);
                            oq5Var3.p(true);
                            return Unit.a;
                        }
                    };
                    oq5Var = oq5Var2;
                    bg3.a(d3, iz2Var, false, ild.C(-130621746, pycVar, oq5Var2), oq5Var, 3120, 4);
                    dupVar2 = dupVar3;
                    function23 = function24;
                } else {
                    oq5Var2.S();
                    function23 = function22;
                    oq5Var = oq5Var2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new tp(str, z, dzgVar, yciVar, dupVar2, function23, i, i2, 0);
                    return;
                }
                return;
            }
            function22 = function2;
            if ((74899 & i3) == 74898) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            oq5Var2.Z(1808391855);
            str.getClass();
            final jyg Q2 = y1g.Q(new nyg(str), oq5Var2);
            oq5Var2.p(false);
            K = oq5Var2.K();
            obj = gq5.a;
            if (K == obj) {
            }
            final poi poiVar2 = (poi) K;
            ayg value2 = Q2.getValue();
            K2 = oq5Var2.K();
            if (K2 == obj) {
            }
            k(value2, z, (Function1) K2, oq5Var2, (i3 & 112) | 384);
            final jx7 jx7Var2 = (jx7) oq5Var2.j(es5.h);
            final float n02 = jx7Var2.n0(10);
            K3 = oq5Var2.K();
            if (K3 == obj) {
            }
            final RuntimeShader d4 = wb8.d(obj2);
            K4 = oq5Var2.K();
            Object obj32 = K4;
            if (K4 == obj) {
            }
            final RuntimeShader d22 = wb8.d(obj32);
            K5 = oq5Var2.K();
            Object obj42 = K5;
            if (K5 == obj) {
            }
            final swn swnVar22 = (swn) obj42;
            yci d32 = androidx.compose.foundation.layout.a.d(yciVar, 1.0f);
            iz2 iz2Var2 = b2c.f;
            pyc pycVar2 = new pyc() { // from class: sp
                @Override // defpackage.pyc
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    oq5 oq5Var3;
                    final RuntimeShader runtimeShader3 = d4;
                    final RuntimeShader runtimeShader4 = d22;
                    c cVar = (c) obj5;
                    hq5 hq5Var2 = (hq5) obj6;
                    int intValue = ((Integer) obj7).intValue();
                    cVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                    }
                    if ((intValue & 19) == 18) {
                        oq5 oq5Var4 = (oq5) hq5Var2;
                        if (oq5Var4.z()) {
                            oq5Var4.S();
                            return Unit.a;
                        }
                    }
                    int i6 = ga6.i(cVar.b);
                    Integer valueOf = Integer.valueOf(i6);
                    if (i6 == Integer.MAX_VALUE) {
                        valueOf = null;
                    }
                    Float valueOf2 = valueOf != null ? Float.valueOf(valueOf.intValue()) : null;
                    float c = valueOf2 != null ? yhn.c(valueOf2.floatValue() * 0.8f, 340.0f, 480.0f) : 480.0f;
                    float floatValue = valueOf2 != null ? valueOf2.floatValue() / c : 1.0f;
                    float f2 = n02;
                    if (valueOf2 != null) {
                        f2 = yhn.c(valueOf2.floatValue() * 0.06f, 0.45f * f2, f2);
                    }
                    final float f3 = f2 / floatValue;
                    vci vciVar = vci.a;
                    yci i7 = valueOf2 != null ? d.i(vciVar, jx7Var2.d0(c)) : d.c(vciVar, 1.0f);
                    oq5 oq5Var5 = (oq5) hq5Var2;
                    boolean c2 = oq5Var5.c(floatValue);
                    final float f4 = floatValue;
                    final swn swnVar3 = swnVar22;
                    boolean h = c2 | oq5Var5.h(swnVar3) | oq5Var5.c(f3) | oq5Var5.h(runtimeShader3) | oq5Var5.h(runtimeShader4);
                    Object K6 = oq5Var5.K();
                    kjn kjnVar = gq5.a;
                    if (h || K6 == kjnVar) {
                        Function1 function1 = new Function1() { // from class: yp
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                return rb.b(f4, swnVar3, f3, runtimeShader3, runtimeShader4, (zco) obj8);
                            }
                        };
                        oq5Var5.k0(function1);
                        K6 = function1;
                    }
                    yci a = a.a(i7, (Function1) K6);
                    iz2 iz2Var22 = b2c.b;
                    kfh d42 = ug3.d(iz2Var22, false);
                    int i8 = oq5Var5.P;
                    androidx.compose.runtime.internal.a l = oq5Var5.l();
                    yci H = vnj.H(oq5Var5, a);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var5.d0();
                    if (oq5Var5.O) {
                        oq5Var5.k(grbVar);
                    } else {
                        oq5Var5.n0();
                    }
                    kb5 kb5Var = wp5.f;
                    g0g.U(oq5Var5, d42, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(oq5Var5, l, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i8))) {
                        ouj.x(i8, oq5Var5, i8, kb5Var3);
                    }
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(oq5Var5, H, kb5Var4);
                    yci L = gdg.L(d.c(vciVar, 1.0f), 0.82f, 0.82f);
                    dup dupVar4 = dupVar3;
                    if (dupVar4 != null) {
                        L = L.f(xp3.u(vciVar, dupVar4));
                    }
                    kfh d5 = ug3.d(iz2Var22, false);
                    int i9 = oq5Var5.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var5.l();
                    yci H2 = vnj.H(oq5Var5, L);
                    oq5Var5.d0();
                    if (oq5Var5.O) {
                        oq5Var5.k(grbVar);
                    } else {
                        oq5Var5.n0();
                    }
                    g0g.U(oq5Var5, d5, kb5Var);
                    g0g.U(oq5Var5, l2, kb5Var2);
                    if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i9))) {
                        ouj.x(i9, oq5Var5, i9, kb5Var3);
                    }
                    g0g.U(oq5Var5, H2, kb5Var4);
                    function24.invoke(oq5Var5, 0);
                    jyg jygVar = Q2;
                    if (jygVar.getValue() != null) {
                        oq5Var5.Z(-1480125951);
                        ayg value22 = jygVar.getValue();
                        yci c3 = d.c(vciVar, 1.0f);
                        Object K7 = oq5Var5.K();
                        if (K7 == kjnVar) {
                            K7 = new wp(poiVar2, 1);
                            oq5Var5.k0(K7);
                        }
                        u1g.d(value22, (Function0) K7, c3, true, wwn.b, dzgVar, null, null, false, oq5Var5, 1087898032, 0, 130360);
                        oq5Var3 = oq5Var5;
                    } else {
                        oq5Var3 = oq5Var5;
                        oq5Var3.Z(-1502337792);
                    }
                    oq5Var3.p(false);
                    oq5Var3.p(true);
                    oq5Var3.p(true);
                    return Unit.a;
                }
            };
            oq5Var = oq5Var2;
            bg3.a(d32, iz2Var2, false, ild.C(-130621746, pycVar2, oq5Var2), oq5Var, 3120, 4);
            dupVar2 = dupVar3;
            function23 = function24;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        dupVar2 = dupVar;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        function22 = function2;
        if ((74899 & i3) == 74898) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        oq5Var2.Z(1808391855);
        str.getClass();
        final jyg Q22 = y1g.Q(new nyg(str), oq5Var2);
        oq5Var2.p(false);
        K = oq5Var2.K();
        obj = gq5.a;
        if (K == obj) {
        }
        final poi poiVar22 = (poi) K;
        ayg value22 = Q22.getValue();
        K2 = oq5Var2.K();
        if (K2 == obj) {
        }
        k(value22, z, (Function1) K2, oq5Var2, (i3 & 112) | 384);
        final jx7 jx7Var22 = (jx7) oq5Var2.j(es5.h);
        final float n022 = jx7Var22.n0(10);
        K3 = oq5Var2.K();
        if (K3 == obj) {
        }
        final RuntimeShader d42 = wb8.d(obj2);
        K4 = oq5Var2.K();
        Object obj322 = K4;
        if (K4 == obj) {
        }
        final RuntimeShader d222 = wb8.d(obj322);
        K5 = oq5Var2.K();
        Object obj422 = K5;
        if (K5 == obj) {
        }
        final swn swnVar222 = (swn) obj422;
        yci d322 = androidx.compose.foundation.layout.a.d(yciVar, 1.0f);
        iz2 iz2Var22 = b2c.f;
        pyc pycVar22 = new pyc() { // from class: sp
            @Override // defpackage.pyc
            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                oq5 oq5Var3;
                final RuntimeShader runtimeShader3 = d42;
                final RuntimeShader runtimeShader4 = d222;
                c cVar = (c) obj5;
                hq5 hq5Var2 = (hq5) obj6;
                int intValue = ((Integer) obj7).intValue();
                cVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        return Unit.a;
                    }
                }
                int i6 = ga6.i(cVar.b);
                Integer valueOf = Integer.valueOf(i6);
                if (i6 == Integer.MAX_VALUE) {
                    valueOf = null;
                }
                Float valueOf2 = valueOf != null ? Float.valueOf(valueOf.intValue()) : null;
                float c = valueOf2 != null ? yhn.c(valueOf2.floatValue() * 0.8f, 340.0f, 480.0f) : 480.0f;
                float floatValue = valueOf2 != null ? valueOf2.floatValue() / c : 1.0f;
                float f2 = n022;
                if (valueOf2 != null) {
                    f2 = yhn.c(valueOf2.floatValue() * 0.06f, 0.45f * f2, f2);
                }
                final float f3 = f2 / floatValue;
                vci vciVar = vci.a;
                yci i7 = valueOf2 != null ? d.i(vciVar, jx7Var22.d0(c)) : d.c(vciVar, 1.0f);
                oq5 oq5Var5 = (oq5) hq5Var2;
                boolean c2 = oq5Var5.c(floatValue);
                final float f4 = floatValue;
                final swn swnVar3 = swnVar222;
                boolean h = c2 | oq5Var5.h(swnVar3) | oq5Var5.c(f3) | oq5Var5.h(runtimeShader3) | oq5Var5.h(runtimeShader4);
                Object K6 = oq5Var5.K();
                kjn kjnVar = gq5.a;
                if (h || K6 == kjnVar) {
                    Function1 function1 = new Function1() { // from class: yp
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            return rb.b(f4, swnVar3, f3, runtimeShader3, runtimeShader4, (zco) obj8);
                        }
                    };
                    oq5Var5.k0(function1);
                    K6 = function1;
                }
                yci a = a.a(i7, (Function1) K6);
                iz2 iz2Var222 = b2c.b;
                kfh d422 = ug3.d(iz2Var222, false);
                int i8 = oq5Var5.P;
                androidx.compose.runtime.internal.a l = oq5Var5.l();
                yci H = vnj.H(oq5Var5, a);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var5.d0();
                if (oq5Var5.O) {
                    oq5Var5.k(grbVar);
                } else {
                    oq5Var5.n0();
                }
                kb5 kb5Var = wp5.f;
                g0g.U(oq5Var5, d422, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(oq5Var5, l, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i8))) {
                    ouj.x(i8, oq5Var5, i8, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(oq5Var5, H, kb5Var4);
                yci L = gdg.L(d.c(vciVar, 1.0f), 0.82f, 0.82f);
                dup dupVar4 = dupVar3;
                if (dupVar4 != null) {
                    L = L.f(xp3.u(vciVar, dupVar4));
                }
                kfh d5 = ug3.d(iz2Var222, false);
                int i9 = oq5Var5.P;
                androidx.compose.runtime.internal.a l2 = oq5Var5.l();
                yci H2 = vnj.H(oq5Var5, L);
                oq5Var5.d0();
                if (oq5Var5.O) {
                    oq5Var5.k(grbVar);
                } else {
                    oq5Var5.n0();
                }
                g0g.U(oq5Var5, d5, kb5Var);
                g0g.U(oq5Var5, l2, kb5Var2);
                if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i9))) {
                    ouj.x(i9, oq5Var5, i9, kb5Var3);
                }
                g0g.U(oq5Var5, H2, kb5Var4);
                function24.invoke(oq5Var5, 0);
                jyg jygVar = Q22;
                if (jygVar.getValue() != null) {
                    oq5Var5.Z(-1480125951);
                    ayg value222 = jygVar.getValue();
                    yci c3 = d.c(vciVar, 1.0f);
                    Object K7 = oq5Var5.K();
                    if (K7 == kjnVar) {
                        K7 = new wp(poiVar22, 1);
                        oq5Var5.k0(K7);
                    }
                    u1g.d(value222, (Function0) K7, c3, true, wwn.b, dzgVar, null, null, false, oq5Var5, 1087898032, 0, 130360);
                    oq5Var3 = oq5Var5;
                } else {
                    oq5Var3 = oq5Var5;
                    oq5Var3.Z(-1502337792);
                }
                oq5Var3.p(false);
                oq5Var3.p(true);
                oq5Var3.p(true);
                return Unit.a;
            }
        };
        oq5Var = oq5Var2;
        bg3.a(d322, iz2Var22, false, ild.C(-130621746, pycVar22, oq5Var2), oq5Var, 3120, 4);
        dupVar2 = dupVar3;
        function23 = function24;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void j(String str, qo6 qo6Var, boolean z, dup dupVar, klu kluVar, uoi uoiVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        str.getClass();
        dupVar.getClass();
        kluVar.getClass();
        uoiVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-294531943);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.d(qo6Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(dupVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(kluVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.f(uoiVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var.f(yciVar) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && oq5Var.z()) {
            oq5Var.S();
        } else if (kluVar.f == elu.e) {
            oq5Var.Z(217412259);
            e(str, z, kluVar, yciVar, oq5Var, (i2 & 14) | ((i2 >> 3) & 112) | ((i2 >> 6) & 896) | ((i2 >> 9) & 7168));
            oq5Var.p(false);
        } else {
            oq5Var.Z(217618440);
            g(str, qo6Var, z, dupVar, kluVar, uoiVar, yciVar, oq5Var, i2 & 4194302);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new eq(str, qo6Var, z, dupVar, kluVar, uoiVar, yciVar, i, 0);
        }
    }

    public static final void k(ayg aygVar, boolean z, Function1 function1, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1305045661);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(aygVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function1) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.h(0.0f, oq5Var);
            }
            poi poiVar = (poi) K;
            Boolean valueOf = Boolean.valueOf(z);
            boolean h = ((i2 & 112) == 32) | oq5Var.h(aygVar) | ((i2 & 896) == 256);
            Object K2 = oq5Var.K();
            if (h || K2 == kjnVar) {
                gq gqVar = new gq(aygVar, z, poiVar, function1, null);
                oq5Var.k0(gqVar);
                K2 = gqVar;
            }
            gld.y(aygVar, valueOf, (Function2) K2, oq5Var);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yj(aygVar, z, function1, i, 1);
        }
    }

    public static final void l(ezg[] ezgVarArr, String str, boolean z, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1955022175);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(ezgVarArr) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            yciVar2 = yciVar;
            i2 |= oq5Var.f(yciVar2) ? 2048 : 1024;
        } else {
            yciVar2 = yciVar;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.Z(-1985646991);
            str.getClass();
            jyg Q = y1g.Q(new nyg(str), oq5Var);
            oq5Var.p(false);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.h(0.0f, oq5Var);
            }
            poi poiVar = (poi) K;
            ayg value = Q.getValue();
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new rp(poiVar, 1);
                oq5Var.k0(K2);
            }
            k(value, z, (Function1) K2, oq5Var, ((i2 >> 3) & 112) | 384);
            yci yciVar3 = yciVar2;
            bg3.a(yciVar3, b2c.f, false, ild.C(-258033463, new up((jx7) oq5Var.j(es5.h), y1g.R((ezg[]) Arrays.copyOf(ezgVarArr, ezgVarArr.length), oq5Var), Q, poiVar, 0), oq5Var), oq5Var, ((i2 >> 9) & 14) | 3120, 4);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp((Object) ezgVarArr, (Object) str, z, (Object) yciVar, i, 1);
        }
    }

    public static final void m(klu kluVar, elu eluVar, boolean z, yci yciVar, uoi uoiVar, d85 d85Var, hq5 hq5Var, int i) {
        int i2;
        float f;
        boolean z2;
        jzk jzkVar = vnj.i;
        kluVar.getClass();
        eluVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1629486723);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(kluVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.d(eluVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(uoiVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.f(d85Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i2) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            tgo q = q(eluVar, oq5Var);
            clu K = p1g.K(kluVar.e, eluVar, oq5Var, i2 & 112);
            qo6 Q = u1g.Q(eluVar);
            if (eluVar == elu.e) {
                oq5Var.Z(1976912176);
                yci d = androidx.compose.foundation.layout.a.d(d.c(yciVar, 1.0f), 1.0f);
                if (d85Var != null) {
                    d = androidx.compose.foundation.a.b(d, d85Var.a, jzkVar);
                }
                f(kluVar, K, z, gdg.L(d, 0.82f, 0.82f), oq5Var, i2 & 910);
                oq5Var.p(false);
            } else {
                oq5Var.Z(1977307798);
                yci d2 = androidx.compose.foundation.layout.a.d(yciVar, 1.0f);
                if (d85Var != null) {
                    d2 = androidx.compose.foundation.a.b(d2, d85Var.a, jzkVar);
                }
                yci u = xp3.u(gdg.L(d2, 0.82f, 0.82f), q);
                kfh d3 = ug3.d(b2c.b, false);
                oq5Var = oq5Var;
                int i3 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, u);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d3, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var, i3, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                String str = kluVar.c;
                if (str != null) {
                    oq5Var.Z(-605583094);
                    f = 1.0f;
                    z2 = false;
                    j66.q(str, ild.C(1535961323, new qp(Q, 1), oq5Var), q, null, uoiVar, oq5Var, (57344 & i2) | 48);
                    oq5Var = oq5Var;
                } else {
                    f = 1.0f;
                    z2 = false;
                    oq5Var.Z(-615449061);
                }
                oq5Var.p(z2);
                h(K, kluVar.d, z, d.c(vci.a, f), oq5Var, (i2 & 896) | 3072);
                oq5Var.p(true);
                oq5Var.p(z2);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dq(kluVar, eluVar, z, yciVar, uoiVar, d85Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(klu kluVar, qmu qmuVar, boolean z, yci yciVar, uoi uoiVar, d85 d85Var, boolean z2, hq5 hq5Var, int i, int i2) {
        int i3;
        boolean z3;
        boolean z4;
        boolean f;
        Object K;
        yci a;
        boolean z5;
        boolean z6;
        qmu qmuVar2;
        boolean z7;
        xmn r;
        kjn kjnVar = gq5.a;
        kluVar.getClass();
        qmuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(405650655);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(kluVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.d(qmuVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var.f(uoiVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i & 196608) == 0) {
            i3 |= oq5Var.f(d85Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i4 = i2 & 64;
        if (i4 != 0) {
            i3 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
        } else if ((1572864 & i) == 0) {
            z3 = z2;
            i3 |= oq5Var.g(z3) ? 1048576 : 524288;
            if ((599187 & i3) == 599186 || !oq5Var.z()) {
                oq5Var.U();
                if ((i & 1) == 0 && !oq5Var.y()) {
                    oq5Var.S();
                } else if (i4 != 0) {
                    z4 = true;
                    oq5Var.q();
                    int i5 = (i3 >> 12) & 14;
                    vm0 b = nnu.b(uoiVar, oq5Var, i5);
                    if (z4) {
                        oq5Var.Z(-1298843581);
                        nnu.a(uoiVar, oq5Var, i5);
                    } else {
                        oq5Var.Z(-1306264733);
                    }
                    oq5Var.p(false);
                    f = oq5Var.f(b);
                    K = oq5Var.K();
                    if (!f || K == kjnVar) {
                        K = new xp(b, 0);
                        oq5Var.k0(K);
                    }
                    a = a.a(yciVar, (Function1) K);
                    if (z) {
                        oq5Var.Z(-1011717907);
                        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
                        context.getClass();
                        if (Build.VERSION.SDK_INT >= 33) {
                            Boolean bool = u1g.a;
                            if (bool != null) {
                                z7 = bool.booleanValue();
                                z5 = z4;
                            } else {
                                ActivityManager b2 = l1b.b(context);
                                if (b2 == null) {
                                    z5 = z4;
                                    z7 = false;
                                } else {
                                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                                    b2.getMemoryInfo(memoryInfo);
                                    ConfigurationInfo deviceConfigurationInfo = b2.getDeviceConfigurationInfo();
                                    deviceConfigurationInfo.getClass();
                                    z5 = z4;
                                    z7 = !b2.isLowRamDevice() && memoryInfo.totalMem > 1073741824 && deviceConfigurationInfo.reqGlEsVersion >= 196608;
                                    u1g.a = Boolean.valueOf(z7);
                                }
                            }
                            if (z7) {
                                z6 = true;
                                oq5Var.p(false);
                            }
                        } else {
                            z5 = z4;
                        }
                        z6 = false;
                        oq5Var.p(false);
                    } else {
                        z5 = z4;
                        oq5Var.Z(-1298482808);
                        oq5Var.p(false);
                        z6 = false;
                    }
                    if (z6 || kluVar.c == null) {
                        int i6 = i3;
                        oq5Var.Z(-1297976201);
                        qmuVar2 = qmuVar;
                        m(kluVar, kluVar.f, qmuVar2 == qmu.c, a, uoiVar, d85Var, oq5Var, i6 & 516110);
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(-1298380999);
                        int i7 = i3;
                        j(kluVar.d, u1g.Q(kluVar.f), qmuVar.a(), q(kluVar.f, oq5Var), kluVar, uoiVar, a, oq5Var, ((i7 << 3) & 458752) | (57344 & (i7 << 12)));
                        oq5Var = oq5Var;
                        oq5Var.p(false);
                        qmuVar2 = qmuVar;
                    }
                    z3 = z5;
                }
                z4 = z3;
                oq5Var.q();
                int i52 = (i3 >> 12) & 14;
                vm0 b3 = nnu.b(uoiVar, oq5Var, i52);
                if (z4) {
                }
                oq5Var.p(false);
                f = oq5Var.f(b3);
                K = oq5Var.K();
                if (!f) {
                }
                K = new xp(b3, 0);
                oq5Var.k0(K);
                a = a.a(yciVar, (Function1) K);
                if (z) {
                }
                if (z6) {
                }
                int i62 = i3;
                oq5Var.Z(-1297976201);
                qmuVar2 = qmuVar;
                m(kluVar, kluVar.f, qmuVar2 == qmu.c, a, uoiVar, d85Var, oq5Var, i62 & 516110);
                oq5Var.p(false);
                z3 = z5;
            } else {
                oq5Var.S();
                qmuVar2 = qmuVar;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new cq(kluVar, qmuVar2, z, yciVar, uoiVar, d85Var, z3, i, i2);
                return;
            }
            return;
        }
        z3 = z2;
        if ((599187 & i3) == 599186) {
        }
        oq5Var.U();
        if ((i & 1) == 0) {
        }
        if (i4 != 0) {
        }
        z4 = z3;
        oq5Var.q();
        int i522 = (i3 >> 12) & 14;
        vm0 b32 = nnu.b(uoiVar, oq5Var, i522);
        if (z4) {
        }
        oq5Var.p(false);
        f = oq5Var.f(b32);
        K = oq5Var.K();
        if (!f) {
        }
        K = new xp(b32, 0);
        oq5Var.k0(K);
        a = a.a(yciVar, (Function1) K);
        if (z) {
        }
        if (z6) {
        }
        int i622 = i3;
        oq5Var.Z(-1297976201);
        qmuVar2 = qmuVar;
        m(kluVar, kluVar.f, qmuVar2 == qmu.c, a, uoiVar, d85Var, oq5Var, i622 & 516110);
        oq5Var.p(false);
        z3 = z5;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static ArrayList o(Context context) {
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = c5b.a;
        }
        ArrayList O = CollectionsKt.O(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        Iterator it = O.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            String str2 = runningAppProcessInfo.processName;
            str2.getClass();
            arrayList2.add(new zsm(str2, Intrinsics.d(runningAppProcessInfo.processName, str), runningAppProcessInfo.pid, runningAppProcessInfo.importance));
        }
        return arrayList2;
    }

    public static yv1 p(AudioManager audioManager, dv1 dv1Var) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes((AudioAttributes) dv1Var.b().a);
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(zc4.p(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfile = directProfilesForAttributes.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (dvt.T(format) || yv1.e.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) hashMap.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(zc4.p(audioProfile.getChannelMasks()));
                    } else {
                        hashMap.put(Integer.valueOf(format), new HashSet(zc4.p(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        tde u = yde.u();
        for (Map.Entry entry : hashMap.entrySet()) {
            u.a(new xv1(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new yv1(u.f());
    }

    public static final tgo q(elu eluVar, hq5 hq5Var) {
        int ordinal = eluVar.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            if (ordinal == 3) {
                oq5 oq5Var = (oq5) hq5Var;
                oq5Var.Z(-1941861599);
                oq5Var.p(false);
                return ugo.a;
            }
            if (ordinal != 4) {
                throw vz1.i((oq5) hq5Var, -1941868568, false);
            }
        }
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.Z(-1941863479);
        tgo F = o5g.F(oq5Var2);
        oq5Var2.p(false);
        return F;
    }

    public static qxp r(AudioManager audioManager, dv1 dv1Var) {
        try {
            audioManager.getClass();
            List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((AudioAttributes) dv1Var.b().a);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new qxp(audioDevicesForAttributes.get(0));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static int s() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && (i < 30 || SdkExtensions.getExtensionVersion(30) < 2)) {
            return Integer.MAX_VALUE;
        }
        return MediaStore.getPickImagesMaxLimit();
    }

    public static OnBackInvokedDispatcher t(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.getClass();
        return onBackInvokedDispatcher;
    }

    public static PackageInfo u(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static Object v(Bundle bundle, Class cls, String str) {
        return bundle.getParcelable(str, cls);
    }

    public static ArrayList w(Bundle bundle) {
        return bundle.getParcelableArrayList("PURCHASES_HISTORY", j.class);
    }

    public static Object x(Intent intent, String str, Class cls) {
        return intent.getParcelableExtra(str, cls);
    }

    public static String y() {
        String processName;
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            String myProcessName = Process.myProcessName();
            myProcessName.getClass();
            return myProcessName;
        }
        if (i >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String n = jo0.n();
        return n != null ? n : "";
    }

    public static Serializable z(Bundle bundle, Class cls, String str) {
        return bundle.getSerializable(str, cls);
    }
}
