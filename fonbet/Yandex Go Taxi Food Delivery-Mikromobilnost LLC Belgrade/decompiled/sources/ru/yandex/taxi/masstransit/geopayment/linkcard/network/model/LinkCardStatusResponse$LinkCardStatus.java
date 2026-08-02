package ru.yandex.taxi.masstransit.geopayment.linkcard.network.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.wky;
import defpackage.xky;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"ru/yandex/taxi/masstransit/geopayment/linkcard/network/model/LinkCardStatusResponse$LinkCardStatus", "", "Lru/yandex/taxi/masstransit/geopayment/linkcard/network/model/LinkCardStatusResponse$LinkCardStatus;", "Companion", "xky", "IN_PROGRESS", "SUCCESS", "ERROR", "CANCELLED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LinkCardStatusResponse$LinkCardStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LinkCardStatusResponse$LinkCardStatus[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final LinkCardStatusResponse$LinkCardStatus CANCELLED;
    public static final xky Companion;
    public static final LinkCardStatusResponse$LinkCardStatus ERROR;
    public static final LinkCardStatusResponse$LinkCardStatus IN_PROGRESS;
    public static final LinkCardStatusResponse$LinkCardStatus SUCCESS;

    static {
        LinkCardStatusResponse$LinkCardStatus linkCardStatusResponse$LinkCardStatus = new LinkCardStatusResponse$LinkCardStatus("IN_PROGRESS", 0);
        IN_PROGRESS = linkCardStatusResponse$LinkCardStatus;
        LinkCardStatusResponse$LinkCardStatus linkCardStatusResponse$LinkCardStatus2 = new LinkCardStatusResponse$LinkCardStatus("SUCCESS", 1);
        SUCCESS = linkCardStatusResponse$LinkCardStatus2;
        LinkCardStatusResponse$LinkCardStatus linkCardStatusResponse$LinkCardStatus3 = new LinkCardStatusResponse$LinkCardStatus("ERROR", 2);
        ERROR = linkCardStatusResponse$LinkCardStatus3;
        LinkCardStatusResponse$LinkCardStatus linkCardStatusResponse$LinkCardStatus4 = new LinkCardStatusResponse$LinkCardStatus("CANCELLED", 3);
        CANCELLED = linkCardStatusResponse$LinkCardStatus4;
        LinkCardStatusResponse$LinkCardStatus[] linkCardStatusResponse$LinkCardStatusArr = {linkCardStatusResponse$LinkCardStatus, linkCardStatusResponse$LinkCardStatus2, linkCardStatusResponse$LinkCardStatus3, linkCardStatusResponse$LinkCardStatus4};
        $VALUES = linkCardStatusResponse$LinkCardStatusArr;
        $ENTRIES = a.a(linkCardStatusResponse$LinkCardStatusArr);
        Companion = new xky();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wky(0));
    }

    public static LinkCardStatusResponse$LinkCardStatus valueOf(String str) {
        return (LinkCardStatusResponse$LinkCardStatus) Enum.valueOf(LinkCardStatusResponse$LinkCardStatus.class, str);
    }

    public static LinkCardStatusResponse$LinkCardStatus[] values() {
        return (LinkCardStatusResponse$LinkCardStatus[]) $VALUES.clone();
    }
}
