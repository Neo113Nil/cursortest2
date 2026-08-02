package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.media.MediaCodecInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType;
import com.yandex.go.platform.ui.components.errordialog.LoadErrorDialog;
import com.yandex.go.platform.web_view_client.a;
import com.yandex.messaging.internal.urlpreview.UrlPreviewBackgroundStyle;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import org.bouncycastle.cms.CMSException;
import ru.yandex.taxi.carplates.ui.CarIndexContainerView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.eatskit.ContentView;
import ru.yandex.taxi.eatskit.dto.ErrorSource;

/* loaded from: classes13.dex */
public abstract class x3 implements r250, igq0 {
    public final /* synthetic */ int a;
    public final Object b;

    public x3(InputStream inputStream) {
        this.a = 4;
        try {
            j3 j3Var = (j3) new o3(inputStream).G();
            if (j3Var == null) {
                throw new CMSException("No content found.");
            }
            this.b = new yfa(j3Var);
        } catch (IOException e) {
            throw new CMSException("IOException reading content.", e);
        } catch (ClassCastException e2) {
            throw new CMSException("Unexpected object reading content.", e2);
        }
    }

    @Override // defpackage.r250
    public void Bc() {
        ContentView contentView = ((rme) this.b).l;
        if (contentView != null) {
            contentView.setHasSwipeArea$eatskit(true);
        }
    }

    public void Bg(zqr zqrVar, ArrayList arrayList) {
        int i = wqr.a[((FlowLayoutOverflow$OverflowType) this.b).ordinal()];
    }

    public void Cg(b3 b3Var) {
        if (((Class) this.b).isInstance(b3Var)) {
            return;
        }
        ny61.r("unexpected object: ".concat(b3Var.getClass().getName()));
    }

    public abstract void Dg();

    public b3 Eg(byte[] bArr) {
        b3 r = b3.r(bArr);
        Cg(r);
        return r;
    }

    public b3 Fg(i3 i3Var) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    public b3 Gg(dqf dqfVar) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    public b3 Hg(s3 s3Var, boolean z) {
        if (128 != s3Var.b) {
            ny61.r("this method only valid for CONTEXT_SPECIFIC tags");
            return null;
        }
        b3 x = s3Var.x(z, this);
        Cg(x);
        return x;
    }

    public abstract View Ig();

    public abstract View Jg();

    public void Kg(c6e0 c6e0Var) {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(c6e0Var);
        }
    }

    public p790 Lg() {
        w040 w040Var = (w040) this.b;
        if (((a) w040Var.e).h()) {
            h7o h7oVar = (h7o) w040Var.g;
            h7oVar.e.removeCallbacksAndMessages(null);
            LoadErrorDialog loadErrorDialog = h7oVar.b;
            if (loadErrorDialog != null) {
                oj91.b(loadErrorDialog);
            }
            ujf0 ujf0Var = (ujf0) w040Var.c;
            if (ujf0Var instanceof rjf0) {
                rjf0 rjf0Var = (rjf0) ujf0Var;
                oj91.b(rjf0Var.a);
                oj91.b(rjf0Var.b);
            } else if (ujf0Var instanceof tjf0) {
                oj91.b(((tjf0) ujf0Var).a);
            }
        } else {
            ((d5c) w040Var.h).onClose();
        }
        return new p790(12, w040Var);
    }

    public x3 Mg(n790 n790Var) {
        return this;
    }

    public x3 Ng(String str) {
        return this;
    }

    public x3 Og() {
        return this;
    }

    public x3 Pg(String str) {
        return this;
    }

    public x3 Qg() {
        return this;
    }

    public abstract void Rg();

    public abstract void Sg(UrlPreviewBackgroundStyle urlPreviewBackgroundStyle);

    public abstract void Tg(ip31 ip31Var, z9z0 z9z0Var, Canvas canvas, boolean z, boolean z2, boolean z3);

    @Override // defpackage.r250
    public void a7() {
        ContentView contentView = ((rme) this.b).l;
        if (contentView != null) {
            contentView.setHasSwipeArea$eatskit(false);
        }
    }

    @Override // defpackage.r250
    public void ae() {
        ((rnc) ((rme) this.b).b.a).getClass();
    }

    @Override // defpackage.r250
    public void b9(f8o f8oVar, ErrorSource errorSource) {
        String str;
        d6j0 d6j0Var;
        vby vbyVar = xby.d;
        IllegalStateException illegalStateException = new IllegalStateException("Failed to load eatskit webview");
        if (f8oVar == null || (d6j0Var = f8oVar.a) == null) {
            str = "No error params";
        } else {
            str = "Error [" + d6j0Var.e + "|" + d6j0Var.d + "] " + d6j0Var.b;
        }
        vbyVar.k(illegalStateException, str);
        ((rme) this.b).p(f8oVar, errorSource);
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                return this == obj;
            default:
                return super.equals(obj);
        }
    }

    @Override // defpackage.r250
    public void h() {
        ((rme) this.b).q();
    }

    public abstract void show();

    public /* synthetic */ x3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public x3() {
        this.a = 3;
        this.b = new ArrayDeque(20);
    }

    public x3(ListItemComponent listItemComponent, CarIndexContainerView carIndexContainerView) {
        this.a = 2;
        this.b = carIndexContainerView;
        int d = c.d(mrg0.go_design_m_space, listItemComponent);
        carIndexContainerView.setPadding(d, 0, d, 0);
        listItemComponent.setTrailView(carIndexContainerView);
    }

    public x3(o350 o350Var) {
        this.a = 10;
        Activity activity = o350Var.a;
        View findViewById = activity.findViewById(neh0.menu_view);
        View inflate = LayoutInflater.from(activity).inflate(rqh0.main_menu_layout, (ViewGroup) null);
        c.w(findViewById, inflate);
        this.b = inflate;
        inflate.setVisibility(8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x3(ListItemComponent listItemComponent, int i) {
        this(listItemComponent, new CarIndexContainerView(listItemComponent.getContext(), i));
        this.a = 2;
    }

    public x3(MediaCodecInfo mediaCodecInfo, String str) {
        this.a = 8;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.b = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new InvalidConfigException(g8e.o("Unable to get CodecCapabilities for mime: ", str), e);
        }
    }
}
