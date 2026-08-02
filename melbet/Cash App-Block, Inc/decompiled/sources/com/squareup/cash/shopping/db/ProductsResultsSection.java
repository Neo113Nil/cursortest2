package com.squareup.cash.shopping.db;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.customersearch.api.SearchCommonMessageSection;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v1.model.Section;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProductsResultsSection {
    public final Button footerButton;
    public final long id;
    public final Section.Layout layout;
    public final SearchCommonMessageSection message;
    public final Text subtitle;
    public final Text title;

    /* renamed from: type, reason: collision with root package name */
    public final String f1204type;

    public ProductsResultsSection(long j, String str, Text text, Text text2, Section.Layout layout, SearchCommonMessageSection searchCommonMessageSection, Button button) {
        str.getClass();
        this.id = j;
        this.f1204type = str;
        this.title = text;
        this.subtitle = text2;
        this.layout = layout;
        this.message = searchCommonMessageSection;
        this.footerButton = button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductsResultsSection)) {
            return false;
        }
        ProductsResultsSection productsResultsSection = (ProductsResultsSection) obj;
        return this.id == productsResultsSection.id && Intrinsics.areEqual(this.f1204type, productsResultsSection.f1204type) && Intrinsics.areEqual(this.title, productsResultsSection.title) && Intrinsics.areEqual(this.subtitle, productsResultsSection.subtitle) && this.layout == productsResultsSection.layout && Intrinsics.areEqual(this.message, productsResultsSection.message) && Intrinsics.areEqual(this.footerButton, productsResultsSection.footerButton);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.f1204type);
        Text text = this.title;
        int hashCode = (m + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.subtitle;
        int hashCode2 = (hashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
        Section.Layout layout = this.layout;
        int hashCode3 = (hashCode2 + (layout == null ? 0 : layout.hashCode())) * 31;
        SearchCommonMessageSection searchCommonMessageSection = this.message;
        int hashCode4 = (hashCode3 + (searchCommonMessageSection == null ? 0 : searchCommonMessageSection.hashCode())) * 31;
        Button button = this.footerButton;
        return hashCode4 + (button != null ? button.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("ProductsResultsSection(id=", this.id, ", type=", this.f1204type);
        m.append(", title=");
        m.append(this.title);
        m.append(", subtitle=");
        m.append(this.subtitle);
        m.append(", layout=");
        m.append(this.layout);
        m.append(", message=");
        m.append(this.message);
        m.append(", footerButton=");
        m.append(this.footerButton);
        m.append(")");
        return m.toString();
    }
}
