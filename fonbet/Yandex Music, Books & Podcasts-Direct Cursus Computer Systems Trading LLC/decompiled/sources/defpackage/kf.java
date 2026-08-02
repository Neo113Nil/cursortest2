package defpackage;

import com.connectsdk.service.command.ServiceCommand;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public enum kf {
    d(R.string.dialog_action_download, "DOWNLOAD", "DownloadAction.DOWNLOAD"),
    e(R.string.dialog_action_delete_from_phone_memory, ServiceCommand.TYPE_DEL, "DownloadAction.DELETE");

    public final int a;
    public final int b;
    public final String c;

    kf(int i, String str, String str2) {
        this.a = r2;
        this.b = i;
        this.c = str2;
    }
}
