package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.payment.sdk.flex.impl.extensions.shimmer.ShimmerDrawable;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class vtr0 implements dpk {
    public final lir a;

    public vtr0(boolean z, lir lirVar) {
        this.a = lirVar;
    }

    @Override // defpackage.dpk
    public final void beforeBindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        Object obj;
        JSONObject jSONObject;
        List extensions = egkVar.getExtensions();
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((bpk) obj).a, ShimmerDivHandler.EXTENSION_ID)) {
                        break;
                    }
                }
            }
            bpk bpkVar = (bpk) obj;
            if (bpkVar != null && (jSONObject = bpkVar.b) != null) {
                try {
                    if (new u3u().c(otr0.class, jSONObject.toString()) != null) {
                        throw new ClassCastException();
                    }
                } catch (Exception unused) {
                    this.a.a(new kir("transport_flex_health_issue", g8e.z("issue", "cannot_parse_shimmer_model")));
                }
            }
        }
        ShimmerDrawable shimmerDrawable = new ShimmerDrawable(view.getContext());
        shimmerDrawable.setShimmer(null, null);
        shimmerDrawable.startShimmer();
        view.setForeground(shimmerDrawable);
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        List extensions = egkVar.getExtensions();
        Object obj = null;
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(((bpk) next).a, ShimmerDivHandler.EXTENSION_ID)) {
                    obj = next;
                    break;
                }
            }
            obj = (bpk) obj;
        }
        return obj != null;
    }

    @Override // defpackage.dpk
    public final void preprocess(egk egkVar, rvo rvoVar) {
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        Drawable foreground = view.getForeground();
        ShimmerDrawable shimmerDrawable = foreground instanceof ShimmerDrawable ? (ShimmerDrawable) foreground : null;
        if (shimmerDrawable != null) {
            shimmerDrawable.stopShimmer();
        }
        view.setForeground(null);
    }
}
