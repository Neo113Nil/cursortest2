package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.camera.video.internal.encoder.j;
import androidx.core.view.b;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.yandex.go.superapp.order_tracking.eats.presentation.ui.EatsOrderDetailsModalView;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.view.input.UnderKeyboardLinearLayout;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.IAdvIdentifiersCallback;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerModalView;
import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerPage;
import ru.yandex.taxi.intercity.data.g;
import ru.yandex.taxi.superapp.shortcuts.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class xen implements t501, xe4, ims, vls, ruy, bje, gjf0, t070, yt5, o0j0, cf3, zqx, IAdvIdentifiersCallback, yls, wx60, jyv, bx60, mep0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xen(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.zqx
    public void a(List list) {
        FullScreenBannerPage.setData$lambda$0((FullScreenBannerPage) this.b, list);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, h3t0] */
    @Override // defpackage.ims
    /* renamed from: apply */
    public Object mo104apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                return Long.valueOf(((j) obj2).n(((Long) obj).longValue()));
            case 3:
                return (j5h) obj2;
            case 16:
                k020 k020Var = (k020) obj;
                k020Var.getClass();
                return (j3b) ((ChatRequest) obj2).handle(new xl10(k020Var));
            default:
                odu0 odu0Var = (odu0) obj;
                ((Ref$ObjectRef) obj2).element = odu0Var.a.takeSnapshot();
                return odu0Var.c();
        }
    }

    @Override // defpackage.t501
    public void b(s501 s501Var) {
        EatsOrderDetailsModalView.lambda$1$0((EatsOrderDetailsModalView) this.b, s501Var);
    }

    @Override // defpackage.yt5
    public long c(long j) {
        return tw21.j((j * r8.e) / 1000000, 0L, ((cfr) this.b).j - 1);
    }

    @Override // defpackage.o0j0
    public void d(long j, ef90 ef90Var) {
        sgb1.b(j, ef90Var, ((les) this.b).K);
    }

    @Override // defpackage.jyv
    public boolean e(i4u i4uVar, int i, Bundle bundle) {
        jge jgeVar;
        AppCompatEditText appCompatEditText = (AppCompatEditText) this.b;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((h2t) i4uVar.a).a).requestPermission();
                InputContentInfo inputContentInfo = (InputContentInfo) ((h2t) i4uVar.a).a;
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception unused) {
                return false;
            }
        }
        h2t h2tVar = (h2t) i4uVar.a;
        h2t h2tVar2 = (h2t) i4uVar.a;
        ClipData clipData = new ClipData(((InputContentInfo) h2tVar.a).getDescription(), new ClipData.Item(((InputContentInfo) h2tVar2.a).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            jgeVar = new gyc(clipData, 2);
        } else {
            kge kgeVar = new kge();
            kgeVar.b = clipData;
            kgeVar.c = 2;
            jgeVar = kgeVar;
        }
        jgeVar.a(((InputContentInfo) h2tVar2.a).getLinkUri());
        jgeVar.setExtras(bundle);
        return b.l(appCompatEditText, jgeVar.build()) == null;
    }

    @Override // defpackage.gjf0
    public void f(long j, long j2) {
        c3r c3rVar = ((b3r) this.b).a;
        c3rVar.i.b(j, j2, c3rVar.d);
    }

    public b731 g(boolean z) {
        kzo kzoVar = (kzo) this.b;
        if (!z) {
            c94 c94Var = c94.y;
            return (a3c.a(c94Var) || azo.e(c94Var)) ? false : azo.a().d() ? new ld1() : new bf5();
        }
        if (Build.VERSION.SDK_INT < 33) {
            return kzo.y;
        }
        bc bcVar = (bc) kzoVar.x;
        Objects.requireNonNull(bcVar);
        return new un7(bcVar);
    }

    @Override // defpackage.ruy
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 4:
                ((xxc0) obj).onMediaMetadataChanged((re10) obj2);
                break;
            case 5:
                ((xxc0) obj).onAudioAttributesChanged((ue3) obj2);
                break;
            default:
                ((xxc0) obj).onTrackSelectionParametersChanged((r001) obj2);
                break;
        }
    }

    @Override // defpackage.mep0
    public a k(dgp0 dgp0Var) {
        umw umwVar = (umw) this.b;
        tse tseVar = umwVar.b;
        g gVar = umwVar.d;
        a22 a22Var = umwVar.g;
        vmw vmwVar = umwVar.f;
        dgp0Var.getClass();
        return new a(tseVar, dgp0Var.a, a22Var, vmwVar, gVar);
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        l2w l2wVar = (l2w) this.b;
        l2wVar.getClass();
        k751 k751Var = n751Var.a;
        u1w g = k751Var.g(8);
        u1w g2 = k751Var.g(2);
        int i = g.d;
        int i2 = g2.d;
        int i3 = i > i2 ? i - i2 : 0;
        View view2 = l2wVar.b;
        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), l2wVar.e + i3);
        return n751Var;
    }

    @Override // defpackage.xe4
    public boolean onBackClick() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                ((UnderKeyboardLinearLayout) obj).hide();
                break;
            default:
                ((wjm) obj).d();
                break;
        }
        return true;
    }

    @Override // defpackage.wx60
    public void onComplete(Task task) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 18:
                ((m50) obj).a(task);
                break;
            case 19:
                adp adpVar = (adp) obj;
                try {
                    Boolean bool = (Boolean) task.k();
                    adpVar.invoke(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
                    break;
                } catch (Exception unused) {
                    adpVar.invoke(Boolean.FALSE);
                    return;
                }
            default:
                zvs zvsVar = (zvs) obj;
                if (!task.o()) {
                    jst.e.h(null, "Launch Google Play In app Rate failed", task.j());
                    zvsVar.invoke(Boolean.FALSE);
                    break;
                } else {
                    zvsVar.invoke(Boolean.TRUE);
                    break;
                }
        }
    }

    @Override // io.appmetrica.analytics.IAdvIdentifiersCallback
    public void onReceive(AdvIdentifiersResult advIdentifiersResult) {
        ((krs) this.b).a = advIdentifiersResult.googleAdvId.advId;
    }

    @Override // defpackage.t070
    public void onSuccess(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 10:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj2;
                CloudMessage cloudMessage = (CloudMessage) obj;
                if (cloudMessage != null) {
                    lz10.b(cloudMessage.getIntent());
                    firebaseMessaging.f();
                    break;
                }
                break;
            default:
                ((iws) obj2).invoke(obj);
                break;
        }
    }

    @Override // defpackage.cf3
    public void setVolume(float f) {
        FullScreenBannerModalView.audioController$lambda$0((FullScreenBannerModalView) this.b, f);
    }
}
