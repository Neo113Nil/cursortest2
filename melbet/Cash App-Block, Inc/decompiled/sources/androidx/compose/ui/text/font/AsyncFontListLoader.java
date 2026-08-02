package androidx.compose.ui.text.font;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.play.integrity.internal.ax;
import com.squareup.wire.GrpcMethod;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class AsyncFontListLoader implements State {
    public boolean cacheable = true;
    public final List fontList;
    public final Function1 onCompletion;
    public final TypefaceRequest typefaceRequest;
    public final ParcelableSnapshotMutableState value$delegate;

    public AsyncFontListLoader(List list, Object obj, TypefaceRequest typefaceRequest, GrpcMethod grpcMethod, Function1 function1, ax axVar) {
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.onCompletion = function1;
        this.value$delegate = Updater.mutableStateOf$default(obj);
    }

    @Override // androidx.compose.runtime.State
    public final Object getValue() {
        return this.value$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:13:0x0034, B:16:0x00a1, B:23:0x004c, B:25:0x0051, B:28:0x0079, B:33:0x0094), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00a1 -> B:14:0x00aa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object load(ContinuationImpl continuationImpl) {
        AsyncFontListLoader$load$1 asyncFontListLoader$load$1;
        int i;
        Function1 function1;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        int size;
        List list;
        int i2;
        try {
            if (continuationImpl instanceof AsyncFontListLoader$load$1) {
                asyncFontListLoader$load$1 = (AsyncFontListLoader$load$1) continuationImpl;
                int i3 = asyncFontListLoader$load$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    asyncFontListLoader$load$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = asyncFontListLoader$load$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = asyncFontListLoader$load$1.label;
                    function1 = this.onCompletion;
                    parcelableSnapshotMutableState = this.value$delegate;
                    if (i == 0) {
                        if (i == 1) {
                            int i4 = asyncFontListLoader$load$1.I$1;
                            int i5 = asyncFontListLoader$load$1.I$0;
                            ResourceFont resourceFont = asyncFontListLoader$load$1.L$1;
                            List list2 = asyncFontListLoader$load$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            if (obj != null) {
                                TypefaceRequest typefaceRequest = this.typefaceRequest;
                                parcelableSnapshotMutableState.setValue(TransactorKt.m1174synthesizeTypefaceFxwP2eA(typefaceRequest.fontSynthesis, obj, resourceFont, typefaceRequest.fontWeight, typefaceRequest.fontStyle));
                                return Unit.INSTANCE;
                            }
                            asyncFontListLoader$load$1.L$0 = list2;
                            asyncFontListLoader$load$1.L$1 = null;
                            asyncFontListLoader$load$1.I$0 = i5;
                            asyncFontListLoader$load$1.I$1 = i4;
                            asyncFontListLoader$load$1.label = 2;
                            if (JobKt.yield(asyncFontListLoader$load$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            size = i4;
                            i2 = i5;
                            list = list2;
                        } else {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            size = asyncFontListLoader$load$1.I$1;
                            i2 = asyncFontListLoader$load$1.I$0;
                            list = asyncFontListLoader$load$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                        }
                        i2++;
                        if (i2 < size) {
                            ((ResourceFont) list.get(i2)).getClass();
                            i2++;
                            if (i2 < size) {
                                boolean isActive = JobKt.isActive(asyncFontListLoader$load$1.getContext());
                                this.cacheable = false;
                                function1.invoke(new TypefaceResult.Immutable(parcelableSnapshotMutableState.getValue(), isActive));
                                return Unit.INSTANCE;
                            }
                        }
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        List list3 = this.fontList;
                        size = list3.size();
                        list = list3;
                        i2 = 0;
                        if (i2 < size) {
                        }
                    }
                }
            }
            if (i == 0) {
            }
        } finally {
            boolean isActive2 = JobKt.isActive(asyncFontListLoader$load$1.getContext());
            this.cacheable = false;
            function1.invoke(new TypefaceResult.Immutable(parcelableSnapshotMutableState.getValue(), isActive2));
        }
        asyncFontListLoader$load$1 = new AsyncFontListLoader$load$1(this, continuationImpl);
        Object obj2 = asyncFontListLoader$load$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = asyncFontListLoader$load$1.label;
        function1 = this.onCompletion;
        parcelableSnapshotMutableState = this.value$delegate;
    }
}
