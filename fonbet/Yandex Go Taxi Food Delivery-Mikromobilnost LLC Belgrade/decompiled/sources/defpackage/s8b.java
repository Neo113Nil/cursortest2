package defpackage;

import com.yandex.messaging.base.rights.ChatRightsFlag;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes15.dex */
public final class s8b extends ay4 {
    public static final /* synthetic */ kgx[] d = {new PropertyReference1Impl("canJoin", 0, "getCanJoin()Z", s8b.class), b64.x(qoi0.a, s8b.class, "canLeave", "getCanLeave()Z", 0), new PropertyReference1Impl("canRead", 0, "getCanRead()Z", s8b.class), new PropertyReference1Impl("canWrite", 0, "getCanWrite()Z", s8b.class), new PropertyReference1Impl("canChange", 0, "getCanChange()Z", s8b.class), new PropertyReference1Impl("canInvite", 0, "getCanInvite()Z", s8b.class), new PropertyReference1Impl("canAddUser", 0, "getCanAddUser()Z", s8b.class), new PropertyReference1Impl("canChangeRole", 0, "getCanChangeRole()Z", s8b.class), new PropertyReference1Impl("canSeeListMembers", 0, "getCanSeeListMembers()Z", s8b.class), new PropertyReference1Impl("canRemoveUsers", 0, "getCanRemoveUsers()Z", s8b.class), new PropertyReference1Impl("canMarkAsImportant", 0, "getCanMarkAsImportant()Z", s8b.class), new PropertyReference1Impl("canPinMessages", 0, "getCanPinMessages()Z", s8b.class), new PropertyReference1Impl("canChangeRights", 0, "getCanChangeRights()Z", s8b.class), new PropertyReference1Impl("canEditMessage", 0, "getCanEditMessage()Z", s8b.class), new PropertyReference1Impl("canWriteThreads", 0, "getCanWriteThreads()Z", s8b.class), new PropertyReference1Impl("canManageMeetings", 0, "getCanManageMeetings()Z", s8b.class), new PropertyReference1Impl("canTranslate", 0, "getCanTranslate()Z", s8b.class), new PropertyReference1Impl("canSendStickers", 0, "getCanSendStickers()Z", s8b.class), new PropertyReference1Impl("canChangeReactions", 0, "getCanChangeReactions()Z", s8b.class), new PropertyReference1Impl("canSendAttachments", 0, "getCanSendAttachments()Z", s8b.class), new PropertyReference1Impl("canDownloadFiles", 0, "getCanDownloadFiles()Z", s8b.class), new PropertyReference1Impl("canMakeExtCall", 0, "getCanMakeExtCall()Z", s8b.class), new PropertyReference1Impl("canShare", 0, "getCanShare()Z", s8b.class), new PropertyReference1Impl("guestsCanDownloadFiles", 0, "getGuestsCanDownloadFiles()Z", s8b.class), new PropertyReference1Impl("canCreateInviteLink", 0, "getCanCreateInviteLink()Z", s8b.class)};
    public static final wbz0 c = new wbz0();
    public static final efr e = new efr();

    public s8b(int i) {
        super(i, 0);
        ChatRightsFlag chatRightsFlag = ChatRightsFlag.Join;
    }

    @Override // defpackage.ay4
    public final ay4 c(int i) {
        return new s8b(i);
    }

    public final boolean j() {
        ChatRightsFlag chatRightsFlag = ChatRightsFlag.DownloadFiles;
        kgx kgxVar = d[20];
        return chatRightsFlag.c(this).booleanValue();
    }

    public final boolean k() {
        ChatRightsFlag chatRightsFlag = ChatRightsFlag.Read;
        kgx kgxVar = d[2];
        return chatRightsFlag.c(this).booleanValue();
    }

    public final boolean l() {
        ChatRightsFlag chatRightsFlag = ChatRightsFlag.Write;
        kgx kgxVar = d[3];
        return chatRightsFlag.c(this).booleanValue();
    }

    public final boolean m() {
        ChatRightsFlag chatRightsFlag = ChatRightsFlag.WriteThreads;
        kgx kgxVar = d[14];
        return chatRightsFlag.c(this).booleanValue();
    }
}
