package com.yandex.passport.internal.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.passport.R;
import com.yandex.passport.internal.analytics.s;
import com.yandex.passport.internal.analytics.x;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.passport.internal.ui.authsdk.z;
import com.yandex.passport.internal.ui.bouncer.roundabout.o;
import com.yandex.passport.internal.ui.browser.SocialBrowserActivity;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.sloth.n0;
import com.yandex.passport.sloth.r0;
import com.yandex.passport.sloth.t;
import com.yandex.passport.sloth.u0;
import com.yandex.passport.sloth.ui.b0;
import com.yandex.passport.sloth.ui.m;
import com.yandex.plus.bdui.flex.document.FlexSlice;
import defpackage.aqv;
import defpackage.e0q;
import defpackage.hyi;
import defpackage.jpj;
import defpackage.k30;
import defpackage.kqv;
import defpackage.o30;
import defpackage.s7e;
import defpackage.s9f;
import defpackage.tt0;
import defpackage.u7e;
import defpackage.uah;
import defpackage.vqn;
import defpackage.wpv;
import defpackage.xpv;
import defpackage.ypv;
import defpackage.zne;
import defpackage.zpj;
import defpackage.zpv;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class l implements com.yandex.passport.legacy.lx.a, com.yandex.passport.legacy.lx.g, jpj, zpj, com.yandex.plus.core.reflect.g, com.yandex.plus.core.network.hosts.a, hyi {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.jpj
    public kqv G(View view, kqv kqvVar) {
        o oVar = (o) this.c;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b;
        view.getClass();
        zne g = kqvVar.a.g(129);
        g.getClass();
        BottomSheetBehavior bottomSheetBehavior = oVar.e;
        coordinatorLayout.getClass();
        Context context = coordinatorLayout.getContext();
        context.getClass();
        bottomSheetBehavior.setMaxHeight(tt0.E(context).getResources().getDisplayMetrics().heightPixels - g.b);
        int i = Build.VERSION.SDK_INT;
        aqv zpvVar = i >= 34 ? new zpv(kqvVar) : i >= 30 ? new ypv(kqvVar) : i >= 29 ? new xpv(kqvVar) : new wpv(kqvVar);
        zpvVar.c(129, zne.c(0, 0, 0, 0));
        return zpvVar.b();
    }

    @Override // com.yandex.passport.legacy.lx.a
    /* renamed from: b */
    public void mo1b(Object obj) {
        int i = this.a;
        final int i2 = 1;
        final int i3 = 0;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                SocialApplicationBindActivity socialApplicationBindActivity = (SocialApplicationBindActivity) obj3;
                com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) obj2;
                Throwable th = (Throwable) obj;
                int i4 = SocialApplicationBindActivity.m;
                if (th instanceof com.yandex.passport.common.exception.a) {
                    int i5 = GlobalRouterActivity.i;
                    com.yandex.passport.internal.properties.k kVar = new com.yandex.passport.internal.properties.k();
                    kVar.c(socialApplicationBindActivity.d.a);
                    kVar.q = "passport/social_application_bind";
                    kVar.h = com.yandex.plus.pay.ui.core.b.J(fVar);
                    socialApplicationBindActivity.startActivityForResult(com.yandex.passport.internal.ui.router.b.a(socialApplicationBindActivity, kVar.a(), true, null, null), 4);
                    socialApplicationBindActivity.i.b("relogin_required");
                    return;
                }
                th.getClass();
                com.yandex.passport.legacy.a.e(6, "Error finish bind application", th);
                socialApplicationBindActivity.setResult(0);
                x xVar = socialApplicationBindActivity.i;
                xVar.getClass();
                xVar.a(s.j, new Pair("error", Log.getStackTraceString(th)));
                socialApplicationBindActivity.finish();
                return;
            case 1:
            default:
                final Context context = (Context) obj2;
                final String str = (String) obj;
                ((com.yandex.passport.internal.util.i) obj3).b = null;
                o30 o30Var = new o30(context);
                k30 k30Var = o30Var.a;
                k30Var.m = false;
                o30Var.b(R.string.passport_debug_information_title);
                o30Var.a(R.string.passport_debug_additional_info_collected);
                int i6 = R.string.passport_debug_send_email;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.util.g
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i7) {
                        switch (i3) {
                            case 0:
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("message/rfc822");
                                intent.putExtra("android.intent.extra.EMAIL", new String[]{"passport@support.yandex.ru"});
                                intent.putExtra("android.intent.extra.SUBJECT", "Yandex Accounts report");
                                intent.putExtra("android.intent.extra.TEXT", str);
                                context.startActivity(intent);
                                break;
                            default:
                                Context context2 = context;
                                ClipboardManager clipboardManager = (ClipboardManager) context2.getSystemService("clipboard");
                                if (clipboardManager != null) {
                                    clipboardManager.setPrimaryClip(ClipData.newPlainText("AM debug info", str));
                                }
                                Toast.makeText(context2, R.string.passport_debug_copied_to_clipboard, 0).show();
                                break;
                        }
                    }
                };
                k30Var.k = k30Var.a.getText(i6);
                k30Var.l = onClickListener;
                o30Var.setPositiveButton(R.string.passport_debug_copy_to_clipboard, new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.util.g
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i7) {
                        switch (i2) {
                            case 0:
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("message/rfc822");
                                intent.putExtra("android.intent.extra.EMAIL", new String[]{"passport@support.yandex.ru"});
                                intent.putExtra("android.intent.extra.SUBJECT", "Yandex Accounts report");
                                intent.putExtra("android.intent.extra.TEXT", str);
                                context.startActivity(intent);
                                break;
                            default:
                                Context context2 = context;
                                ClipboardManager clipboardManager = (ClipboardManager) context2.getSystemService("clipboard");
                                if (clipboardManager != null) {
                                    clipboardManager.setPrimaryClip(ClipData.newPlainText("AM debug info", str));
                                }
                                Toast.makeText(context2, R.string.passport_debug_copied_to_clipboard, 0).show();
                                break;
                        }
                    }
                }).create().show();
                return;
            case 2:
                z zVar = (z) obj3;
                String str2 = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                ImageView imageView = zVar.h;
                if (imageView == null) {
                    Intrinsics.j("imageAppIcon");
                    throw null;
                }
                Object tag = imageView.getTag();
                tag.getClass();
                if (TextUtils.equals((String) tag, str2)) {
                    ImageView imageView2 = zVar.h;
                    if (imageView2 != null) {
                        imageView2.setImageBitmap(bitmap);
                        return;
                    } else {
                        Intrinsics.j("imageAppIcon");
                        throw null;
                    }
                }
                return;
            case 3:
                z zVar2 = (z) obj3;
                com.yandex.passport.internal.l lVar = (com.yandex.passport.internal.l) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                ImageView imageView3 = zVar2.i;
                if (imageView3 == null) {
                    Intrinsics.j("imageAvatar");
                    throw null;
                }
                Object tag2 = imageView3.getTag();
                tag2.getClass();
                String str3 = (String) tag2;
                String g = lVar.g();
                if (g == null) {
                    g = null;
                }
                if (TextUtils.equals(str3, g)) {
                    ImageView imageView4 = zVar2.i;
                    if (imageView4 != null) {
                        imageView4.setImageBitmap(bitmap2);
                        return;
                    } else {
                        Intrinsics.j("imageAvatar");
                        throw null;
                    }
                }
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [ezc, kotlin.jvm.functions.Function0] */
    @Override // defpackage.hyi
    public void c(NestedScrollView nestedScrollView, int i) {
        vqn vqnVar = (vqn) this.c;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a aVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a) this.b;
        if (Math.abs(i - vqnVar.a) >= 10) {
            vqnVar.a = i;
            s9f[] s9fVarArr = com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a.m;
            if (com.yandex.plus.bdui.flex.ui.a.q(aVar.a()) >= 1.0f) {
                aVar.b.invoke();
                aVar.d().setOnScrollChangeListener((hyi) null);
            }
        }
    }

    @Override // defpackage.zpj
    public void d(Exception exc) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 8:
                com.yandex.passport.sloth.ui.d dVar = (com.yandex.passport.sloth.ui.d) obj2;
                m mVar = (m) obj;
                com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.d, null, "Phone Number Hint failure", exc);
                }
                com.yandex.passport.sloth.ui.g gVar = dVar.a;
                u0 u0Var = u0.STARTED;
                String message = exc.getMessage();
                r0 r0Var = r0.PHONE_NUMBER_HINT;
                Map e = uah.e(new Pair("state", "failed"), new Pair("throwable_message", String.valueOf(message)));
                com.yandex.passport.internal.sloth.o oVar = (com.yandex.passport.internal.sloth.o) ((com.yandex.passport.internal.ui.sloth.c) gVar).a;
                oVar.getClass();
                if (oVar.a()) {
                    oVar.a.a("sloth.reportWebAmEvent.".concat(r0Var.a), e);
                }
                mVar.invoke(null);
                break;
            default:
                b0 b0Var = (b0) obj2;
                t tVar = (t) obj;
                com.yandex.passport.common.logger.d dVar3 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.d, null, "Phone Number Hint failure", exc);
                }
                b0Var.t.a(new n0(u0.FAILED, exc.getMessage()));
                tVar.a.invoke(null);
                break;
        }
    }

    @Override // com.yandex.plus.core.network.hosts.a
    public String e() {
        u7e u7eVar;
        com.yandex.plus.core.network.hosts.a aVar = (com.yandex.plus.core.network.hosts.a) this.c;
        p pVar = (p) this.b;
        String e = aVar.e();
        String str = StringsKt.M(e, "://", false) ? e : null;
        if (str == null) {
            str = "http://".concat(e);
        }
        try {
            s7e s7eVar = new s7e();
            s7eVar.h(null, str);
            u7eVar = s7eVar.e();
        } catch (IllegalArgumentException unused) {
            u7eVar = null;
        }
        String str2 = u7eVar != null ? u7eVar.d : null;
        return str2 == null ? pVar.e() : str2;
    }

    @Override // com.yandex.plus.core.reflect.g
    public com.yandex.plus.core.reflect.d invoke(Object obj, Method method, Object[] objArr) {
        com.yandex.plus.bdui.shared.a aVar = (com.yandex.plus.bdui.shared.a) this.c;
        com.yandex.plus.bdui.flex.utils.b bVar = (com.yandex.plus.bdui.flex.utils.b) this.b;
        FlexSlice flexSlice = (FlexSlice) obj;
        if (objArr.length != 1 || !(objArr[0] instanceof e0q) || !Intrinsics.d(method.getReturnType(), e0q.class)) {
            return com.yandex.plus.core.reflect.e.a;
        }
        Object obj2 = objArr[0];
        obj2.getClass();
        e0q e0qVar = (e0q) obj2;
        if (e0qVar instanceof FlexSlice) {
            FlexSlice flexSlice2 = (FlexSlice) e0qVar;
            if (aVar.getClass() == flexSlice2.getPlusSlice().getClass()) {
                flexSlice = bVar.d(aVar.a(flexSlice2.getPlusSlice()));
            }
        }
        return new com.yandex.plus.core.reflect.f(flexSlice);
    }

    @Override // com.yandex.passport.legacy.lx.g
    public Object b(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 1:
                int i2 = GlobalRouterActivity.i;
                com.yandex.passport.internal.properties.k kVar = new com.yandex.passport.internal.properties.k(((com.yandex.passport.internal.ui.authsdk.k) obj3).y.d);
                kVar.h = com.yandex.plus.pay.ui.core.b.J((com.yandex.passport.common.core.f) obj2);
                kVar.a = true;
                return com.yandex.passport.internal.ui.router.b.a((Context) obj, kVar.a(), true, null, null);
            case 5:
                return SocialBrowserActivity.a((Context) obj3, (Uri) obj2);
            default:
                com.yandex.passport.internal.ui.social.authenticators.e eVar = (com.yandex.passport.internal.ui.social.authenticators.e) obj3;
                Context context = (Context) obj;
                com.yandex.passport.internal.network.client.j b = eVar.t.b(com.yandex.plus.core.network.api.utils.a.L(eVar.k.d.a));
                String str = eVar.l.d().a;
                context.getClass();
                String b2 = com.yandex.passport.common.browser.c.b(context);
                String str2 = eVar.v.a;
                eVar.s.getClass();
                String builder = Uri.parse(b.e()).buildUpon().appendEncodedPath("broker2/start").appendQueryParameter("bind", "1").appendQueryParameter("yandex_token", str2).appendQueryParameter("consumer", ((com.yandex.passport.internal.common.d) b.f).a()).appendQueryParameter("provider", str).appendQueryParameter("retpath", b2).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("code_challenge", com.yandex.passport.internal.util.k.a((String) obj2)).appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("passthrough_errors", "UserDeniedError").toString();
                builder.getClass();
                return SocialBrowserActivity.a(context, Uri.parse(builder));
        }
    }
}
