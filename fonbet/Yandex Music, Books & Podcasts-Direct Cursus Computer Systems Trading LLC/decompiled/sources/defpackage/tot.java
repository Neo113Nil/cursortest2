package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.connectsdk.service.capability.ScreenMirroringControl;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.yandex.passport.R;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.ui.AccountNotAuthorizedActivity;
import com.yandex.passport.internal.ui.AutoLoginActivity;
import com.yandex.passport.internal.ui.SocialApplicationBindActivity;
import com.yandex.passport.internal.ui.SocialBindActivity;
import com.yandex.passport.internal.ui.b;
import com.yandex.passport.internal.ui.bouncer.roundabout.r;
import com.yandex.passport.internal.ui.c;
import com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity;
import com.yandex.passport.internal.ui.domik.common.e;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesSlothActivity;
import com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothActivity;
import com.yandex.passport.internal.ui.sloth.webcard.e1;
import com.yandex.passport.internal.ui.social.gimap.m;
import com.yandex.passport.internal.widget.ConfirmationCodeInput;
import com.yandex.passport.internal.y;
import com.yandex.passport.legacy.lx.a;
import com.yandex.passport.legacy.lx.g;
import com.yandex.pulse.metrics.o;
import de.hdodenhof.circleimageview.CircleImageView;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.Intrinsics;
import ru.kinopoisk.sdk.easylogin.internal.W0;
import ru.kinopoisk.sdk.easylogin.internal.X0;
import ru.yandex.music.utils.Assertions;
import ru.yandex.music.utils.Preconditions;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData$UgcLiveStatus;

/* loaded from: classes.dex */
public final /* synthetic */ class tot implements iyr, ag6, OnCompleteListener, xz1, ScreenMirroringControl.ScreenMirroringErrorListener, jpj, kd, qyc, a, g, tqj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tot(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.jpj
    public kqv G(View view, kqv kqvVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 5:
                tqv.a((tqv) obj, kqvVar);
                break;
            case 19:
                r rVar = (r) obj;
                view.getClass();
                zne g = kqvVar.a.g(647);
                g.getClass();
                rVar.setPadding(rVar.getPaddingLeft(), g.b, rVar.getPaddingRight(), g.d);
                break;
            case 20:
                ConstraintLayout constraintLayout = (ConstraintLayout) obj;
                view.getClass();
                zne g2 = kqvVar.a.g(2);
                g2.getClass();
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), g2.d);
                break;
            case 21:
                int i2 = DeleteForeverActivity.j;
                view.getClass();
                zne g3 = kqvVar.a.g(647);
                g3.getClass();
                view.setBackgroundColor(((DeleteForeverActivity) obj).getColor(R.color.passport_roundabout_background));
                view.setPadding(g3.a, g3.b, g3.c, g3.d);
                break;
            case 22:
                c7g c7gVar = (c7g) obj;
                view.getClass();
                zne g4 = kqvVar.a.g(2);
                g4.getClass();
                c7gVar.setPadding(c7gVar.getPaddingLeft(), c7gVar.getPaddingTop(), c7gVar.getPaddingRight(), g4.d);
                break;
            case 23:
                view.getClass();
                zne g5 = kqvVar.a.g(655);
                g5.getClass();
                ((t86) obj).setMargins(g5.a, g5.b, g5.c, g5.d);
                break;
            case 26:
                int i3 = ManagingPlusDevicesSlothActivity.g;
                view.getClass();
                zne g6 = kqvVar.a.g(647);
                g6.getClass();
                view.setBackgroundColor(((ManagingPlusDevicesSlothActivity) obj).getColor(R.color.passport_roundabout_background));
                view.setPadding(g6.a, g6.b, g6.c, g6.d);
                break;
            default:
                int i4 = WebCardSlothActivity.e;
                view.getClass();
                zne g7 = kqvVar.a.g(647);
                g7.getClass();
                e1 ui = ((WebCardSlothActivity) obj).k().getUi();
                ui.getClass();
                ui.h = g7.b;
                ui.i = g7.d;
                View e = ui.P().e();
                ViewGroup.LayoutParams layoutParams = e.getLayoutParams();
                if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                    layoutParams = null;
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (layoutParams2 != null) {
                    int i5 = ui.g.c;
                    layoutParams2.topMargin = ui.h + i5;
                    layoutParams2.bottomMargin = i5 + ui.i;
                    e.setLayoutParams(layoutParams2);
                }
                break;
        }
        return kqv.b;
    }

    @Override // defpackage.qyc
    public Object apply(Object obj) {
        return X0.a((W0) this.b, obj);
    }

    @Override // defpackage.kd
    /* renamed from: b, reason: collision with other method in class */
    public void mo33b(Object obj) {
        g6w g6wVar;
        f6w f6wVar;
        int i = this.a;
        int i2 = 1;
        Object obj2 = this.b;
        switch (i) {
            case 8:
                ssg.a(5, "WizardTrailerQueueAdapterImpl", "can't start " + ((fm1) obj2) + ", message=" + ((Throwable) obj).getMessage(), null);
                return;
            case 10:
                i6w i6wVar = (i6w) obj2;
                h6w h6wVar = (h6w) obj;
                int ordinal = h6wVar.ordinal();
                if (ordinal == 0) {
                    f4m f4mVar = i6wVar.f;
                    if (f4mVar == null || (f6wVar = (g6wVar = (g6w) f4mVar.b).d) == null) {
                        return;
                    }
                    x7c x7cVar = (x7c) Preconditions.nonNull(g6wVar.e);
                    mrr mrrVar = (mrr) Preconditions.nonNull(g6wVar.f);
                    String obj3 = g6wVar.c.b.getText().toString();
                    String str = g6wVar.h;
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("atg_topic", x7cVar);
                    bundle.putSerializable("arg_source", mrrVar);
                    bundle.putString("arg_message", obj3);
                    bundle.putString("arg_payload", str);
                    t46 t46Var = new t46();
                    t46Var.setArguments(bundle);
                    f6wVar.D(t46Var);
                    return;
                }
                if (ordinal != 1) {
                    Assertions.fail("setOnItemClickListener(): unhandled item " + h6wVar);
                    return;
                }
                if (i6wVar.f != null) {
                    c3x.B(i6wVar.b);
                    g6w g6wVar2 = (g6w) i6wVar.f.b;
                    if (g6wVar2.d != null) {
                        String obj4 = g6wVar2.c.b.getText().toString();
                        String str2 = g6wVar2.j;
                        if (str2 != null && obj4.startsWith(str2)) {
                            obj4 = obj4.substring(str2.length());
                        }
                        String trim = obj4.trim();
                        f6w f6wVar2 = g6wVar2.d;
                        x7c x7cVar2 = (x7c) Preconditions.nonNull(g6wVar2.e);
                        mrr mrrVar2 = (mrr) Preconditions.nonNull(g6wVar2.f);
                        String str3 = g6wVar2.h;
                        f6wVar2.getClass();
                        x7cVar2.getClass();
                        mrrVar2.getClass();
                        trim.getClass();
                        if (str3 != null) {
                            trim = ouj.o(trim, "\n\n", str3);
                        }
                        ggp ggpVar = new ggp();
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("arg_topic", x7cVar2);
                        bundle2.putSerializable("arg_source", mrrVar2);
                        bundle2.putString("arg_email", null);
                        bundle2.putString("arg_message", trim);
                        ggpVar.setArguments(bundle2);
                        f6wVar2.D(ggpVar);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                Bitmap bitmap = (Bitmap) obj;
                int i3 = AccountNotAuthorizedActivity.m;
                CircleImageView circleImageView = ((AccountNotAuthorizedActivity) obj2).g;
                if (circleImageView != null) {
                    circleImageView.setImageBitmap(bitmap);
                    return;
                } else {
                    Intrinsics.j("imageAvatar");
                    throw null;
                }
            case 14:
                Bitmap bitmap2 = (Bitmap) obj;
                int i4 = AutoLoginActivity.m;
                CircleImageView circleImageView2 = ((AutoLoginActivity) obj2).g;
                if (circleImageView2 != null) {
                    circleImageView2.setImageBitmap(bitmap2);
                    return;
                } else {
                    Intrinsics.j("imageAvatar");
                    throw null;
                }
            case 15:
                c cVar = (c) obj2;
                String str4 = (String) obj;
                if (str4 != null) {
                    PackageManager packageManager = cVar.getPackageManager();
                    try {
                        str4 = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str4, 128)).toString();
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    String string = cVar.getResources().getString(R.string.passport_invalid_signature_dialog_text, str4);
                    o30 o30Var = new o30(cVar);
                    k30 k30Var = o30Var.a;
                    k30Var.f = string;
                    k30Var.m = false;
                    o30Var.b(R.string.passport_invalid_signature_dialog_title);
                    o30 positiveButton = o30Var.setPositiveButton(android.R.string.ok, new oba(i2, cVar));
                    positiveButton.a.n = new b(0, cVar);
                    positiveButton.create().show();
                    return;
                }
                return;
            case 16:
                SocialApplicationBindActivity socialApplicationBindActivity = (SocialApplicationBindActivity) obj2;
                int i5 = SocialApplicationBindActivity.m;
                if (((Boolean) obj).booleanValue()) {
                    socialApplicationBindActivity.setResult(-1, new Intent());
                    socialApplicationBindActivity.i.b("success");
                } else {
                    socialApplicationBindActivity.i.b(UgcLiveVideoData$UgcLiveStatus.CANCELLED);
                    socialApplicationBindActivity.setResult(0);
                }
                socialApplicationBindActivity.finish();
                return;
            case 17:
                SocialBindActivity socialBindActivity = (SocialBindActivity) obj2;
                Throwable th = (Throwable) obj;
                int i6 = SocialBindActivity.h;
                th.getClass();
                com.yandex.passport.legacy.a.e(6, "Error getting master token on binding social to passport account", th);
                socialBindActivity.f.w(y.a(socialBindActivity.d.d), th);
                socialBindActivity.setResult(0);
                socialBindActivity.finish();
                return;
            case 25:
                ((com.yandex.passport.internal.ui.domik.common.b) obj2).G();
                return;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                m mVar = (m) obj2;
                mVar.s.setEnabled(mVar.N());
                return;
            default:
                ConfirmationCodeInput confirmationCodeInput = (ConfirmationCodeInput) obj2;
                int i7 = ConfirmationCodeInput.w;
                confirmationCodeInput.invalidate();
                String code = confirmationCodeInput.getCode();
                Iterator it = confirmationCodeInput.h.iterator();
                while (it.hasNext()) {
                    com.yandex.passport.internal.ui.domik.common.c cVar2 = (com.yandex.passport.internal.ui.domik.common.c) it.next();
                    boolean z = code.length() == confirmationCodeInput.g;
                    e eVar = cVar2.a;
                    if (z) {
                        eVar.L();
                    }
                    eVar.G();
                }
                return;
        }
    }

    @Override // defpackage.xz1
    public String c() {
        h02 h02Var = (h02) ((vbv) this.b).k.getValue();
        h02Var.getClass();
        return h02Var.a();
    }

    @Override // defpackage.iyr
    public Object execute() {
        switch (this.a) {
            case 0:
                bko bkoVar = (bko) ((hgp) this.b).i;
                SQLiteDatabase a = bkoVar.a();
                a.beginTransaction();
                try {
                    a.compileStatement("DELETE FROM log_event_dropped").execute();
                    a.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + bkoVar.b.a()).execute();
                    a.setTransactionSuccessful();
                    a.endTransaction();
                    return null;
                } catch (Throwable th) {
                    a.endTransaction();
                    throw th;
                }
            default:
                bjt bjtVar = (bjt) this.b;
                Iterator it = ((Iterable) ((bko) bjtVar.b).g(new e7o(5))).iterator();
                while (it.hasNext()) {
                    ((ime) bjtVar.c).K((de2) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 2:
                vq2.y((Intent) this.b);
                break;
            case 6:
                ((trv) this.b).b.d(null);
                break;
            default:
                ((ScheduledFuture) this.b).cancel(false);
                break;
        }
    }

    @Override // com.connectsdk.service.capability.ScreenMirroringControl.ScreenMirroringErrorListener
    public void onError(ScreenMirroringControl.ScreenMirroringError screenMirroringError) {
        ((ScreenMirroringControl.ScreenMirroringErrorListener) this.b).onError(screenMirroringError);
    }

    @Override // defpackage.tqj
    public void onSuccess(Object obj) {
        ((com.yandex.passport.internal.ui.domik.common.a) this.b).invoke(obj);
    }

    @Override // defpackage.ag6
    public Object p(Task task) {
        ((CountDownLatch) this.b).countDown();
        return null;
    }

    @Override // com.yandex.passport.legacy.lx.g
    public Object b(Object obj) {
        l lVar = (l) this.b;
        int i = GlobalRouterActivity.i;
        return com.yandex.passport.internal.ui.router.b.a((Context) obj, lVar, true, null, null);
    }
}
