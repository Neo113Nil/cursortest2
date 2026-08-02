package defpackage;

import android.webkit.WebView;
import java.util.Map;

/* loaded from: classes12.dex */
public interface q7w0 extends ien {
    boolean canScrollUp();

    WebView getView();

    void onPause();

    void onResume();

    void prepareForReuse(s7w0 s7w0Var);

    void setCommonHeaders(Map map);
}
