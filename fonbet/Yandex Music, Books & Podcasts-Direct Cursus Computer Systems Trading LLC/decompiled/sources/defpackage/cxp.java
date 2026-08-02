package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.yandex.music.shared.utils.file.SharedFileProvider;
import java.io.File;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class cxp {
    public final eg0 a;

    public cxp(eg0 eg0Var) {
        this.a = eg0Var;
    }

    public final Intent a(zwp zwpVar, Context context, String str) {
        eg0 eg0Var = this.a;
        nxp nxpVar = (nxp) ((jyr) eg0Var.e).getValue();
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        nxpVar.getClass();
        String a = nxp.a(zwpVar, str, uuid);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", a);
        String string = context.getString(eg0Var.a);
        string.getClass();
        if (string.length() <= 0) {
            string = null;
        }
        if (string != null) {
            intent.putExtra("android.intent.extra.TITLE", string);
        }
        return intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0107, code lost:
    
        if (c(r10, r11, r4, r5, r6) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0141, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013f, code lost:
    
        if (c(r2, r3, r4, r5, r6) == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0068, code lost:
    
        if (r13 == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(fyp fypVar, zwp zwpVar, Context context, boolean z, cg6 cg6Var) {
        axp axpVar;
        int i;
        String str;
        if (cg6Var instanceof axp) {
            axpVar = (axp) cg6Var;
            int i2 = axpVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                axpVar.p = i2 - Integer.MIN_VALUE;
                axp axpVar2 = axpVar;
                Object obj = axpVar2.n;
                Object obj2 = nm6.a;
                i = axpVar2.p;
                eg0 eg0Var = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!z) {
                        str = null;
                        if (str == null && z) {
                            context.getClass();
                            hag.x(context, R.string.share_invite_error, 0);
                        }
                        if (Intrinsics.d(fypVar, zxp.a)) {
                            context.getClass();
                            Object systemService = context.getSystemService("clipboard");
                            systemService.getClass();
                            nxp nxpVar = (nxp) ((jyr) eg0Var.e).getValue();
                            String uuid = UUID.randomUUID().toString();
                            uuid.getClass();
                            nxpVar.getClass();
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, nxp.a(zwpVar, str, uuid)));
                            hag.x(context, R.string.link_copied_to_clipboard, 0);
                        } else if (Intrinsics.d(fypVar, zxp.b)) {
                            context.startActivity(Intent.createChooser(a(zwpVar, context, str), null));
                        } else {
                            if ((fypVar instanceof dyp) || (fypVar instanceof cyp)) {
                                zwp zwpVar2 = zwpVar;
                                Context context2 = context;
                                String str2 = ((eyp) fypVar).a;
                                Intent a = a(zwpVar2, context2, str);
                                a.setPackage(str2);
                                context2.startActivity(a);
                                return Unit.a;
                            }
                            if (fypVar instanceof byp) {
                                String str3 = ((byp) fypVar).a;
                                Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
                                intent.setType("image/*");
                                axpVar2.j = null;
                                axpVar2.k = null;
                                axpVar2.l = null;
                                axpVar2.m = z;
                                axpVar2.p = 2;
                            } else {
                                zwp zwpVar3 = zwpVar;
                                Context context3 = context;
                                if (!(fypVar instanceof ayp)) {
                                    b6e.s();
                                    return null;
                                }
                                String str4 = ((ayp) fypVar).a;
                                Intent intent2 = new Intent("com.facebook.stories.ADD_TO_STORY");
                                intent2.setType("image/*");
                                intent2.putExtra("com.facebook.platform.extra.APPLICATION_ID", context3.getString(eg0Var.b));
                                axpVar2.j = null;
                                axpVar2.k = null;
                                axpVar2.l = null;
                                axpVar2.m = z;
                                axpVar2.p = 3;
                            }
                        }
                        return Unit.a;
                    }
                    e5c e5cVar = (e5c) ((jyr) eg0Var.d).getValue();
                    axpVar2.j = fypVar;
                    axpVar2.k = zwpVar;
                    axpVar2.l = context;
                    axpVar2.m = z;
                    axpVar2.p = 1;
                    obj = e5cVar.a(axpVar2);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        if (i == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = axpVar2.m;
                    context = axpVar2.l;
                    zwpVar = axpVar2.k;
                    fypVar = axpVar2.j;
                    qgg.h0(obj);
                }
                str = (String) obj;
                if (str == null) {
                    context.getClass();
                    hag.x(context, R.string.share_invite_error, 0);
                }
                if (Intrinsics.d(fypVar, zxp.a)) {
                }
                return Unit.a;
            }
        }
        axpVar = new axp(this, cg6Var);
        axp axpVar22 = axpVar;
        Object obj3 = axpVar22.n;
        Object obj22 = nm6.a;
        i = axpVar22.p;
        eg0 eg0Var2 = this.a;
        if (i != 0) {
        }
        str = (String) obj3;
        if (str == null) {
        }
        if (Intrinsics.d(fypVar, zxp.a)) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(zwp zwpVar, Context context, String str, Intent intent, cg6 cg6Var) {
        bxp bxpVar;
        int i;
        if (cg6Var instanceof bxp) {
            bxpVar = (bxp) cg6Var;
            int i2 = bxpVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bxpVar.o = i2 - Integer.MIN_VALUE;
                Object obj = bxpVar.m;
                nm6 nm6Var = nm6.a;
                i = bxpVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    eg0 eg0Var = this.a;
                    if (!((z66) ((jyr) eg0Var.c).getValue()).g()) {
                        context.getClass();
                        hag.x(context, R.string.check_internet_connection, 0);
                        return Unit.a;
                    }
                    int i3 = SharedFileProvider.g;
                    context.getClass();
                    File file = new File(context.getFilesDir(), "temporary");
                    File file2 = (file.exists() || file.mkdirs()) ? file : null;
                    File file3 = new File(file2, String.valueOf(zwpVar.a.hashCode()));
                    if (file2 != null) {
                        file2.mkdir();
                    }
                    file3.mkdir();
                    mxp mxpVar = (mxp) ((jyr) eg0Var.f).getValue();
                    bxpVar.j = context;
                    bxpVar.k = str;
                    bxpVar.l = intent;
                    bxpVar.o = 1;
                    obj = mxpVar.a(zwpVar, file3, bxpVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    intent = bxpVar.l;
                    str = bxpVar.k;
                    context = bxpVar.j;
                    qgg.h0(obj);
                }
                qir qirVar = (qir) obj;
                awp awpVar = qirVar.a;
                awp awpVar2 = qirVar.b;
                int i4 = SharedFileProvider.g;
                Uri a0 = c9g.a0(context, awpVar.a);
                Uri a02 = c9g.a0(context, awpVar2.a);
                intent.getClass();
                intent.addFlags(1);
                intent.setDataAndType(a0, "image/png");
                intent.putExtra("interactive_asset_uri", a02);
                context.grantUriPermission(str, a02, 1);
                context.startActivity(intent);
                return Unit.a;
            }
        }
        bxpVar = new bxp(this, cg6Var);
        Object obj2 = bxpVar.m;
        nm6 nm6Var2 = nm6.a;
        i = bxpVar.o;
        if (i != 0) {
        }
        qir qirVar2 = (qir) obj2;
        awp awpVar3 = qirVar2.a;
        awp awpVar22 = qirVar2.b;
        int i42 = SharedFileProvider.g;
        Uri a03 = c9g.a0(context, awpVar3.a);
        Uri a022 = c9g.a0(context, awpVar22.a);
        intent.getClass();
        intent.addFlags(1);
        intent.setDataAndType(a03, "image/png");
        intent.putExtra("interactive_asset_uri", a022);
        context.grantUriPermission(str, a022, 1);
        context.startActivity(intent);
        return Unit.a;
    }
}
