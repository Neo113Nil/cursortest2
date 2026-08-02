package defpackage;

import com.connectsdk.service.airplay.PListParser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class boj {
    public static final qee d;
    public static final /* synthetic */ boj[] e;
    public static final /* synthetic */ rdb f;
    public final String a;
    public final String b;
    public final String c;

    static {
        boj[] bojVarArr = {new boj(0, "DOWNLOAD_INFO", "download_info", "tracks", "download-info"), new boj(1, "FILE_DOWNLOAD_INFO", "file_download_info", "file-download-info", null), new boj(2, "STRM_MASTER_PLAY_LIST", "strm_master_play_list", "music", "master.m3u8"), new boj(3, "STRM_MEDIA_PLAY_LIST", "strm_media_play_list", "music", "index-a1.m3u8"), new boj(4, "STRM_KEY", "strm_key", PListParser.TAG_KEY, null), new boj(5, "GET_FILE_INFO", "get_file_info", "get-file-info", null)};
        e = bojVarArr;
        f = new rdb(bojVarArr);
        d = new qee(29);
    }

    public boj(int i, String str, String str2, String str3, String str4) {
        this.a = str2;
        this.b = str3;
        this.c = str4;
    }

    public static boj valueOf(String str) {
        return (boj) Enum.valueOf(boj.class, str);
    }

    public static boj[] values() {
        return (boj[]) e.clone();
    }
}
