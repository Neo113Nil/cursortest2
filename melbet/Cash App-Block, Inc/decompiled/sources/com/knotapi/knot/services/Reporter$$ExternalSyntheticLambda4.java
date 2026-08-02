package com.knotapi.knot.services;

import com.knotapi.knot.services.Reporter;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public final /* synthetic */ class Reporter$$ExternalSyntheticLambda4 implements Reporter.BreadcrumbValidator, Reporter.BreadcrumbRetriever {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Reporter$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // com.knotapi.knot.services.Reporter.BreadcrumbValidator
    public boolean isValid(Object obj) {
        switch (this.$r8$classId) {
            case 1:
                return Reporter.lambda$getAndClearBreadcrumbs$5((String) obj);
            default:
                return Reporter.lambda$getAndClearBreadcrumbsAsJson$6((JSONArray) obj);
        }
    }

    @Override // com.knotapi.knot.services.Reporter.BreadcrumbRetriever
    public Object retrieve(String str) {
        switch (this.$r8$classId) {
            case 0:
                return Reporter.getStoredBreadcrumbsAsJson(str);
            default:
                return Reporter.getStoredBreadcrumbs(str);
        }
    }
}
