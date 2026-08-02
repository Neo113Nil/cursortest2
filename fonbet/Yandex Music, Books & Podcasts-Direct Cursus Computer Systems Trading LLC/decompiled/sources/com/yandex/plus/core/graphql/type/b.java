package com.yandex.plus.core.graphql.type;

import com.connectsdk.service.command.ServiceCommand;
import defpackage.u75;

/* loaded from: classes4.dex */
public enum b {
    /* JADX INFO: Fake field, exist only in values array */
    unfreeze("accept"),
    /* JADX INFO: Fake field, exist only in values array */
    activatePresent("activatePresent"),
    /* JADX INFO: Fake field, exist only in values array */
    afisha("afisha"),
    /* JADX INFO: Fake field, exist only in values array */
    cardActivation("cardActivation"),
    /* JADX INFO: Fake field, exist only in values array */
    cashback("cashback"),
    /* JADX INFO: Fake field, exist only in values array */
    closeCurrentWebview("closeCurrentWebview"),
    /* JADX INFO: Fake field, exist only in values array */
    closePopup("closePopup"),
    /* JADX INFO: Fake field, exist only in values array */
    currentWindow("currentWindow"),
    /* JADX INFO: Fake field, exist only in values array */
    custom("custom"),
    /* JADX INFO: Fake field, exist only in values array */
    iframe("iframe"),
    /* JADX INFO: Fake field, exist only in values array */
    modalWindow("modalWindow"),
    /* JADX INFO: Fake field, exist only in values array */
    newWindow("newWindow"),
    none("none"),
    /* JADX INFO: Fake field, exist only in values array */
    popup("popup"),
    /* JADX INFO: Fake field, exist only in values array */
    retryPayment("retryPayment"),
    subscribe(ServiceCommand.TYPE_SUB),
    /* JADX INFO: Fake field, exist only in values array */
    unfreeze("unfreeze"),
    UNKNOWN__("UNKNOWN__");

    public static final com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a b = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
    public final String a;

    static {
        u75.h("accept", "activatePresent", "afisha", "cardActivation", "cashback", "closeCurrentWebview", "closePopup", "currentWindow", "custom", "iframe", "modalWindow", "newWindow", "none", "popup", "retryPayment", ServiceCommand.TYPE_SUB, "unfreeze").getClass();
    }

    b(String str) {
        this.a = str;
    }
}
