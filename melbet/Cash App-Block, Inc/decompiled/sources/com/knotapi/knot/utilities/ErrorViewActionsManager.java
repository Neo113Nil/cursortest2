package com.knotapi.knot.utilities;

import com.knotapi.knot.models.ErrorView;
import com.knotapi.knot.models.ErrorViewActions;
import com.knotapi.knot.webview.KnotView;

/* loaded from: classes4.dex */
public class ErrorViewActionsManager {
    private static final String TAG = "ErrorViewActionsManager";

    public static void startErrorViewActions(String str, KnotView knotView, ErrorViewActions errorViewActions) {
        if (!Helper.isUrlMatch(str, errorViewActions.getUrl(), errorViewActions.getIsUrlRegex()) || errorViewActions.getErrorView() == null) {
            return;
        }
        ErrorView errorView = knotView.getViewClient().getErrorView();
        errorView.setTitle(errorViewActions.getErrorView().get("title").getAsString());
        errorView.setContent(errorViewActions.getErrorView().get("description").getAsString());
        knotView.getViewClient().showErrorPage(errorView);
    }
}
