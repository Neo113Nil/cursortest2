package defpackage;

import com.yandex.messaging.core.net.entities.FoldersBucket;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public abstract class wwr {
    public static final FoldersBucket.FolderData a(jjf jjfVar) {
        FoldersBucket.FolderData folderData = new FoldersBucket.FolderData();
        folderData.id = jjfVar.a;
        folderData.name = jjfVar.c;
        FoldersBucket.FolderIcon folderIcon = new FoldersBucket.FolderIcon();
        folderIcon.value = 0;
        folderData.icon = folderIcon;
        folderData.includedChatIds = a.J0(jjfVar.e);
        folderData.excludedChatIds = a.J0(jjfVar.f);
        folderData.includedFilterIds = a.J0(jjfVar.g);
        folderData.excludedFilterIds = a.J0(jjfVar.h);
        return folderData;
    }
}
