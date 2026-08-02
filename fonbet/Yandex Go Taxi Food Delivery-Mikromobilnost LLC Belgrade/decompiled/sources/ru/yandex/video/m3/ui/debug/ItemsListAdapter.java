package ru.yandex.video.m3.ui.debug;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.player.YandexPlayer;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\u0010\tJ\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/ui/debug/ItemsListAdapter;", "Landroid/widget/ArrayAdapter;", "Lru/yandex/video/m3/ui/debug/Item;", "context", "Landroid/content/Context;", "resource", "", "objects", "", "(Landroid/content/Context;ILjava/util/List;)V", "getView", "Landroid/view/View;", "position", "convertView", "parent", "Landroid/view/ViewGroup;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ItemsListAdapter extends ArrayAdapter<Item> {
    public static final int $stable = 8;
    private final Context context;
    private final int resource;

    public ItemsListAdapter(Context context, int i, List<Item> list) {
        super(context, i, list);
        this.context = context;
        this.resource = i;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(this.context).inflate(this.resource, (ViewGroup) null);
        }
        Item item = position < getCount() ? getItem(position) : null;
        if (item != null) {
            YandexPlayer<?> attachedEngine = item.getAttachedEngine();
            String valueOf = attachedEngine != null ? Integer.valueOf(attachedEngine.getPlayerIndex()) : "no";
            TextView textView = (TextView) convertView.findViewById(R.id.tv_item_uuid);
            TextView textView2 = (TextView) convertView.findViewById(R.id.tv_engine);
            TextView textView3 = (TextView) convertView.findViewById(R.id.tv_preload);
            textView.setText(String.valueOf(item.getMediaData().getVideoContentId()));
            textView2.setText("lpi=" + item.getListPlayerIndex() + " eng=" + valueOf);
            textView3.setText(this.context.getString(R.string.preload, item.getPreloadState()));
            if (item.getVisible()) {
                textView.setTypeface(null, 1);
                textView2.setTypeface(null, 1);
                textView3.setTypeface(null, 1);
                return convertView;
            }
            textView.setTypeface(null, 0);
            textView2.setTypeface(null, 0);
            textView3.setTypeface(null, 0);
        }
        return convertView;
    }
}
