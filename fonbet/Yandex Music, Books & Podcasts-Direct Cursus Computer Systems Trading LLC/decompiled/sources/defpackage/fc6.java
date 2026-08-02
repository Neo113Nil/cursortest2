package defpackage;

import android.content.ClipData;
import android.graphics.Point;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.ScrollCaptureTarget;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Arrays;
import java.util.function.Consumer;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class fc6 implements gc6, ic6 {
    public final /* synthetic */ int a;
    public Object b;

    public fc6(int i) {
        LogSessionId logSessionId;
        this.a = i;
        switch (i) {
            case 3:
                this.b = szf.g0(Boolean.FALSE);
                break;
            default:
                logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                this.b = logSessionId;
                break;
        }
    }

    @Override // defpackage.gc6
    public void a(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    @Override // defpackage.gc6
    public void b(int i) {
        ((ContentInfo.Builder) this.b).setFlags(i);
    }

    @Override // defpackage.gc6
    public jc6 build() {
        return new jc6(new fc6(((ContentInfo.Builder) this.b).build()));
    }

    public void c(AndroidComposeView androidComposeView, tfp tfpVar, CoroutineContext coroutineContext, Consumer consumer) {
        eqi eqiVar = new eqi(new dwo[16]);
        zdg.R(tfpVar.a(), 0, new y66(1, eqiVar, eqi.class, "add", "add(Ljava/lang/Object;)Z", 8, 3));
        Arrays.sort(eqiVar.a, 0, eqiVar.c, gl5.a(dpo.C, dpo.D));
        int i = eqiVar.c;
        dwo dwoVar = (dwo) (i == 0 ? null : eqiVar.a[i - 1]);
        if (dwoVar == null) {
            return;
        }
        aqe aqeVar = dwoVar.c;
        sp5 sp5Var = new sp5(dwoVar.a, aqeVar, gld.e(coroutineContext), this, androidComposeView);
        f8j f8jVar = dwoVar.d;
        ynn y = ltg.D(f8jVar).y(f8jVar, true);
        long a = aqeVar.a();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(androidComposeView, uwf.C(jf0.W(y)), new Point((int) (a >> 32), (int) (a & 4294967295L)), sp5Var);
        scrollCaptureTarget.setScrollBounds(uwf.C(aqeVar));
        consumer.accept(scrollCaptureTarget);
    }

    public void d(LogSessionId logSessionId) {
        LogSessionId logSessionId2;
        LogSessionId logSessionId3 = (LogSessionId) this.b;
        logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
        vq1.A(logSessionId3.equals(logSessionId2));
        this.b = logSessionId;
    }

    @Override // defpackage.ic6
    public int e() {
        return ((ContentInfo) this.b).getSource();
    }

    @Override // defpackage.ic6
    public ContentInfo f() {
        return (ContentInfo) this.b;
    }

    @Override // defpackage.ic6
    public ClipData g() {
        return ((ContentInfo) this.b).getClip();
    }

    @Override // defpackage.ic6
    public int h() {
        return ((ContentInfo) this.b).getFlags();
    }

    @Override // defpackage.gc6
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    public fc6(ContentInfo contentInfo) {
        this.a = 1;
        contentInfo.getClass();
        this.b = contentInfo;
    }

    public fc6(ClipData clipData, int i) {
        this.a = 0;
        this.b = ec6.a(clipData, i);
    }
}
