package ru.yandex.taxi.logistics.sdk.photocomments;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.ComposeView;
import defpackage.a7u0;
import defpackage.bts;
import defpackage.dci;
import defpackage.did;
import defpackage.dlb0;
import defpackage.fid;
import defpackage.flb0;
import defpackage.glb0;
import defpackage.hlb0;
import defpackage.jgz;
import defpackage.mkb0;
import defpackage.oz40;
import defpackage.qti;
import defpackage.rkb0;
import defpackage.sb2;
import defpackage.tfx;
import defpackage.tls;
import defpackage.ua3;
import defpackage.wwg;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001%B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017R0\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010#¨\u0006&"}, d2 = {"Lru/yandex/taxi/logistics/sdk/photocomments/PhotocommentsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "uuid", "Lzy11;", "onImageDeletedClicked", "(Ljava/lang/String;)V", "Ldci;", "imageLoader", "setImageLoader", "(Ldci;)V", "", "Lmkb0;", "photocommentItems", "bindPhotocomments", "(Ljava/util/List;)V", "Lkotlin/Function1;", "deleteClickListener", "Ltls;", "getDeleteClickListener", "()Ltls;", "setDeleteClickListener", "(Ltls;)V", "Loz40;", "Ldlb0;", "photocommentItemsState", "Loz40;", "Ldci;", "Companion", "hlb0", "sdk-photocomments"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PhotocommentsView extends FrameLayout {
    public static final int $stable = 8;
    public static final hlb0 Companion = new hlb0();
    private static final glb0 emptyImageLoader = new glb0();
    private tls deleteClickListener;
    private dci imageLoader;
    private final oz40 photocommentItemsState;

    public PhotocommentsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.photocommentItemsState = f.j(new dlb0((List) null, 3));
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        addView(composeView);
        composeView.setContent(new androidx.compose.runtime.internal.a(882597565, new flb0(this, 0), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(PhotocommentsView photocommentsView, fid fidVar, int i) {
        int i2 = 1;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            qti.c(null, null, false, wwg.S(-276824330, true, new flb0(photocommentsView, i2), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 7);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 lambda$0$0(PhotocommentsView photocommentsView, fid fidVar, int i) {
        int i2 = 2;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            a7u0 a7u0Var = ua3.a;
            Object obj = photocommentsView.imageLoader;
            if (obj == null) {
                obj = emptyImageLoader;
            }
            sb2.b(a7u0Var.a(obj), wwg.S(1002488758, true, new flb0(photocommentsView, i2), btsVar), btsVar, 56);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 lambda$0$0$0(PhotocommentsView photocommentsView, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            dlb0 dlb0Var = (dlb0) photocommentsView.photocommentItemsState.getValue();
            PhotocommentsMode photocommentsMode = PhotocommentsMode.MUTABLE;
            rkb0 rkb0Var = new rkb0();
            boolean e = btsVar.e(photocommentsView);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                PhotocommentsView$1$1$1$1$1 photocommentsView$1$1$1$1$1 = new PhotocommentsView$1$1$1$1$1(1, photocommentsView, PhotocommentsView.class, "onImageDeletedClicked", "onImageDeletedClicked(Ljava/lang/String;)V", 0);
                btsVar.o0(photocommentsView$1$1$1$1$1);
                Q = photocommentsView$1$1$1$1$1;
            }
            a.b(dlb0Var, photocommentsMode, rkb0Var, null, null, (tls) ((tfx) Q), null, null, btsVar, 48, 216);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onImageDeletedClicked(String uuid) {
        tls tlsVar = this.deleteClickListener;
        if (tlsVar != null) {
            tlsVar.invoke(uuid);
        }
    }

    public final void bindPhotocomments(List<? extends mkb0> photocommentItems) {
        setVisibility(!photocommentItems.isEmpty() ? 0 : 8);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : photocommentItems) {
            if (hashSet.add(((mkb0) obj).getId())) {
                arrayList.add(obj);
            }
        }
        boolean z = arrayList.size() != photocommentItems.size();
        boolean z2 = !z;
        if (z) {
            jgz jgzVar = jgz.a;
            jgz.c(new IllegalStateException("Photocomments don't have unique ids"));
        }
        this.photocommentItemsState.setValue(new dlb0(photocommentItems, z2));
    }

    public final tls getDeleteClickListener() {
        return this.deleteClickListener;
    }

    public final void setDeleteClickListener(tls tlsVar) {
        this.deleteClickListener = tlsVar;
    }

    public final void setImageLoader(dci imageLoader) {
        this.imageLoader = imageLoader;
    }

    public PhotocommentsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PhotocommentsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PhotocommentsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
