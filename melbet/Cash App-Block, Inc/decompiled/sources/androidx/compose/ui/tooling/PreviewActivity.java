package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.profile.views.preview.ProfileViewModelProvider;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class PreviewActivity extends ComponentActivity {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final String TAG = "PreviewActivity";

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        r9 = null;
     */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        Class<?> cls;
        Object[] array2;
        super.onCreate(bundle);
        int i = getApplicationInfo().flags & 2;
        String str = this.TAG;
        if (i == 0) {
            Log.d(str, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        Log.d(str, "PreviewActivity has composable ".concat(stringExtra));
        String substringBeforeLast$default = StringsKt.substringBeforeLast$default(stringExtra, '.');
        String substringAfterLast = StringsKt.substringAfterLast('.', stringExtra, stringExtra);
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        int i2 = 0;
        if (stringExtra2 == null) {
            Log.d(str, "Previewing '" + substringAfterLast + "' without a parameter provider.");
            ComponentActivityKt.setContent$default(this, new ComposableLambdaImpl(new PreviewActivity$$ExternalSyntheticLambda1(substringBeforeLast$default, substringAfterLast, i2), true, -840626948));
            return;
        }
        Log.d(str, "Previewing '" + substringAfterLast + "' with parameter provider: '" + stringExtra2 + '\'');
        try {
            cls = Class.forName(stringExtra2);
        } catch (ClassNotFoundException e) {
            Log.e("PreviewLogger", "Unable to find PreviewProvider '" + stringExtra2 + '\'', e);
            cls = null;
        }
        int intExtra = getIntent().getIntExtra("parameterProviderIndex", -1);
        if (cls != null) {
            try {
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                Constructor<?> constructor = null;
                int i3 = 0;
                boolean z = false;
                while (true) {
                    if (i3 < length) {
                        Constructor<?> constructor2 = constructors[i3];
                        if (constructor2.getParameterTypes().length == 0) {
                            if (z) {
                                break;
                            }
                            z = true;
                            constructor = constructor2;
                        }
                        i3++;
                    } else if (!z) {
                    }
                }
                if (constructor == null) {
                    throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
                }
                constructor.setAccessible(true);
                Object newInstance = constructor.newInstance(null);
                newInstance.getClass();
                PreviewParameterProvider previewParameterProvider = (PreviewParameterProvider) newInstance;
                if (intExtra < 0) {
                    Sequence values = ((ProfileViewModelProvider) previewParameterProvider).getValues();
                    int count = SequencesKt___SequencesKt.count(((ProfileViewModelProvider) previewParameterProvider).getValues());
                    Iterator it = values.iterator();
                    array2 = new Object[count];
                    while (i2 < count) {
                        array2[i2] = it.next();
                        i2++;
                    }
                } else {
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(SequencesKt___SequencesKt.elementAt(((ProfileViewModelProvider) previewParameterProvider).getValues(), intExtra));
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf, 10));
                    Iterator it2 = listOf.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(ComposableInvoker.unwrapIfInline(it2.next()));
                    }
                    array2 = arrayList.toArray(new Object[0]);
                }
            } catch (KotlinReflectionNotSupportedError unused) {
                a$$ExternalSyntheticBUOutline0.m$1("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
                return;
            }
        } else {
            array2 = new Object[0];
        }
        if (array2.length > 1) {
            ComponentActivityKt.setContent$default(this, new ComposableLambdaImpl(new PreviewActivity$$ExternalSyntheticLambda2(array2, substringBeforeLast$default, substringAfterLast), true, -861939235));
        } else {
            ComponentActivityKt.setContent$default(this, new ComposableLambdaImpl(new PreviewActivity$$ExternalSyntheticLambda2(substringBeforeLast$default, substringAfterLast, array2), true, -1901447514));
        }
    }
}
