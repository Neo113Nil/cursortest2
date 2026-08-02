package ru.yandex.taxi.communications.api.dto.ticket;

import defpackage.f3z0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.x1z0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/communications/api/dto/ticket/TicketTopAsset;", "", "Companion", "ru/yandex/taxi/communications/api/dto/ticket/h", "TicketTopAssetType", "TicketTopAssetReplayMode", "ru/yandex/taxi/communications/api/dto/ticket/f", "f3z0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TicketTopAsset {
    public static final f3z0 Companion = new f3z0();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(5)), null};
    public final String a;
    public final TicketTopAssetType b;
    public final h c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/communications/api/dto/ticket/TicketTopAsset$TicketTopAssetReplayMode;", "", "Companion", "ru/yandex/taxi/communications/api/dto/ticket/i", "FIXED", "FOREVER", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TicketTopAssetReplayMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TicketTopAssetReplayMode[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final i Companion;
        public static final TicketTopAssetReplayMode FIXED;
        public static final TicketTopAssetReplayMode FOREVER;

        static {
            TicketTopAssetReplayMode ticketTopAssetReplayMode = new TicketTopAssetReplayMode("FIXED", 0);
            FIXED = ticketTopAssetReplayMode;
            TicketTopAssetReplayMode ticketTopAssetReplayMode2 = new TicketTopAssetReplayMode("FOREVER", 1);
            FOREVER = ticketTopAssetReplayMode2;
            TicketTopAssetReplayMode[] ticketTopAssetReplayModeArr = {ticketTopAssetReplayMode, ticketTopAssetReplayMode2};
            $VALUES = ticketTopAssetReplayModeArr;
            $ENTRIES = kotlin.enums.a.a(ticketTopAssetReplayModeArr);
            Companion = new i();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(7));
        }

        public static TicketTopAssetReplayMode valueOf(String str) {
            return (TicketTopAssetReplayMode) Enum.valueOf(TicketTopAssetReplayMode.class, str);
        }

        public static TicketTopAssetReplayMode[] values() {
            return (TicketTopAssetReplayMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/communications/api/dto/ticket/TicketTopAsset$TicketTopAssetType;", "", "Companion", "ru/yandex/taxi/communications/api/dto/ticket/j", "IMAGE", "LOTTIE", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TicketTopAssetType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TicketTopAssetType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final j Companion;
        public static final TicketTopAssetType IMAGE;
        public static final TicketTopAssetType LOTTIE;

        static {
            TicketTopAssetType ticketTopAssetType = new TicketTopAssetType("IMAGE", 0);
            IMAGE = ticketTopAssetType;
            TicketTopAssetType ticketTopAssetType2 = new TicketTopAssetType("LOTTIE", 1);
            LOTTIE = ticketTopAssetType2;
            TicketTopAssetType[] ticketTopAssetTypeArr = {ticketTopAssetType, ticketTopAssetType2};
            $VALUES = ticketTopAssetTypeArr;
            $ENTRIES = kotlin.enums.a.a(ticketTopAssetTypeArr);
            Companion = new j();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(8));
        }

        public static TicketTopAssetType valueOf(String str) {
            return (TicketTopAssetType) Enum.valueOf(TicketTopAssetType.class, str);
        }

        public static TicketTopAssetType[] values() {
            return (TicketTopAssetType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TicketTopAsset(int i, String str, TicketTopAssetType ticketTopAssetType, h hVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = TicketTopAssetType.IMAGE;
        } else {
            this.b = ticketTopAssetType;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = hVar;
        }
    }

    /* renamed from: a, reason: from getter */
    public final TicketTopAssetType getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketTopAsset)) {
            return false;
        }
        TicketTopAsset ticketTopAsset = (TicketTopAsset) obj;
        return jl40.l(this.a, ticketTopAsset.a) && this.b == ticketTopAsset.b && jl40.l(this.c, ticketTopAsset.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        h hVar = this.c;
        return hashCode + (hVar == null ? 0 : hVar.hashCode());
    }

    public final String toString() {
        return "TicketTopAsset(url=" + this.a + ", type=" + this.b + ", replay=" + this.c + Extension.C_BRAKE;
    }

    public TicketTopAsset() {
        this(0);
    }

    public TicketTopAsset(int i) {
        TicketTopAssetType ticketTopAssetType = TicketTopAssetType.IMAGE;
        this.a = "";
        this.b = ticketTopAssetType;
        this.c = null;
    }
}
