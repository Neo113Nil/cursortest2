package defpackage;

import android.net.Uri;
import android.view.KeyEvent;
import com.yandex.div.core.state.PathFormatException;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivVisibilityAction;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class y6k {
    private static final String AUTHORITY_HIDE_TOOLTIP = "hide_tooltip";
    private static final String AUTHORITY_SET_VARIABLE = "set_variable";
    private static final String AUTHORITY_SHOW_TOOLTIP = "show_tooltip";
    private static final String AUTHORITY_SWITCH_STATE = "set_state";
    private static final String AUTHORITY_TIMER = "timer";
    private static final String AUTHORITY_VIDEO = "video";
    private static final String PARAM_ACTION = "action";
    private static final String PARAM_ID = "id";
    private static final String PARAM_MULTIPLE = "multiple";
    private static final String PARAM_STATE_ID = "state_id";
    private static final String PARAM_TEMPORARY = "temporary";
    private static final String PARAM_VARIABLE_NAME = "name";
    private static final String PARAM_VARIABLE_VALUE = "value";
    private static final String SCHEME_DIV_ACTION = "div-action";

    public static rvo getLocalResolver(String str, fpl fplVar, rvo rvoVar) {
        aw5 bindingContext;
        if (str != null) {
            KeyEvent.Callback e = vi91.e((Div2View) fplVar, str);
            if ((e instanceof msk) && (bindingContext = ((msk) e).getBindingContext()) != null) {
                return bindingContext.b;
            }
        }
        return rvoVar;
    }

    public static boolean handleAction(String str, Uri uri, fpl fplVar, rvo rvoVar) {
        Div2View div2View;
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        aw5 bindingContext;
        if (uri != null && SCHEME_DIV_ACTION.equals(uri.getScheme())) {
            String authority = uri.getAuthority();
            if (AUTHORITY_SWITCH_STATE.equals(authority)) {
                String queryParameter5 = uri.getQueryParameter("state_id");
                if (queryParameter5 == null) {
                    return false;
                }
                try {
                    fplVar.switchToState(xw91.h(queryParameter5), uri.getBooleanQueryParameter(PARAM_TEMPORARY, true));
                    return true;
                } catch (PathFormatException | VariableMutationException unused) {
                }
            } else if (AUTHORITY_SHOW_TOOLTIP.equals(authority)) {
                String queryParameter6 = uri.getQueryParameter("id");
                if (queryParameter6 != null) {
                    fplVar.showTooltip(queryParameter6, uri.getBooleanQueryParameter(PARAM_MULTIPLE, false));
                    return true;
                }
            } else if (AUTHORITY_HIDE_TOOLTIP.equals(authority)) {
                String queryParameter7 = uri.getQueryParameter("id");
                if (queryParameter7 != null) {
                    fplVar.hideTooltip(queryParameter7);
                    return true;
                }
            } else {
                if (AUTHORITY_SET_VARIABLE.equals(authority)) {
                    String queryParameter8 = uri.getQueryParameter(PARAM_VARIABLE_NAME);
                    if (queryParameter8 == null || (queryParameter4 = uri.getQueryParameter("value")) == null) {
                        return false;
                    }
                    div2View = fplVar instanceof Div2View ? (Div2View) fplVar : null;
                    if (div2View == null) {
                        fplVar.getClass();
                        return false;
                    }
                    if (str != null) {
                        KeyEvent.Callback e = vi91.e((Div2View) fplVar, str);
                        if ((e instanceof msk) && (bindingContext = ((msk) e).getBindingContext()) != null) {
                            rvoVar = bindingContext.b;
                        }
                    }
                    gtq0.P(div2View, queryParameter8, queryParameter4, rvoVar);
                    return true;
                }
                if (AUTHORITY_TIMER.equals(authority)) {
                    String queryParameter9 = uri.getQueryParameter("id");
                    if (queryParameter9 == null || (queryParameter3 = uri.getQueryParameter("action")) == null) {
                        return false;
                    }
                    div2View = fplVar instanceof Div2View ? (Div2View) fplVar : null;
                    if (div2View == null) {
                        fplVar.getClass();
                        return false;
                    }
                    div2View.applyTimerCommand(queryParameter9, queryParameter3);
                    return true;
                }
                if ("video".equals(authority)) {
                    div2View = fplVar instanceof Div2View ? (Div2View) fplVar : null;
                    if (div2View == null || (queryParameter = uri.getQueryParameter("id")) == null || (queryParameter2 = uri.getQueryParameter("action")) == null) {
                        return false;
                    }
                    return div2View.applyVideoCommand(queryParameter, queryParameter2, rvoVar);
                }
                if (wfz.c(authority)) {
                    return wfz.k(uri, fplVar, rvoVar);
                }
                if (xgb1.a(authority)) {
                    return xgb1.d(uri, fplVar);
                }
            }
        }
        return false;
    }

    public boolean getUseActionUid() {
        return false;
    }

    public final boolean handleActionUrl(String str, Uri uri, fpl fplVar, rvo rvoVar) {
        aw5 bindingContext;
        if (str != null) {
            KeyEvent.Callback e = vi91.e((Div2View) fplVar, str);
            if ((e instanceof msk) && (bindingContext = ((msk) e).getBindingContext()) != null) {
                rvoVar = bindingContext.b;
            }
        }
        return handleAction(str, uri, fplVar, rvoVar);
    }

    public boolean handleActionWithReason(v3k v3kVar, fpl fplVar, rvo rvoVar, String str) {
        return tryHandleCustomTypedAction(v3kVar.j, v3kVar.h, v3kVar.f, fplVar, null, str) || handleAction(v3kVar, fplVar, rvoVar);
    }

    public void handleCustomTypedAction(jbk jbkVar, String str, fpl fplVar, String str2, String str3, kgj kgjVar) {
    }

    public void handlePayload(JSONObject jSONObject) {
    }

    public final boolean tryHandleCustomTypedAction(jbk jbkVar, String str, JSONObject jSONObject, fpl fplVar, String str2, String str3) {
        if (!(jbkVar instanceof tak)) {
            return false;
        }
        handleCustomTypedAction(jbkVar, str, fplVar, str2, str3, jSONObject != null ? new o501(28) : null);
        return true;
    }

    public boolean handleActionWithReason(v3k v3kVar, fpl fplVar, rvo rvoVar, String str, String str2) {
        return tryHandleCustomTypedAction(v3kVar.j, v3kVar.h, v3kVar.f, fplVar, str, str2) || handleAction(v3kVar, fplVar, rvoVar, str);
    }

    public final boolean handleActionUrl(Uri uri, fpl fplVar, rvo rvoVar) {
        return handleActionUrl(null, uri, fplVar, rvoVar);
    }

    public final boolean tryHandleCustomTypedAction(f9l f9lVar, fpl fplVar, String str) {
        return tryHandleCustomTypedAction(f9lVar.d(), f9lVar.e(), f9lVar.getPayload(), fplVar, str, null);
    }

    public boolean handleActionUrl(Uri uri, fpl fplVar) {
        return handleActionUrl(uri, fplVar, fplVar.getExpressionResolver());
    }

    public final boolean tryHandleCustomTypedAction(v3k v3kVar, fpl fplVar, String str, String str2) {
        return tryHandleCustomTypedAction(v3kVar.j, v3kVar.h, v3kVar.f, fplVar, str, str2);
    }

    public boolean handleAction(nnk nnkVar, fpl fplVar, rvo rvoVar) {
        return handleAction((f9l) nnkVar, fplVar, rvoVar);
    }

    public boolean handleAction(DivVisibilityAction divVisibilityAction, fpl fplVar, rvo rvoVar, String str) {
        return handleAction((f9l) divVisibilityAction, fplVar, rvoVar, str);
    }

    public boolean handleAction(nnk nnkVar, fpl fplVar, rvo rvoVar, String str) {
        return handleAction((f9l) nnkVar, fplVar, rvoVar, str);
    }

    public boolean handleAction(DivVisibilityAction divVisibilityAction, fpl fplVar, rvo rvoVar) {
        return handleAction((f9l) divVisibilityAction, fplVar, rvoVar);
    }

    public boolean handleAction(v3k v3kVar, fpl fplVar, rvo rvoVar) {
        Uri uri;
        jbk jbkVar = v3kVar.j;
        String str = v3kVar.h;
        boolean tryHandleCustomTypedAction = tryHandleCustomTypedAction(jbkVar, v3kVar.h, v3kVar.f, fplVar, null, null);
        Expression expression = v3kVar.k;
        if (tryHandleCustomTypedAction || dai0.u(str, v3kVar.j, fplVar, rvoVar, v3kVar.a)) {
            return true;
        }
        Uri uri2 = expression != null ? (Uri) expression.a(rvoVar) : null;
        if (eja1.h(uri2, fplVar)) {
            Div2View div2View = (Div2View) fplVar;
            if (expression == null || (uri = (Uri) expression.a(rvoVar)) == null || uri.getQueryParameter("url") == null) {
                return false;
            }
            div2View.addLoadReference(div2View.getDiv2Component().i().a(), div2View);
            return true;
        }
        return handleAction(str, uri2, fplVar, rvoVar);
    }

    public boolean handleAction(v3k v3kVar, fpl fplVar, rvo rvoVar, String str) {
        return tryHandleCustomTypedAction(v3kVar.j, v3kVar.h, v3kVar.f, fplVar, str, null) || handleAction(v3kVar, fplVar, rvoVar);
    }

    public boolean handleAction(f9l f9lVar, fpl fplVar, rvo rvoVar) {
        Uri uri;
        if (tryHandleCustomTypedAction(f9lVar.d(), f9lVar.e(), f9lVar.getPayload(), fplVar, null, null) || dai0.u(f9lVar.e(), f9lVar.d(), fplVar, rvoVar, f9lVar.a())) {
            return true;
        }
        Uri uri2 = f9lVar.getUrl() != null ? (Uri) f9lVar.getUrl().a(rvoVar) : null;
        if (eja1.h(uri2, fplVar)) {
            Div2View div2View = (Div2View) fplVar;
            Expression url = f9lVar.getUrl();
            if (url == null || (uri = (Uri) url.a(rvoVar)) == null || uri.getQueryParameter("url") == null) {
                return false;
            }
            div2View.addLoadReference(div2View.getDiv2Component().i().a(), div2View);
            return true;
        }
        return handleAction(f9lVar.e(), uri2, fplVar, rvoVar);
    }

    public boolean handleAction(f9l f9lVar, fpl fplVar, rvo rvoVar, String str) {
        return tryHandleCustomTypedAction(f9lVar.d(), f9lVar.e(), f9lVar.getPayload(), fplVar, str, null) || handleAction(f9lVar, fplVar, rvoVar);
    }
}
