package com.braze.support;

import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/braze/support/DataStoreUtils;", "", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DataStoreUtils {
    public static final DataStoreUtils INSTANCE = new DataStoreUtils();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    public final class a implements Function0<String> {
        final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to parse JSON list: '", this.a, "'");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    public final class b implements Function0<String> {
        final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to parse JSON map: '", this.a, "'");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    public final class e implements Function0<String> {
        public static final e a = new e();

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to serialize data to JSON";
        }
    }

    private DataStoreUtils() {
    }
}
