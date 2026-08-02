package com.squareup.cash.blockers.presenters;

import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class TitleTemplates {
    public final Function2 businessAccountTitleTemplate;
    public final Function2 personalAccountTitleTemplate;

    public TitleTemplates(Function2 function2, Function2 function22) {
        this.personalAccountTitleTemplate = function2;
        this.businessAccountTitleTemplate = function22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleTemplates)) {
            return false;
        }
        TitleTemplates titleTemplates = (TitleTemplates) obj;
        return this.personalAccountTitleTemplate.equals(titleTemplates.personalAccountTitleTemplate) && this.businessAccountTitleTemplate.equals(titleTemplates.businessAccountTitleTemplate);
    }

    public final int hashCode() {
        return this.businessAccountTitleTemplate.hashCode() + (this.personalAccountTitleTemplate.hashCode() * 31);
    }

    public final String toString() {
        return "TitleTemplates(personalAccountTitleTemplate=" + this.personalAccountTitleTemplate + ", businessAccountTitleTemplate=" + this.businessAccountTitleTemplate + ")";
    }
}
