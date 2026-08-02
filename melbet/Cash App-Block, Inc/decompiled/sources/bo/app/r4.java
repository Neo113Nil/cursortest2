package bo.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.widget.ImageView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.R$string;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class r4 extends SuspendLambda implements Function2 {
    public Bitmap a;
    public int b;
    public final /* synthetic */ DefaultBrazeImageLoader c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ String e;
    public final /* synthetic */ BrazeViewBounds f;
    public final /* synthetic */ ImageView g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(DefaultBrazeImageLoader defaultBrazeImageLoader, Context context, String str, BrazeViewBounds brazeViewBounds, ImageView imageView, Continuation continuation) {
        super(2, continuation);
        this.c = defaultBrazeImageLoader;
        this.d = context;
        this.e = str;
        this.f = brazeViewBounds;
        this.g = imageView;
    }

    public static final String a(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to retrieve bitmap from url: ", str);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new r4(this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            TrafficStats.setThreadStatsTag(1337);
            Bitmap bitmapFromUrl = this.c.getBitmapFromUrl(this.d, this.e, this.f);
            if (bitmapFromUrl == null) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                str = DefaultBrazeImageLoader.TAG;
                BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(this.e, 19), 14, (Object) null);
            } else {
                String str2 = this.e;
                Object tag = this.g.getTag(R$string.com_braze_image_lru_cache_image_url_key);
                tag.getClass();
                if (Intrinsics.areEqual(str2, (String) tag)) {
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                    p4 p4Var = new p4(this.g, bitmapFromUrl, null);
                    this.a = bitmapFromUrl;
                    this.b = 1;
                    if (JobKt.withContext(handlerContext, p4Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bitmap = bitmapFromUrl;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bitmap = this.a;
        SafeTrace.throwOnFailure(obj);
        BrazeViewBounds brazeViewBounds = this.f;
        ImageView imageView = this.g;
        imageView.addOnLayoutChangeListener(new q4(brazeViewBounds, imageView, bitmap));
        return Unit.INSTANCE;
    }
}
