package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.io.Closeable;
import java.util.Map;

/* loaded from: classes15.dex */
public interface rv41 extends Closeable {
    void F(int i);

    void U1();

    View asView();

    void clearHistory();

    void f1(sls slsVar, String str);

    void hide();

    void i1(Fragment fragment);

    boolean loadUrl(String str, Map map);

    boolean onBackPressed();

    void show();

    boolean x1();
}
