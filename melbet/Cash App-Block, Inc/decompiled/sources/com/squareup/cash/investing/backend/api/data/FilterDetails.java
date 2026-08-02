package com.squareup.cash.investing.backend.api.data;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class FilterDetails {

    /* loaded from: classes6.dex */
    public final class Categories extends FilterDetails {
        public final ArrayList categories;
        public final String name;
        public final FilterToken token;

        /* renamed from: type, reason: collision with root package name */
        public final SyncInvestmentCategory.CategoryType f1151type;

        public Categories(FilterToken filterToken, String str, SyncInvestmentCategory.CategoryType categoryType, ArrayList arrayList) {
            str.getClass();
            categoryType.getClass();
            this.token = filterToken;
            this.name = str;
            this.f1151type = categoryType;
            this.categories = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Categories)) {
                return false;
            }
            Categories categories = (Categories) obj;
            return this.token.equals(categories.token) && Intrinsics.areEqual(this.name, categories.name) && this.f1151type == categories.f1151type && this.categories.equals(categories.categories);
        }

        @Override // com.squareup.cash.investing.backend.api.data.FilterDetails
        public final FilterToken getToken() {
            return this.token;
        }

        @Override // com.squareup.cash.investing.backend.api.data.FilterDetails
        public final SyncInvestmentCategory.CategoryType getType() {
            return this.f1151type;
        }

        public final int hashCode() {
            return this.categories.hashCode() + ((this.f1151type.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.value.hashCode() * 31, 31, this.name)) * 31);
        }

        public final String toString() {
            return "Categories(token=" + this.token + ", name=" + this.name + ", type=" + this.f1151type + ", categories=" + this.categories + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class Subfilters extends FilterDetails {
        public final List mapNodes;
        public final String name;
        public final List subfilters;
        public final FilterToken token;

        /* renamed from: type, reason: collision with root package name */
        public final SyncInvestmentCategory.CategoryType f1152type;

        public Subfilters(FilterToken filterToken, String str, SyncInvestmentCategory.CategoryType categoryType, List list, List list2) {
            str.getClass();
            list.getClass();
            list2.getClass();
            this.token = filterToken;
            this.name = str;
            this.f1152type = categoryType;
            this.subfilters = list;
            this.mapNodes = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subfilters)) {
                return false;
            }
            Subfilters subfilters = (Subfilters) obj;
            return this.token.equals(subfilters.token) && Intrinsics.areEqual(this.name, subfilters.name) && this.f1152type == subfilters.f1152type && Intrinsics.areEqual(this.subfilters, subfilters.subfilters) && Intrinsics.areEqual(this.mapNodes, subfilters.mapNodes);
        }

        @Override // com.squareup.cash.investing.backend.api.data.FilterDetails
        public final FilterToken getToken() {
            return this.token;
        }

        @Override // com.squareup.cash.investing.backend.api.data.FilterDetails
        public final SyncInvestmentCategory.CategoryType getType() {
            return this.f1152type;
        }

        public final int hashCode() {
            return this.mapNodes.hashCode() + Recorder$$ExternalSyntheticOutline2.m((this.f1152type.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.value.hashCode() * 31, 31, this.name)) * 31, 31, this.subfilters);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Subfilters(token=");
            sb.append(this.token);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", type=");
            sb.append(this.f1152type);
            sb.append(", subfilters=");
            sb.append(this.subfilters);
            sb.append(", mapNodes=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.mapNodes, ")");
        }
    }

    public abstract FilterToken getToken();

    public abstract SyncInvestmentCategory.CategoryType getType();
}
