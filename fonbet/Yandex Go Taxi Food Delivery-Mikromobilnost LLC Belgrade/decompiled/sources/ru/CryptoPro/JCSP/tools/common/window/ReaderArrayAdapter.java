package ru.CryptoPro.JCSP.tools.common.window;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import defpackage.woh0;
import java.util.List;

/* loaded from: classes4.dex */
public class ReaderArrayAdapter extends ArrayAdapter<ReaderItem> {
    public ReaderArrayAdapter(Context context, List<ReaderItem> list) {
        super(context, woh0.reader_item, list);
    }

    private View initView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(woh0.reader_item, viewGroup, false);
        }
        ReaderItem readerItem = (ReaderItem) getItem(i);
        if (readerItem != null) {
            TextView textView = (TextView) view.findViewById(R.id.text1);
            textView.setText(readerItem.getCommonDescription());
            textView.setSelected(true);
        }
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return initView(i, view, viewGroup);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return initView(i, view, viewGroup);
    }
}
