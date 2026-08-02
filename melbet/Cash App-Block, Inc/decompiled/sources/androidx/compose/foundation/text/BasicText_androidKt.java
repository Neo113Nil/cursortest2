package androidx.compose.foundation.text;

import android.os.Trace;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.os.BundleKt;
import androidx.room.InvalidationTracker$$ExternalSyntheticLambda0;
import coil3.ComponentRegistry;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public abstract class BasicText_androidKt {
    public static final StaticProvidableCompositionLocal LocalBackgroundTextMeasurementExecutor = new StaticProvidableCompositionLocal(new InvalidationTracker$$ExternalSyntheticLambda0(9));
    public static Boolean backingCoreCountSatisfactory;

    public static final void BackgroundTextMeasurement(final AnnotatedString annotatedString, final TextStyle textStyle, final FontFamilyResolverImpl fontFamilyResolverImpl, final List list, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Executor executor = (Executor) gapComposer.consume(LocalBackgroundTextMeasurementExecutor);
        if (executor == null || !shouldPrefetch(annotatedString.text.length())) {
            gapComposer.startReplaceGroup(-517090505);
            gapComposer.end(false);
            return;
        }
        gapComposer.startReplaceGroup(-518737659);
        final LayoutDirection layoutDirection = (LayoutDirection) gapComposer.consume(CompositionLocalsKt.LocalLayoutDirection);
        final Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
        try {
            executor.execute(new Runnable() { // from class: androidx.compose.foundation.text.BasicText_androidKt$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MutableSnapshot takeNestedMutableSnapshot;
                    TextStyle textStyle2 = TextStyle.this;
                    LayoutDirection layoutDirection2 = layoutDirection;
                    AnnotatedString annotatedString2 = annotatedString;
                    Density density2 = density;
                    FontFamilyResolverImpl fontFamilyResolverImpl2 = fontFamilyResolverImpl;
                    Trace.beginSection("BackgroundTextMeasurement");
                    try {
                        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
                        MutableSnapshot mutableSnapshot = currentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) currentSnapshot : null;
                        if (mutableSnapshot == null || (takeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(null, null)) == null) {
                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                        }
                        try {
                            Snapshot makeCurrent = takeNestedMutableSnapshot.makeCurrent();
                            try {
                                TextStyle resolveDefaults = BundleKt.resolveDefaults(textStyle2, layoutDirection2);
                                List list2 = list;
                                if (list2 == null) {
                                    list2 = EmptyList.INSTANCE;
                                }
                                ComponentRegistry.Builder builder = new ComponentRegistry.Builder(annotatedString2, resolveDefaults, list2, density2, fontFamilyResolverImpl2);
                                builder.getMaxIntrinsicWidth();
                                builder.getMinIntrinsicWidth();
                                Snapshot.restoreCurrent(makeCurrent);
                                takeNestedMutableSnapshot.apply().check();
                                takeNestedMutableSnapshot.dispose();
                                Trace.endSection();
                            } catch (Throwable th) {
                                Snapshot.restoreCurrent(makeCurrent);
                                throw th;
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
        gapComposer.end(false);
    }

    public static final boolean shouldPrefetch(int i) {
        if (i >= 8 && i < 1000) {
            if (backingCoreCountSatisfactory == null) {
                backingCoreCountSatisfactory = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            Boolean bool = backingCoreCountSatisfactory;
            bool.getClass();
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
