package defpackage;

import android.content.ClipData;
import android.os.Bundle;
import android.view.Surface;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.foundation.text.input.internal.StatelessInputConnection;
import com.yandex.fintechsdk.core.ui.impl.api.shimmers.ShimmersLayoutIdentifiers;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.taxi.stories.presentation.story.StoryModalView;

/* loaded from: classes11.dex */
public final class wor0 implements pvr0, s4s0, s52, cps0, gor, jyv, gsf0, nvu0, h2v0, uwc0 {
    public Object a;

    public wor0(fwi fwiVar) {
        float f = ist0.a;
        iq31 iq31Var = new iq31();
        iq31Var.a = f;
        float density = fwiVar.getDensity();
        float f2 = unr.a;
        iq31Var.b = density * 386.0878f * 160.0f * 0.84f;
        this.a = iq31Var;
    }

    @Override // defpackage.uwc0
    public void a(int i, int i2) {
        ((TextureRegistry$SurfaceProducer) this.a).setSize(i, i2);
    }

    @Override // defpackage.pvr0
    public ShimmersLayoutIdentifiers b() {
        return new ShimmersLayoutIdentifiers(ygh0.finsdkPKBackButton, ((a2w) ((b2w) this.a).b.a.getValue()).a() ? soh0.finsdk_pk_shimmer : soh0.finsdk_pk_shimmer_fullscreen, null);
    }

    @Override // defpackage.gor
    public float c() {
        return 0.0f;
    }

    @Override // defpackage.gsf0
    public boolean d() {
        boolean z;
        z = ((StoryModalView) this.a).attached;
        return z;
    }

    @Override // defpackage.jyv
    public boolean e(i4u i4uVar, int i, Bundle bundle) {
        StatelessInputConnection statelessInputConnection = (StatelessInputConnection) this.a;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((h2t) i4uVar.a).a).requestPermission();
                InputContentInfo inputContentInfo = (InputContentInfo) ((h2t) i4uVar.a).a;
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                statelessInputConnection.logDebug("Can't insert content from IME; requestPermission() failed, " + e);
                return false;
            }
        }
        StatelessInputConnection.access$getSession$p(statelessInputConnection);
        h2t h2tVar = (h2t) i4uVar.a;
        h2t h2tVar2 = (h2t) i4uVar.a;
        new ClipData(((InputContentInfo) h2tVar.a).getDescription(), new ClipData.Item(((InputContentInfo) h2tVar2.a).getContentUri()));
        ((InputContentInfo) h2tVar2.a).getDescription();
        ((InputContentInfo) h2tVar2.a).getLinkUri();
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        throw null;
    }

    public void f() {
        Object value;
        ovv0 ovv0Var = (ovv0) this.a;
        ovv0Var.O.f();
        ovv0Var.P.f();
        ovv0Var.Q.f();
        ovv0Var.R.f();
        ovv0Var.S.f();
        r0 r0Var = ovv0Var.T.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, EmptyList.a));
        ovv0Var.U.a.a.l(null);
    }

    @Override // defpackage.nvu0
    public nvu0 get(String str) {
        Object opt = ((JSONArray) this.a).opt(Integer.parseInt(str));
        if (opt instanceof JSONArray) {
            return new wor0((JSONArray) opt);
        }
        if (opt instanceof JSONObject) {
            return new jhu0((JSONObject) opt);
        }
        if (opt == null ? true : opt.equals(JSONObject.NULL)) {
            return null;
        }
        return bei.Q;
    }

    @Override // defpackage.uwc0
    public int getHeight() {
        return ((TextureRegistry$SurfaceProducer) this.a).getHeight();
    }

    @Override // defpackage.uwc0
    public Surface getSurface() {
        return ((TextureRegistry$SurfaceProducer) this.a).getSurface();
    }

    @Override // defpackage.uwc0
    public int getWidth() {
        return ((TextureRegistry$SurfaceProducer) this.a).getWidth();
    }

    @Override // defpackage.gor
    public long i(float f) {
        return ((long) (Math.exp(((iq31) this.a).b(f) / (unr.a - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // defpackage.gor
    public float j(float f, float f2) {
        double b = ((iq31) this.a).b(f2);
        double d = unr.a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * b) * r8.a * r8.b))) + f;
    }

    @Override // defpackage.gor
    public float k(float f, long j) {
        long j2 = j / 1000000;
        tnr a = ((iq31) this.a).a(f);
        long j3 = a.c;
        return (((Math.signum(a.a) * m92.a(j3 > 0 ? j2 / j3 : 1.0f).b) * a.b) / j3) * 1000.0f;
    }

    @Override // defpackage.gor
    public float l(float f, float f2, long j) {
        long j2 = j / 1000000;
        tnr a = ((iq31) this.a).a(f2);
        long j3 = a.c;
        return (Math.signum(a.a) * a.b * m92.a(j3 > 0 ? j2 / j3 : 1.0f).a) + f;
    }

    @Override // defpackage.uwc0
    public void release() {
        ((TextureRegistry$SurfaceProducer) this.a).release();
        this.a = null;
    }

    @Override // defpackage.uwc0
    public void scheduleFrame() {
        ((TextureRegistry$SurfaceProducer) this.a).scheduleFrame();
    }

    @Override // defpackage.nvu0
    public void set(String str, Object obj) {
        JSONArray jSONArray = (JSONArray) this.a;
        int parseInt = Integer.parseInt(str);
        if (parseInt < 0 || parseInt > jSONArray.length()) {
            ny61.s();
        } else {
            try {
                jSONArray.put(parseInt, obj);
            } catch (Throwable unused) {
            }
        }
    }

    public /* synthetic */ wor0(Object obj) {
        this.a = obj;
    }
}
