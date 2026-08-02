package androidx.compose.runtime;

/* loaded from: classes.dex */
public final class StaticProvidableCompositionLocal extends ProvidableCompositionLocal {
    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    public final ProvidedValue defaultProvidedValue$runtime(Object obj) {
        return new ProvidedValue(this, obj, obj == null, null, null, null, false);
    }
}
