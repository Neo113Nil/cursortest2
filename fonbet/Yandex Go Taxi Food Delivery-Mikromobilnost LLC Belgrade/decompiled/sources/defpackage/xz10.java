package defpackage;

import android.net.Uri;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.action.MessagingAction;
import com.yandex.messaging.internal.ChatAlias;
import com.yandex.messaging.internal.InviteChat;
import com.yandex.messaging.internal.PrivateChat;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.StaffChat;
import com.yandex.messaging.links.a;
import com.yandex.messaging.ui.timeline.ChatOpenTarget;
import com.yandex.messaging.uri.UtmSourceValue;

/* loaded from: classes15.dex */
public final /* synthetic */ class xz10 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ Uri c;

    public /* synthetic */ xz10(Uri uri, a aVar) {
        this.a = 13;
        this.c = uri;
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        int i = this.a;
        MessagingAction.NoAction noAction = MessagingAction.NoAction.a;
        String str2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        int i2 = 2;
        a aVar = this.b;
        Uri uri = this.c;
        switch (i) {
            case 0:
                w610 w610Var = (w610) obj;
                String str3 = (String) ((u1l) w610Var.a()).get(1);
                String str4 = (String) ((u1l) w610Var.a()).get(2);
                InviteChat inviteChat = new InviteChat(str3);
                aVar.getClass();
                return new MessagingAction.OpenChat(inviteChat, a.d(uri, "text"), null, str4.length() > 0 ? new ServerMessageRef(Long.parseLong(str4), null, 2, null) : null, true, false, null, false, null, false, a.d(uri, "context"), false, false, null, 23524);
            case 1:
                w610 w610Var2 = (w610) obj;
                String str5 = (String) ((u1l) w610Var2.a()).get(1);
                String str6 = (String) ((u1l) w610Var2.a()).get(2);
                InviteChat inviteChat2 = new InviteChat(str5);
                aVar.getClass();
                return new MessagingAction.OpenChat(inviteChat2, a.d(uri, "text"), null, str6.length() > 0 ? new ServerMessageRef(Long.parseLong(str6), null, 2, null) : null, true, false, null, false, null, false, a.d(uri, "context"), false, false, null, 23524);
            case 2:
                PrivateChat privateChat = new PrivateChat((String) ((u1l) ((w610) obj).a()).get(1), objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0);
                aVar.getClass();
                return new MessagingAction.OpenChat(privateChat, a.d(uri, "text"), null, null, false, false, null, false, null, false, a.d(uri, "context"), false, false, null, 31740);
            case 3:
                PrivateChat privateChat2 = new PrivateChat((String) ((u1l) ((w610) obj).a()).get(1), objArr4 == true ? 1 : 0, i2, objArr3 == true ? 1 : 0);
                aVar.getClass();
                return new MessagingAction.OpenChat(privateChat2, null, null, null, false, false, null, false, null, false, null, false, jl40.l(a.d(uri, "utm_source"), UtmSourceValue.Invite.getFrom()), null, 28670);
            case 4:
                w610 w610Var3 = (w610) obj;
                String str7 = (String) ((u1l) w610Var3.a()).get(1);
                String str8 = (String) ((u1l) w610Var3.a()).get(2);
                InviteChat inviteChat3 = new InviteChat(str7);
                aVar.getClass();
                return new MessagingAction.OpenChat(inviteChat3, a.d(uri, "text"), null, str8.length() > 0 ? new ServerMessageRef(Long.parseLong(str8), null, 2, null) : null, true, false, null, false, null, false, a.d(uri, "context"), false, false, null, 23524);
            case 5:
                w610 w610Var4 = (w610) obj;
                String str9 = (String) ((u1l) w610Var4.a()).get(1);
                String str10 = (String) ((u1l) w610Var4.a()).get(2);
                ChatAlias chatAlias = new ChatAlias(str9);
                ServerMessageRef serverMessageRef = str10.length() > 0 ? new ServerMessageRef(Long.parseLong(str10), null, 2, null) : null;
                aVar.getClass();
                return new MessagingAction.OpenChat(chatAlias, a.d(uri, "text"), null, serverMessageRef, false, false, null, false, null, false, a.d(uri, "context"), false, false, null, 31732);
            case 6:
                w610 w610Var5 = (w610) obj;
                String str11 = (String) ((u1l) w610Var5.a()).get(1);
                String str12 = (String) ((u1l) w610Var5.a()).get(2);
                ExistingChatRequest a = p8b.a(str11);
                aVar.getClass();
                return new MessagingAction.OpenChat(a, a.d(uri, "text"), null, str12.length() > 0 ? new ServerMessageRef(Long.parseLong(str12), null, 2, null) : null, false, false, null, false, null, false, a.d(uri, "context"), false, false, null, 31732);
            case 7:
                w610 w610Var6 = (w610) obj;
                String str13 = (String) ((u1l) w610Var6.a()).get(1);
                String str14 = (String) ((u1l) w610Var6.a()).get(2);
                ExistingChatRequest a2 = p8b.a(str13);
                aVar.getClass();
                return new MessagingAction.OpenChat(a2, a.d(uri, "text"), null, str14.length() > 0 ? new ServerMessageRef(Long.parseLong(str14), null, 2, null) : null, false, false, null, false, null, false, a.d(uri, "context"), false, false, null, 31732);
            case 8:
                w610 w610Var7 = (w610) obj;
                String str15 = (String) ((u1l) w610Var7.a()).get(1);
                String str16 = (String) ((u1l) w610Var7.a()).get(2);
                ChatAlias chatAlias2 = new ChatAlias(str15);
                ServerMessageRef serverMessageRef2 = str16.length() > 0 ? new ServerMessageRef(Long.parseLong(str16), null, 2, null) : null;
                aVar.getClass();
                return new MessagingAction.OpenChat(chatAlias2, a.d(uri, "text"), null, serverMessageRef2, false, false, null, false, null, false, a.d(uri, "context"), false, false, null, 31732);
            case 9:
                String[] strArr = {"user_id", "userId"};
                aVar.getClass();
                boolean z = false;
                int i3 = 0;
                while (true) {
                    if (i3 >= 2) {
                        str = null;
                    } else {
                        str = a.d(uri, strArr[i3]);
                        if (str == null) {
                            i3++;
                        }
                    }
                }
                if (str == null) {
                    return noAction;
                }
                PrivateChat privateChat3 = new PrivateChat(str, objArr6 == true ? 1 : 0, i2, objArr5 == true ? 1 : 0);
                String d = a.d(uri, "text");
                String d2 = a.d(uri, "payload");
                if (uri != null) {
                    try {
                        z = uri.getBooleanQueryParameter("invite", false);
                    } catch (UnsupportedOperationException unused) {
                    }
                }
                return new MessagingAction.OpenChat(privateChat3, d, d2, null, z, false, null, false, null, false, a.d(uri, "context"), false, false, a.d(uri, "action"), 15336);
            case 10:
                aVar.getClass();
                String d3 = a.d(uri, "invite_hash");
                if (d3 == null) {
                    return noAction;
                }
                InviteChat inviteChat4 = new InviteChat(d3);
                String d4 = a.d(uri, "text");
                String d5 = a.d(uri, "payload");
                u6b u6bVar = ChatOpenTarget.Companion;
                String d6 = a.d(uri, "target");
                u6bVar.getClass();
                return new MessagingAction.OpenChat(inviteChat4, d4, d5, null, true, false, null, false, u6b.a(d6), false, a.d(uri, "context"), false, false, null, 23272);
            case 11:
                PrivateChat privateChat4 = new PrivateChat((String) ((u1l) ((w610) obj).a()).get(1), str2, i2, objArr7 == true ? 1 : 0);
                aVar.getClass();
                return new MessagingAction.OpenChat(privateChat4, a.d(uri, "text"), null, null, false, false, null, false, null, false, a.d(uri, "context"), false, false, null, 31740);
            case 12:
                w610 w610Var8 = (w610) obj;
                String str17 = (String) ((u1l) w610Var8.a()).get(1);
                String str18 = (String) ((u1l) w610Var8.a()).get(2);
                ChatAlias chatAlias3 = new ChatAlias(str17);
                ServerMessageRef serverMessageRef3 = str18.length() > 0 ? new ServerMessageRef(Long.parseLong(str18), null, 2, null) : null;
                aVar.getClass();
                return new MessagingAction.OpenChat(chatAlias3, a.d(uri, "text"), null, serverMessageRef3, false, false, null, false, null, false, a.d(uri, "context"), false, false, null, 31732);
            default:
                String str19 = (String) kotlin.collections.a.b0(uri.getPathSegments());
                if (str19 == null) {
                    str19 = "";
                }
                StaffChat staffChat = new StaffChat(str19);
                aVar.getClass();
                return new MessagingAction.OpenChat(staffChat, null, null, null, false, false, null, false, null, false, null, false, false, a.d(uri, "action"), 16382);
        }
    }

    public /* synthetic */ xz10(a aVar, Uri uri, int i) {
        this.a = i;
        this.b = aVar;
        this.c = uri;
    }
}
