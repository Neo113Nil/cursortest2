package defpackage;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yandex.messaging.activity.MessengerRequestCode;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.mediaviewer.MediaViewerMessageActions;
import com.yandex.messaging.ui.imageviewer.ImageViewerActivity;
import com.yandex.messaging.ui.imageviewer.ImageViewerArgs$Sender;
import com.yandex.messaging.ui.imageviewer.ImageViewerInfo;
import com.yandex.messaging.ui.imageviewer.ImageViewerMessageActions;
import com.yandex.messaging.video.UrlVideoPlayerArgs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes15.dex */
public final class zzw implements jcz0 {
    public final Fragment a;
    public final j0x b;
    public final ps10 c;
    public final mdb d;
    public final rz10 e;
    public final ezq f;
    public final k0b g;

    public zzw(Fragment fragment, j0x j0xVar, ps10 ps10Var, e2k0 e2k0Var, zm31 zm31Var, mdb mdbVar, rz10 rz10Var, ezq ezqVar, k0b k0bVar) {
        this.a = fragment;
        this.b = j0xVar;
        this.c = ps10Var;
        this.d = mdbVar;
        this.e = rz10Var;
        this.f = ezqVar;
        this.g = k0bVar;
    }

    @Override // defpackage.jcz0
    public final void A(o4v0 o4v0Var) {
        this.c.A(o4v0Var);
    }

    @Override // defpackage.jcz0
    public final void B(long j, String str) {
        this.c.B(j, str);
    }

    @Override // defpackage.jcz0
    public final void C(Uri uri) {
        F(uri);
    }

    public final MediaViewerMessageActions D() {
        return new MediaViewerMessageActions(true, false, this.d.e, true, false, 16, null);
    }

    public final void E(chv chvVar, ImageView imageView, MessengerRequestCode messengerRequestCode) {
        Fragment fragment = this.a;
        Intent intent = new Intent(fragment.requireContext(), (Class<?>) ImageViewerActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("chat_id", chvVar.a);
        bundle.putParcelable("initial", chvVar.b);
        bundle.putParcelableArrayList("gallery", chvVar.c);
        bundle.putParcelable("message_actions", chvVar.d);
        bundle.putSerializable("sender", chvVar.e);
        intent.putExtras(bundle);
        if (!this.e.a.a) {
            fragment.startActivityForResult(intent, messengerRequestCode.getValue());
        } else {
            fragment.startActivityForResult(intent, messengerRequestCode.getValue(), ActivityOptions.makeSceneTransitionAnimation(fragment.requireActivity(), imageView, imageView.getTransitionName()).toBundle());
        }
    }

    public final void F(Uri uri) {
        this.b.a(uri);
    }

    @Override // defpackage.jcz0
    public final void d(ImageView imageView, String str, ImageViewerInfo imageViewerInfo, nu10 nu10Var) {
        List singletonList = Collections.singletonList(imageViewerInfo);
        E(new chv(str, imageViewerInfo, new ArrayList(singletonList), new ImageViewerMessageActions(true, false, this.d.e, true, false, false, 48, null), ImageViewerArgs$Sender.Chat), imageView, MessengerRequestCode.IMAGE_PREVIEW);
    }

    @Override // defpackage.jcz0
    public final void e(String str) {
        this.c.e(str);
    }

    @Override // defpackage.jcz0
    public final void f(long j, String str, String str2) {
        UrlVideoPlayerArgs urlVideoPlayerArgs = new UrlVideoPlayerArgs(Uri.parse(str), str2, j);
        FragmentActivity requireActivity = this.a.requireActivity();
        v520 v520Var = v520.d;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(urlVideoPlayerArgs.getVideoUri());
        requireActivity.startActivity(intent);
    }

    @Override // defpackage.jcz0
    public final void g(LocalMessageRef localMessageRef, j3b j3bVar, y2r y2rVar, nu10 nu10Var) {
        String str;
        String str2 = y2rVar.a;
        if (str2 == null || (str = y2rVar.b) == null) {
            return;
        }
        ezq.a(this.f, localMessageRef, j3bVar, str2, str, y2rVar.c, y2rVar.d, D(), new yzw(this, localMessageRef, j3bVar, y2rVar, nu10Var, 1));
    }

    @Override // defpackage.jcz0
    public final void h(String str) {
        this.c.h(str);
    }

    @Override // defpackage.jcz0
    public final void i(String str, String str2) {
        F(Uri.parse(str));
    }

    @Override // defpackage.jcz0
    public final void k(LocalMessageRef localMessageRef, j3b j3bVar, y2r y2rVar, nu10 nu10Var) {
        String str;
        String str2 = y2rVar.a;
        if (str2 == null || (str = y2rVar.b) == null) {
            return;
        }
        ezq.a(this.f, localMessageRef, j3bVar, str2, str, y2rVar.c, y2rVar.d, D(), new yzw(this, localMessageRef, j3bVar, y2rVar, nu10Var, 0));
    }

    @Override // defpackage.jcz0
    public final void l(LocalMessageRef localMessageRef, j3b j3bVar, y2r y2rVar, nu10 nu10Var, f02 f02Var) {
        String str;
        String str2 = y2rVar.a;
        if (str2 == null || (str = y2rVar.b) == null) {
            return;
        }
        ezq.a(this.f, localMessageRef, j3bVar, str2, str, y2rVar.c, y2rVar.d, D(), new t7j(24, f02Var, this, y2rVar));
    }

    @Override // defpackage.jcz0
    public final void o(String str, String str2, ServerMessageRef serverMessageRef, String str3) {
        F(Uri.parse(str));
    }

    @Override // defpackage.jcz0
    public final void p(String str) {
        this.c.p(str);
    }

    @Override // defpackage.jcz0
    public final void q(ImageView imageView, String str, ImageViewerInfo imageViewerInfo, ArrayList arrayList, nu10 nu10Var) {
        E(new chv(str, imageViewerInfo, new ArrayList(arrayList), new ImageViewerMessageActions(true, false, this.d.e, true, false, false, 48, null), ImageViewerArgs$Sender.Chat), imageView, MessengerRequestCode.IMAGE_PREVIEW);
    }

    @Override // defpackage.jcz0
    public final void u(String str) {
        this.c.u(str);
    }

    @Override // defpackage.jcz0
    public final void w(LocalMessageRef localMessageRef) {
        this.c.w(localMessageRef);
    }

    @Override // defpackage.jcz0
    public final void x(nu10 nu10Var, CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, j3b j3bVar, y2r y2rVar, boolean z6, boolean z7) {
        this.c.x(nu10Var, charSequence, z, z2, z3, z4, z5, j3bVar, y2rVar, z6, z7);
    }

    @Override // defpackage.jcz0
    public final void y(String str, String str2, String str3) {
        F(Uri.parse(str));
    }

    @Override // defpackage.jcz0
    public final void z(String str, String str2, String str3) {
        F(Uri.parse(str));
    }
}
