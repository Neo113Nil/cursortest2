package com.squareup.cash.investingcrypto.presenters.news;

import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/investingcrypto/presenters/news/DuplicateNewsKeyError;", "Lcom/squareup/cash/observability/types/ReportedError;", "presenters"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DuplicateNewsKeyError extends ReportedError {
    public final ErrorFeature errorFeature;
    public final Set features;
    public final Set keys;
    public final NewsKind kind;

    public DuplicateNewsKeyError(NewsKind newsKind, Set set, ErrorFeature errorFeature) {
        newsKind.getClass();
        set.getClass();
        this.kind = newsKind;
        this.keys = set;
        this.errorFeature = errorFeature;
        this.features = SetsKt__SetsJVMKt.setOf(errorFeature);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuplicateNewsKeyError)) {
            return false;
        }
        DuplicateNewsKeyError duplicateNewsKeyError = (DuplicateNewsKeyError) obj;
        return Intrinsics.areEqual(this.kind, duplicateNewsKeyError.kind) && Intrinsics.areEqual(this.keys, duplicateNewsKeyError.keys) && Intrinsics.areEqual(this.errorFeature, duplicateNewsKeyError.errorFeature);
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Duplicate news articles detected on " + this.kind + ": " + this.keys;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final String getTitle() {
        return "Duplicate News Articles";
    }

    public final int hashCode() {
        return this.errorFeature.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.kind.hashCode() * 31, 31, this.keys);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "DuplicateNewsKeyError(kind=" + this.kind + ", keys=" + this.keys + ", errorFeature=" + this.errorFeature + ")";
    }
}
