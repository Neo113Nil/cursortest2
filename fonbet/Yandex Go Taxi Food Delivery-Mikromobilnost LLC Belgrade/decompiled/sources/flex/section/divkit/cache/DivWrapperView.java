package flex.section.divkit.cache;

import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.c3;
import defpackage.a231;
import defpackage.anl;
import defpackage.b96;
import defpackage.bnl;
import defpackage.c231;
import defpackage.dnl;
import defpackage.ehj;
import defpackage.fnl;
import defpackage.gd7;
import defpackage.gtq0;
import defpackage.hi21;
import defpackage.inl;
import defpackage.j3k;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.l7w;
import defpackage.omk;
import defpackage.q;
import defpackage.qqu0;
import defpackage.rhc;
import defpackage.rvo;
import defpackage.t131;
import defpackage.tls;
import defpackage.tn60;
import defpackage.u131;
import defpackage.v131;
import defpackage.v63;
import defpackage.w131;
import defpackage.w511;
import defpackage.wml;
import defpackage.x131;
import defpackage.xml;
import defpackage.y131;
import defpackage.y2l;
import defpackage.y6k;
import defpackage.ycc;
import defpackage.yml;
import defpackage.z131;
import defpackage.zmk;
import defpackage.zml;
import defpackage.zvi;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0010¢\u0006\u0004\b!\u0010 J\r\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010 J\r\u0010#\u001a\u00020\u0010¢\u0006\u0004\b#\u0010 J\r\u0010$\u001a\u00020\u0010¢\u0006\u0004\b$\u0010 J\r\u0010%\u001a\u00020\u0010¢\u0006\u0004\b%\u0010 J\r\u0010&\u001a\u00020\u0010¢\u0006\u0004\b&\u0010 J/\u0010-\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b-\u0010.J/\u0010-\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010(\u001a\u00020'2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010/JE\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010(\u001a\u00020'2\u0006\u0010,\u001a\u00020+2\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0010\u0018\u000100¢\u0006\u0004\b2\u00103J\u001b\u00107\u001a\u00020\u00102\f\u00106\u001a\b\u0012\u0004\u0012\u00020504¢\u0006\u0004\b7\u00108J\u0015\u0010;\u001a\u00020\u00102\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u00020\u00102\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0010¢\u0006\u0004\b?\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010AR*\u0010C\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR$\u0010K\u001a\u00020\u00132\u0006\u0010B\u001a\u00020\u00138\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0013\u0010R\u001a\u0004\u0018\u00010O8F¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lflex/section/divkit/cache/DivWrapperView;", "Landroid/view/ViewGroup;", "Lj3k;", "cache", "Landroid/content/Context;", "parentContext", "<init>", "(Lj3k;Landroid/content/Context;)V", "", "type", "Lgd7;", "getCachedView", "(Ljava/lang/String;)Lgd7;", "", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "toContentMode", "()V", "toPlaceholderMode", "tryLogVisibility", "startDivAnimation", "stopDivAnimation", "discardVisibilityTracking", "trackChildrenVisibility", "Lzmk;", "dataTag", "Lomk;", Constants.KEY_DATA, "Ly6k;", "actionHandler", "setData", "(Ljava/lang/String;Lzmk;Lomk;Ly6k;)V", "(Ljava/lang/String;Lomk;Lzmk;Ly6k;)Z", "Lkotlin/Function1;", "onComplete", "setDataAsync", "(Ljava/lang/String;Lomk;Lzmk;Ly6k;Ltls;)V", "", "Lcom/yandex/div2/c3;", "variables", "updateVariables", "(Ljava/util/List;)V", "Ly2l;", "patch", "applyPatch", "(Ly2l;)V", "updateActionHandler", "(Ly6k;)V", "releaseView", "Lj3k;", "Landroid/content/Context;", "value", "placeholderHeight", CA20Status.STATUS_USER_I, "getPlaceholderHeight", "()I", "setPlaceholderHeight", "(I)V", "cachedView", "Lgd7;", "isInContentMode", "Z", "setInContentMode", "(Z)V", "Lcom/yandex/div/core/view2/Div2View;", "getDivView", "()Lcom/yandex/div/core/view2/Div2View;", "divView", "divkit-section_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DivWrapperView extends ViewGroup {
    private final j3k cache;
    private gd7 cachedView;
    private boolean isInContentMode;
    private final Context parentContext;
    private int placeholderHeight;

    public DivWrapperView(j3k j3kVar, Context context) {
        super(context);
        this.cache = j3kVar;
        this.parentContext = context;
        this.isInContentMode = true;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    private final gd7 getCachedView(String type) {
        gd7 gd7Var;
        LinkedList<gd7> linkedList;
        gd7 gd7Var2 = this.cachedView;
        if (!jl40.l(type, gd7Var2 != null ? gd7Var2.a : null)) {
            releaseView();
        }
        gd7 gd7Var3 = this.cachedView;
        if (gd7Var3 != null) {
            return gd7Var3;
        }
        j3k j3kVar = this.cache;
        Context context = getContext();
        LinkedList linkedList2 = j3kVar.A;
        linkedList2.remove(type);
        linkedList2.add(type);
        while (linkedList2.size() > j3kVar.w) {
            String str = (String) ycc.y(linkedList2);
            if (str != null && (linkedList = (LinkedList) j3kVar.a().remove(str)) != null) {
                for (gd7 gd7Var4 : linkedList) {
                    gd7Var4.b.setActionHandler(null);
                    gd7Var4.b.cleanup();
                }
            }
        }
        LinkedList linkedList3 = (LinkedList) j3kVar.a().get(type);
        if (linkedList3 == null || (gd7Var = (gd7) ycc.y(linkedList3)) == null) {
            gd7Var = new gd7(j3kVar.b.a(j3kVar.a.a(context, j3kVar.c), new ViewGroup.LayoutParams(-1, -1)), type);
        }
        addView(gd7Var.b);
        this.cachedView = gd7Var;
        return gd7Var;
    }

    private final void setInContentMode(boolean z) {
        if (this.isInContentMode != z) {
            this.isInContentMode = z;
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c231 updateVariables$lambda$2$lambda$1(c231 c231Var, c231 c231Var2) {
        return c231Var;
    }

    public final void applyPatch(y2l patch) {
        gd7 gd7Var = this.cachedView;
        if (gd7Var != null) {
            gd7Var.b.applyPatch(patch);
        }
    }

    public final void discardVisibilityTracking() {
        gd7 gd7Var = this.cachedView;
        if (gd7Var != null) {
            gd7Var.b.discardVisibilityTracking();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.isInContentMode) {
            super.dispatchDraw(canvas);
        }
    }

    public final Div2View getDivView() {
        gd7 gd7Var = this.cachedView;
        if (gd7Var != null) {
            return gd7Var.b;
        }
        return null;
    }

    public final int getPlaceholderHeight() {
        return this.placeholderHeight;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        if (!this.isInContentMode || getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!this.isInContentMode) {
            super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(this.placeholderHeight, 1073741824));
        } else {
            if (getChildCount() == 0) {
                setMeasuredDimension(0, 0);
                return;
            }
            View childAt = getChildAt(0);
            measureChild(childAt, widthMeasureSpec, heightMeasureSpec);
            setMeasuredDimension(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    public final void releaseView() {
        gd7 gd7Var = this.cachedView;
        if (gd7Var == null) {
            return;
        }
        Div2View div2View = gd7Var.b;
        this.cachedView = null;
        setInContentMode(true);
        removeViewAt(0);
        div2View.setActionHandler(null);
        j3k j3kVar = this.cache;
        j3kVar.getClass();
        String str = gd7Var.a;
        if (j3kVar.A.contains(str)) {
            List list = (List) j3kVar.a().get(str);
            if ((list != null ? list.size() : 0) < j3kVar.x) {
                div2View.releaseMedia();
                HashMap a = j3kVar.a();
                Object obj = a.get(str);
                if (obj == null) {
                    obj = new LinkedList();
                    a.put(str, obj);
                }
                ((LinkedList) obj).add(gd7Var);
                return;
            }
        }
        div2View.setActionHandler(null);
        div2View.cleanup();
    }

    public final boolean setData(String type, omk data, zmk dataTag, y6k actionHandler) {
        Div2View div2View = getCachedView(type).b;
        boolean data2 = div2View.setData(data, dataTag);
        div2View.setActionHandler(actionHandler);
        return data2;
    }

    public final void setDataAsync(String type, omk data, zmk dataTag, y6k actionHandler, tls onComplete) {
        gd7 cachedView = getCachedView(type);
        cachedView.b.setDataAsync(data, dataTag, new q(24, cachedView, actionHandler, onComplete));
    }

    public final void setPlaceholderHeight(int i) {
        if (this.placeholderHeight != i) {
            this.placeholderHeight = i;
            requestLayout();
        }
    }

    public final void startDivAnimation() {
        gd7 gd7Var = this.cachedView;
        if (gd7Var != null) {
            gd7Var.b.startDivAnimation();
        }
    }

    public final void stopDivAnimation() {
        gd7 gd7Var = this.cachedView;
        if (gd7Var != null) {
            gd7Var.b.stopDivAnimation();
        }
    }

    public final void toContentMode() {
        if (this.isInContentMode) {
            return;
        }
        setInContentMode(true);
    }

    public final void toPlaceholderMode() {
        if (this.isInContentMode) {
            setInContentMode(false);
        }
    }

    public final void trackChildrenVisibility() {
        gd7 gd7Var = this.cachedView;
        if (gd7Var != null) {
            gd7Var.b.trackChildrenVisibility();
        }
    }

    public final void tryLogVisibility() {
        gd7 gd7Var = this.cachedView;
        if (gd7Var != null) {
            gd7Var.b.tryLogVisibility();
        }
    }

    public final void updateActionHandler(y6k actionHandler) {
        gd7 gd7Var = this.cachedView;
        if (gd7Var != null) {
            gd7Var.b.setActionHandler(actionHandler);
        }
    }

    public final void updateVariables(List<? extends c3> variables) {
        gd7 gd7Var;
        c231 c231Var;
        if (variables.isEmpty() || (gd7Var = this.cachedView) == null) {
            return;
        }
        Div2View div2View = gd7Var.b;
        rvo expressionResolver = div2View.getExpressionResolver();
        for (c3 c3Var : variables) {
            if (c3Var instanceof xml) {
                b96 b96Var = ((xml) c3Var).c;
                c231Var = new u131(b96Var.a, ((Boolean) b96Var.b.a(expressionResolver)).booleanValue());
            } else if (c3Var instanceof anl) {
                l7w l7wVar = ((anl) c3Var).c;
                c231Var = new y131(l7wVar.a, ((Number) l7wVar.b.a(expressionResolver)).longValue());
            } else if (c3Var instanceof bnl) {
                tn60 tn60Var = ((bnl) c3Var).c;
                c231Var = new x131(tn60Var.a, ((Number) tn60Var.b.a(expressionResolver)).doubleValue());
            } else if (c3Var instanceof fnl) {
                qqu0 qqu0Var = ((fnl) c3Var).c;
                c231Var = new z131(qqu0Var.a, (String) qqu0Var.b.a(expressionResolver));
            } else if (c3Var instanceof yml) {
                rhc rhcVar = ((yml) c3Var).c;
                c231Var = new v131(rhcVar.a, ((Number) rhcVar.b.a(expressionResolver)).intValue());
            } else if (c3Var instanceof inl) {
                hi21 hi21Var = ((inl) c3Var).c;
                c231Var = new a231(hi21Var.a, (Uri) hi21Var.b.a(expressionResolver));
            } else if (c3Var instanceof zml) {
                ehj ehjVar = ((zml) c3Var).c;
                c231Var = new w131(ehjVar.a, (JSONObject) ehjVar.b.a(expressionResolver));
            } else if (c3Var instanceof wml) {
                v63 v63Var = ((wml) c3Var).c;
                c231Var = new t131(v63Var.a, (JSONArray) v63Var.b.a(expressionResolver));
            } else {
                if (!(c3Var instanceof dnl)) {
                    w511.b();
                    return;
                }
                c231Var = null;
            }
            if (c231Var != null) {
                gtq0.Q(div2View, c231Var.c(), expressionResolver, new zvi(15, c231Var));
            }
        }
    }

    @jxi
    public final void setData(String type, zmk dataTag, omk data, y6k actionHandler) {
        Div2View div2View = getCachedView(type).b;
        div2View.setData(data, dataTag);
        div2View.setActionHandler(actionHandler);
    }
}
