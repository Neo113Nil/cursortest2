package defpackage;

import com.yandex.music.shared.media.session.session.Media3SessionService;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;
import ru.yandex.music.kids.KidsCatalogActivity;

/* loaded from: classes6.dex */
public final class jmd extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jmd(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new jmd((kmd) this.l, continuation, 0);
            case 1:
                return new jmd((x1e) this.l, continuation, 1);
            case 2:
                return new jmd((j2e) this.l, continuation, 2);
            case 3:
                return new jmd((ck0) this.l, continuation, 3);
            case 4:
                return new jmd((cfe) this.l, continuation, 4);
            case 5:
                return new jmd((x8a) this.l, continuation, 5);
            case 6:
                return new jmd((iye) this.l, continuation, 6);
            case 7:
                return new jmd((uu5) this.l, continuation, 7);
            case 8:
                return new jmd((gdf) this.l, continuation, 8);
            case 9:
                return new jmd((KidsCatalogActivity) this.l, continuation, 9);
            case 10:
                return new jmd((jef) this.l, continuation, 10);
            case 11:
                return new jmd((dff) this.l, continuation, 11);
            case 12:
                return new jmd((ghf) this.l, continuation, 12);
            case 13:
                return new jmd((elf) this.l, continuation, 13);
            case 14:
                return new jmd((fyf) this.l, continuation, 14);
            case 15:
                return new jmd((l0g) this.l, continuation, 15);
            case 16:
                return new jmd((nsh) this.l, continuation, 16);
            case 17:
                return new jmd(2, continuation);
            case 18:
                return new jmd((mu7) this.l, continuation, 18);
            case 19:
                return new jmd((OkHttpClient) this.l, continuation, 19);
            case 20:
                return new jmd((etg) this.l, continuation, 20);
            case 21:
                return new jmd((y1h) this.l, continuation, 21);
            case 22:
                return new jmd((c3h) this.l, continuation, 22);
            case 23:
                return new jmd((w4h) this.l, continuation, 23);
            case 24:
                return new jmd((t5h) this.l, continuation, 24);
            case 25:
                return new jmd((j7h) this.l, continuation, 25);
            case 26:
                return new jmd((Media3SessionService) this.l, continuation, 26);
            case 27:
                return new jmd((wgh) this.l, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new jmd((ovh) this.l, continuation, 28);
            default:
                return new jmd((b1i) this.l, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 23:
                ((jmd) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((jmd) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0224  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0222 -> B:101:0x0213). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x0239 -> B:99:0x023d). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 2114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jmd(int i, Continuation continuation) {
        super(i, continuation);
        this.j = 17;
    }
}
