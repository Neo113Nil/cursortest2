package Q;

import O.C0028d;
import O.InterfaceC0027c;
import O.K;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import m.C0285w;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f927a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, a aVar) {
        super(inputConnection, false);
        this.f927a = aVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0027c interfaceC0027c;
        B.b bVar = inputContentInfo == null ? null : new B.b(11, new B.b(10, inputContentInfo));
        a aVar = this.f927a;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((B.b) bVar.f10b).f10b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((B.b) bVar.f10b).f10b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((B.b) bVar.f10b).f10b).getDescription();
        B.b bVar2 = (B.b) bVar.f10b;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) bVar2.f10b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0027c = new B.b(clipData, 2);
        } else {
            C0028d c0028d = new C0028d();
            c0028d.f797b = clipData;
            c0028d.f798c = 2;
            interfaceC0027c = c0028d;
        }
        interfaceC0027c.d(((InputContentInfo) bVar2.f10b).getLinkUri());
        interfaceC0027c.a(bundle2);
        if (K.h((C0285w) aVar.f926a, interfaceC0027c.k()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
