package defpackage;

import android.content.Context;
import com.yandex.messaging.internal.entities.MediaFileMessageData;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.VoiceMessageData;
import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes15.dex */
public final class ty10 implements Comparable {
    public final /* synthetic */ uy10 A;
    public final Date a;
    public final String b;
    public final String c;
    public final MessageData w;
    public final String x;
    public final wab y;
    public final boolean z;

    public ty10(uy10 uy10Var, yab yabVar) {
        this.A = uy10Var;
        Date T = yabVar.T();
        this.a = T;
        this.b = uy10Var.j.format(T);
        this.c = uy10Var.k.format(T);
        this.w = yabVar.R();
        this.x = yabVar.a();
        this.y = yabVar.F0();
        this.z = !yabVar.a1();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a(boolean z) {
        String str;
        int i;
        String str2;
        uy10 uy10Var = this.A;
        noy0 noy0Var = uy10Var.e;
        ij10 ij10Var = uy10Var.d;
        Context context = uy10Var.a;
        MessageData messageData = this.w;
        wab wabVar = this.y;
        if (wabVar != null) {
            if (!z || !this.z) {
                wabVar = null;
            }
            if (wabVar != null) {
                str = wabVar.c;
                ArrayList arrayList = new ArrayList();
                i = messageData.type;
                if (i != 0) {
                    arrayList.add(((v3k0) noy0Var).b(2, (String) ij10Var.a(str).a));
                    return arrayList;
                }
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        arrayList.add(context.getString(oyh0.chat_share_geolocation_stub));
                        return arrayList;
                    }
                    if (i == 4) {
                        arrayList.add(context.getString(oyh0.chat_share_sticker_stub));
                        return arrayList;
                    }
                    if (i == 6) {
                        unr0.B("[File] ", ((MediaFileMessageData) messageData).fileName, arrayList);
                        return arrayList;
                    }
                    if (i != 1001) {
                        if (i == 10) {
                            arrayList.add(context.getString(oyh0.chat_share_gallery_stub));
                            if (str != null && (str2 = (String) ij10Var.a(str).a) != null && str2.length() != 0) {
                                arrayList.add(((v3k0) noy0Var).b(2, str2));
                            }
                            return arrayList;
                        }
                        if (i == 11) {
                            arrayList.add(ne10.a((VoiceMessageData) messageData, context.getResources()));
                            return arrayList;
                        }
                        if (ydz.a.a()) {
                            ydz.b("MessagesSharer", "Unhandled message type " + messageData.type);
                        }
                        arrayList.add(context.getString(oyh0.chat_share_unknown_message));
                        return arrayList;
                    }
                }
                unr0.B("[Media] ", ((MediaFileMessageData) messageData).fileName, arrayList);
                return arrayList;
            }
        }
        str = messageData.text;
        ArrayList arrayList2 = new ArrayList();
        i = messageData.type;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList b(boolean z) {
        String str;
        int i;
        String str2;
        uy10 uy10Var = this.A;
        noy0 noy0Var = uy10Var.e;
        ij10 ij10Var = uy10Var.d;
        Context context = uy10Var.a;
        MessageData messageData = this.w;
        wab wabVar = this.y;
        if (wabVar != null) {
            if (!z || !this.z) {
                wabVar = null;
            }
            if (wabVar != null) {
                str = wabVar.c;
                ArrayList arrayList = new ArrayList();
                i = messageData.type;
                if (i != 0) {
                    arrayList.add(((v3k0) noy0Var).b(1, (String) ij10Var.a(str).a).toString());
                    return arrayList;
                }
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        arrayList.add(context.getString(oyh0.chat_share_geolocation_stub));
                        return arrayList;
                    }
                    if (i == 4) {
                        arrayList.add(context.getString(oyh0.chat_share_sticker_stub));
                        return arrayList;
                    }
                    if (i == 6) {
                        unr0.B("[File] ", ((MediaFileMessageData) messageData).fileName, arrayList);
                        return arrayList;
                    }
                    if (i != 1001) {
                        if (i == 10) {
                            arrayList.add(context.getString(oyh0.chat_share_gallery_stub));
                            if (str != null && (str2 = (String) ij10Var.a(str).a) != null && str2.length() != 0) {
                                arrayList.add(((v3k0) noy0Var).b(1, str2).toString());
                            }
                            return arrayList;
                        }
                        if (i == 11) {
                            arrayList.add(ne10.a((VoiceMessageData) messageData, context.getResources()));
                            return arrayList;
                        }
                        if (ydz.a.a()) {
                            ydz.b("MessagesSharer", "Unhandled message type " + messageData.type);
                        }
                        arrayList.add(context.getString(oyh0.chat_share_unknown_message));
                        return arrayList;
                    }
                }
                unr0.B("[Media] ", ((MediaFileMessageData) messageData).fileName, arrayList);
                return arrayList;
            }
        }
        str = messageData.text;
        ArrayList arrayList2 = new ArrayList();
        i = messageData.type;
        if (i != 0) {
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.compareTo(((ty10) obj).a);
    }
}
