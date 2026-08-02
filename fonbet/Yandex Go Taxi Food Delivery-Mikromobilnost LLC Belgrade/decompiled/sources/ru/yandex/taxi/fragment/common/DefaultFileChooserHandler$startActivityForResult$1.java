package ru.yandex.taxi.fragment.common;

import android.net.Uri;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.jst;
import defpackage.mvg;
import defpackage.nbh;
import defpackage.ny61;
import defpackage.r40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.fragment.common.BaseWebChromeClient;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.fragment.common.DefaultFileChooserHandler$startActivityForResult$1", f = "DefaultFileChooserHandler.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 59}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DefaultFileChooserHandler$startActivityForResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $captureImageUri;
    final /* synthetic */ BaseWebChromeClient.a $oneShotHandler;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFileChooserHandler$startActivityForResult$1(b bVar, Uri uri, BaseWebChromeClient.a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$captureImageUri = uri;
        this.$oneShotHandler = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultFileChooserHandler$startActivityForResult$1(this.this$0, this.$captureImageUri, this.$oneShotHandler, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultFileChooserHandler$startActivityForResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        nbh nbhVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            this.$oneShotHandler.accept(null);
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Failed to handle activity result from file chooser");
        }
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0.c;
            this.label = 1;
            obj = gVar.d(Constants.VPN_TRAFFIC, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nbhVar = (nbh) this.L$1;
                kotlin.b.b(obj);
                this.$oneShotHandler.accept(nbhVar.a);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        nbh b = b.b(this.this$0, (r40) obj, this.$captureImageUri);
        b bVar = this.this$0;
        this.L$0 = null;
        this.L$1 = b;
        this.label = 2;
        if (b.a(bVar, b, this) != coroutineSingletons) {
            nbhVar = b;
            this.$oneShotHandler.accept(nbhVar.a);
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
