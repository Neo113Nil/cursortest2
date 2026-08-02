package ru.CryptoPro.JCSP.tools.common.window;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.eb3;
import defpackage.jzh0;
import defpackage.o97;
import defpackage.ow4;
import defpackage.oyr;
import defpackage.p97;
import defpackage.rch0;
import defpackage.woh0;
import defpackage.x610;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ru.CryptoPro.JCSP.tools.common.window.ReaderInfo;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;
import ru.cprocsp.ACSP.tools.receiver.DeviceConnectionReceiver;
import ru.cprocsp.ACSP.tools.receiver.DeviceStateUpdater;

/* loaded from: classes4.dex */
public class CSPSelectReader extends CSPDialog implements DeviceStateUpdater {
    private static final String READER_INDEX = "readerIndex";
    private String header;
    private String replacedMessage;
    private String text_for_empty;
    private int max = 0;
    private final List<ReaderInfo> readerInfos = new LinkedList();
    private DeviceConnectionReceiver connectionReceiver = null;
    private boolean readersAndAppletsExists = false;
    private ReaderItem readerItem = null;
    private TextView tvServiceMessage = null;
    private AutoCompleteTextView tvReader = null;

    /* renamed from: ru.CryptoPro.JCSP.tools.common.window.CSPSelectReader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ru$cprocsp$ACSP$tools$receiver$DeviceConnectionReceiver$Devices;

        static {
            int[] iArr = new int[DeviceConnectionReceiver.Devices.values().length];
            $SwitchMap$ru$cprocsp$ACSP$tools$receiver$DeviceConnectionReceiver$Devices = iArr;
            try {
                iArr[DeviceConnectionReceiver.Devices.Bluetooth.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ru$cprocsp$ACSP$tools$receiver$DeviceConnectionReceiver$Devices[DeviceConnectionReceiver.Devices.USB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateDialog$0(AdapterView adapterView, View view, int i, long j) {
        this.readerItem = (ReaderItem) adapterView.getItemAtPosition(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateDialog$1(TextInputLayout textInputLayout, DialogInterface dialogInterface, int i) {
        if (textInputLayout.getVisibility() != 0) {
            endDialog(-20, null);
            return;
        }
        endDialog((this.readerItem.getReaderIndex() << 16) + this.readerItem.getAppletIndex(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateDialog$2(DialogInterface dialogInterface, int i) {
        endDialog(-1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onCreateDialog$3(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return keyBackController(i, keyEvent);
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.CSPDialog
    public void initReceiver() {
        if (this.readersAndAppletsExists) {
            return;
        }
        this.connectionReceiver = new DeviceConnectionReceiver(this, new Handler());
        IntentFilter intentFilter = new IntentFilter();
        Iterator<String> it = DeviceConnectionReceiver.DEVICE_ACTION_BLT.iterator();
        while (it.hasNext()) {
            intentFilter.addAction(it.next());
        }
        Iterator<String> it2 = DeviceConnectionReceiver.DEVICE_ACTION_USB.iterator();
        while (it2.hasNext()) {
            intentFilter.addAction(it2.next());
        }
        Context context = getContext();
        if (context != null) {
            context.registerReceiver(this.connectionReceiver, intentFilter);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        int i;
        FragmentActivity requireActivity = requireActivity();
        Bundle bundle2 = this.bundle;
        int i2 = 0;
        if (bundle2 != null) {
            this.max = bundle2.getInt(IDialogId.INTENT_EXTRA_IN_MAX, 0);
            this.header = this.bundle.getString(IDialogId.INTENT_EXTRA_IN_HEADER);
            this.text_for_empty = this.bundle.getString(IDialogId.INTENT_EXTRA_IN_TEXT_FOR_EMPTY);
            this.replacedMessage = this.bundle.getString(IDialogId.INTENT_EXTRA_IN_REPLACED_MESSAGE);
            ArrayList parcelableArrayList = this.bundle.getParcelableArrayList(IDialogId.INTENT_EXTRA_IN_READER_INFO);
            if (parcelableArrayList != null) {
                this.readerInfos.addAll(parcelableArrayList);
            }
        }
        View inflate = getLayoutInflater().inflate(woh0.fragment_csp_select_reader, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(rch0.tvText);
        this.tvServiceMessage = (TextView) inflate.findViewById(rch0.tvServiceMessage);
        this.tvReader = (AutoCompleteTextView) inflate.findViewById(rch0.tvReader);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(rch0.tilReader);
        textView.setText(this.replacedMessage);
        if (!this.readerInfos.isEmpty()) {
            LinkedList linkedList = new LinkedList();
            int i3 = 0;
            for (ReaderInfo readerInfo : this.readerInfos) {
                for (ReaderInfo.AppletInfo appletInfo : readerInfo.getApplets()) {
                    linkedList.add(new ReaderItem(readerInfo.getName() + " - " + appletInfo.getName(), i3, appletInfo.getIndex()));
                }
                i3++;
            }
            boolean isEmpty = linkedList.isEmpty();
            this.readersAndAppletsExists = !isEmpty;
            if (!isEmpty) {
                ReaderArrayAdapter readerArrayAdapter = new ReaderArrayAdapter(requireActivity, linkedList);
                readerArrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
                this.tvReader.setAdapter(readerArrayAdapter);
                this.tvReader.setOnItemClickListener(new o97(i2, this));
                textInputLayout.setVisibility(0);
                this.readerItem = (ReaderItem) linkedList.get(0);
                if (bundle != null && linkedList.size() > (i = bundle.getInt(READER_INDEX))) {
                    this.readerItem = (ReaderItem) linkedList.get(i);
                }
                this.tvReader.setText((CharSequence) this.readerItem.getCommonDescription(), false);
            }
        }
        String string = getString(R.string.ok);
        if (textInputLayout.getVisibility() != 0) {
            string = getString(jzh0.Update) + (this.max > 0 ? oyr.m(this.max, "]", new StringBuilder("[")) : "");
        }
        x610 o = new x610(requireActivity, 0).m(getDialogTitle()).o(inflate);
        o.l(string, new ow4(1, this, textInputLayout));
        AlertDialog create = o.j(new p97(i2, this)).create();
        create.setCancelable(true);
        create.setCanceledOnTouchOutside(false);
        create.setOnKeyListener(new eb3(3, this));
        initReceiver();
        return create;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        releaseReceiver();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        ReaderItem readerItem;
        int position;
        ReaderArrayAdapter readerArrayAdapter = (ReaderArrayAdapter) this.tvReader.getAdapter();
        if (readerArrayAdapter != null && (readerItem = this.readerItem) != null && (position = readerArrayAdapter.getPosition(readerItem)) >= 0) {
            bundle.putInt(READER_INDEX, position);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.CSPDialog
    public void releaseReceiver() {
        Context context;
        if (this.readersAndAppletsExists || this.connectionReceiver == null || (context = getContext()) == null) {
            return;
        }
        context.unregisterReceiver(this.connectionReceiver);
        this.connectionReceiver = null;
    }

    @Override // ru.cprocsp.ACSP.tools.receiver.DeviceStateUpdater
    public void update(DeviceConnectionReceiver.Devices devices) {
        if (getContext() != null) {
            int i = AnonymousClass1.$SwitchMap$ru$cprocsp$ACSP$tools$receiver$DeviceConnectionReceiver$Devices[devices.ordinal()];
            if (i == 1) {
                this.tvServiceMessage.setText(getString(jzh0.BluetoothDeviceConnected));
                this.tvServiceMessage.setVisibility(0);
                return;
            }
            TextView textView = this.tvServiceMessage;
            if (i != 2) {
                textView.setText("");
                this.tvServiceMessage.setVisibility(8);
            } else {
                textView.setText(getString(jzh0.USBDeviceConnected));
                this.tvServiceMessage.setVisibility(0);
            }
        }
    }
}
