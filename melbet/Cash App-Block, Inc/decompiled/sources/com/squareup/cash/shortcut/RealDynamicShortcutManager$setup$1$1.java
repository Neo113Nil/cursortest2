package com.squareup.cash.shortcut;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import coil3.Image;
import coil3.Image_androidKt;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import coil3.request.ImageResult;
import coil3.size.Scale;
import coil3.transform.CircleCropTransformation;
import coil3.transform.Transformation;
import com.squareup.cash.R;
import com.squareup.cash.db.contacts.Recipient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.PapaEvent;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealDynamicShortcutManager$setup$1$1 extends SuspendLambda implements Function2 {
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public Collection L$10;
    public RealDynamicShortcutManager L$2;
    public Collection L$4;
    public Iterator L$5;
    public Recipient L$7;
    public Intent L$8;
    public Uri L$9;
    public int label;
    public final /* synthetic */ RealDynamicShortcutManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDynamicShortcutManager$setup$1$1(RealDynamicShortcutManager realDynamicShortcutManager, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realDynamicShortcutManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealDynamicShortcutManager$setup$1$1 realDynamicShortcutManager$setup$1$1 = new RealDynamicShortcutManager$setup$1$1(this.this$0, continuation);
        realDynamicShortcutManager$setup$1$1.L$0 = obj;
        return realDynamicShortcutManager$setup$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealDynamicShortcutManager$setup$1$1) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:4|(3:5|6|7)|8|9|(1:11)(1:97)|12|13|14|(1:16)(1:96)|17|18|(30:20|(1:22)(1:93)|23|(1:25)|26|27|28|29|30|31|32|33|34|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|(1:53)(11:55|8|9|(0)(0)|12|13|14|(0)(0)|17|18|(2:94|95)(0)))(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(30:20|(1:22)(1:93)|23|(1:25)|26|27|28|29|30|31|32|33|34|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|(1:53)(11:55|8|9|(0)(0)|12|13|14|(0)(0)|17|18|(2:94|95)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x016d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x016e, code lost:
    
        r15 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017b, code lost:
    
        r10 = r9;
        r9 = r2;
        r2 = r3;
        r3 = r5;
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0190, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0182, code lost:
    
        r15 = r9;
        r9 = r2;
        r2 = r3;
        r3 = r5;
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0188, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0198, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0195, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0192, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0181, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x016a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0165 A[Catch: IOException -> 0x016a, RuntimeException -> 0x016d, TRY_LEAVE, TryCatch #17 {IOException -> 0x016a, RuntimeException -> 0x016d, blocks: (B:9:0x015d, B:11:0x0165), top: B:8:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0171  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v29, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0158 -> B:8:0x015d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01ac -> B:13:0x0175). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01cb -> B:14:0x01ea). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Iterator it;
        ArrayList arrayList;
        int i2;
        int i3;
        RealDynamicShortcutManager realDynamicShortcutManager;
        int i4;
        Bitmap bitmap;
        ArrayList arrayList2;
        Bitmap bitmap2;
        Object execute;
        RealDynamicShortcutManager realDynamicShortcutManager2 = this.this$0;
        ShortcutManager shortcutManager = realDynamicShortcutManager2.shortcutManager;
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.label;
        String str = null;
        if (i5 == 0) {
            i = 0;
            SafeTrace.throwOnFailure(obj);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((Recipient) obj2).getDisplayName() != null) {
                    arrayList3.add(obj2);
                }
            }
            List take = CollectionsKt.take(arrayList3, shortcutManager.getMaxShortcutCountPerActivity() - shortcutManager.getManifestShortcuts().size());
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(take, 10));
            it = take.iterator();
            arrayList = arrayList4;
            i2 = 0;
            i3 = 0;
            realDynamicShortcutManager = realDynamicShortcutManager2;
            if (!it.hasNext()) {
            }
        } else {
            if (i5 != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = this.I$1;
            int i7 = this.I$0;
            Collection collection = this.L$10;
            Uri uri = this.L$9;
            Intent intent = this.L$8;
            Recipient recipient = this.L$7;
            it = this.L$5;
            Collection collection2 = this.L$4;
            i = 0;
            RealDynamicShortcutManager realDynamicShortcutManager3 = this.L$2;
            try {
                SafeTrace.throwOnFailure(obj);
                bitmap2 = null;
                arrayList2 = collection2;
                execute = obj;
            } catch (IOException e) {
                IOException e2 = e;
                arrayList2 = collection2;
                Timber.Forest.e("Error fetching photo uri: " + uri + ", e: " + e2, new Object[i]);
                i4 = i7;
                bitmap = null;
                i2 = i6;
                realDynamicShortcutManager = realDynamicShortcutManager3;
                arrayList = arrayList2;
                ShortcutInfo.Builder builder = new ShortcutInfo.Builder(realDynamicShortcutManager.context, recipient.getCustomerId());
                String displayName = recipient.getDisplayName();
                displayName.getClass();
                ShortcutInfo.Builder intent2 = builder.setShortLabel(displayName).setIntent(intent);
                intent2.getClass();
                intent2.setIcon(bitmap != null ? Icon.createWithAdaptiveBitmap(bitmap) : Icon.createWithResource(realDynamicShortcutManager.context, R.drawable.shortcut_avatar_generic));
                collection.add(intent2.build());
                i3 = i4;
                str = null;
                i = 0;
                if (!it.hasNext()) {
                }
            } catch (RuntimeException e3) {
                RuntimeException e4 = e3;
                Timber.Forest.e("Error fetching photo uri: " + uri + ", e: " + e4, new Object[0]);
                i4 = i7;
                bitmap = null;
                i2 = i6;
                realDynamicShortcutManager = realDynamicShortcutManager3;
                arrayList = collection2;
                ShortcutInfo.Builder builder2 = new ShortcutInfo.Builder(realDynamicShortcutManager.context, recipient.getCustomerId());
                String displayName2 = recipient.getDisplayName();
                displayName2.getClass();
                ShortcutInfo.Builder intent22 = builder2.setShortLabel(displayName2).setIntent(intent);
                intent22.getClass();
                intent22.setIcon(bitmap != null ? Icon.createWithAdaptiveBitmap(bitmap) : Icon.createWithResource(realDynamicShortcutManager.context, R.drawable.shortcut_avatar_generic));
                collection.add(intent22.build());
                i3 = i4;
                str = null;
                i = 0;
                if (!it.hasNext()) {
                }
            }
            Image image = ((ImageResult) execute).getImage();
            bitmap = image == null ? Image_androidKt.toBitmap(image, image.getWidth(), image.getHeight()) : bitmap2;
            i4 = i7;
            i2 = i6;
            realDynamicShortcutManager = realDynamicShortcutManager3;
            arrayList = arrayList2;
            ShortcutInfo.Builder builder22 = new ShortcutInfo.Builder(realDynamicShortcutManager.context, recipient.getCustomerId());
            String displayName22 = recipient.getDisplayName();
            displayName22.getClass();
            ShortcutInfo.Builder intent222 = builder22.setShortLabel(displayName22).setIntent(intent);
            intent222.getClass();
            intent222.setIcon(bitmap != null ? Icon.createWithAdaptiveBitmap(bitmap) : Icon.createWithResource(realDynamicShortcutManager.context, R.drawable.shortcut_avatar_generic));
            collection.add(intent222.build());
            i3 = i4;
            str = null;
            i = 0;
            if (!it.hasNext()) {
                recipient = (Recipient) it.next();
                Context context = realDynamicShortcutManager.context;
                String customerId = recipient.getCustomerId();
                customerId.getClass();
                intent = new Intent(context, (Class<?>) PapaEvent.getJavaClass(realDynamicShortcutManager.activity));
                intent.setAction("contact");
                intent.setData(Uri.fromParts("customer", customerId, str));
                intent.putExtra("customer-token", customerId);
                String customerId2 = recipient.getCustomerId();
                com.squareup.protos.cash.ui.Image photo = recipient.getPhoto();
                String str2 = photo != null ? photo.light_url : str;
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("notification").appendQueryParameter("customerId", customerId2);
                if (str2 != null) {
                    appendQueryParameter.appendQueryParameter("photoUrl", str2);
                }
                uri = appendQueryParameter.build();
                uri.getClass();
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.shortcut_avatar);
                RealImageLoader realImageLoader = realDynamicShortcutManager.imageLoader;
                ImageRequest.Builder builder3 = new ImageRequest.Builder(context);
                builder3.data(uri);
                builder3.size(dimensionPixelSize, dimensionPixelSize);
                builder3.scale(Scale.FILL);
                Transformation[] transformationArr = new Transformation[1];
                transformationArr[i] = new CircleCropTransformation();
                Extras.Key key = ImageRequestsKt.transformationsKey;
                ImageRequestsKt.transformations(builder3, ArraysKt___ArraysKt.toList(transformationArr));
                ImageRequest build = builder3.build();
                bitmap2 = null;
                this.L$0 = null;
                this.L$2 = realDynamicShortcutManager;
                this.L$4 = arrayList;
                this.L$5 = it;
                this.L$7 = recipient;
                this.L$8 = intent;
                this.L$9 = uri;
                this.L$10 = arrayList;
                this.I$0 = i3;
                this.I$1 = i2;
                this.label = 1;
                execute = realImageLoader.execute(build, this);
                if (execute == coroutineSingletons) {
                    return coroutineSingletons;
                }
                arrayList2 = arrayList;
                realDynamicShortcutManager3 = realDynamicShortcutManager;
                i6 = i2;
                i7 = i3;
                collection = arrayList2;
                Image image2 = ((ImageResult) execute).getImage();
                if (image2 == null) {
                }
                i4 = i7;
                i2 = i6;
                realDynamicShortcutManager = realDynamicShortcutManager3;
                arrayList = arrayList2;
                ShortcutInfo.Builder builder222 = new ShortcutInfo.Builder(realDynamicShortcutManager.context, recipient.getCustomerId());
                String displayName222 = recipient.getDisplayName();
                displayName222.getClass();
                ShortcutInfo.Builder intent2222 = builder222.setShortLabel(displayName222).setIntent(intent);
                intent2222.getClass();
                intent2222.setIcon(bitmap != null ? Icon.createWithAdaptiveBitmap(bitmap) : Icon.createWithResource(realDynamicShortcutManager.context, R.drawable.shortcut_avatar_generic));
                collection.add(intent2222.build());
                i3 = i4;
                str = null;
                i = 0;
                if (!it.hasNext()) {
                    return CollectionsKt.toList(arrayList);
                }
            }
        }
    }
}
