package com.google.maps.android.ktx.utils.attribution;

import android.content.Context;
import androidx.startup.Initializer;
import coil3.size.SizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/google/maps/android/ktx/utils/attribution/AttributionIdInitializer;", "Landroidx/startup/Initializer;", "", "<init>", "()V", "create", "context", "Landroid/content/Context;", "dependencies", "", "Ljava/lang/Class;", "maps-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AttributionIdInitializer implements Initializer {
    /* renamed from: create, reason: collision with other method in class */
    public void m2062create(Context context) {
        context.getClass();
        SizeKt.addInternalUsageAttributionId(context, "gmp_git_androidmapsktx_v6.0.1");
    }

    @Override // androidx.startup.Initializer
    public List<Class<? extends Initializer>> dependencies() {
        return EmptyList.INSTANCE;
    }

    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ Object create(Context context) {
        m2062create(context);
        return Unit.INSTANCE;
    }
}
