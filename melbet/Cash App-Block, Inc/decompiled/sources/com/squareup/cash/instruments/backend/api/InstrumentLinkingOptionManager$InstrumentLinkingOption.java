package com.squareup.cash.instruments.backend.api;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InstrumentLinkingOptionManager$InstrumentLinkingOption {
    public final List cashInstrumentType;
    public final String description;
    public final Long feeBps;
    public final LinkingAction linkingAction;
    public final boolean showInInstrumentSelector;
    public final String title;

    public final class LinkingAction {
        public final String description;
        public final LinkType linkType;
        public final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class LinkType {
            public static final /* synthetic */ LinkType[] $VALUES;
            public static final LinkType LINK;
            public static final LinkType REPLACE;

            static {
                LinkType linkType = new LinkType("LINK", 0);
                LINK = linkType;
                LinkType linkType2 = new LinkType("REPLACE", 1);
                REPLACE = linkType2;
                $VALUES = new LinkType[]{linkType, linkType2};
            }

            public static LinkType valueOf(String str) {
                return (LinkType) Enum.valueOf(LinkType.class, str);
            }

            public static LinkType[] values() {
                return (LinkType[]) $VALUES.clone();
            }
        }

        public LinkingAction(LinkType linkType, String str, String str2) {
            this.linkType = linkType;
            this.title = str;
            this.description = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkingAction)) {
                return false;
            }
            LinkingAction linkingAction = (LinkingAction) obj;
            return this.linkType == linkingAction.linkType && this.title.equals(linkingAction.title) && this.description.equals(linkingAction.description);
        }

        public final int hashCode() {
            return this.description.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.linkType.hashCode() * 31, 31, this.title);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LinkingAction(linkType=");
            sb.append(this.linkType);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", description=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.description, ")");
        }
    }

    public InstrumentLinkingOptionManager$InstrumentLinkingOption(List list, String str, String str2, Long l, boolean z, LinkingAction linkingAction) {
        list.getClass();
        this.cashInstrumentType = list;
        this.title = str;
        this.description = str2;
        this.feeBps = l;
        this.showInInstrumentSelector = z;
        this.linkingAction = linkingAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentLinkingOptionManager$InstrumentLinkingOption)) {
            return false;
        }
        InstrumentLinkingOptionManager$InstrumentLinkingOption instrumentLinkingOptionManager$InstrumentLinkingOption = (InstrumentLinkingOptionManager$InstrumentLinkingOption) obj;
        return Intrinsics.areEqual(this.cashInstrumentType, instrumentLinkingOptionManager$InstrumentLinkingOption.cashInstrumentType) && Intrinsics.areEqual(this.title, instrumentLinkingOptionManager$InstrumentLinkingOption.title) && Intrinsics.areEqual(this.description, instrumentLinkingOptionManager$InstrumentLinkingOption.description) && this.feeBps.equals(instrumentLinkingOptionManager$InstrumentLinkingOption.feeBps) && this.showInInstrumentSelector == instrumentLinkingOptionManager$InstrumentLinkingOption.showInInstrumentSelector && Intrinsics.areEqual(this.linkingAction, instrumentLinkingOptionManager$InstrumentLinkingOption.linkingAction);
    }

    public final int hashCode() {
        int hashCode = this.cashInstrumentType.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(ViewEvent$State$EnumUnboxingLocalUtility.m(this.feeBps, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.showInInstrumentSelector);
        LinkingAction linkingAction = this.linkingAction;
        return m + (linkingAction != null ? linkingAction.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = Request$Priority$EnumUnboxingLocalUtility.m("InstrumentLinkingOption(cashInstrumentType=", ", title=", this.title, ", description=", this.cashInstrumentType);
        Request$Priority$EnumUnboxingLocalUtility.m(this.feeBps, this.description, ", feeBps=", ", showInInstrumentSelector=", m);
        m.append(this.showInInstrumentSelector);
        m.append(", linkingAction=");
        m.append(this.linkingAction);
        m.append(")");
        return m.toString();
    }
}
