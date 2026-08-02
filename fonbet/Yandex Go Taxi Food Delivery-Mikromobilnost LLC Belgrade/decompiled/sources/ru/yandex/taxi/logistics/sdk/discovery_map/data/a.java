package ru.yandex.taxi.logistics.sdk.discovery_map.data;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.hjz;
import defpackage.ldc;
import defpackage.lvi0;
import defpackage.nsj;
import defpackage.ny61;
import defpackage.q8s;
import defpackage.qdc;
import defpackage.rzo;
import defpackage.utj;
import defpackage.wtj;
import defpackage.zez0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final hjz a;
    public final qdc b;
    public final q8s c;

    public a(hjz hjzVar, qdc qdcVar, q8s q8sVar) {
        this.a = hjzVar;
        this.b = qdcVar;
        this.c = q8sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(utj utjVar, ContinuationImpl continuationImpl) {
        DiscoveryMapMapper$mapState$1 discoveryMapMapper$mapState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        utj utjVar2;
        CharSequence charSequence;
        if (continuationImpl instanceof DiscoveryMapMapper$mapState$1) {
            discoveryMapMapper$mapState$1 = (DiscoveryMapMapper$mapState$1) continuationImpl;
            int i2 = discoveryMapMapper$mapState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                discoveryMapMapper$mapState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = discoveryMapMapper$mapState$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = discoveryMapMapper$mapState$1.label;
                q8s q8sVar = this.c;
                if (i != 0) {
                    b.b(obj);
                    FormattedText formattedText = utjVar.a;
                    discoveryMapMapper$mapState$1.L$0 = utjVar;
                    discoveryMapMapper$mapState$1.label = 1;
                    obj = q8sVar.a(formattedText, discoveryMapMapper$mapState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence = (CharSequence) discoveryMapMapper$mapState$1.L$1;
                        utjVar2 = (utj) discoveryMapMapper$mapState$1.L$0;
                        b.b(obj);
                        return new wtj(charSequence, (CharSequence) obj, b(utjVar2.b), b(utjVar2.w));
                    }
                    utjVar = (utj) discoveryMapMapper$mapState$1.L$0;
                    b.b(obj);
                }
                CharSequence charSequence2 = (CharSequence) obj;
                FormattedText formattedText2 = utjVar.c;
                discoveryMapMapper$mapState$1.L$0 = utjVar;
                discoveryMapMapper$mapState$1.L$1 = charSequence2;
                discoveryMapMapper$mapState$1.label = 2;
                a = q8sVar.a(formattedText2, discoveryMapMapper$mapState$1);
                if (a != coroutineSingletons) {
                    utjVar2 = utjVar;
                    charSequence = charSequence2;
                    obj = a;
                    return new wtj(charSequence, (CharSequence) obj, b(utjVar2.b), b(utjVar2.w));
                }
                return coroutineSingletons;
            }
        }
        discoveryMapMapper$mapState$1 = new DiscoveryMapMapper$mapState$1(this, continuationImpl);
        Object obj2 = discoveryMapMapper$mapState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = discoveryMapMapper$mapState$1.label;
        q8s q8sVar2 = this.c;
        if (i != 0) {
        }
        CharSequence charSequence22 = (CharSequence) obj2;
        FormattedText formattedText22 = utjVar.c;
        discoveryMapMapper$mapState$1.L$0 = utjVar;
        discoveryMapMapper$mapState$1.L$1 = charSequence22;
        discoveryMapMapper$mapState$1.label = 2;
        a = q8sVar2.a(formattedText22, discoveryMapMapper$mapState$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final lvi0 b(nsj nsjVar) {
        String str;
        if (nsjVar == null) {
            return null;
        }
        String str2 = nsjVar.a;
        if (str2 == null || (str = this.a.a(str2)) == null) {
            str = nsjVar.b;
        }
        String str3 = str;
        Integer b = this.b.b(nsjVar.c);
        ldc ldcVar = b != null ? new ldc(rzo.d(b.intValue())) : null;
        return new lvi0(str3, null, null, null, ldcVar != null ? new zez0(ldcVar.a) : null, 46);
    }
}
