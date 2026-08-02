package com.yandex.plus.pay.internal.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.eta;
import defpackage.j66;
import defpackage.qdb;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayWebSuccessScreenParams;", "", "pageTheme", "Lcom/yandex/plus/pay/internal/model/PlusPayWebSuccessScreenParams$PageTheme;", "invoiceIds", "", "", "<init>", "(Lcom/yandex/plus/pay/internal/model/PlusPayWebSuccessScreenParams$PageTheme;Ljava/util/List;)V", "getPageTheme", "()Lcom/yandex/plus/pay/internal/model/PlusPayWebSuccessScreenParams$PageTheme;", "getInvoiceIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PageTheme", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final /* data */ class PlusPayWebSuccessScreenParams {

    @NotNull
    private final List<String> invoiceIds;

    @NotNull
    private final PageTheme pageTheme;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayWebSuccessScreenParams$PageTheme;", "", "<init>", "(Ljava/lang/String;I)V", "LIGHT", "DARK", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class PageTheme {
        private static final /* synthetic */ qdb $ENTRIES;
        private static final /* synthetic */ PageTheme[] $VALUES;
        public static final PageTheme LIGHT = new PageTheme("LIGHT", 0);
        public static final PageTheme DARK = new PageTheme("DARK", 1);

        private static final /* synthetic */ PageTheme[] $values() {
            return new PageTheme[]{LIGHT, DARK};
        }

        static {
            PageTheme[] $values = $values();
            $VALUES = $values;
            $ENTRIES = j66.Q($values);
        }

        private PageTheme(String str, int i) {
        }

        @NotNull
        public static qdb getEntries() {
            return $ENTRIES;
        }

        public static PageTheme valueOf(String str) {
            return (PageTheme) Enum.valueOf(PageTheme.class, str);
        }

        public static PageTheme[] values() {
            return (PageTheme[]) $VALUES.clone();
        }
    }

    public PlusPayWebSuccessScreenParams(@NotNull PageTheme pageTheme, @NotNull List<String> list) {
        pageTheme.getClass();
        list.getClass();
        this.pageTheme = pageTheme;
        this.invoiceIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlusPayWebSuccessScreenParams copy$default(PlusPayWebSuccessScreenParams plusPayWebSuccessScreenParams, PageTheme pageTheme, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            pageTheme = plusPayWebSuccessScreenParams.pageTheme;
        }
        if ((i & 2) != 0) {
            list = plusPayWebSuccessScreenParams.invoiceIds;
        }
        return plusPayWebSuccessScreenParams.copy(pageTheme, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PageTheme getPageTheme() {
        return this.pageTheme;
    }

    @NotNull
    public final List<String> component2() {
        return this.invoiceIds;
    }

    @NotNull
    public final PlusPayWebSuccessScreenParams copy(@NotNull PageTheme pageTheme, @NotNull List<String> invoiceIds) {
        pageTheme.getClass();
        invoiceIds.getClass();
        return new PlusPayWebSuccessScreenParams(pageTheme, invoiceIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayWebSuccessScreenParams)) {
            return false;
        }
        PlusPayWebSuccessScreenParams plusPayWebSuccessScreenParams = (PlusPayWebSuccessScreenParams) other;
        return this.pageTheme == plusPayWebSuccessScreenParams.pageTheme && Intrinsics.d(this.invoiceIds, plusPayWebSuccessScreenParams.invoiceIds);
    }

    @NotNull
    public final List<String> getInvoiceIds() {
        return this.invoiceIds;
    }

    @NotNull
    public final PageTheme getPageTheme() {
        return this.pageTheme;
    }

    public int hashCode() {
        return this.invoiceIds.hashCode() + (this.pageTheme.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PlusPayWebSuccessScreenParams(pageTheme=");
        sb.append(this.pageTheme);
        sb.append(", invoiceIds=");
        return eta.h(sb, this.invoiceIds, ')');
    }
}
