package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uhd {
    public static final mvn b;
    public static final uhd c;
    public static final /* synthetic */ uhd[] d;
    public static final /* synthetic */ rdb e;
    public final String a;

    static {
        uhd uhdVar = new uhd("YANDEX_MIDI", 0, "yandexmidi");
        uhd uhdVar2 = new uhd("YANDEX_LIGHT", 1, "yandexmicro");
        uhd uhdVar3 = new uhd("YANDEX_MINI", 2, "yandexmini");
        uhd uhdVar4 = new uhd("YANDEX_MINI_2", 3, "yandexmini_2");
        uhd uhdVar5 = new uhd("YANDEX_STATION", 4, "yandexstation");
        uhd uhdVar6 = new uhd("YANDEX_STATION_MAX", 5, "yandexstation_2");
        uhd uhdVar7 = new uhd("YANDEX_TV_GOYA", 6, "goya");
        uhd uhdVar8 = new uhd("YANDEX_TV_MAGRITTE", 7, "magritte");
        uhd uhdVar9 = new uhd("SCREEN_XIAOMI", 8, "quinglong");
        uhd uhdVar10 = new uhd("SCREEN_CENTAUR", 9, "centaur");
        uhd uhdVar11 = new uhd("SCREEN_CHIRON", 10, "chiron");
        uhd uhdVar12 = new uhd("JBL_LINK_PORTABLE", 11, "jbl_link_portable");
        uhd uhdVar13 = new uhd("JBL_LINK_MUSIC", 12, "jbl_link_music");
        uhd uhdVar14 = new uhd("OTHER_DEVICE_WITH_ALICE", 13, "other_device_alice");
        c = uhdVar14;
        uhd[] uhdVarArr = {uhdVar, uhdVar2, uhdVar3, uhdVar4, uhdVar5, uhdVar6, uhdVar7, uhdVar8, uhdVar9, uhdVar10, uhdVar11, uhdVar12, uhdVar13, uhdVar14, new uhd("CUCUMBER", 14, "cucumber"), new uhd("PLUM", 15, "plum"), new uhd("BLACKTHORN", 16, "blackthorn")};
        d = uhdVarArr;
        e = new rdb(uhdVarArr);
        b = new mvn(24);
    }

    public uhd(String str, int i, String str2) {
        this.a = str2;
    }

    public static uhd valueOf(String str) {
        return (uhd) Enum.valueOf(uhd.class, str);
    }

    public static uhd[] values() {
        return (uhd[]) d.clone();
    }
}
